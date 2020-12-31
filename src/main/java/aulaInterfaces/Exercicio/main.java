package aulaInterfaces.Exercicio;

import aulaInterfaces.Exercicio.entities.Contrato;
import aulaInterfaces.Exercicio.entities.parcelas;
import aulaInterfaces.Exercicio.service.ProcessamentoContrato;
import aulaInterfaces.Exercicio.service.ServicoPagamentoInterface;
import aulaInterfaces.Exercicio.service.ServicoPagamentoPayPalImp;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String [] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o codigo do contrato: ");
         int numContrato = sc.nextInt();
        System.out.print("Digite a data do contrato: ");
         Date dataContrato = simpleDateFormat.parse(sc.next());
        System.out.print("Digite o valor total do contrato: ");
        double valorTotalContrato = sc.nextDouble();
        System.out.print("Digite o numero de parcelas: ");
         int numbParcelas = sc.nextInt();

         Contrato contrato = new Contrato(numContrato,dataContrato,valorTotalContrato);

        ProcessamentoContrato processamentoContrato = new ProcessamentoContrato(new ServicoPagamentoPayPalImp());

        processamentoContrato.processeContract(contrato,numbParcelas);

        System.out.print("Installments: \n");
        for(parcelas par : contrato.getList()){
            System.out.print(par);


        }



    }

}
