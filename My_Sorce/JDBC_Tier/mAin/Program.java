package mAin;
import java.util.ArrayList;

import DAO.Deptdao;
import DTO.Dept;

//DTO (Data Transfer Object) -> 
//DAO(Data Access Object) -> CRUD


public class Program {

public static void main(String[] args) {
		//DAO 
		Deptdao DeptList = new Deptdao();
		
		///////////////////////////Multi ROW/////////////////////////////////////////////
		ArrayList<Dept> DList = null;
		
		DList = DeptList.getDeptList();
		
		if(DList != null){
				print(DList);
		}else{
			System.out.println("Data Search Fail");
		}
		////////////////////////////Single ROW///////////////////////////////////////////
		Dept singleDept;
		singleDept = DeptList.getDeptListByDeptno(10);
		if(singleDept != null){
			print(singleDept);
		}else{
			System.out.println("SingleRowData Search Fail");
		}
	
		///////////////////////////////////////Insert row///////////////////////////////////////
		/*
		System.out.println("***********************Insert*********************************");
		Dept d = new Dept();
		d.setDeptno(80);
		d.setDname("IT");
		d.setLoc("busan");
		
		int ResultRow = DeptList.InsertDept(d);
		if(ResultRow > 0){
			System.out.println("Insert Row : " + ResultRow );
		}else{
			System.out.println("Insert Fail");
		}
	*/
	  ///////////////////////////////////////////update row /////////////////////////////////////////////

		System.out.println("***********************UPdate*********************************");
		Dept UpdateData = new Dept();
		UpdateData.setDeptno(80);
		UpdateData.setDname("ITupdate");
		UpdateData.setLoc("seoul");
		
	    int	UpdateResultRow = DeptList.UpdateDept(UpdateData);
		if(UpdateResultRow > 0){
			System.out.println("Update Row : " + UpdateResultRow );
		}else{
			System.out.println("Update Fail");
		}
    /////////////////////////////////////////delete row/////////////////////////////////////////////////////

	    int DeleteResultRow = DeptList.DeleteDept(80);
		if(DeleteResultRow > 0){
			System.out.println("Delete Row : " + DeleteResultRow );
		}else{
			System.out.println("Delete Fail");
		}
	
	}
	public static void print(ArrayList<Dept> list){
		for(Dept d : list){
			System.out.printf("[%d][%s][%s]\n", d.getDeptno() , d.getDname() , d.getLoc());
		}
	}
	public static void print(Dept list){
			System.out.printf("[%d][%s][%s]\n", list.getDeptno() , list.getDname() , list.getLoc());

	}
}
