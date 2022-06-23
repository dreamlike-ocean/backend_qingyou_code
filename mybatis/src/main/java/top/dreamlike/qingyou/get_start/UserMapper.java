package top.dreamlike.qingyou.get_start;

import org.apache.ibatis.annotations.Param;
import top.dreamlike.qingyou.entity.LoginUser;

public interface UserMapper {
    LoginUser selectById(@Param("userId") Integer userId);
}
