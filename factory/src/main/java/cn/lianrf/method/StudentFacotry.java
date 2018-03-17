package cn.lianrf.method;

import cn.lianrf.entity.Person;
import cn.lianrf.entity.Student;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class StudentFacotry implements IFacotry{
    public Person getPerson() {
        return new Student();
    }
}
