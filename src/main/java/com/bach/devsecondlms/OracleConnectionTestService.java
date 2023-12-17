package com.bach.devsecondlms;

 import org.springframework.beans.factory.annotation.Autowired;
   import org.springframework.jdbc.core.JdbcTemplate;
   import org.springframework.stereotype.Service;

   @Service
   public class OracleConnectionTestService {

       private final JdbcTemplate jdbcTemplate;

       @Autowired
       public OracleConnectionTestService(JdbcTemplate jdbcTemplate) {
           this.jdbcTemplate = jdbcTemplate;
       }

       public void testDatabaseConnection() {
           String result = jdbcTemplate.queryForObject("SELECT 'Connected to Oracle' FROM DUAL", String.class);
           System.out.println("Result: " + result);
       }
   }