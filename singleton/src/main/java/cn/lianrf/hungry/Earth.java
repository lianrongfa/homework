package cn.lianrf.hungry;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class Earth {

    private Earth(){}

    private static Earth earth=new Earth();

    public static Earth getInstance(){
        return earth;
    }
}
