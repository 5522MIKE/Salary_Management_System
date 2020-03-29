package com.Dao;

import modleItem.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 用户封装类
 * @author MikyMing
 * @data 2020/3/26 - 19:46
 */
public class userDao {

    private User user = null;


    public User getUser(String userId) {
        return null;
    }

    public User getUserByName(String userName) {
        return null;
    }


    public Vector<User> getUsers(List userIdList) {
        return null;
    }

    public int addUser(User user) {

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

        return BaseDao.insert(sql, list);
    }

    public int updateUser(User user) {
        return 0;
    }

    public User creatUser(Vector<String> v) {
        return null;
    }

    private User setUser(Vector userAttributes) {
        return null;
    }

    private List getUserAttributesList(User user) {


        return null;
    }

}
