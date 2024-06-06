package co.develhope.springinterceptors2.config;

import co.develhope.springinterceptors2.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {

    MonthInterceptor monthInterceptor;

    @Autowired
    public SpringMVCConfig(MonthInterceptor monthInterceptor) {
        this.monthInterceptor = monthInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(monthInterceptor);
    }
}
