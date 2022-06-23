package top.dreamlike.qingyou.select;

import org.apache.ibatis.annotations.Param;
import top.dreamlike.qingyou.entity.ScoreRecord;

import java.util.List;
import java.util.StringJoiner;

public class UserScoreRecord {
    private Integer userId;
    private List<ScoreRecord> scoreRecords;

    public UserScoreRecord(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserScoreRecord setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public List<ScoreRecord> getScoreRecords() {
        return scoreRecords;
    }

    public UserScoreRecord setScoreRecords(List<ScoreRecord> scoreRecords) {
        this.scoreRecords = scoreRecords;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserScoreRecord.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("scoreRecords=" + scoreRecords)
                .toString();
    }
}
