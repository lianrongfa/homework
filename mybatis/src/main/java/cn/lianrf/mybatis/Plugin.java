package cn.lianrf.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public class Plugin implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public static Object warp(Object target){

        Proxy.newProxyInstance(target.getClass().getClassLoader(),,new Plugin());

        return target;
    }



}
