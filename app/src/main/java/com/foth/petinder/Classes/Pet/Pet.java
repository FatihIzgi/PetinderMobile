package com.foth.petinder.Classes.Pet;

import com.foth.petinder.Classes.User.User;

public class Pet {

    private int id;
    private User user;
    private String name;
    private String photo;
    private String category;
    private boolean forAdoption;
    private boolean forBreeding;



    public Pet(int id, User user, String name, String photo, String category, boolean forAdoption, boolean forBreeding) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.photo = photo;
        this.category = category;
        this.forAdoption = forAdoption;
        this.forBreeding = forBreeding;
        if(forAdoption){
            PetListProviderForAdoption.addAnimalToTheAdoptionList(this);
        }
        if(forBreeding){
            PetListProviderForBreeding.addAnimalToTheList(this);
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
