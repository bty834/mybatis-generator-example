package io.github.bty834.mybatis3dynamicsqlruntimegenerator.infra.mapper;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class LocalMessageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.975+08:00", comments="Source Table: local_message")
    public static final LocalMessage localMessage = new LocalMessage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.975+08:00", comments="Source field: local_message.id")
    public static final SqlColumn<Long> id = localMessage.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.number")
    public static final SqlColumn<Long> number = localMessage.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.topic")
    public static final SqlColumn<String> topic = localMessage.topic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.sharding_key")
    public static final SqlColumn<String> shardingKey = localMessage.shardingKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.msg_id")
    public static final SqlColumn<String> msgId = localMessage.msgId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.send_status")
    public static final SqlColumn<Byte> sendStatus = localMessage.sendStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.retry_times")
    public static final SqlColumn<Byte> retryTimes = localMessage.retryTimes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.next_retry_time")
    public static final SqlColumn<Date> nextRetryTime = localMessage.nextRetryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.deleted")
    public static final SqlColumn<Byte> deleted = localMessage.deleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.create_time")
    public static final SqlColumn<Date> createTime = localMessage.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.update_time")
    public static final SqlColumn<Date> updateTime = localMessage.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.cc2")
    public static final SqlColumn<String> cc2 = localMessage.cc2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.cc3")
    public static final SqlColumn<Integer> cc3 = localMessage.cc3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.976+08:00", comments="Source field: local_message.content")
    public static final SqlColumn<String> content = localMessage.content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.975+08:00", comments="Source Table: local_message")
    public static final class LocalMessage extends AliasableSqlTable<LocalMessage> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> number = column("number", JDBCType.BIGINT);

        public final SqlColumn<String> topic = column("topic", JDBCType.VARCHAR);

        public final SqlColumn<String> shardingKey = column("sharding_key", JDBCType.VARCHAR);

        public final SqlColumn<String> msgId = column("msg_id", JDBCType.VARCHAR);

        public final SqlColumn<Byte> sendStatus = column("send_status", JDBCType.TINYINT);

        public final SqlColumn<Byte> retryTimes = column("retry_times", JDBCType.TINYINT);

        public final SqlColumn<Date> nextRetryTime = column("next_retry_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Byte> deleted = column("deleted", JDBCType.TINYINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cc2 = column("cc2", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cc3 = column("cc3", JDBCType.INTEGER);

        public final SqlColumn<String> content = column("content", JDBCType.LONGVARCHAR);

        public LocalMessage() {
            super("local_message", LocalMessage::new);
        }
    }
}