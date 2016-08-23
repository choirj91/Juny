package Mvc_Ex;

import java.util.ArrayList;

//DTO (Data Transfer Object) -> 
//DAO(Data Access Object) -> CRUD

public class MvcMain {   // view
	
	public static void main(String[] args) throws Exception {
		DeptDAO dao = new DeptDAO();
		
		ArrayList<DeptDTO> list = dao.select();
		
		for( DeptDTO dto : list){
			System.out.println(dto.dcode + " | " + dto.dname +  " | " + dto.pdept + " | " + dto.area);
		}
		
		 dao.delete();
		
	}
}
