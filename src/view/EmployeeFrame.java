package view;
import java.awt.Container;

import javax.swing.*;

class EmployeeFrame extends JFrame{
	
	
	JButton ViewProfile,UpdateProfile, UpdateSkill, ApplyJob, Logout;
	
	EmployeeFrame(){
		setTitle("Employee Frame");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		
		ViewProfile=new JButton("View Profile");
		ViewProfile.setBounds(20,50,100,20);
		c.add(ViewProfile);
		
		UpdateProfile=new JButton("Update Profile");
		UpdateProfile.setBounds(20,100,100,20);
		c.add(UpdateProfile);
		
		UpdateSkill=new JButton("Update Skill");
		UpdateSkill.setBounds(20,150,100,20);
		c.add(UpdateSkill);
		
		ApplyJob=new JButton("Apply Job");
		ApplyJob.setBounds(20,200,100,20);
		c.add(ApplyJob);
		
		Logout=new JButton("Logout");
		Logout.setBounds(20,250,100,20);
		c.add(Logout);
		
		
		setVisible(true);
	}
}

