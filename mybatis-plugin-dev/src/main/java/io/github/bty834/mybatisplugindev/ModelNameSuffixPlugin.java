package io.github.bty834.mybatisplugindev;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

public class ModelNameSuffixPlugin extends PluginAdapter {

    private static final String SUFFIX = "suffix";
    // 可使用英文逗号、分号、空格分割多个表
    private static final String EXCLUDE_TABLES = "excludeTables";

    @Override
    public boolean validate(List<String> warnings) {
        return warnings.isEmpty();
    }


    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        super.initialized(introspectedTable);
        String suffix = getProperties().getProperty(SUFFIX);

        if (suffix == null || suffix.trim().isEmpty()) {
            return;
        }

        if (introspectedTable.getTableConfiguration().getProperty("tableOverride") != null) {
            return;
        }

        String excludeTables = getProperties().getProperty(EXCLUDE_TABLES);

        if (excludeTables != null && !excludeTables.trim().isEmpty()) {
            String[] excludeTableArray = excludeTables.split("[,;\\s]+");
            for (String t : excludeTableArray) {
                if (t.trim().isEmpty()) {
                    continue;
                }
                String tableName = introspectedTable.getTableConfiguration().getTableName();
                if (Objects.equals(tableName, t.trim())){
                    return;
                }
            }
        }

        String domainObjectName = introspectedTable.getFullyQualifiedTable().getDomainObjectName() + suffix;

        introspectedTable.getTableConfiguration().setDomainObjectName(domainObjectName);

        try {
            Field domainObjectNameField = FullyQualifiedTable.class.getDeclaredField("domainObjectName");
            domainObjectNameField.setAccessible(true);
            domainObjectNameField.set(introspectedTable.getFullyQualifiedTable(), domainObjectName);

            Method calculateJavaClientAttributes = IntrospectedTable.class.getDeclaredMethod("calculateJavaClientAttributes");
            calculateJavaClientAttributes.setAccessible(true);
            calculateJavaClientAttributes.invoke(introspectedTable);

            Method calculateModelAttributes = IntrospectedTable.class.getDeclaredMethod("calculateModelAttributes");
            calculateModelAttributes.setAccessible(true);
            calculateModelAttributes.invoke(introspectedTable);

            Method calculateXmlAttributes = IntrospectedTable.class.getDeclaredMethod("calculateXmlAttributes");
            calculateXmlAttributes.setAccessible(true);
            calculateXmlAttributes.invoke(introspectedTable);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
