package Package.Entities;

/**
 * Created by milan on 24/01/2017.
 */

import Package.Enums.OrderState;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long TestId;
    private int tableNumber;
    private OrderState orderState;
    private String remarks;
    private boolean isPaid;
    private float balance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "TestWaiter", joinColumns = {
            @JoinColumn(name = "TestId", referencedColumnName = "TestId")}, inverseJoinColumns = {
            @JoinColumn(name = "waiterId", referencedColumnName = "waiterId")})
    private Waiter waiter;

    public Test () {}

    public Test (long id, int tableNumber, String remarks, OrderState orderState, boolean isPaid, float balance) {
        super();
        this.TestId = id;
        this.tableNumber = tableNumber;
        this.remarks = remarks;
        this.orderState = orderState;
        this.isPaid = isPaid;
        this.balance = balance;
    }

    public long getId() {
        return TestId;
    }

    public void setId(long id) {
        this.TestId = id;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonIgnore
    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setIsPaid(boolean isPaid) {
        this.setPaid(isPaid);};

    public boolean getIsPaid() {
        return isPaid();}

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

