package net.hzbox.vj.gateway.config;

//@Configuration
//@EnableRedisHttpSession(redisNamespace="gateway")
public class HttpSessionConfig {

    /**
     * 微信端使用 corpid 区分不同公司session信息
     *
     * 更改 MultiSession cookie 分隔符为下划线_
     * 解决Cookie不符合RFC-6265标准问题
     * 参考：https://github.com/spring-projects/spring-session/issues/615
     *
     * @author Jack
     * @since 09/28/2017
     * @return
     */
//    @Bean
//    public MultiHttpSessionStrategy multiHttpSessionStrategy() {
//        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
//        serializer.setCookieName("JSESSIONID");
//
//        CookieHttpSessionStrategy strategy = new CookieHttpSessionStrategy();
//        strategy.setCookieSerializer(serializer);
//        strategy.setSessionAliasParamName("corpid");
//        strategy.setDeserializationDelimiter("_ ");
//        strategy.setSerializationDelimiter("_");
//
//        return strategy;
//    }
}
