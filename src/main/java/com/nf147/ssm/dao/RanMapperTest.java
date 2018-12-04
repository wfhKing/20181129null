package com.nf147.ssm.dao;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageRowBounds;
import com.nf147.ssm.entity.Ran;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class RanMapperTest {

    @Test
    public void selectAll() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        RanMapper mapper = session.getMapper(RanMapper.class);

//        List<Ran> rans = mapper.selectAll(new RowBounds(0,10));
//        for (Ran ran : rans) {
//            System.out.println(ran);
//        }
//
//        System.out.println("============================");

//        PageRowBounds pageRowBounds = new PageRowBounds(0, 10);
//        List<Ran> rans2 = mapper.selectAll(pageRowBounds);
//        for (Ran ran2 : rans2) {
//            System.out.println(ran2);
//        }

        System.out.println("======================================");

        PageHelper.startPage(0,10);
        List<Ran> rans3 = mapper.selectAll();
        for (Ran ran3 : rans3) {
            System.out.println(ran3);
        }
    }
}