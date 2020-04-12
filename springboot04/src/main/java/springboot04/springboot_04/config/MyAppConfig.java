package springboot04.springboot_04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot04.springboot_04.service.HelloService;

/**
 * @Configuration指明当前类为配置类，不用再写配置文件
 */
@Configuration
public class MyAppConfig {


    /**
     *
     * @Bean将方法的返回值添加到容器中，容器中这个组件的默认id为方法名
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@bean给容器中添加组件");
        return new HelloService();
    }
}
