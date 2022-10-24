package com.itheima;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        bookDao.getById(1);
    }


}
