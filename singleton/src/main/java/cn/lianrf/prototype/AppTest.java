package cn.lianrf.prototype;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class AppTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Lenovo lenovo = new Lenovo();
        try {

            Thread.sleep(1000);
            Lenovo clone = (Lenovo)lenovo.clone();

            System.out.println(lenovo);
            System.out.println(clone);

            System.out.println(lenovo.getCpu());
            System.out.println(clone.getCpu());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void test2() {
        Samsung samsung = new Samsung();
        try {

            Thread.sleep(1000);
            Samsung clone = (Samsung)samsung.clone();

            System.out.println(samsung);
            System.out.println(clone);

            System.out.println(samsung.getCpu());
            System.out.println(clone.getCpu());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
