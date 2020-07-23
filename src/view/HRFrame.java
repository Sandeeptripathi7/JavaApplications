package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HRFrame extends JFrame{
	
	JButton ViewSkill_wiseEmployeeList, ViewAllSkills, AddJob,ViewAllJob, ViewSkill_wiseJob, ViewEmployeelist , DeactivateJob,Logout;
	
	public HRFrame(){
		setTitle("HR Frame");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		ViewSkill_wiseEmployeeList=new JButton("Skill_wiseEmployee List");
		ViewSkill_wiseEmployeeList.setBounds(20,50,100,20);
		c.add(ViewSkill_wiseEmployeeList);
		
		ViewAllSkills=new JButton("All Skills");
		ViewAllSkills.setBounds(20,100,100,20);
		c.add(ViewAllSkills);
		
		AddJob=new JButton("Add Job");
		AddJob.setBounds(20,150,100,20);
		
		ViewAllJob=new JButton("All Job");
		ViewAllJob.setBounds(20,200,100,20);
		c.add(ViewAllJob);
		
		ViewSkill_wiseJob=new JButton("Skill_wiseJob");
		ViewSkill_wiseJob.setBounds(20,250,100,20);
		c.add(ViewSkill_wiseJob);
		
		ViewEmployeelist=new JButton("Employee list");
		ViewEmployeelist.setBounds(20,300,100,20);
		c.add(ViewEmployeelist);
		
		DeactivateJob=new JButton("Deactivate Job");
		DeactivateJob.setBounds(20,350,100,20);
		c.add(DeactivateJob);
		
		Logout=new JButton("Logout");
		Logout.setBounds(20,400,100,20);
		c.add(Logout);
		
		setVisible(true);
	}
}

