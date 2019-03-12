package org.spring.springboot.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
/*
    CommandLineRunner为启动加载类，用来实现在项目启动后执行功能
 */
public class DatasourceApplication  implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DatasourceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info(dataSource.toString());
    }
}
