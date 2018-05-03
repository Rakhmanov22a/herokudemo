package kz.kaznitu.lessons.models;

import javax.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bike_id")
    private Long bikeId;

    @Column(name = "bike_model")
    private String bikeModel;

    @Column(name = "bike_color")
    private String bikeColor;

    @Column(name = "bike_year")
    private int bikeYear;

    @ManyToOne
    private MadeIn madeIn;

    public Bike() {
    }

    public Bike(String bikeModel, String bikeColor, int bikeYear, MadeIn madeIn) {
        this.bikeModel = bikeModel;
        this.bikeColor = bikeColor;
        this.bikeYear= bikeYear;
        this.madeIn = madeIn;
    }

    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel= bikeModel;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor= bikeColor;
    }

    public int getBikeYear(){return bikeYear;}

    public void setBikeYear(int bikeYear) {
        this.bikeYear = bikeYear;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn= madeIn;
    }
}
