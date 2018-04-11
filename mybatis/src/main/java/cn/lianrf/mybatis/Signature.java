package cn.lianrf.mybatis;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by lianrongfa on 2018/4/11.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Signature {
    Class<?> type();
    String method();
    Class<?> [] args();
}
