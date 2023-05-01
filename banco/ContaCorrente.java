package banco;

import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	Scanner input = new Scanner (System.in);
	
	//declaracao de variaveis
	public int contadorTalao, qtd;
	public char continuar;
	
	
	public void pedirTalao () {
		
		System.out.println("Você deseja solicitar talao de cheque?");
		if (movimento<=10||continuar=='N') {
			
			System.out.println("Você deseja solicitar talao de cheque?");
		}
		if (continuar=='S') {
			System.out.println("\nVocê tem direito a três cheques. Quantos cheques deseja solicitar?");
			qtd=input.nextInt();
			
			movimento++;
			
			if (qtd<= 3) {
				
				saldo-=(qtd*30);
			System.out.println("\nSeu saldo atual e:"+saldo);
				
			}
		}else {
			System.out.println("Muito obrigada por ter usado os nossos serviços! :)");
		}
		
	}


	
	}

