package view;
import javax.swing.*;
import controller.EmployeeController;
import model.Employee;

import java.awt.*;
import java.awt.event.*;
public class LoginFrame extends JFrame {
	JLabel lTitle, lUser,lPassword,lMessage,lRole;
	JTextField tUser;
	JPasswordField tPassword;
	JButton bLogin;
	
	public LoginFrame() {
		//registeration button link
		JButton bLogin=new JButton("Login");
		bLogin.setBounds(200,300,150,25);
		add(bLogin);
		bLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String username=tUser.getText();
				String password=tPassword.getText();
				Employee emp=new EmployeeController().Login(username, password);
				if(emp==null){
					RegisterFrame obj = new RegisterFrame();
					dispose();
				}
				else {
					if(emp.getRole()=="HR"){
						HRFrame obj=new HRFrame();
						dispose();
					}	
					else if(emp.getRole()=="PM"){
						PMFrame obj=new PMFrame();
						dispose();
						
					}
					else {
						EmployeeFrame obj=new EmployeeFrame();
						dispose();

					}

				}
			}
			
		});
		
		setTitle("Login Form");
		lTitle=new JLabel("Login Form");
		lTitle.setBounds(180, 20, 150, 25);
		lUser=new JLabel("User Id");
		lUser.setBounds(50, 80, 150, 25);
		lPassword=new JLabel("Password");
		lPassword.setBounds(50, 160, 150, 25);
		lRole=new JLabel("Role");
		lRole.setBounds(50,240,150,25);
		tUser=new JTextField();
		tUser.setBounds(200, 80, 150, 25);
		tPassword=new JPasswordField();
		tPassword.setBounds(200, 160, 150, 25);
		tPassword.setEchoChar('*');
		
		//JcomboBox
		String [] values= {"NA","EMP","HR","PM"};
		JComboBox c1=new JComboBox(values);
		c1.setBounds(200,240,150,25);
		
		
		JButton bRegister=new JButton("Registeration");
		bRegister.setBounds(50, 300,150, 25);

		bRegister.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				RegisterFrame obj = new RegisterFrame();
				dispose();
			}});
		lMessage=new JLabel();
		lMessage.setBounds(120, 320, 320, 25);
		add(lTitle);
		add(lUser);
		add(lPassword);
		add(lRole);
		add(tUser);
		add(tPassword);
		add(c1);
		add(bLogin);
		add(lMessage);
		
		
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	

}
		
