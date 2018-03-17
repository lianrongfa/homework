package cn.lianrf.method;

import cn.lianrf.simple.SimpleFacotry;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class AppTest {
    public static void main(String[] args) {
        IFacotry facotry = new StudentFacotry();
        System.out.println(facotry.getPerson());
    }
}
