package polimorfismoEHerança;

import polimorfismoEHerança.entities.Account;
import polimorfismoEHerança.entities.BusinessAccount;
import polimorfismoEHerança.entities.SavindsAccount;

public class Aplication {
    public static void main(String [] args) {

        Account account = new Account(1001,"ander",0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "joao", 0.0, 500.0);


        //UPCASTING - É quando uma superclasse recebe uma referência da subclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"bob",0.0,200.00);
        Account acc3 = new SavindsAccount(1004,"ana",0.0,0.01);


        //DOWNCASTING - É quando uma subclasse recebe uma referência de uma superclasse

        BusinessAccount acc4 = (BusinessAccount)acc2;

        ((BusinessAccount) acc2).loan(10.00);

        //@Override


        Account acc0 = new Account(1001,"ander",1000.00);
        acc0.withdraw(200.00);
        System.out.println(acc0.getBalance());


        SavindsAccount acc = new SavindsAccount(1001,"ander",1000.00,0.01);
        acc.withdraw(200.00);
        System.out.println(acc.getBalance());


        //super na classe BusinessAccount

        Account ac3 = new BusinessAccount(999,"caio",1000.0,500.00);

        ac3.withdraw(100);
        System.out.println(ac3.getBalance());




    }
}
