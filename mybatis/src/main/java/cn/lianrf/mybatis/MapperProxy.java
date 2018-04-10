package cn.lianrf.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
        Select select = method.getAnnotation(Select.class);
        if(select==null){
            return method.invoke(this,args);
        }
        String sql = select.value();
        Object param = args[0];
        return session.selectOne(sql,args[0]);
    }
}
