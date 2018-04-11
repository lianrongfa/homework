package cn.lianrf.mybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianrongfa on 2018/4/11.
 */
public class SimpleExecutor implements Executor{

    @Override
    public <T> List<T> query(Connection connection, String sql, Object parameter) {

        List<T> ts = new ArrayList<>();
        ResultSet rs = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            if(parameter!=null)
                statement.setString(1,String.valueOf(parameter));
            rs = statement.executeQuery();
            if (rs==null) return null;
            //此处应该采用反射，偷懒方法
            while (rs.next()){
                Test test = new Test();
                test.setId(rs.getString("id"));
                test.settId(rs.getString("t_id"));
                test.settName(rs.getString("t_name"));

                ts.add((T)test);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(connection!=null)
                connection.close();
            if(rs!=null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return (List<T>)ts;
    }
}
