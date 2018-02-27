package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.utils.ConditionalObj;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ActorMapper {

    @Select("SELECT * FROM ACTOR")
    ArrayList<Actor> getAll();

    @Select("SELECT * FROM #{table} WHERE #{col} like #{name}")
    ArrayList<Actor> getActorByNotDefineName(ConditionalObj co);

    @Select("SELECT * FROM ACTOR FROM id = #{id}")
    Actor getActorById(Actor actor);

    @Select("SELECT * FROM ACTOR FROM actor_name = #{actor_name}")
    ArrayList<Actor> getActorByName(Actor actor);

    @Insert("INSERT INTO ACTOR(actorr_name, country_id, description, sex_id) VALUES (#{actor_name}, #{country_id}, #{description}, #{sex_id}")
    int addActor(Actor actor);

    @Delete("DELETE FROM ACTOR WHERE ID = #{id}")
    int deleteActorById(Actor actor);

    @Delete("DELETE FROM ACTOR WHERE actor_name = #{actor_name}")
    int deleteActorByName(Actor actor);

    @Update("UPDATE ACTOR SET actor_name=#{actor_name}, country_id=#{country_id}, description=#{description}, sex_id=#{sex_id} WHERE ID = #{id}")
    int updateActor(Actor actor);
}
