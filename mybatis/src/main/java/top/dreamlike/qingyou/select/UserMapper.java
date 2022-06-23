package top.dreamlike.qingyou.select;

import org.apache.ibatis.annotations.Param;
import top.dreamlike.qingyou.entity.LoginUser;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    LoginUser selectById(@Param("userId") Integer userId);

   List<HashMap<String,Object>> selectByIdtToMap(@Param("userId") Integer userId);

    LoginUser selectByIdUseResultMap(@Param("userId") Integer userId);

    UserScoreRecord selectUserScoreRecordById(@Param("userId") Integer userId);

    User selectUserById(@Param("userId") Integer userId);
    ScoreRecordUserInfo selectScoreUserInfoById();
}
