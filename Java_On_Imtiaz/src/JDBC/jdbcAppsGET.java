package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcAppsGET {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			// established Conncetion Object
			Connection conn = DriverManager.getConnection(url, "root", "mysql123");

			// create a statement object to send the database
			Statement statement = conn.createStatement();

			// execute statement object
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

			// process the data
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("salary"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
