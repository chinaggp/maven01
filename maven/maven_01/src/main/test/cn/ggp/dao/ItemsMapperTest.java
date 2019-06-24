package cn.ggp.dao;

import cn.ggp.domain.Items;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ggp
 * @version V1.0
 * @Package cn.ggp.dao
 * @date 2019/6/15 12:49
 * @Copyright © 2019-2020
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemsMapperTest {
    @Test
    public void testFindById(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper mapper = applicationContext.getBean(ItemsMapper.class);
        Items items = mapper.findById(1);
        System.out.println(items);
    }
}
