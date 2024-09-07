package models;


import java.util.List;

public class Customer {
    private String name;
    private int UserId;
    private String gmail;
    private long phone;
    private List<Order> Orders;

    //Constructor

    public Customer(String name, int userId, List<Order> orders, String gmail, long phone) {
        this.name = name;
        UserId = userId;
        Orders = orders;
        this.gmail = gmail;
        this.phone = phone;

    }

    //Getter and  Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> orders) {
        Orders = orders;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    //Get info about  Customer
    public void CusInfo() {
        System.out.println("Name: " + name);
        System.out.println("UserId: " + UserId);
        System.out.println("Gmail: " + gmail);
        System.out.println("Phone: " + phone);

    }

    public void printAllOrders() {
        System.out.println("Orders for Customer: " + name);
        for (Order order : Orders) {
            System.out.println("Order ID: " + order.getId());
            for (BookOrder bookOrder : order.getBookOrders()) {
                Books book = bookOrder.getBook();
                System.out.println("  Book: " + book.getName() +
                        ", Quantity: " + bookOrder.getQuantity() +
                        ", Price per unit: " + book.getPrice());
            }


        }
    }
}
