package top.dreamlike.qingyou;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    LoginUser selectById(@Param("userId") Integer userId);
}
