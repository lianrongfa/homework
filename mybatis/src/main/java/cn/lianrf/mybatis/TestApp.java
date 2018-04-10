package cn.lianrf.mybatis;

import java.lang.reflect.Method;

/**
 * Created by lianrongfa on 2018/4/3.
 */
public class TestApp {

    public static void main(String[] args) {
        try {
            Method method = Test.class.getMethod("getId");
            String name = method.getDeclaringClass().getName();
            System.out.println(name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
