package com.foth.petinder.Classes.Pet;

import com.foth.petinder.Classes.User.User;

import java.util.ArrayList;

public class Pet {

    private int id;
    private User user;
    private String name;
    private ArrayList<String> photos;
    private String category;
    private boolean forAdoption;
    private boolean forBreeding;

    public Pet() {
    }

    public Pet(int id, User user, String name, ArrayList<String> photos, String category, boolean forAdoption, boolean forBreeding) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.photos = photos;
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

    public ArrayList<String> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<String> photos) {
        this.photos = photos;
    }

    public boolean isForAdoption() {
        return forAdoption;
    }

    public void setForAdoption(boolean forAdoption) {
        this.forAdoption = forAdoption;
    }

    public boolean isForBreeding() {
        return forBreeding;
    }

    public void setForBreeding(boolean forBreeding) {
        this.forBreeding = forBreeding;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
