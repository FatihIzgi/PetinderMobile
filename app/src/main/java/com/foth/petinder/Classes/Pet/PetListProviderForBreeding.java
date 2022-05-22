package com.foth.petinder.Classes.Pet;

import java.util.ArrayList;

public class PetListProviderForBreeding {

    private static ArrayList<Pet> dogs = new ArrayList<>();
    private static ArrayList<Pet> cats = new ArrayList<>();
    private static ArrayList<Pet> fish = new ArrayList<>();
    private static ArrayList<Pet> rabbits = new ArrayList<>();
    private static ArrayList<Pet> birds = new ArrayList<>();
    private static ArrayList<Pet> turtles = new ArrayList<>();
    private static ArrayList<Pet> spiders = new ArrayList<>();
    private static ArrayList<Pet> hamsters = new ArrayList<>();
    private static ArrayList<Pet> others = new ArrayList<>();
    private static ArrayList<Pet> chosenList = new ArrayList<>();

    public static void addAnimalToTheList(Pet pet){
        if(pet.getCategory().equals("Köpek")){
            dogs.add(pet);
        }
        if(pet.getCategory().equals("Kedi")){
            cats.add(pet);
        }
        if(pet.getCategory().equals("Balık")){
            fish.add(pet);
        }
        if(pet.getCategory().equals("Tavşan")){
            rabbits.add(pet);
        }
        if(pet.getCategory().equals("Kuş")){
            birds.add(pet);
        }
        if(pet.getCategory().equals("Kaplumbağa")){
            turtles.add(pet);
        }
        if(pet.getCategory().equals("Örümcek")){
            spiders.add(pet);
        }
        if(pet.getCategory().equals("Hamster")){
            hamsters.add(pet);
        }
        if(pet.getCategory().equals("Diğer")){
            others.add(pet);
        }
    }

    public static ArrayList<Pet> getTheChosenPetList(String option){
        if(option.equals("Köpek")){
            return dogs;
        }
        if(option.equals("Kedi")){
            return cats;
        }
        if(option.equals("Balık")){
            return fish;
        }
        if(option.equals("Tavşan")){
            return rabbits;
        }
        if(option.equals("Kuş")){
            return birds;
        }
        if(option.equals("Kaplumbağa")){
            return turtles;
        }
        if(option.equals("Örümcek")){
            return spiders;
        }
        if(option.equals("Hamster")){
            return hamsters;
        }
        else {
            return null;
        }
    }

    public static Pet getTheCurrentPet(String option, int counter){
        if(counter>=0 && counter<getTheChosenPetList(option).size()){
            return getTheChosenPetList(option).get(counter);
        }
        else {
            return null;
        }
    }


}
