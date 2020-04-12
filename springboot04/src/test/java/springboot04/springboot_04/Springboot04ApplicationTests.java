package springboot04.springboot_04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import springboot04.springboot_04.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean flag = ioc.containsBean("helloService");
        System.out.println("flag="+flag);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
