课后作业
1. Mapper在spring管理下其实是单例，为什么可以是一个
单例？ SCOPE -> application
因为mapper在使用时开发人员是不用自己去维护的，每次使用的mapper都是一样的内容，故可以是一个application的。
2. MyBatis在Spring集成下没有mapper的xml文件会不会
报错，为什么？
不会，因为配置文件与注解可以同时存在
3. TypeHandler手写
 位置：https://github.com/lianrongfa/projects/blob/master/common/src/main/java/cn/lianrf/mybatis/typehandler/TestTypeHandler.java
4. 手写Plugin,多个interceptor到底谁先执行？顺序由谁
决定的？
 由配置顺序决定，在org.mybatis.spring.SqlSessionFactoryBean的451行可验证
    if (!isEmpty(this.plugins)) {
      for (Interceptor plugin : this.plugins) {
        configuration.addInterceptor(plugin);
        if (LOGGER.isDebugEnabled()) {
          LOGGER.debug("Registered plugin: '" + plugin + "'");
        }
      }
    }

