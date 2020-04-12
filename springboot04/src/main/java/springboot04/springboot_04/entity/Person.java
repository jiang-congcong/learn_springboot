package springboot04.springboot_04.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties将配置文件值绑定到类中，默认从全局配置文件中获取值
 * @Component将这个组件加入spring容器中才能用
 */

@Component//将组件加入spring容器
@ConfigurationProperties(prefix = "person")//方法一：从全局配置文件（application.properties或application.yml）批量注入值
@PropertySource(value = {"classpath:person.properties"})//方法三：从指定文件获取值，先将值写入全局配置文件，再传给类，故要加@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * @Value注入单个值，支持字面量，${key},#{el表达式} 方法二
     */
    //@Value("${person.last-name}")
    private String lastName;
    //@Value("#{10*2}")
    private int age;
    //@Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
