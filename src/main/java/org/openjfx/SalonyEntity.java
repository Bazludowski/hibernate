package org.openjfx;

import javax.persistence.*;

@Entity
@Table(name = "salony", schema = "baza", catalog = "")
public class SalonyEntity {
    private int id;
    private Double maxpojemnosc;
    private Double pojemnosc;
    private String nazwa;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "maxpojemnosc")
    public Double getMaxpojemnosc() {
        return maxpojemnosc;
    }

    public void setMaxpojemnosc(Double maxpojemnosc) {
        this.maxpojemnosc = maxpojemnosc;
    }

    @Basic
    @Column(name = "pojemnosc")
    public Double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalonyEntity that = (SalonyEntity) o;

        if (id != that.id) return false;
        if (maxpojemnosc != null ? !maxpojemnosc.equals(that.maxpojemnosc) : that.maxpojemnosc != null) return false;
        if (pojemnosc != null ? !pojemnosc.equals(that.pojemnosc) : that.pojemnosc != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maxpojemnosc != null ? maxpojemnosc.hashCode() : 0);
        result = 31 * result + (pojemnosc != null ? pojemnosc.hashCode() : 0);
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        return result;
    }
}
