package com.itheima;

import com.itheima.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.java2d.pipe.hw.ExtendedBufferCapabilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisdemo {
    public static void main(String[] args) throws IOException {
        //1.加载Mybatis核心配置文件获取SqlSessionFactory。
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.用SqlSessionFactory得到sql

        SqlSession sqlSession =sqlSessionFactory.openSession();

        //3.执行sql语句
        List<User> Users =sqlSession.selectList("test.selectAll");

        List<Frist> Frists =sqlSession.selectList("test.Frist");

        List<Second> Seconds =sqlSession.selectList("test.Second");

        sqlSession.selectList("test.Thirda");

        List<Third> Thirds =sqlSession.selectList("test.Third");

        sqlSession.selectList("test.Fourtha");

        List<Fourth> Fourths =sqlSession.selectList("test.Fourth");

        List<Fifth> Fifths =sqlSession.selectList("test.Fifth");

        //4.打印
        System.out.println(Users);
        System.out.println(Frists);
        System.out.println(Seconds);
        System.out.println(Thirds);
        System.out.println(Fourths);
        System.out.println(Fifths);

        //5.释放资源
        sqlSession.close();
    }
}
