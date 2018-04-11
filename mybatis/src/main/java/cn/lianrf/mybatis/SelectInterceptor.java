package cn.lianrf.mybatis;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.List;

/**
 * Created by lianrongfa on 2018/4/10.
 */
@Interceptors(
        {
          @Signature(type = Executor.class, method = "query", args = {Connection.class,String.class,Object.class})
        }
)
public class SelectInterceptor implements Interceptor{
    @Override
    public Object interceptor(Invocation invocation) {

        Executor executor = (Executor)invocation.getTarget();

        Method method = invocation.getMethod();

        Object[] args = invocation.getArgs();
        //拦截，偷换查询参数
        List<Object> query = executor.query((Connection) args[0], (String) args[1], "2");


        return query;
    }

    @Override
    public Object plugAll(Object target) {
        return Plugin.warp(target,this);
    }
}
