package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.openjfx.CarShowroom;

import java.util.Map;
import java.util.TreeMap;

public class CarShowroomContainer {
    Map<String, CarShowroom> salony = new TreeMap<>();

    void addCenter(String nazwa, CarShowroom cs){
        salony.put(nazwa,cs);
    }

    void removeCenter(String nazwa) {salony.remove(nazwa); }

    void findEmpty(){
        boolean jestPusty = false;
        for(Map.Entry<String,CarShowroom> entry : salony.entrySet()) {
            String key = entry.getKey(); //nazwa salonu z mapy
            CarShowroom value = entry.getValue(); //obiekt salonu z mapy
            if(value.pojemnosc == 0){
                jestPusty = true;
                System.out.println("\tSalon " + key + " jest pusty");
            }
        }
        if(!jestPusty)
            System.out.println("Nie ma pustego salonu");

    }
    CarShowroom getShowroom(String nazwa){
        for (Map.Entry<String, CarShowroom> e : salony.entrySet()) {
            String key = e.getKey();
            CarShowroom value = e.getValue();
            if (key.equals(nazwa))
                return value;
        }
        return null;
    }
    ObservableList<String> options = FXCollections.observableArrayList();
    ObservableList<String> getShowrooms(){
        for (Map.Entry<String, CarShowroom> e : salony.entrySet()) {
            String key = e.getKey();
            options.add(key);
        }
//        options.sort(Collator.getInstance());
        return options;
    }
    void summary(){
        for(Map.Entry<String,CarShowroom> entry : salony.entrySet()) {
            String key = entry.getKey(); //nazwa salonu z mapy
            CarShowroom value = entry.getValue(); //obiekt salonu z mapy
            System.out.println(key+ " => " + value.pojemnosc/ value.maxpojemnosc*100 + "%");
        }
    }
    ObservableList<CarShowroom> shwrom(){
        ObservableList<CarShowroom> poptions = FXCollections.observableArrayList();
        poptions.removeAll();
        for (Map.Entry<String, CarShowroom> e : salony.entrySet()) {
            CarShowroom value = e.getValue();
            poptions.add(value);
        }
//        options.sort(Collator.getInstance());
        return poptions;
    }
    String showinfo(CarShowroom dane){
        return ("Nazwa: " +dane.nazwasalonu+ "\nMaksymalna Pojemnosc: "+ dane.maxpojemnosc);
    }
}
