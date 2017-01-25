package Package.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by milan on 17.01.2017.
 */
@Entity
public class Waiter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long waiterId;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "waiter", targetEntity = Test.class )
    private List<Test> orders;

    public Waiter () {

    }

    public Waiter (String name, String surname) {
        super ();
        this.name = name;
        this.surname = surname;
    }

    public Waiter (long id, String name, String surname) {
        super ();
        this.waiterId = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return waiterId;
    }

    public void setId(long id) {
        this.waiterId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Test> getOrders() {
        return orders;
    }

    public void setOrders(List<Test> orders) {
        this.orders = orders;
    }
}
