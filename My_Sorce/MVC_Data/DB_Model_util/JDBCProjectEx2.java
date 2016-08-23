package DB_Model_util;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JDBCProjectEx2 extends JFrame implements ActionListener {

	// component ��ü ����
	JPanel panWest, panSouth; // �����ؽ�Ʈ�ʵ�, �Ʒ��� ��ư
	JPanel p1, p2, p3, p4, p5;
	JTextField txtNo, txtName, txtEmail, txtPhone;
	JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel;

	JTable table; // �˻��� ��ü ���⸦ ���� ���̺� ��ü ����
	// ���º�ȭ�� ���� ���� ����
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	int cmd = NONE;

	MyModel model;
	// db���� ��ü ����
	Connection conn;
	Statement stmt;
	PreparedStatement pstmtInsert, pstmtDelete;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;

	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "jun";
	private String pwd = "oracle";

	private String sqlInsert = "insert into Customers values(?, ?, ?, ?)";
	private String sqlDelete = "delete from Customers where name = ?";
	private String sqlTotal = "select * from Customers";
	private String sqlSearch = "select * from Customers where name = ?	";

	public void dbConnect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			pstmtInsert = conn.prepareStatement(sqlInsert);
			pstmtTotal = conn.prepareStatement(sqlTotal);
			pstmtSearch = conn.prepareStatement(sqlSearch);
			pstmtDelete = conn.prepareStatement(sqlDelete);

			pstmtTotalScroll = conn.prepareStatement(sqlTotal, ResultSet.TYPE_SCROLL_SENSITIVE, // Ŀ��
																								// �̵���
																								// �����Ӱ�
																								// �ϰ�,
																								// ������Ʈ
																								// ������
																								// �ݿ���.
					ResultSet.CONCUR_UPDATABLE // resultset object �� ������ ���� <==>
												// CONCUR_READ_ONLY
			);

			pstmtSearchScroll = conn.prepareStatement(sqlSearch, ResultSet.TYPE_SCROLL_SENSITIVE, // Ŀ��
																									// �̵���
																									// �����Ӱ�
																									// �ϰ�,
																									// ������Ʈ
																									// ������
																									// �ݿ���.
					ResultSet.CONCUR_UPDATABLE // resultset object �� ������ ���� <==>
												// CONCUR_READ_ONLY
			);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JDBCProjectEx2() { // �������Լ�.
		// component ���
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("��    ȣ"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);

		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("��    ��"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);

		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("��  ��  ��"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);

		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("��ȭ��ȣ"));
		p4.add(txtPhone = new JTextField(12));
		panWest.add(p4);

		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);

		add(panWest, "West");

		// button ȭ�� �Ʒ� ���
		panSouth = new JPanel();
		panSouth.add(btnTotal = new JButton("��ü����"));
		panSouth.add(btnAdd = new JButton("��     ��"));
		panSouth.add(btnDel = new JButton("��     ��"));
		panSouth.add(btnSearch = new JButton("��     ��"));
		panSouth.add(btnCancel = new JButton("��     ��"));
		add(panSouth, "South");

		// event ó��
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);

		// ���̺� ��ü ����
		add(new JScrollPane(table = new JTable()), "Center");
		// close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���� â ���
		setBounds(100, 100, 700, 300); // setSize(W,H); pack();
		setVisible(true);
		dbConnect();

	} // constuctor end

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btnAdd) {
			if (cmd != ADD) { // if( 0 != 1){}
				setText(ADD); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			add();// �߰�

		} else if (obj == btnDel) {
			if (cmd != DELETE) {
				setText(DELETE); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			
			del();// ����

		} else if (obj == btnSearch) {
			if (cmd != SEARCH) {
				setText(SEARCH); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			 search(); //�˻�

		} else if (obj == btnTotal) {
			setTitle(e.getActionCommand());
			total();
			return;
		 //��ü����
		}
		setText(NONE);
		init(); // �ʱ�ȭ �޼ҵ�, user method
		return;
	}// actionPerformed end

	private void search() {
		String strName = Util.toLatin(txtName.getText());	//�ѱ۱���ó��
		
		if (strName.length()<1) {
			JOptionPane.showInternalMessageDialog(null, "�̸��� �ʼ�������~");
			return;
		}
		try {
			pstmtSearchScroll.setString(1, Util.toKor(strName));
			ResultSet rsScroll = pstmtSearchScroll.executeQuery();
			pstmtSearch.setString(1, Util.toKor(strName));
			ResultSet rs = pstmtSearch.executeQuery();
			
			if( model == null) model = new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void del() {
		try {
			String strName = Util.toLatin(txtName.getText());	//�ѱ۱���ó��
			if (strName.length()<1) {
				JOptionPane.showInternalMessageDialog(null, "�̸��� �ʼ�������~");
				return;
			}
			
			pstmtDelete.setString(1, strName);
			pstmtDelete.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "��������");
			//JOptionPane.showConfirmDialog(null, "delete sucess");
			total();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void total() {		//��ü���� (select) ��ư �̺�Ʈ ó��.
		try {
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();
			ResultSet rs = pstmtTotal.executeQuery();
			
			if (model == null) 
				model = new MyModel();
				model.getRowCount(rsScroll);
				model.setData(rs);
				table.setModel(model);
				table.updateUI();
			
			
		} catch (Exception e) {
			
		}
		
		
	}

	private void add() {
		try {
			String strNo = txtNo.getText();// �ý�Ʈ �ڽ� ���� ����.
			String strName = txtName.getText();
			String strMail = txtEmail.getText();
			String strPhone = txtPhone.getText();

			if (strNo.length() < 1 || strName.length() < 1) {
				JOptionPane.showMessageDialog(null, "��ȣ�� �̸��� �ʼ� �����Դϴ�. �ٽ� Ȯ���� �ֽʼ�.");
				return; // â�� ������ �ٽ� ���ư��� ��ٷ�����.
			}

			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strMail);
			pstmtInsert.setString(4, strPhone);

			pstmtInsert.executeUpdate(); // insert ����

		} catch (Exception e) {
			e.printStackTrace();

		}
		JOptionPane.showMessageDialog(null, "�߰��ǽ῵");
	}

	private void init() { // �ʱ�ȭ �޼ҵ�
		txtNo.setText("");
		txtNo.setEditable(false);
		txtName.setText("");
		txtName.setEditable(false);
		txtEmail.setText("");
		txtEmail.setEditable(false);
		txtPhone.setText("");
		txtPhone.setEditable(false);
	}// init() end

	private void setText(int command) {
		switch (command) {
		case ADD:
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtPhone.setEditable(true);
			break;
		case DELETE:
		case SEARCH:
			txtName.setEditable(true);
			break;
		}// switch end

		setButton(command); // user method
	}// setText() end

	private void setButton(int command) {
		// cancel button �����ϰ� � ��ư�� �������� ��� ��ư�� ��Ȱ��ȭ
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);

		switch (command) {
		case ADD:
			btnAdd.setEnabled(true);
			cmd = ADD;
			break;
		case DELETE:
			btnDel.setEnabled(true);
			cmd = DELETE;
			break;

		case SEARCH:
			btnSearch.setEnabled(true);
			cmd = SEARCH;
			break;
		case TOTAL:
			btnTotal.setEnabled(true);
			cmd = TOTAL;
			break;
		case NONE:
			btnTotal.setEnabled(true);
			btnAdd.setEnabled(true);
			btnDel.setEnabled(true);
			btnSearch.setEnabled(true);
			btnCancel.setEnabled(true); //
			cmd = NONE;
			break;
		}// switch end
	}// setButton end

	public static void main(String[] args) {
		new JDBCProjectEx2();
	} // end main
}