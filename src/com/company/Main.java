package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Menneske menneske = new Menneske();

//        ((Mand) menneske).dovn(); kan ikke lade sig gøre



      Menneske mand = new Mand(); // implicit upcast

        ((Mand)mand).dovn(); // explicit downcast;

        Kvinde kvinde = new Kvinde();

        ArrayList <Menneske> arrayList = new ArrayList<>();

        arrayList.add(mand);
        arrayList.add(kvinde);

        System.out.println(arrayList.get(0).behov());
        System.out.println(arrayList.get(1).behov());

        System.out.println(((Mand) arrayList.get(0)).dovn());
        System.out.println(((Kvinde) arrayList.get(1)).knokler());

         // System.out.println(((Kvinde) arrayList.get(0)).knokler());Det kan vi heller ikke fordi vi ikke kan caste en mand til en kvinde i java

        System.out.println(" vi prøver listegennemløbet");

        udSkrivListe(arrayList);


    }




    private static void udSkrivListe(ArrayList<Menneske> arrayList) {
        for (int i = 0; i <arrayList.size() ; i++) {

            if (arrayList.get(i) instanceof Mand) {

                System.out.println(((Mand) arrayList.get(i)).dovn());
            }
        else {
                System.out.println(((Kvinde) arrayList.get(i)).knokler());
            }
        }
    }
}
