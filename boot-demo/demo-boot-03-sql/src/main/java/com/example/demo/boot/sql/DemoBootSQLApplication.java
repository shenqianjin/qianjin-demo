package com.example.demo.boot.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBootSQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootSQLApplication.class, args);
		// String url ="jdbc:mysql://qianjin-mysql.mysql.database.azure.com:3306/information_schema?useSSL=true&requireSSL=false";
		// myDbConn = DriverManager.getConnection(url, "qianjin@qianjin-mysql", {your_password});
	}

}
