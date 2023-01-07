package com.example.myGarden.models;

import jakarta.persistence.*;

@Entity
@Table
public class Flowers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    @ManyToOne()
    @JoinColumn(name = "type_id", insertable = false, updatable = false)
    private Types type;
    @Column(name = "type_id")
    private Long type_id;
    @ManyToOne()
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private Users user;
    @Column(name = "user_id")
    private Long user_id;

    public Flowers() {
    }

    public Flowers(String name, String description, String image, Types type, Long type_id, Users user, Long user_id) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
        this.type_id = type_id;
        this.user = user;
        this.user_id = user_id;
    }

    public Flowers(Long id, String name, String description, String image, Types type, Long type_id, Users user, Long user_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
        this.type_id = type_id;
        this.user = user;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
