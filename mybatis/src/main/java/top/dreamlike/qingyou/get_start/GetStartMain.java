package top.dreamlike.qingyou.get_start;

import com.mysql.cj.jdbc.Driver;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;

public class GetStartMain {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory factory = buildFromJava();
        try (SqlSession session = factory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            System.out.println(mapper.selectById(31));
            System.out.println(mapper.getClass());
        }
    }

    public static SqlSessionFactory buildFromXml() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config-get-start.xml");
        return new SqlSessionFactoryBuilder()
                .build(inputStream);
    }
    public static SqlSessionFactory buildFromJava() throws IOException {
        PooledDataSource dataSource = new PooledDataSource(Driver.class.getName(),"jdbc:mysql://localhost:3306/app","root","12345678");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        //注意这里mapper只有与其同级
        configuration.addMapper(UserMapper.class);
        return new SqlSessionFactoryBuilder().build(configuration);
    }

}
