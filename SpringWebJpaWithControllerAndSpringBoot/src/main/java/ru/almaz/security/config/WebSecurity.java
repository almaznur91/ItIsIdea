//package ru.almaz.security.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//import javax.sql.DataSource;
//import javax.xml.crypto.Data;
//
//
//@EnableWebSecurity
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/signUp/**").permitAll()
//                .antMatchers("/confirm/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/signIn")
//                .usernameParameter("userLogin")
//                .passwordParameter("userPassword")
//                .successForwardUrl("/profile")
//                .permitAll()
//                .failureUrl("/signIn?error=true") // на какую страницу перенаправлять с случае фейла
//                .permitAll() // разрешить страницу логина
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/signIn")
//                .and()
//                .rememberMe() // настраиваем функционал "Запомнить меня"
//                .rememberMeParameter("remember-me") // говорим, что параметр будет называться именно так
//                .tokenRepository(persistentTokenRepository()) // говорим, каким репозиторием следует пользоваться, для того, чтобы запомнить пользователя
//                .tokenValiditySeconds(6000)
//                .and()
//                .csrf().disable();
//    }
//
//    // бин, который хранит объект-репозиторий
//    // связанный с таблицей для запоминания сессий
//    @Bean
//    public PersistentTokenRepository persistentTokenRepository() {
//        JdbcTokenRepositoryImpl tokenRepository =
//                new JdbcTokenRepositoryImpl();
//        tokenRepository.setDataSource(dataSource);
//        return tokenRepository;
//    }
//}
//    // сконфигуривали безопасность для работы с нашим UserDetailsImpl и PasswordEncoder
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
////    }
////}
