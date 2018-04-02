package cn.lianrf.mybatis;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * Created by lianrongfa on 2018/4/1.
 */
public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T getMapper(Class<T> clazz) {

        configuration.getMapper(clazz,this);
        T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy(this));
        return t;
    }

    public <T> T selectOne(String statement,Object parameter) {
        return executor.selectOne(statement,parameter);
    }

    public Connection getConnection() {
        return null;
    }
}
