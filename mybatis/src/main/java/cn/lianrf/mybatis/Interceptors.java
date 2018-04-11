package cn.lianrf.mybatis;

import java.lang.annotation.*;

/**
 * Created by lianrongfa on 2018/4/11.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Interceptors {
    Signature [] value();
}

