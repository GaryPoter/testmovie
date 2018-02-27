package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.utils.ConditionalObj;
import com.example.testmovie.utils.Table;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper

public interface ObjMapper<T> {
    @Select("${statement}")
    ArrayList<T> getAll(Table table);

    @Select("${statement}")
    ArrayList<T> getObjByNotDefineName(Table table);

    @Select("${statement}")
    T getObjById(Table table);

    @Select("${statement}")
    ArrayList<T> getObjByName(Table table);

    @Insert("${statement}")
    int addObj(Table table);

    @Delete("${statement}")
    int deleteObjById(Table table);

    @Delete("${statement}")
    int deleteObjByName(Table table);

    @Update("${statement}")
    int updateObj(Table table);
}
