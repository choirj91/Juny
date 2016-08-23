package Mvc_Ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

public class DeptDAO {   // controller
	BasicDataSource  ds;
	
	public DeptDAO() {
		ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:xe");
		ds.setUsername("jun");
		ds.setPassword("oracle");
		ds.setInitialSize(4);
	} // constructor end
	
	//DML - select 
	public ArrayList<DeptDTO> select() throws Exception{
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = ds.getConnection();
		String sql = "select * from dept2";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			DeptDTO dto = new DeptDTO();
			dto.setDcode(rs.getInt(1));
			dto.setDname(rs.getString(2));
			dto.setPdept(rs.getInt(3));
			dto.setArea(rs.getString(4));
			list.add(dto);
		}
		return list;
		
		
	}
	// DML - delete
	
		public void delete() throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			conn = ds.getConnection();
			System.out.println("delete dcode number ? ");
			int dcode = new Scanner(System.in).nextInt();
			String sql = "delete dept2 where dcode = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dcode);
			pstmt.executeUpdate(); 
			
			System.out.println("delete success!!!\n\n");
			ArrayList<DeptDTO>  list  = select();
			for( DeptDTO  dto : list ) {
				System.out.println(dto.dcode + "|" + dto.dname + "|" + dto.pdept + "|" + dto.area);
			}
		}
		
		public void insert() throws Exception{
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			conn = ds.getConnection();
			System.out.println("���m���� �ٽ� �߰��� �Ͻð� ���ž���?");
			System.out.println("�� �׷� dcode �Է� �غ�����.");
			int dcode = new Scanner(System.in).nextInt();
			System.out.println("���̸��� �ʾ���� ���� ����?");
			String tt = new Scanner(System.in).next();
			System.out.println("�̹��� pdep ��ȣ �Է�!! ���Ǵ� �Ե�.");
			int pdep = new Scanner(System.in).nextInt();
			
			
		}
	}

