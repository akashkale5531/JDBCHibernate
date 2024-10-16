package com.demo.jpa.Jdbccourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*
    private static String Insert_Query= """
            insert into course(id,name,author)values(2,'Java','Akash');      
            """;
    public void insert() {
        jdbcTemplate.update(Insert_Query);
    }
    */

    private static String Insert_Query= """
            insert into course(id,name,author)values(?,?,?);      
            """;
    public void insert(Course course) {
        jdbcTemplate.update(Insert_Query,course.getId(),course.getName(),course.getAuthor());
    }




}
