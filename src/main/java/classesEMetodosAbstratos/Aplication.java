package classesEMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;

public class Aplication {
    public static void main(String [] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavindsAccount(1004, "caio", 1320,0.1));
        list.add(new SavindsAccount(1002, "maria", 1000,0.1));
        list.add(new BusinessAccount(1002, "bob",1000,500));

        double soma = 0.0;

        for(Account acc : list){
            soma+= acc.getBalance();
        }

        System.out.println(soma);
    }
}
