package com.example.testmovie.mappers;

import com.example.testmovie.DAO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    ArrayList<User> serchAll();

    @Select("SELECT * FROM USER WHERE ID = {id}")
    User getUser(@Param("id") Long id);
}
