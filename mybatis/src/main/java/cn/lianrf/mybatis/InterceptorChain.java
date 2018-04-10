package cn.lianrf.mybatis;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lianrongfa on 2018/4/10.
 */
public class InterceptorChain {

    private final List<Interceptor> interceptors = new ArrayList<Interceptor>();

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptors) {
            target = interceptor.plugAll(target);
        }
        return target;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    /**
     * @return 不可修改的interceptor集合
     */
    public List<Interceptor> getInterceptors() {
        return Collections.unmodifiableList(this.interceptors);
    }
}
