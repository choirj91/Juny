package DB_Model_util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object[][] data;
	String[] columnName;
	int rows, cols;

	@Override
	public int getColumnCount() {
		
		return columnName.length;
	}

	@Override
	public int getRowCount() {
		
		return data.length;
	}
public void getRowCount(ResultSet rsScroll)  {
	try {
		rsScroll.last();	//레코드에 마지막 행으로 커서 이동.
		rows = rsScroll.getRow();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return data[rowIndex][columnIndex];
	}
	public void setData(ResultSet rs){
		try {
			ResultSetMetaData rsmd = rs.getMetaData();	//데이터에 대한 정보를 얻어옴.
			cols = rsmd.getColumnCount();	//열의 개수를 얻어옴
			columnName = new String[cols];
			
			for (int i = 0; i < cols	; i++) {
				columnName[i] = rsmd.getColumnName(i + 1);	//db의 필드 번호는 1부터 시작하기 때문에 +1				
			}
			data = new Object[rows][cols];
			int r = 0;
			
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					if( i != 1) data[r][i] = rs.getObject(i + 1);	//number type
					else data[r][i] = Util.toKor((String)rs.getObject(i + 1));	// varchar2 type 한글 깨짐 처리.
				}
				
				r++;	//증가
			}
			
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
