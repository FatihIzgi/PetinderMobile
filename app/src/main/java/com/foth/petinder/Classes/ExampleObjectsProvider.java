package com.foth.petinder.Classes;
import com.foth.petinder.Classes.Pet.Pet;
import com.foth.petinder.Classes.User.User;

import java.util.ArrayList;

public class ExampleObjectsProvider {

    private static ArrayList<String> kopek1Photos = new ArrayList<>();
    private static ArrayList<String> kopek2Photos = new ArrayList<>();
    private static ArrayList<String> kopek3Photos = new ArrayList<>();
    private static ArrayList<String> kopek4Photos = new ArrayList<>();

    private static ArrayList<String> kedi1Photos = new ArrayList<>();
    private static ArrayList<String> kedi2Photos = new ArrayList<>();
    private static ArrayList<String> kedi3Photos = new ArrayList<>();


    private static ArrayList<String> balik1Photos = new ArrayList<>();
    private static ArrayList<String> kus1Photos = new ArrayList<>();
    private static ArrayList<String> kus2Photos = new ArrayList<>();
    private static ArrayList<String> tavsan1Photos = new ArrayList<>();
    private static ArrayList<String> kaplumbaga1Photos = new ArrayList<>();
    private static ArrayList<String> orumcek1Photos = new ArrayList<>();

    private static void fillPhotos(){
        kopek1Photos.add("dog");
        kopek1Photos.add("dog2");
        kopek1Photos.add("dog3");
        kopek1Photos.add("dog4");
        kopek2Photos.add("dog2");
        kopek3Photos.add("dog3");
        kopek3Photos.add("dog4");
        kopek4Photos.add("dog4");
        kopek4Photos.add("dog3");
        kopek4Photos.add("dog");

        kedi1Photos.add("cat");
        kedi1Photos.add("cat2");
        kedi2Photos.add("cat2");
        kedi3Photos.add("cat");

        balik1Photos.add("balik1");
    }

    public static void provideRandomUserAndPetObjectsForAdoption(){

        fillPhotos();

        User user = new User(1,"Zehra Yıldırım");
        User user2 = new User(2,"Kullanıcı2");
        User user3 = new User(3,"Kullanıcı3");
        User user4 = new User(4,"Kullanıcı4");
        User user5 = new User(1,"Kullanıcı5");
        User user6 = new User(2,"Kullanıcı6");
        User user7 = new User(3,"Kullanıcı7");
        User user8 = new User(4,"Kullanıcı8");

        Pet pet0 = new Pet(3,user,"Alice In Dreamland",kopek1Photos,"Köpek",true,false);
        Pet pet3 = new Pet(3,user2,"Köpek2",kopek2Photos,"Köpek",true,false);
        Pet pet6 = new Pet(2,user3,"Köpek3",kopek3Photos,"Köpek",true,false);
        Pet pet7 = new Pet(3,user3,"Köpek4",kopek4Photos,"Köpek",true,false);

        Pet pet1 = new Pet(1,user,"Kedi1",kedi1Photos,"Kedi",true,false);
        Pet pet4 = new Pet(4,user3,"Kedi2",kedi2Photos,"Kedi",true,false);
        Pet pet2 = new Pet(4,user3,"Kedi3",kedi3Photos,"Kedi",true,false);


        Pet pet8 = new Pet(3,user4,"Balık1",balik1Photos,"Balık",true,false);

    }

    public static void provideRandomUserAndPetObjectsForBreeding(){

        fillPhotos();

        User user5 = new User(1,"Kullanıcı5");
        User user6 = new User(2,"Kullanıcı6");
        User user7 = new User(3,"Kullanıcı7");
        User user8 = new User(4,"Kullanıcı8");


        Pet pet10 = new Pet(3,user5,"Köpek1",kopek1Photos,"Köpek",false,true);
        Pet pet13 = new Pet(3,user6,"Köpek2",kopek2Photos,"Köpek",false,true);
        Pet pet16 = new Pet(2,user7,"Köpek3",kopek3Photos,"Köpek",false,true);
        Pet pet17 = new Pet(3,user8,"Köpek4",kopek4Photos,"Köpek",false,true);

        Pet pet11 = new Pet(1,user6,"Kedi1",kedi1Photos,"Kedi",false,true);
        Pet pet14 = new Pet(4,user7,"Kedi2",kedi2Photos,"Kedi",false,true);
        Pet pet12 = new Pet(4,user5,"Kedi3",kedi3Photos,"Kedi",false,true);


        Pet pet18 = new Pet(3,user5,"Balık1",balik1Photos,"Balık",false,true);

    }

}
