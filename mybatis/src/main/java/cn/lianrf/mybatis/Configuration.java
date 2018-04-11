package cn.lianrf.mybatis;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lianrongfa on 2018/4/2.
 */
public class Configuration {

	protected final InterceptorChain interceptorChain = new InterceptorChain();

    public <T> T getMapper(Class<T> clazz, SqlSession sqlSession) {
        T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy(sqlSession));
        return t;
    }

    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/learn", "root", "root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }


    public Executor newExecutor(){
        Executor executor = new SimpleExecutor();
        interceptorChain.addInterceptor(new SelectInterceptor());
        return (Executor)interceptorChain.pluginAll(executor);
    }
}
