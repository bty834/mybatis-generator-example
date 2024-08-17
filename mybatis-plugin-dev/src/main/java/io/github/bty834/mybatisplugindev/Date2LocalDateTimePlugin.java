package io.github.bty834.mybatisplugindev;

import java.util.List;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class Date2LocalDateTimePlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {

        FullyQualifiedJavaType fullyQualifiedJavaType = introspectedColumn.getFullyQualifiedJavaType();

        String fullyQualifiedName = fullyQualifiedJavaType.getFullyQualifiedName();
        if (fullyQualifiedName.equals("java.util.Date")) {
            try {
                FullyQualifiedJavaType type = field.getType();

                java.lang.reflect.Field baseShortName = type.getClass().getDeclaredField("baseShortName");
                baseShortName.setAccessible(true);
                baseShortName.set(type, "LocalDateTime");

                java.lang.reflect.Field qualifiedName = type.getClass().getDeclaredField("baseQualifiedName");
                qualifiedName.setAccessible(true);
                qualifiedName.set(type, "java.time.LocalDateTime");

                topLevelClass.addImportedType(type);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }
}
