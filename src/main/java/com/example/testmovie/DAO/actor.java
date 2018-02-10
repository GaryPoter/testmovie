package com.example.testmovie.DAO;

public class actor extends Person{
    private Long actMovieId;

    public actor() {
        super();
    }

    public Long getActMovieId() {
        return actMovieId;
    }

    public void setActMovieId(Long actMovieId) {
        this.actMovieId = actMovieId;
    }
}
