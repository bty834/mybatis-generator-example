package io.github.bty834.mybatis3runtimegenerator.infra.mapper;

import io.github.bty834.mybatis3runtimegenerator.infra.model.LocalMessage;
import io.github.bty834.mybatis3runtimegenerator.infra.model.LocalMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocalMessageMapper {
    long countByExample(LocalMessageExample example);

    int deleteByExample(LocalMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocalMessage row);

    int insertSelective(LocalMessage row);

    List<LocalMessage> selectByExampleWithBLOBs(LocalMessageExample example);

    List<LocalMessage> selectByExample(LocalMessageExample example);

    LocalMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") LocalMessage row, @Param("example") LocalMessageExample example);

    int updateByExampleWithBLOBs(@Param("row") LocalMessage row, @Param("example") LocalMessageExample example);

    int updateByExample(@Param("row") LocalMessage row, @Param("example") LocalMessageExample example);

    int updateByPrimaryKeySelective(LocalMessage row);

    int updateByPrimaryKeyWithBLOBs(LocalMessage row);

    int updateByPrimaryKey(LocalMessage row);
}