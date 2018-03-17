package cn.lianrf.abs;

import cn.lianrf.entity.Person;
import cn.lianrf.entity.Student;
import cn.lianrf.entity.Teacher;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class PersonFactory extends AbstractFactory{
    Person getStudent() {
        return new Student();
    }

    Person getTeacher() {
        return new Teacher();
    }
}
