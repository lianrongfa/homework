package cn.lianrf.mybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lianrongfa on 2018/4/2.
 */
public interface Executor {

    <T> List<T> query(Connection connection, String sql, Object parameter);
}
