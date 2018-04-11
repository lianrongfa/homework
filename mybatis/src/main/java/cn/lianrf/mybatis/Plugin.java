package cn.lianrf.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public class Plugin implements InvocationHandler {

    private Object target;
    private Interceptor interceptor;
    private Map<Class<?>, Set<Method>> signatrueMap;

    public Plugin(Object target, Interceptor interceptor, Map<Class<?>, Set<Method>> signatrueMap) {
        this.target = target;
        this.interceptor = interceptor;
        this.signatrueMap = signatrueMap;
    }
    //偷懒都拦截了
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = this.interceptor.interceptor(new Invocation(target, method, args));

        return result;
    }

    public static Object warp(Object target,Interceptor interceptor) {

        Class<?> targetClass = target.getClass();
        Object o = Proxy.newProxyInstance(targetClass.getClassLoader(),
                targetClass.getInterfaces(), new Plugin(target,interceptor,null));
        return o;
    }


}
