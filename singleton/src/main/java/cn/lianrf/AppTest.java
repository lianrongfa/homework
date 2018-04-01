package cn.lianrf;

import cn.lianrf.lazy.Earth;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class AppTest {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        int i = 100;
        CountDownLatch cdl = new CountDownLatch(i);
        for (int j = 0; j < i; j++) {
            new Thread(()->{
                try {
                    cdl.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Earth.getInstance());
            }).start();

            cdl.countDown();
        }
        System.out.println(cdl.getCount());
    }

    public static void test2() {
        try {
            Class<?> aClass = Class.forName("cn.lianrf.securitylazy.Earth");
            Constructor<?> constructor = aClass.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();

            Object o2 = constructor.newInstance();

            System.out.println(o1);
            System.out.println(o2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test3() {
        cn.lianrf.enums.Earth earth1 = cn.lianrf.enums.Earth.EARTH1;
        cn.lianrf.enums.Earth earth2 = cn.lianrf.enums.Earth.EARTH1;

        earth1.setA(5);
        System.out.println(earth1.getA());
        System.out.println(earth2.getA());
    }
}
