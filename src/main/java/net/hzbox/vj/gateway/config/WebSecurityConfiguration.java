//package net.hzbox.vj.gateway.config;
//
//import javax.servlet.Filter;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;
//
//import net.hzbox.vj.security.LoginAuthenticationEntryPoint;
//import net.hzbox.vj.security.wechat.WechatClientAuthenticationFilter;
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers("/**/favicon.ico",
//                         "/management/**", 
//                         "/company/suite/collback**", 
//                         "/company/register/callback**",
//                         "/company/alipay/alipay_callback",
//                         "/company/alipay/alipay_callback_notify",
//                         "/company/register/index").permitAll()
//            .anyRequest().authenticated()
//                .and()
//            .exceptionHandling()
//                .authenticationEntryPoint(new LoginAuthenticationEntryPoint())
//                .and()
//            .addFilterBefore(wechatClientAuthFilter(), AbstractPreAuthenticatedProcessingFilter.class)
//            .headers().disable()
//            .csrf().disable();
//    }
//
//  
//    @Bean
//    public Filter wechatClientAuthFilter() {
//        WechatClientAuthenticationFilter filter = new WechatClientAuthenticationFilter();
//        return filter;
//    }
//}
