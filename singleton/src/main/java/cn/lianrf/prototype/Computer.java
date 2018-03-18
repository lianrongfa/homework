package cn.lianrf.prototype;

import java.io.Serializable;

/**
 * Created by lianrongfa on 2018/3/18.
 */
public class Computer implements Cloneable,Serializable{



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
