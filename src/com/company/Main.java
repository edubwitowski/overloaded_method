package com.company;


import java.util.*;
public class Main {


    class newCustomer {
        private int cuID;
        private String cusName;
        private int cusPhone;



        public void Data() {

            cuID = 100;
            cusName = "New Customer";
            cusPhone = 10;
        }


         public int getcuID() {
            return cuID;
        }

        public int setcuID() {
            this.cuID = cuID;
        }

        public String getcusName() {
            return cusName;
        }
        public String setcusName() {
              return cusName;

        }

        public int getcusPhone() {
            return cusPhone;
        }

        public void setcusPhone() {
            this.cusPhone = cusPhone;
        }

    }

    public static void main(String args[]) {
        System.out.println("Enter customer selection:");
        newCustomer = newCustomer();
        System.out.println("Customer name is: " + this.getcusName());
        System.out.println("Customer Phone is: " + this.getcusPhone());

    }

     /*static*/newCustomer (String arg[]) {
        Scanner sc = new Scanner(System.in);
            String Customer;
            String Name;
            int cusPhone;
            System.out.println("Enter Customer: ");
            Customer = sc.nextLine();
            System.out.println("Enter customer Name: ");
            Name = sc.nextLine();
            cusPhone = Integer.parseInt(cusPhone);
            return Customer (1, Name, cusPhone);
        }
    }

