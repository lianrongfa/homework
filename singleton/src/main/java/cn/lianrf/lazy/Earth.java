package cn.lianrf.lazy;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class Earth {

    private Earth(){}

    private static Earth earth=null;

    public static Earth getInstance(){
        if(earth==null)
            earth=new Earth();
        return earth;
    }
}
