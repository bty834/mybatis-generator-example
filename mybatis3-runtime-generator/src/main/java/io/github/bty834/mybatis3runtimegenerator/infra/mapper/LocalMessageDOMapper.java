package io.github.bty834.mybatis3runtimegenerator.infra.mapper;

import io.github.bty834.mybatis3runtimegenerator.infra.model.LocalMessageDO;
import io.github.bty834.mybatis3runtimegenerator.infra.model.LocalMessageDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocalMessageDOMapper {
    long countByExample(LocalMessageDOExample example);

    int insert(LocalMessageDO record);

    int insertSelective(LocalMessageDO record);

    List<LocalMessageDO> selectByExample(LocalMessageDOExample example);

    LocalMessageDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LocalMessageDO record, @Param("example") LocalMessageDOExample example);

    int updateByExample(@Param("record") LocalMessageDO record, @Param("example") LocalMessageDOExample example);

    int updateByPrimaryKeySelective(LocalMessageDO record);

    int updateByPrimaryKey(LocalMessageDO record);
}