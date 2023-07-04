package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests
{
	static
	{
		try
		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Class.forName("org.postgresql.Driver");
//			Class.forName("org.mariadb.jdbc.Driver");
//			Class.forName("com.mysql.jdbc.Driver");
//			org.postgresql.Driver
//			Class.forName("org.postgresql.Driver");
			Class.forName("org.mariadb.jdbc.Driver");

			log.info("!!!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection()
	{
//		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "book_ex", "book_ex"))
//		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/un", "book_ex", "book_ex"))
//		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/un", "book_ex", "book_ex"))
		try (Connection con = DriverManager.getConnection("jdbc:mariadb://221.149.48.232:3306/downdan", "downdan", "Untab12#$12"))

//		jdbc:postgresql://{host}[:{port}]/[{database}]
		{
			log.info(con);
			log.info("======");
		}
		catch (Exception e)
		{
			fail(e.getMessage());
			log.info("@@@");
		}
	}

}
