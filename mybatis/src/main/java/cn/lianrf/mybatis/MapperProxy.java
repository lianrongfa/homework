package cn.lianrf.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lianrongfa on 2018/4/1.
 */
public class MapperProxy implements InvocationHandler{

    private SqlSession session;

    public MapperProxy(SqlSession session) {
        this.session = session;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
