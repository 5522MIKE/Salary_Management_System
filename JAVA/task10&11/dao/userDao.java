package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


import modleltem.*;


//TODO 无User类



/**
 * 
 * @author JYF
 *
 */

public class userDao {


	private user user = null;
	

	public user getUser(String userId) {
		List<String> list = new ArrayList<>();
		list.add(userId);
		Vector<String> v = null;
		String sql = "select * from user where userId =?";
		try {
			v = baseDao.select(sql, list);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(v!=null)
		{
		user = new user();
		
		user = creatUser(v);
		user.setUserId(v.get(0));
		user.setUserName(v.get(1));
		user.setUserPsw(v.get(2));
		user.setSex(v.get(3));
		user.setDepartment(v.get(4));
		user.setPost(v.get(5));
		user.setProfessionalTitle(v.get(6));
		user.setmTOA_State(v.get(7));
		user.setBaseAllowanceState(v.get(8));
		user.setDutyAllowanceState(v.get(9));
		user.setTelAllowanceState(v.get(10));
		user.setLoginAuthority(v.get(11));		
		}		
		return user;
	}
	
	public user getUserByName(String userName) {
		List<String> list = new ArrayList<>();
		list.add(userName);
		Vector<String> v = null;
		String sql = "select * from user where userId =?";
		try {
			v = baseDao.select(sql, list);
		} catch (SQLException e) {
			//  TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(v!=null)
		{
		user = new user();
		
		user = creatUser(v);
		user.setUserId(v.get(0));
		user.setUserName(v.get(1));
		user.setUserPsw(v.get(2));
		user.setSex(v.get(3));
		user.setDepartment(v.get(4));
		user.setPost(v.get(5));
		user.setProfessionalTitle(v.get(6));
		user.setmTOA_State(v.get(7));
		user.setBaseAllowanceState(v.get(8));
		user.setDutyAllowanceState(v.get(9));
		user.setTelAllowanceState(v.get(10));
		user.setLoginAuthority(v.get(11));		
		}		
		return user;
	}
		

	public Vector<user> getUsers(List<user> userIdList) {
		
		Vector<user> users = new Vector<>();
		Vector<Vector<String>> vectors = new Vector<>();
		String sql = "select * from user";
		List<String> list = new ArrayList<>();
		try {
			vectors = baseDao.selectAll(sql, list);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for(Vector<String> x :vectors)
		{
			user user = new user();
			
			user =  creatUser(x);
			user.setUserId(x.get(0));
			user.setUserName(x.get(1));
			user.setUserPsw(x.get(2));
			user.setSex(x.get(3));
			user.setDepartment(x.get(4));
			user.setPost(x.get(5));
			user.setProfessionalTitle(x.get(6));
			user.setmTOA_State(x.get(7));
			user.setBaseAllowanceState(x.get(8));
			user.setDutyAllowanceState(x.get(9));
			user.setTelAllowanceState(x.get(10));
			user.setLoginAuthority(x.get(11));
			
			users.add(user);
		}
				
		return users;
	}

	public int addUser(user user) {			
		
		 List<String> list = new ArrayList<>();
		 list.add(user.getUserId());
		 list.add(user.getUserName());
		 list.add(user.getUserPsw());
		 list.add(user.getSex());
		 list.add(user.getDepartment());
		 list.add( user.getPost());
		 list.add(user.getmTOA_State());
		 list.add(user.getBaseAllowanceState());
		 list.add( user.getDutyAllowanceState());
		 list.add(user.getTelAllowanceState());
		 list.add(user.getProfessionalTitle());
		 list.add(user.getLoginAuthority());		 	
		
		 String sql1 ="userId,userName,psw,sex,department,post,mTAO_State,baseAllowanceState,dutyAllowanceState,telAllowanceState,professionalTitle,loginAuthority";
		 String sql = "insert into user("+sql1+") values (?,?,?,?,?,?,?,?,?,?,?,?)";
		 
		 return baseDao.insert(sql, list);
	}
////更新用户信息
	public int updateUser(user user) {
		 List<String> list = new ArrayList<>();						//存储用户信息
		 list.add(user.getUserName());
		 list.add(user.getUserPsw());
		 list.add(user.getSex());
		 list.add(user.getDepartment());
		 list.add( user.getPost());
		 list.add(user.getmTOA_State());
		 list.add(user.getBaseAllowanceState());
		 list.add( user.getDutyAllowanceState());
		 list.add(user.getTelAllowanceState());
		 list.add(user.getProfessionalTitle());
		 list.add(user.getLoginAuthority());
		 
		 list.add(user.getUserId());
		 

//		//更新的SQL语句
		 String sql1 = "userName=?,psw=?,sex=?,department=?,post=?,mTAO_State=?,baseAllowanceState=?,dutyAllowanceState=?,telAllowanceState=?,professionalTitle=?,loginAuthority=?"; 
		 String sql = "update user set "+ sql1+"where UserId=?";
		 
//		//调用数据库操作类进行更新
		 int updateCount =0;			
		 try {
			updateCount = baseDao.update(sql, list);
		} catch (SQLException e) {
			//  TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		 return updateCount;				//返回获取结果为0，则没有更新任何信息
	}
	
    public user creatUser(Vector<String> v)
    {
    	user user = new user();
		user.setUserId(v.get(0));
		user.setUserName(v.get(1));
		user.setUserPsw(v.get(2));
		user.setSex(v.get(3));
		user.setDepartment(v.get(4));
		user.setPost(v.get(5));
		user.setProfessionalTitle(v.get(6));
		user.setmTOA_State(v.get(7));
		user.setBaseAllowanceState(v.get(8));
		user.setDutyAllowanceState(v.get(9));
		user.setTelAllowanceState(v.get(10));
		user.setLoginAuthority(v.get(11));    	
    	return user;
    	
    	
    }

	private user setUser(Vector userAttributes) {
		return null;
	}

	private List getUserAttributesList(user user) {
				
		
		 return null;
	}


}
