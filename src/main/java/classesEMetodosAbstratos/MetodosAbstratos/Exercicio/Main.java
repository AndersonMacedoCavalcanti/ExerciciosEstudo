package classesEMetodosAbstratos.MetodosAbstratos.Exercicio;

import classesEMetodosAbstratos.MetodosAbstratos.Exercicio.entities.Pessoa;
import classesEMetodosAbstratos.MetodosAbstratos.Exercicio.entities.PessoaFisica;
import classesEMetodosAbstratos.MetodosAbstratos.Exercicio.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int numberTaxPayers = sc.nextInt();

        for(int i = 0; i < numberTaxPayers; i++ ){
            System.out.println("Taxpayer #"+(i+1)+" data:");
            System.out.print("Individual or company (i/c)? ");
            char opcao = sc.next().charAt(0);
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(opcao == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(nome,anualIncome,healthExpenditures));
            }
            else if (opcao == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(nome,anualIncome,numberOfEmployees));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID");
        for (Pessoa taxes : list) {
            System.out.print(taxes.getNome() + ": $ " + taxes.calcularImposto()+"\n");
        }

        double soma = 0;
        for (Pessoa totalTaxes : list){
            soma+=totalTaxes.calcularImposto();
        }

        sc.close();

        System.out.println("TOTAL TAXES: $ "+soma);
    }
}
