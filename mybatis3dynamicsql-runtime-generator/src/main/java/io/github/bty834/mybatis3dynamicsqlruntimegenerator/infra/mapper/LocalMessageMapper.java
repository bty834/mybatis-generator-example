package io.github.bty834.mybatis3dynamicsqlruntimegenerator.infra.mapper;

import static io.github.bty834.mybatis3dynamicsqlruntimegenerator.infra.mapper.LocalMessageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import io.github.bty834.mybatis3dynamicsqlruntimegenerator.infra.model.LocalMessage;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface LocalMessageMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<LocalMessage>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.98+08:00", comments="Source Table: local_message")
    BasicColumn[] selectList = BasicColumn.columnList(id, number, topic, shardingKey, msgId, sendStatus, retryTimes, nextRetryTime, deleted, createTime, updateTime, cc2, cc3, content);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source Table: local_message")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LocalMessageResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="number", property="number", jdbcType=JdbcType.BIGINT),
        @Result(column="topic", property="topic", jdbcType=JdbcType.VARCHAR),
        @Result(column="sharding_key", property="shardingKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_id", property="msgId", jdbcType=JdbcType.VARCHAR),
        @Result(column="send_status", property="sendStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="retry_times", property="retryTimes", jdbcType=JdbcType.TINYINT),
        @Result(column="next_retry_time", property="nextRetryTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cc2", property="cc2", jdbcType=JdbcType.VARCHAR),
        @Result(column="cc3", property="cc3", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<LocalMessage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.978+08:00", comments="Source Table: local_message")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LocalMessageResult")
    Optional<LocalMessage> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.978+08:00", comments="Source Table: local_message")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.978+08:00", comments="Source Table: local_message")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.978+08:00", comments="Source Table: local_message")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.978+08:00", comments="Source Table: local_message")
    default int insert(LocalMessage row) {
        return MyBatis3Utils.insert(this::insert, row, localMessage, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(topic).toProperty("topic")
            .map(shardingKey).toProperty("shardingKey")
            .map(msgId).toProperty("msgId")
            .map(sendStatus).toProperty("sendStatus")
            .map(retryTimes).toProperty("retryTimes")
            .map(nextRetryTime).toProperty("nextRetryTime")
            .map(deleted).toProperty("deleted")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(cc2).toProperty("cc2")
            .map(cc3).toProperty("cc3")
            .map(content).toProperty("content")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.979+08:00", comments="Source Table: local_message")
    default int insertMultiple(Collection<LocalMessage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, localMessage, c ->
            c.map(id).toProperty("id")
            .map(number).toProperty("number")
            .map(topic).toProperty("topic")
            .map(shardingKey).toProperty("shardingKey")
            .map(msgId).toProperty("msgId")
            .map(sendStatus).toProperty("sendStatus")
            .map(retryTimes).toProperty("retryTimes")
            .map(nextRetryTime).toProperty("nextRetryTime")
            .map(deleted).toProperty("deleted")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
            .map(cc2).toProperty("cc2")
            .map(cc3).toProperty("cc3")
            .map(content).toProperty("content")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.979+08:00", comments="Source Table: local_message")
    default int insertSelective(LocalMessage row) {
        return MyBatis3Utils.insert(this::insert, row, localMessage, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(number).toPropertyWhenPresent("number", row::getNumber)
            .map(topic).toPropertyWhenPresent("topic", row::getTopic)
            .map(shardingKey).toPropertyWhenPresent("shardingKey", row::getShardingKey)
            .map(msgId).toPropertyWhenPresent("msgId", row::getMsgId)
            .map(sendStatus).toPropertyWhenPresent("sendStatus", row::getSendStatus)
            .map(retryTimes).toPropertyWhenPresent("retryTimes", row::getRetryTimes)
            .map(nextRetryTime).toPropertyWhenPresent("nextRetryTime", row::getNextRetryTime)
            .map(deleted).toPropertyWhenPresent("deleted", row::getDeleted)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
            .map(cc2).toPropertyWhenPresent("cc2", row::getCc2)
            .map(cc3).toPropertyWhenPresent("cc3", row::getCc3)
            .map(content).toPropertyWhenPresent("content", row::getContent)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.98+08:00", comments="Source Table: local_message")
    default Optional<LocalMessage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.98+08:00", comments="Source Table: local_message")
    default List<LocalMessage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.98+08:00", comments="Source Table: local_message")
    default List<LocalMessage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    default Optional<LocalMessage> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, localMessage, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    static UpdateDSL<UpdateModel> updateAllColumns(LocalMessage row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(number).equalTo(row::getNumber)
                .set(topic).equalTo(row::getTopic)
                .set(shardingKey).equalTo(row::getShardingKey)
                .set(msgId).equalTo(row::getMsgId)
                .set(sendStatus).equalTo(row::getSendStatus)
                .set(retryTimes).equalTo(row::getRetryTimes)
                .set(nextRetryTime).equalTo(row::getNextRetryTime)
                .set(deleted).equalTo(row::getDeleted)
                .set(createTime).equalTo(row::getCreateTime)
                .set(updateTime).equalTo(row::getUpdateTime)
                .set(cc2).equalTo(row::getCc2)
                .set(cc3).equalTo(row::getCc3)
                .set(content).equalTo(row::getContent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LocalMessage row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(number).equalToWhenPresent(row::getNumber)
                .set(topic).equalToWhenPresent(row::getTopic)
                .set(shardingKey).equalToWhenPresent(row::getShardingKey)
                .set(msgId).equalToWhenPresent(row::getMsgId)
                .set(sendStatus).equalToWhenPresent(row::getSendStatus)
                .set(retryTimes).equalToWhenPresent(row::getRetryTimes)
                .set(nextRetryTime).equalToWhenPresent(row::getNextRetryTime)
                .set(deleted).equalToWhenPresent(row::getDeleted)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(updateTime).equalToWhenPresent(row::getUpdateTime)
                .set(cc2).equalToWhenPresent(row::getCc2)
                .set(cc3).equalToWhenPresent(row::getCc3)
                .set(content).equalToWhenPresent(row::getContent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    default int updateByPrimaryKey(LocalMessage row) {
        return update(c ->
            c.set(number).equalTo(row::getNumber)
            .set(topic).equalTo(row::getTopic)
            .set(shardingKey).equalTo(row::getShardingKey)
            .set(msgId).equalTo(row::getMsgId)
            .set(sendStatus).equalTo(row::getSendStatus)
            .set(retryTimes).equalTo(row::getRetryTimes)
            .set(nextRetryTime).equalTo(row::getNextRetryTime)
            .set(deleted).equalTo(row::getDeleted)
            .set(createTime).equalTo(row::getCreateTime)
            .set(updateTime).equalTo(row::getUpdateTime)
            .set(cc2).equalTo(row::getCc2)
            .set(cc3).equalTo(row::getCc3)
            .set(content).equalTo(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.981+08:00", comments="Source Table: local_message")
    default int updateByPrimaryKeySelective(LocalMessage row) {
        return update(c ->
            c.set(number).equalToWhenPresent(row::getNumber)
            .set(topic).equalToWhenPresent(row::getTopic)
            .set(shardingKey).equalToWhenPresent(row::getShardingKey)
            .set(msgId).equalToWhenPresent(row::getMsgId)
            .set(sendStatus).equalToWhenPresent(row::getSendStatus)
            .set(retryTimes).equalToWhenPresent(row::getRetryTimes)
            .set(nextRetryTime).equalToWhenPresent(row::getNextRetryTime)
            .set(deleted).equalToWhenPresent(row::getDeleted)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
            .set(cc2).equalToWhenPresent(row::getCc2)
            .set(cc3).equalToWhenPresent(row::getCc3)
            .set(content).equalToWhenPresent(row::getContent)
            .where(id, isEqualTo(row::getId))
        );
    }
}