package banco;

import Utilitarios.Utils;

public class ContaEstudantil extends Conta {
		
	double limiteEstudantil= 5000, saldoAtual;
	String continuar, act;
	public void usarEstudantil () {
			if (movimento<=10||continuar=="N") {
			double valor = 0;
			do {
			System.out.println("\nVoce deseja solicitar emprestimo?");
			act=input.next();
			
				if (act!="S") {
					System.out.println("\nO seu limite de emprestimo e R$5.000. Qual valor deseja solicitar?");
					valor=input.nextDouble();
					
										
					if(limiteEstudantil>=valor) {
						saldo+=valor;
						limiteEstudantil-=valor;
					
					System.out.println("\nO seu saldo atual e: "+ Utils.doubleToString(saldo));
					System.out.println("\nLimite de emprestimo estudantil disponivel: "+ Utils.doubleToString(limiteEstudantil));
									
					movimento++;
					}else {
						System.out.println("\nValor invalido. O seu limite de emprestimo e R$5000. Tente novamente");
					}
				}
				} while (limiteEstudantil<=valor);
	
			}else {
				System.out.println("\nObrigada por utilizar nossos servicos");
			}
	}
}

