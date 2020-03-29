package viewtem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import dao.userDao;
import modleltem.user;

//import dao.UserDao;
//import modleItem.User;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 * 
 * @author JYF
 *
 */

public class userInfoCreat extends JPanel {
	
	private JTextField userId;
	private JTextField userName;	
	
	
	private JComboBox sex;
	private JComboBox department;
	private JTextField post;	
	private JComboBox professionalTitle;
	private JComboBox mTOA_State;
	private JComboBox baseAllowanceState ;
	private JComboBox dutyAllowanceState ;
	private JComboBox telAllowanceState;
	private JComboBox loginAuthority;

	public userInfoCreat() {
		setLayout(null);	
		//windowsBulider 自动生成代码
		JLabel label = new JLabel("姓名：");
		label.setBounds(60, 166, 54, 15);
		add(label);
		
		JLabel label_1 = new JLabel("性别：");
		label_1.setBounds(60, 229, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("职称级别：");
		label_2.setBounds(319, 98, 76, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("职务：");
		label_3.setBounds(60, 355, 54, 15);
		add(label_3);
		
		userName = new JTextField();
		userName.setBounds(116, 162, 128, 21);
		add(userName);
		userName.setColumns(10);
		
		post = new JTextField();
		post.setBounds(116, 354, 128, 21);
		add(post);
		post.setColumns(10);
		
		JLabel label_4 = new JLabel("部门：");
		label_4.setBounds(60, 292, 54, 15);
		add(label_4);
		
		department = new JComboBox();
		department.setModel(new DefaultComboBoxModel(new String[] {"学院领导", "软件工程系", "计算机基础部","数学教学部", "学院办公室", "学院实验中心"}));
		department.setBounds(116, 290, 128, 21);
		add(department);
		
		sex = new JComboBox();
		sex.setModel(new DefaultComboBoxModel(new String[] {"请选择", "男", "女"}));
		sex.setBounds(116, 226, 128, 21);
		add(sex);
		
	    professionalTitle = new JComboBox();
		professionalTitle.setModel(new DefaultComboBoxModel(new String[] {"请选择", "正高-正处", "副高-副处", "中级-正科", "初级-副科", "无"}));
		professionalTitle.setBounds(405, 95, 139, 21);
		add(professionalTitle);
		
		JLabel label_5 = new JLabel("编号：");
		label_5.setBounds(60, 103, 54, 15);
		add(label_5);
		
		userId = new JTextField();
		userId.setBounds(116, 98, 128, 21);
		add(userId);
		userId.setColumns(10);
		
		JLabel label_6 = new JLabel("绩效统计身份：");
		label_6.setBounds(319, 161, 92, 15);
		add(label_6);
		
		mTOA_State = new JComboBox();
		mTOA_State.setModel(new DefaultComboBoxModel(new String[] {"请选择", "院长", "书记", "副院长", "副书记", "工会主席", "院长助理", "学术委主任委员", "系主任-兼职", "部主任-兼职", "行政", "教辅", "专任教师", "无"}));
		mTOA_State.setBounds(405, 158, 139, 21);
		add(mTOA_State);
		
		JLabel label_7 = new JLabel("生活津贴身份");
		label_7.setBounds(319, 224, 92, 15);
		add(label_7);
		
		baseAllowanceState = new JComboBox();
		baseAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"请选择", "院长书记", "副院长-书记", "工会主席", "系部主任", "办公室主任", "团委书记", "学术委主任委员", "院长助理", "办系部副主任", "本科生辅导员", "教学秘书教务", "教授", "副教授", "讲师", "初级", "无"}));
		baseAllowanceState.setBounds(405, 221, 139, 21);
		add(baseAllowanceState);
		
		JLabel label_8 = new JLabel("职务津贴身份：");
		label_8.setBounds(319, 287, 92, 15);
		add(label_8);
		
		dutyAllowanceState = new JComboBox();
		dutyAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"请选择", "院长书记 ", "副院长-书记", "工会主席 ", "办公室主任", "团委书记 ", "继教办主任", "各中心主任  ", "各中心副主任", "各办副主任", "本科生辅导员", "本科生班主任", "教学秘书", "科研秘书", "党务秘书", "党支部书记", "工会委员", "学生科研负责人 ", "学院网站维护 ", "微信公众号维护", "无"}));
		dutyAllowanceState.setBounds(405, 284, 139, 21);
		add(dutyAllowanceState);
		
		JLabel label_9 = new JLabel("电话补贴身份：");
		label_9.setBounds(319, 350, 92, 15);
		add(label_9);
		
		 telAllowanceState = new JComboBox();
		telAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"请选择", "院长书记", "副院长书记", "院长助理", "工会主席", "办公室主任", "团委书记", "学术委主任委员", "各系部门主任", "各部门副主任", "本科生辅导员", "党务秘书", "教务员", "教学秘书", "科研秘书", "无"}));
		telAllowanceState.setBounds(405, 347, 139, 21);
		add(telAllowanceState);
		
		JLabel label_10 = new JLabel("用户系统登录身份（用户权限）：");
		label_10.setBounds(64, 400, 180, 15);
		add(label_10);
		
		loginAuthority = new JComboBox();
		loginAuthority.setModel(new DefaultComboBoxModel(new String[] {"教师", "财务员", "财务主管领导"}));
		loginAuthority.setBounds(254, 397, 107, 21);
		add(loginAuthority);
		
		JLabel label_11 = new JLabel("添加新用户");
		label_11.setFont(new Font("华文行楷", Font.PLAIN, 22));
		label_11.setBounds(265, 27, 216, 40);
		add(label_11);	
		
		JButton creatUserBt = new JButton("创 建 用 户");	
		//TODO　无 dao.UserDao modleItem.User
		//通过UserDao和User创建用户
		creatUserBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user user = new user();
				user.setUserId(userId.getText());
				user.setUserName(userName.getText());
				user.setUserPsw("abc123456");
				user.setSex(sex.getSelectedItem().toString());
				user.setDepartment(department.getSelectedItem().toString());
				user.setPost(post.getText());
				user.setProfessionalTitle(professionalTitle.getSelectedItem().toString());
				user.setmTOA_State(mTOA_State.getSelectedItem().toString());
				user.setBaseAllowanceState(baseAllowanceState.getSelectedItem().toString());
				user.setDutyAllowanceState(dutyAllowanceState.getSelectedItem().toString());
				user.setTelAllowanceState(telAllowanceState.getSelectedItem().toString());
				user.setLoginAuthority(loginAuthority.getSelectedItem().toString());
				
				userDao userDao = new userDao();
				int n = userDao.addUser(user);
				
				if(n==1)
				{
					JOptionPane.showMessageDialog(null, "添加用户成功", "提示信息" ,JOptionPane.OK_OPTION);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"添加用户不成功", "提示信息", JOptionPane.WARNING_MESSAGE);
				}
				
				
			}
		});
		

		creatUserBt.setBounds(252, 448, 143, 23);
		add(creatUserBt);
	}
	
	

}
