package cn.lianrf.mybatis;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public class SelectInterceptor implements Interceptor{
    @Override
    public Object interceptor(Invocation invocation) {
        return null;
    }

    @Override
    public Object plugAll(Object target) {
        return Plugin.warp(target);
    }
}
