package cn.lianrf.mybatis;

import java.lang.reflect.Method;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public class Invocation {
    private Object target;
    private Method method;
    private Object args [];

    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object getTarget() {
        return target;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArgs() {
        return args;
    }
}
