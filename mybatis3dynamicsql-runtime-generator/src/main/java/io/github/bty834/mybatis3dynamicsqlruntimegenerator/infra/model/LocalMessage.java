package io.github.bty834.mybatis3dynamicsqlruntimegenerator.infra.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class LocalMessage {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.972+08:00", comments="Source field: local_message.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.number")
    private Long number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.topic")
    private String topic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.sharding_key")
    private String shardingKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.msg_id")
    private String msgId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.send_status")
    private Byte sendStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.retry_times")
    private Byte retryTimes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.next_retry_time")
    private Date nextRetryTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.deleted")
    private Byte deleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc2")
    private String cc2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc3")
    private Integer cc3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.content")
    private String content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.number")
    public Long getNumber() {
        return number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.number")
    public void setNumber(Long number) {
        this.number = number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.topic")
    public String getTopic() {
        return topic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.sharding_key")
    public String getShardingKey() {
        return shardingKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.sharding_key")
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.msg_id")
    public String getMsgId() {
        return msgId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.msg_id")
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.send_status")
    public Byte getSendStatus() {
        return sendStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.send_status")
    public void setSendStatus(Byte sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.retry_times")
    public Byte getRetryTimes() {
        return retryTimes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.retry_times")
    public void setRetryTimes(Byte retryTimes) {
        this.retryTimes = retryTimes;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.next_retry_time")
    public Date getNextRetryTime() {
        return nextRetryTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.next_retry_time")
    public void setNextRetryTime(Date nextRetryTime) {
        this.nextRetryTime = nextRetryTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.deleted")
    public Byte getDeleted() {
        return deleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.deleted")
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.973+08:00", comments="Source field: local_message.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc2")
    public String getCc2() {
        return cc2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc2")
    public void setCc2(String cc2) {
        this.cc2 = cc2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc3")
    public Integer getCc3() {
        return cc3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.cc3")
    public void setCc3(Integer cc3) {
        this.cc3 = cc3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.content")
    public String getContent() {
        return content;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-14T00:58:54.974+08:00", comments="Source field: local_message.content")
    public void setContent(String content) {
        this.content = content;
    }
}