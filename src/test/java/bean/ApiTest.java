package bean;

import com.finn.springframework.beans.factory.config.BeanDefinition;
import com.finn.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/*
 * @description: api test
 * @author: Finn
 * @create: 2022/07/18 14:16
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean，这里传入的是一个UserService.class类型
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
                userService_singleton.queryUserInfo();
    }

}
