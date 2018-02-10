package com.example.testmovie.mappers;

import com.example.testmovie.DAO.User;
import com.example.testmovie.utils.Table;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER")
    ArrayList<User> serchAll();

//    Table table = new Table();
//    @Select()
//    ArrayList<User> serchAll();

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User getUserById(@Param("id") Long id);

    @Select("SELECT * FROM USER WHERE ID = #{id} OR NAME = #{name}")
    User getUser(User user);

    @Select("SELECT * FROM USER WHERE NAME = #{name} AND PASWD = #{paswd}")
    User getUserByNameAndPaswd(User user);

    @Insert("INSERT INTO USER(name, paswd) VALUES (#{name}, #{paswd})")
    int addUser(User user);

    @Delete("DELETE FROM USER WHERE ID = #{id}")
    int deleteUser(User user);

    @Update("UPDATE USER SET name=#{name}, paswd=#{paswd} WHERE ID = #{id}")
    int updateUser(User user);
}
