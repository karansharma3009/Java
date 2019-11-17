package Adapter;

public class AdapterClassDemo {

    public static void main(String[] args) {

        CreditCard cd = new BankCustomer();
        cd.giveBankdetails();
        System.out.println(cd.getCreditCard());

    }

}
