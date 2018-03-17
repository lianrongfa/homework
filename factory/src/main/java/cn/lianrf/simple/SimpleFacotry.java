package cn.lianrf.simple;

import cn.lianrf.entity.Person;
import cn.lianrf.entity.Student;
import cn.lianrf.entity.Teacher;

/**
 * Created by lianrongfa on 2018/3/17.
 */
public class SimpleFacotry {

    public Person getPerson(String name){
        Person person=null;
        if(name.equals("学生")){
            person =new Student();
        }
        else if(name.equals("学生")){
            person =new Teacher();
        }
        return person;
    }
}
