
package com.develhope.springiterceptors.configs;

import com.develhope.springiterceptors.interceptors.APILoggingInterceptor;
import com.develhope.springiterceptors.interceptors.LoggedUserInterceptor;
import com.develhope.springiterceptors.interceptors.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfiguration implements WebMvcConfigurer {


    private final APILoggingInterceptor apiLoggingInterceptor;
   // private final TestInterceptor testInterceptor;
    private final LoggedUserInterceptor loggedUserInterceptor;

    @Autowired
    public SpringMVCConfiguration(APILoggingInterceptor apiLoggingInterceptor, LoggedUserInterceptor loggedUserInterceptor) {
        this.apiLoggingInterceptor = apiLoggingInterceptor;
      //  this.testInterceptor = testInterceptor;
        this.loggedUserInterceptor = loggedUserInterceptor;
    }

   @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
     //   registry.addInterceptor(testInterceptor);
        registry.addInterceptor(loggedUserInterceptor);
    }
}
