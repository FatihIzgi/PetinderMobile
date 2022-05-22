package com.foth.petinder.Classes;
import com.foth.petinder.Classes.Pet.Pet;
import com.foth.petinder.Classes.User.User;

public class ExampleObjectsProvider {

    public static void provideRandomUserAndPetObjectsForAdoption(){
        User user = new User(1,"Kullanıcı1");
        User user2 = new User(2,"Kullanıcı2");
        User user3 = new User(3,"Kullanıcı3");
        User user4 = new User(4,"Kullanıcı4");
        User user5 = new User(1,"Kullanıcı5");
        User user6 = new User(2,"Kullanıcı6");
        User user7 = new User(3,"Kullanıcı7");
        User user8 = new User(4,"Kullanıcı8");

        Pet pet0 = new Pet(3,user,"Köpek1","dog","Köpek",true,false);
        Pet pet1 = new Pet(1,user,"Kedi1","cat","Kedi",true,false);
        Pet pet3 = new Pet(3,user2,"Köpek2","dog2","Köpek",true,false);
        Pet pet4 = new Pet(4,user3,"Kedi2","cat2","Kedi",true,false);
        Pet pet6 = new Pet(2,user3,"Köpek3","dog3","Köpek",true,false);
        Pet pet7 = new Pet(3,user3,"Köpek4","dog4","Köpek",true,false);


        Pet pet8 = new Pet(3,user4,"Balık1","balik1","Balık",true,false);
        Pet pet9 = new Pet(1,user4,"Kuş1","kus1","Kuş",true,false);
        Pet pet10 = new Pet(3,user4,"Tavşan1","tavsan1","Tavşan",true,false);
        Pet pet11= new Pet(4,user5,"Kaplumbağa1","kaplumbaga1","Kaplumbağa",true,false);
        Pet pet12 = new Pet(1,user6,"Kuş2","kus2","Kuş",true,false);
        Pet pet13 = new Pet(2,user7,"Örümcek1","orumcek1","Örümcek",true,false);

    }

    public static void provideRandomUserAndPetObjectsForBreeding(){
        User user = new User(1,"Kullanıcı1");
        User user2 = new User(2,"Kullanıcı2");
        User user3 = new User(3,"Kullanıcı3");
        User user4 = new User(4,"Kullanıcı4");
        User user5 = new User(1,"Kullanıcı5");
        User user6 = new User(2,"Kullanıcı6");
        User user7 = new User(3,"Kullanıcı7");
        User user8 = new User(4,"Kullanıcı8");

        Pet pet0 = new Pet(3,user,"Köpek1","dog","Köpek",false,true);
        Pet pet1 = new Pet(1,user,"Kedi1","cat","Kedi",false,true);
        Pet pet3 = new Pet(3,user2,"Köpek2","dog2","Köpek",false,true);
        Pet pet4 = new Pet(4,user3,"Kedi2","cat2","Kedi",false,true);
        Pet pet6 = new Pet(2,user3,"Köpek3","dog3","Köpek",false,true);
        Pet pet7 = new Pet(3,user3,"Köpek4","dog4","Köpek",false,true);


        Pet pet8 = new Pet(3,user4,"Balık1","balik1","Balık",false,true);
        Pet pet9 = new Pet(1,user4,"Kuş1","kus1","Kuş",false,true);
        Pet pet10 = new Pet(3,user4,"Tavşan1","tavsan1","Tavşan",false,true);
        Pet pet11= new Pet(4,user5,"Kaplumbağa1","kaplumbaga1","Kaplumbağa",true,true);
        Pet pet12 = new Pet(1,user6,"Kuş2","kus2","Kuş",false,true);
        Pet pet13 = new Pet(2,user7,"Örümcek1","orumcek1","Örümcek",false,true);

    }

}
