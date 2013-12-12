package at.hammer.jdbc_dao;

import static at.hammer.jooq_generated.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.*;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import at.hammer.jooq_generated.Tables;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/chinook";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(Tables.ARTIST).fetch();
			
			for (Record r : result) {
			    Integer artistid = r.getValue(ARTIST.ARTISTID);
			    String name = r.getValue(ARTIST.NAME);

			    System.out.println("ARTISTID: " + artistid + "\n" + "NAME: " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
		
		
	}
}