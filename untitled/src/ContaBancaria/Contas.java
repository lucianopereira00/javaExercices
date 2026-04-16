package ContaBancaria;

import java.util.ArrayList;

public class Contas {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(200);
        ContaBancaria contaBancaria2 = new ContaBancaria(300);
        ContaBancaria contaBancaria3 = new ContaBancaria(400);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(contaBancaria1);
        contas.add(contaBancaria2);
        contas.add(contaBancaria3);

        ContaBancaria contaComMaiorSaldo =  contas.get(0);
        for(ContaBancaria conta : contas){
            if(conta.getSaldo() > contaComMaiorSaldo.getSaldo()){
                contaComMaiorSaldo = conta;
            }
        }
        System.out.println("CONTA COM MAIOR SALDO: " + contaComMaiorSaldo.getSaldo());
    }
}
