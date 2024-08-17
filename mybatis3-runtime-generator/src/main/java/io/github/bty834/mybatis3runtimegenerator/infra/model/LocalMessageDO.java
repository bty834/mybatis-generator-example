package io.github.bty834.mybatis3runtimegenerator.infra.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocalMessageDO implements Serializable {
    private Long id;

    private Long number;

    private String topic;

    private String shardingKey;

    private String msgId;

    private Byte sendStatus;

    private String content;

    private Byte retryTimes;

    private LocalDateTime nextRetryTime;

    private Boolean deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String cc2;

    private Integer cc3;

    private static final long serialVersionUID = 1L;
}