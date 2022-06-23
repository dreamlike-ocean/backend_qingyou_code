package top.dreamlike.qingyou.select;

import top.dreamlike.qingyou.entity.LoginUser;

import java.util.StringJoiner;

public class ScoreRecordUserInfo {
    private Integer recordId;
    private Long timestamp;
    private LoginUser loginUser;

    public Integer getRecordId() {
        return recordId;
    }

    public ScoreRecordUserInfo setRecordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public ScoreRecordUserInfo setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ScoreRecordUserInfo.class.getSimpleName() + "[", "]")
                .add("recordId=" + recordId)
                .add("timestamp=" + timestamp)
                .add("loginUser=" + loginUser)
                .toString();
    }
}
