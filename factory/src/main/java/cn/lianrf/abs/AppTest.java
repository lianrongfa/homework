package cn.lianrf.abs;

import cn.lianrf.simple.SimpleFacotry;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class AppTest {
    public static void main(String[] args) {
        PersonFactory facotry = new PersonFactory();
        System.out.println(facotry.getStudent());
        System.out.println(facotry.getTeacher());
    }
}
