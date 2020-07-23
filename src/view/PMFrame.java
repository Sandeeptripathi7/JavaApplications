package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PMFrame extends JFrame{
	
	JButton ActiveEmployee, DeactiveEmployee, ViewAllEmployee, ViewSelectiveEmployee, AddSkill, ViewAllSkills, DeactiveSkill,Logout;
	
	public PMFrame(){
		setTitle("PM Frame");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		ActiveEmployee=new JButton("ActiveEmployee");
		ActiveEmployee.setBounds(20,50,100,20);
		c.add(ActiveEmployee);
		
		ViewAllSkills=new JButton("All Skills");
		ViewAllSkills.setBounds(20,100,100,20);
		c.add(ViewAllSkills);
		
		DeactiveEmployee=new JButton("DeactiveEmployee");
		DeactiveEmployee.setBounds(20,150,100,20);
		c.add(DeactiveEmployee);
		
		ViewAllEmployee=new JButton("All Employee");
		ViewAllEmployee.setBounds(20,200,100,20);
		c.add(ViewAllEmployee);
		
		ViewSelectiveEmployee=new JButton("Selective Employee");
		ViewSelectiveEmployee.setBounds(20,250,100,20);
		c.add(ViewSelectiveEmployee);
		
		AddSkill=new JButton("Add Skill");
		AddSkill.setBounds(20,300,100,20);
		c.add(AddSkill);
		
		DeactiveSkill=new JButton("Deactive Skill");
		DeactiveSkill.setBounds(20,350,100,20);
		c.add(DeactiveSkill);
		
		Logout=new JButton("Logout");
		Logout.setBounds(20,400,100,20);
		c.add(Logout);
		
		setVisible(true);
	}
}

