package application;

import entities.BusinessConta;
import entities.Conta;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Conta acc = new Conta(1001, "Alex", 0.0);
		BusinessConta bacc = new BusinessConta(1002, "Maria", 0.0, 500.0);
		
//UPPCASTING - PEGA UM OBJETO DO TIPO SUBCLASSE A ATRIBUI PARA O SUPERCLASSE
		Conta acc1 = bacc;
		Conta acc2 = new BusinessConta(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
// DOWNCASTING - OBJETO DA SUPERCLASSE PARA A SUBCLASSE
		
		BusinessConta acc4 = (BusinessConta) acc2;
		acc4.emprestar(100.0);
		
//BusinessConta acc5 = (BusinessConta) acc3; SUBCLASSE convertendo com SUBCLASSE
		if (acc3 instanceof BusinessConta) {
			BusinessConta acc5 = (BusinessConta) acc3;
			acc5.emprestar(500.0);
		}
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.atualizacaoSaldo();
			System.out.println("Atualizado");
			
		}
	}  

}
