package top.dreamlike.qingyou.select;

import org.apache.ibatis.annotations.Param;

import java.util.StringJoiner;

//这个类用于讲解constructor标签
public class User {
    private Integer userId;
    private String username;
    private String password;

    public User(@Param("userId") Integer userId,@Param("username") String username,@Param("password") String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        System.out.println("我被mybatis调用了");
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
