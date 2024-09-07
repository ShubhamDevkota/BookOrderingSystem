import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your gmail");
        sc.nextLine();
        String gmail = sc.nextLine();
        System.out.println("Enter your phone number");
        Long phone = sc.nextLong();

        Customer c1 = new Customer("shubham",id,new ArrayList<>(),gmail,phone);






        // For setting genre
        Genre g1 = new Genre("Fiction","Best");
        Genre g2 = new Genre("SiFi","Boring");
        Genre g3 = new Genre("History","Decent");

//        //Getting Values
//        System.out.println(g1.getName());
//        System.out.println(g2.getName());
//        System.out.println(g1.getDescription());
//        System.out.println(g2.getDescription());
//
//        //Setting Values
//        g1.setName("Horror");
//        System.out.println(g1.getName());


        // For books

        Books b1 = new Books("Flying Cats", "Big Zolo",g1,"Really Good",600, true);
        Books b2 = new Books("Flying Dogs", "Shubham",g2,"Kind of  Good",1000, true);
        Books b3 = new Books("Dogs and Cats", "Devkota",g3,"Informative",500, false);



        List<Books> onSale = new ArrayList<Books>();
        onSale.add(b1);
        onSale.add(b2);
        onSale.add(b3);
        List<BookOrder> bookOrderList = new ArrayList<>();

        System.out.println("Do you want to order books?" +
                "Write true or false");
        boolean b = sc.nextBoolean();

        if(b){
            System.out.println("books on sale are: ");
            for (int i = 0; i < onSale.size(); i++) {
                Books book = onSale.get(i);
                System.out.println("No"+(i+1)+" "+book.getName());
            }

            System.out.println("To get details press 1 else press 2");
            int i = sc.nextInt();
            if(i == 1){
                b1.getBookDetails();
                System.out.println();
                System.out.println();
                b2.getBookDetails();
                System.out.println();
                System.out.println();
                b3.getBookDetails();
                System.out.println();
                System.out.println();

            }
            else{
                System.out.println();
            }


            boolean ordering = true;
            while(ordering){
                System.out.println("Which Book do you want to order press it's number");
                int which_book = sc.nextInt();
                System.out.println("How many do you want to order?");
                int how_many = sc.nextInt();
                if (which_book == 1) {
                    BookOrder bo1 = new BookOrder(1, b1, how_many);
                    bookOrderList.add(bo1);
                } else if (which_book == 2) {
                    BookOrder bo2 = new BookOrder(2, b2, how_many);
                    bookOrderList.add(bo2);
                } else if (which_book == 3) {
                    BookOrder bo3 = new BookOrder(3, b3, how_many);
                    bookOrderList.add(bo3);
                } else {
                    System.out.println("Enter a valid book number");
                }

                System.out.println("Do you want other books?   True or False");
                boolean other_book = sc.nextBoolean();
                if(!other_book){
                    ordering = false;
                }



            }
            Order order1 = new Order(bookOrderList,1,c1);
            int totalAmount = order1.calculateTotalAmount();
            System.out.println("Total amount for your order: " + totalAmount);




            int money=0;
            boolean enoughMoney = false;
            while(!enoughMoney){
                System.out.println("Give Money");
                money = sc.nextInt();
                if(money >= totalAmount){
                    enoughMoney = true;
                }
                else {
                    System.out.println("Give more money");
                }
            }
            int note = (int) (money - totalAmount);
            if (note >= 1000) {
                int times = note / 1000;
                System.out.println("1000 *" + times);
                note = note - (1000 * times);
            }


            if (note >= 500) {
                int times = note / 500;
                System.out.println("500 *" + times);
                note = note - (500 * times);

            }
            if (note >= 100) {
                int times = note / 100;
                System.out.println("100 *" + times);
                note = note - (100 * times);

            }
            if (note >= 50) {
                int times = note / 50;
                System.out.println("50 *" + times);
                note = note - (50 * times);

            }
            if (note >= 20) {
                int times = note / 20;
                System.out.println("20 *" + times);
                note = note - (20 * times);

            }
            if (note >= 10) {
                int times = note / 10;
                System.out.println("10 *" + times);
                note = note - (10 * times);

            }
            if (note >= 5) {
                int times = note / 5;
                System.out.println("5 *" + times);
                note = note - (5 * times);

            }
            c1.getOrders().add(order1);

            c1.printAllOrders();




        }

        else{
            System.out.println("No books were ordered");
        }










    }
}

