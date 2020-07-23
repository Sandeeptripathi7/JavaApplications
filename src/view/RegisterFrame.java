package view;
import javax.swing.*;
import java.awt.event.*;
class Register extends JFrame implements ActionListener{
	JLabel lTitle, lUser,lPassword,lFirstname,lLastname,lEmail,lMobileno;
	JTextField tUser;
	JPasswordField tPassword;
	JTextField tFirstname;
	JTextField tLastname;
	JTextField tEmail;
	JTextField tMobileno;
	
	JButton bregister;
	public Register() {
		setTitle("Registeration Form");
		
		
		lTitle=new JLabel("Registeration Form");
		lTitle.setBounds(450, 20, 150, 25);
		

		lFirstname=new JLabel("First Name");
		lFirstname.setBounds(50,80,150,25);
		lLastname=new JLabel("Last Name");
		lLastname.setBounds(50,160,150,25);
		lEmail=new JLabel("Email Id");
		lEmail.setBounds(50,240,150,25);
		lUser=new JLabel("User Id");
		lUser.setBounds(650, 80, 150, 25);
		lPassword=new JLabel("Password");
		lPassword.setBounds(650, 160, 150, 25);
		lMobileno=new JLabel("Mobile No");
		lMobileno.setBounds(650,240,150,25);

		tFirstname=new JTextField();
		tFirstname.setBounds(200,80,150,25);
		tLastname=new JTextField();
		tLastname.setBounds(200,160,150,25);
		tEmail=new JTextField();
		tEmail.setBounds(200,240,150,25);
		tUser=new JTextField();
		tUser.setBounds(800, 80, 150, 25);
		tPassword=new JPasswordField();
		tPassword.setBounds(800, 160, 150, 25);
		tPassword.setEchoChar('*');
		tMobileno=new JTextField();
		tMobileno.setBounds(800,240,150,25);
		bregister=new JButton("Register");
		bregister.setBounds(450, 400,150, 25);
		bregister.addActionListener(this);
		
		add(lTitle);

		add(lFirstname);
		add(lLastname);
		add(lEmail);
        add(lUser);
		add(lPassword);
		add(lMobileno);

		add(tFirstname);
		add(tLastname);
		add(tEmail);
		add(tUser);
		add(tPassword);
		add(tMobileno);
		add(bregister);
		
		
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
}

public class RegisterFrame {
	public RegisterFrame(){
		new Register();
	}

	}


