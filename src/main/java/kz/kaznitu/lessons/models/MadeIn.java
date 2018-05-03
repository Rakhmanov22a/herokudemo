package kz.kaznitu.lessons.models;

import javax.persistence.*;

@Entity
@Table(name = "made_in")
public class MadeIn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "made_in_id")
    private Long madeInId;

    @Column(name = "bike_name")
    private String bikeName;

    @Column(name = "location")
    private String location;

    public MadeIn() {
    }

    public MadeIn(String bikeName, String location) {
        this.bikeName =bikeName;
        this.location = location;
    }

    public Long getMadeInId() {
        return madeInId;
    }

    public void setMadeInId(Long madeInId) {
        this.madeInId= madeInId;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName= bikeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
