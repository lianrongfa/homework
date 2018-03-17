package cn.lianrf.abs;

import cn.lianrf.entity.Person;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public abstract class AbstractFactory {

    abstract Person getStudent();
    abstract Person getTeacher();
}
