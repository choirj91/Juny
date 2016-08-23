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
		rsScroll.last();	//���ڵ忡 ������ ������ Ŀ�� �̵�.
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
			ResultSetMetaData rsmd = rs.getMetaData();	//�����Ϳ� ���� ������ ����.
			cols = rsmd.getColumnCount();	//���� ������ ����
			columnName = new String[cols];
			
			for (int i = 0; i < cols	; i++) {
				columnName[i] = rsmd.getColumnName(i + 1);	//db�� �ʵ� ��ȣ�� 1���� �����ϱ� ������ +1				
			}
			data = new Object[rows][cols];
			int r = 0;
			
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					if( i != 1) data[r][i] = rs.getObject(i + 1);	//number type
					else data[r][i] = Util.toKor((String)rs.getObject(i + 1));	// varchar2 type �ѱ� ���� ó��.
				}
				
				r++;	//����
			}
			
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
