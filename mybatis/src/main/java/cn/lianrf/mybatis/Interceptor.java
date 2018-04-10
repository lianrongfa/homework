package cn.lianrf.mybatis;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public interface Interceptor {
    Object interceptor(Invocation invocation);
}
