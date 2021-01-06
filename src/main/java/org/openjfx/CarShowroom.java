package org.openjfx;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.Comparator;
@Entity
@Table(name = "salony")
public class CarShowroom {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    int ID;
    @Column (name = "maxpojemnosc")
    public double maxpojemnosc;
    @Column (name = "pojemnosc")
    public double pojemnosc = 0;
    @Column (name = "Nazwa")
    public String nazwasalonu;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getMaxpojemnosc() {
        return maxpojemnosc;
    }

    public void setMaxpojemnosc(double maxpojemnosc) {
        this.maxpojemnosc = maxpojemnosc;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public String getNazwasalonu() {
        return nazwasalonu;
    }

    public void setNazwasalonu(String nazwasalonu) {
        this.nazwasalonu = nazwasalonu;
    }
//    ArrayList<Vehicle> samochody = new ArrayList<Vehicle>();
//    DefaultTableModel tablica = new DefaultTableModel();
//
//    public DefaultTableModel getTablica() {
//        return tablica;
//    }
//
//    DefaultTableModel setModel(JTable table) {
//
//            tablica.addColumn("Marka");
//            tablica.addColumn("Model");
//            tablica.addColumn("Stan Pojazdu");
//            tablica.addColumn("Rok Produkcji");
//            tablica.addColumn("Przebieg");
//            tablica.addColumn("Pojemnosc");
//        tablica.setColumnCount(6);
//
//        return tablica;
//}
//    public CarShowroom(String nazwasalonu, double maxpojemnosc) {
//        this.nazwasalonu = nazwasalonu;
//        this.maxpojemnosc = maxpojemnosc;
//        this.samochody = new ArrayList<Vehicle>();
//
//    }
//    Comparator<Vehicle> compNazwa = new Comparator<Vehicle>() {
//        @Override
//        public int compare(Vehicle item, Vehicle t1) {
//            return Integer.compare(item.ilosc, t1.ilosc);
//        }
//    };
//
//    void addProduct(Vehicle v) {
//        boolean czydodane = false;
//        if (pojemnosc == 0) {
//            samochody.add(v);
//            pojemnosc += v.ilosc;
//            System.out.println("Dodano samochod");
//        }
//        else if (pojemnosc + v.ilosc <= maxpojemnosc) {
//            for (Vehicle veh : samochody) {
//                if (veh.equals(v)) {
//                    veh.ilosc += v.ilosc;
//                    pojemnosc += v.ilosc;
//                    czydodane = true;
//                    System.out.println("Dodano kolejny samochod do istniejacego");
//                }
//            }
//            if (!czydodane) {
//                samochody.add(v);
//                pojemnosc += v.ilosc;
//                System.out.println("Dodano samochod");
//            }
//        }
//        else {
//            System.err.println("Nie mozna dodac");
//        }
//    }
//    Vehicle getProduct(String v) {
//        boolean czyjest = false;
//        if(samochody.isEmpty()){
//            System.err.println("Twoja lista jest pusta");
//        }
//        else{
//            for(Vehicle veh:samochody){
//                if (veh.model.equals(v)){
//                    czyjest = true;
//                    veh.ilosc-=1;
//                    System.out.println("Zmniejszono ilosc");
//                    if(veh.ilosc ==0){
//                        samochody.remove(veh);
//                        System.out.println("Usunieto element z listy");
//                    }
//                return veh;
//                }
//            }
//        }
//        if(!czyjest){
//            System.err.println("Nie ma takiego produktu");
//        }
//    return null;
//    }
//
//
//    void removeProduct(Vehicle v) {
//        boolean czyjest = false;
//        for(Vehicle veh:samochody){
//            if(veh.equals(v)){
//                samochody.remove(veh);
//                czyjest = true;
//                break;
//            }
//        }
//        if(!czyjest){
//            System.err.println("Nie ma");
//        }
//    }
//
//    Vehicle search(String name) {
//        boolean found = false;
//        for (Vehicle veh:samochody) {
//            if (veh.model.equals(name)) {
//                System.out.println("Znaleziono produkt " + veh.model);
//                found = true;
//                return veh;
//            }
//        }
//        if(!found)
//            System.out.println("Nie znaleziono autka o podanej nazwie");
//        return null;
//    }
//
//
//    Vehicle searchPartial(String name) {
//        for (Vehicle veh : samochody)
//            if (veh.model.contains(name)) {
//                return veh;
//            }
//        return null;
//    }
//    int countByCondition(ItemCondition stan){
//        int i =0;
//        for (Vehicle veh:samochody)
//            if(veh.stan.equals(stan))
//                i++;
//        return i;
//
//    }
//
//    void summary(){
//        for (Vehicle veh : samochody)
//            System.out.println(veh.print());
//    }
//
//    //    void sortByName(){
//////        Collections.sort(samochody);
////    }
//    Vehicle max() {
//        Vehicle max =  Collections.max(samochody, new Comparator<Vehicle>() {
//            @Override
//            public int compare(Vehicle item, Vehicle t1) {
//                return Integer.compare(item.ilosc, t1.ilosc);
//            }
//        });
//        System.out.println("Produkt o najwiekszej ilosci: " + max.marka+ ", "+max.model);
//        return max;
//    }

}
