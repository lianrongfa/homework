package cn.lianrf.mybatis;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.List;

/**
 * Created by lianrongfa on 2018/4/1.
 */
public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.executor = configuration.newExecutor();
    }

    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz,this);
    }

    public <T> T selectOne(String sql,Object parameter) {
        List<Object> list = executor.query(getConnection(), sql, parameter);
        return (T) list.get(0);
    }

    public Connection getConnection() {
        return configuration.getConnection();
    }
}
