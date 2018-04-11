package cn.lianrf.mybatis;

/**
 * Created by lianrongfa on 2018/4/2.
 */
public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SqlSession session = new SqlSession(configuration);
        TestMapper mapper = session.getMapper(TestMapper.class);
        Test test = mapper.selectByPrimaryKey("1");
        System.out.println(test);
    }
}
