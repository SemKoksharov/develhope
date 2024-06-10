
package com.develhope.springiterceptors.configs;

import com.develhope.springiterceptors.interceptors.APILoggingInterceptor;
import com.develhope.springiterceptors.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfiguration implements WebMvcConfigurer {

    private final APILoggingInterceptor apiLoggingInterceptor;
    private final LegacyInterceptor legacyInterceptor;


    @Autowired
    public SpringMVCConfiguration(APILoggingInterceptor apiLoggingInterceptor, LegacyInterceptor legacyInterceptor) {
        this.apiLoggingInterceptor = apiLoggingInterceptor;
        this.legacyInterceptor = legacyInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
