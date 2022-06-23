package top.dreamlike.qingyou.select;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SelectMain {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = buildFromXml();
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            System.out.println(mapper.selectScoreUserInfoById());
        }
    }

    public static SqlSessionFactory buildFromXml() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config-select.xml");
        return new SqlSessionFactoryBuilder()
                .build(inputStream);
    }


}
