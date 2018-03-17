package cn.lianrf.method;

import cn.lianrf.entity.Person;
import cn.lianrf.entity.Student;
import cn.lianrf.entity.Teacher;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class TeacherFacotry implements IFacotry{
    public Person getPerson() {
        return new Teacher();
    }
}
