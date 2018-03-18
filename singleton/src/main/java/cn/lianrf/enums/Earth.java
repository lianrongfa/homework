package cn.lianrf.enums;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public enum Earth {

    EARTH1(1){

    },EARTH2(2){

    };

    private int a;

    Earth(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
