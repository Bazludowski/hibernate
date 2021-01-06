package org.openjfx;

import javax.persistence.*;

@Entity
@Table(name = "auta", schema = "baza", catalog = "")
public class AutaEntity {
    private int id;
    private String marka;
    private String model;
    private String itemCondition;
    private Double cena;
    private Integer rokprodukcji;
    private Double przebieg;
    private Double pojemnosc;
    private Integer ilosc;
    private String salon;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Marka")
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Basic
    @Column(name = "Model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "ItemCondition")
    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    @Basic
    @Column(name = "Cena")
    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Basic
    @Column(name = "Rokprodukcji")
    public Integer getRokprodukcji() {
        return rokprodukcji;
    }

    public void setRokprodukcji(Integer rokprodukcji) {
        this.rokprodukcji = rokprodukcji;
    }

    @Basic
    @Column(name = "Przebieg")
    public Double getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(Double przebieg) {
        this.przebieg = przebieg;
    }

    @Basic
    @Column(name = "Pojemnosc")
    public Double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Basic
    @Column(name = "Ilosc")
    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    @Basic
    @Column(name = "Salon")
    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutaEntity that = (AutaEntity) o;

        if (id != that.id) return false;
        if (marka != null ? !marka.equals(that.marka) : that.marka != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (itemCondition != null ? !itemCondition.equals(that.itemCondition) : that.itemCondition != null)
            return false;
        if (cena != null ? !cena.equals(that.cena) : that.cena != null) return false;
        if (rokprodukcji != null ? !rokprodukcji.equals(that.rokprodukcji) : that.rokprodukcji != null) return false;
        if (przebieg != null ? !przebieg.equals(that.przebieg) : that.przebieg != null) return false;
        if (pojemnosc != null ? !pojemnosc.equals(that.pojemnosc) : that.pojemnosc != null) return false;
        if (ilosc != null ? !ilosc.equals(that.ilosc) : that.ilosc != null) return false;
        if (salon != null ? !salon.equals(that.salon) : that.salon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (itemCondition != null ? itemCondition.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        result = 31 * result + (rokprodukcji != null ? rokprodukcji.hashCode() : 0);
        result = 31 * result + (przebieg != null ? przebieg.hashCode() : 0);
        result = 31 * result + (pojemnosc != null ? pojemnosc.hashCode() : 0);
        result = 31 * result + (ilosc != null ? ilosc.hashCode() : 0);
        result = 31 * result + (salon != null ? salon.hashCode() : 0);
        return result;
    }
}
