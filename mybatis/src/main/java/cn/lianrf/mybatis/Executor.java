package cn.lianrf.mybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lianrongfa on 2018/4/2.
 */
public class Executor {

    public <T> T selectOne(Connection connection,String sql, Object parameter) {

        ResultSet rs = null;
        Test test = null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,String.valueOf(parameter));
            rs = statement.executeQuery();
            if (rs==null) return null;
            test = new Test();
            while (rs.next()){
                test.setId(rs.getString("id"));
                test.settId(rs.getString("t_id"));
                test.settName(rs.getString("t_name"));
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

        return (T)test;
    }
}
