package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcAppsINSERT {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		int rowAffected;
		try {
			// established Conncetion Object
			Connection conn = DriverManager.getConnection(url, "root", "mysql123");

			// create a statement object to send the database
			Statement statement = conn.createStatement();

			// execute statement object
			rowAffected = statement.executeUpdate(
					"insert into employees_tbl(id,name,dept,salary) " + "values (900,'tom','salary',7000)");

			// process and result
			System.out.println("Executed an insertion. Row affected: " + rowAffected);

		} catch (SQLException e) {
			System.out.println("Error while insertion");
		}

	}

}
