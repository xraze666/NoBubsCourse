package core.learn.no.bugs.secondTask;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void addPurchase(String item) {
        this.purchaseHistory.add(item);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", purchaseHistory=" + purchaseHistory +
                '}';
    }
}
