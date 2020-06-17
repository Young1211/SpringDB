package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDB{
	
	Connection conn; //데이터 베이스와 연결을 위한 객체 
	PreparedStatement pstmt; //sql 문을 데이터베이스에 보내기 위한 객체 
	ResultSet rs;
	
	public OracleDB() { //DB 연결 
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		
		try {
			Class.forName(driver); //jdbc 드라이버 로딩
			System.out.println("jdbc driver 로딩 성공");
			conn =DriverManager.getConnection(url,user,password); //connection 생성 
			System.out.println("오라클 연결 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		}catch(SQLException e) {
			System.out.println("오라클 연결 실패");
		}	
		
	}

	public ResultSet executeQuery(String sql) {
		try { 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		}catch(SQLException e) {
		System.out.println("conn");
		System.out.println(pstmt);
		}
		return rs;
	}
	
	public int executeUpdateQuery(String sql) {
		int result =0;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return result;
	}
	

		

	
	
	public void close() { //자원 해제
		try {
			conn.close();
		}catch(SQLException e) {
			
		}
	}
	
	
	
	
	
	
}