package com.demo.jpa.Jdbccourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JDBCRepository jdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        jdbcRepository.insert();
    }
}
