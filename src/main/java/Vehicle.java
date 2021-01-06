


import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "auta")
public class Vehicle{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    int ID;
    @Column (name = "Marka")
    public String marka;
    @Column (name = "Model")
    public String model;
    @Column (name = "ItemCondition")
    public String ItemCondition;
    @Column (name = "Cena")
    public double cena;
    @Column (name = "Rokprodukcji")
    public int rok_produkcji;
    @Column (name = "Przebieg")
    public double przebieg;
    @Column (name = "Pojemnosc")
    public double pojemnosc;
    @Column (name = "Ilosc")
    public int ilosc;
    @Column (name = "Salon")
    public String salon;
//    public org.openjfx.ItemCondition stan;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getItemCondition() {
        return ItemCondition;
    }

    public void setItemCondition(String itemCondition) {
        ItemCondition = itemCondition;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public void setState(String zamowiony) {
    }
    //    public Vehicle(String marka, String model, ItemCondition stan, double cena, int rok_produkcji, double przebieg, double pojemnosc, int ilosc, String salon) {
//        this.marka = marka;
//        this.model = model;
//        this.stan = stan;
//        this.cena = cena;
//        this.rok_produkcji = rok_produkcji;
//        this.przebieg = przebieg;
//        this.pojemnosc = pojemnosc;
//        this.ilosc = ilosc;
//        this.salon = salon;
//    }
//
//    String print(){
//        return("\nMarka: "+marka+" \nModel: "+model+" \nStan: "+stan+" \nCena: "+cena+"\nRokProdukcji: "+rok_produkcji+"\nPrzebieg: "+przebieg+"\nPojemnosc: "+pojemnosc+ "Ilosc: "+ilosc);
//    }
//
//    @Override
//    public int compareTo(Vehicle other) {
//        int var1 = this.model.compareTo(other.model);
//        System.out.println("Porownanie auto1: "+this.print()+"\nPorownanie auto2: "+other.print());
//        return 0;
//    }
//    public Vehicle(){
//
//    }
//    public StringProperty markaproperty(){return new SimpleStringProperty(marka);}
//    public StringProperty modelproperty(){return new SimpleStringProperty(model);}
//    public IntegerProperty rokproperty(){return new SimpleIntegerProperty(rok_produkcji);}
//    public DoubleProperty cenaproperty(){return new SimpleDoubleProperty(cena);}
//    public StringProperty salonproperty(){return new SimpleStringProperty(salon);}
}
