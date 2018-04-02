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
        this.executor = configuration.getExecutor();
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz,this);
    }

    public <T> T selectOne(String sql,Object parameter) {
        return executor.selectOne(getConnection(),sql,parameter);
    }

    public Connection getConnection() {
        return configuration.getConnection();
    }
}
