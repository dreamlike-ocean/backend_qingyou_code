package top.dreamlike.qingyou.entity;

import java.util.StringJoiner;

public class ScoreRecord {
    private Integer recordId;
    private Integer userId;
    private Integer count;
    private Long timestamp;
    private Integer type;

    public Integer getRecordId() {
        return recordId;
    }

    public ScoreRecord setRecordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public ScoreRecord setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public ScoreRecord setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public ScoreRecord setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ScoreRecord setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ScoreRecord.class.getSimpleName() + "[", "]")
                .add("recordId=" + recordId)
                .add("userId=" + userId)
                .add("count=" + count)
                .add("timestamp=" + timestamp)
                .add("type=" + type)
                .toString();
    }
}
