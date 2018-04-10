package cn.lianrf.mybatis;

import java.lang.reflect.Proxy;


/**
 * Created by lianrongfa on 2018/4/2.
 */
public class Configuration {

    protected final InterceptorChain interceptorChain = new InterceptorChain();

    public <T> T getMapper(Class<T> clazz, SqlSession sqlSession) {
        T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new MapperProxy(sqlSession));
        return t;
    }
}
