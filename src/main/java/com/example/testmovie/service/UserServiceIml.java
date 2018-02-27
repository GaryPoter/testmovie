package com.example.testmovie.service;

import com.example.testmovie.DAO.User;
import com.example.testmovie.utils.Table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;


public interface UserServiceIml {
    ArrayList<User> getAll(Table table);

    ArrayList<User> getObjByNotDefineName(Table table);

    User getObjById(Table table);

    ArrayList<User> getObjByName(Table table);

    int addObj(Table table);

    int deleteObjById(Table table);

    int deleteObjByName(Table table);

    int updateObj(Table table);
}
