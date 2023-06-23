package com.eazybytes.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    /*
    * requestMatchers representa quais os endpoints serão conferidos,
    * authenticated() define que esses endpoints não podem ser acessados sem autorização
    * o permitAll() permite com que haja o acesso
    */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        .requestMatchers("/notices", "/contact").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();

        /*
        *Configuration to deny all requests
        *  http.authorizedHttpRequests().anyRequest().denyAll();
        * .and().formLogin()
        * .and().httpBasic();
        * return http.build();
        */

        /*
         *Configuration to permit all requests
         * the application is open
         *  http.authorizedHttpRequests().anyRequest().permitAll();
         * .and().formLogin()
         * .and().httpBasic();
         * return http.build();
         */
    }
}
