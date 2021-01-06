package org.openjfx;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "rating", schema = "baza", catalog = "")
public class RatingEntity {
    private int rateId;
    private int rate;
    private Date date;
    private String opis;
    private int itemId;

    @Id
    @Column(name = "RateID")
    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    @Basic
    @Column(name = "rate")
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "itemID")
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingEntity that = (RatingEntity) o;

        if (rateId != that.rateId) return false;
        if (rate != that.rate) return false;
        if (itemId != that.itemId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rateId;
        result = 31 * result + rate;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + itemId;
        return result;
    }
}
