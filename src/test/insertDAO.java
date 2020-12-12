package test;
 import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;
 
public class insertDAO {
 public static void main(String[] args) {
	 
	 
 }
	 public static boolean create(DTO dto) throws Exception {

			boolean flag = false;
			Connection con = null;
			Statement stmt = null;
			String id = dto.getId();
			String passwd = dto.getPassword();
			String job = dto.getJob();
			String info = dto.getInfo();

			String sql = "INSERT INTO guest(id, password, job, info) VALUES";

			try {
				sql += "('" + new String(id.getBytes(), "ISO-8859-1") + "','"  
						+ new String(passwd.getBytes(), "ISO-8859-1") + "','"
						+ new String(job.getBytes(), "ISO-8859-1") + "','"
						+ new String(info.getBytes(), "ISO-8859-1") + "')";

				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://127.0.0.1:3306/member", "root", "1234");
				stmt = (Statement) con.createStatement();
				stmt.executeUpdate(sql);

				flag = true;
			} catch (Exception e) {
				System.out.println(e);
				flag = false;
			} finally {

				try {

					if (stmt != null)
						stmt.close();
					if (con != null)
						con.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			return flag;

		}
}