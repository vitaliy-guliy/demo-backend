package com.redhat.demo.webback.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class MotionPicture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int year;
    @Column(nullable = false)
    private String name;
    @Column
    private String imageUrl;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private int rank;
    @Column(nullable = false)
    private boolean isTVShow;

    public MotionPicture(){
    }
    public MotionPicture(
            int id,
            int year,
            String name,
            String imageUrl,
            String genre,
            int rank,
            boolean isTVShow
            ){
        this.id = id;
        this.year = year;
        this.name = name;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.rank = rank;
        this.isTVShow = isTVShow;
    }

    public int getId() {
        return id;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
