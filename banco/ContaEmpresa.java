package banco;

import java.io.IOException;
import java.util.Scanner;



public class ContaEmpresa extends Conta {

		double emprestimoEmpresa=100000;
		static String act ;
				
		public void pedirEmprestimo () throws IOException {
			Scanner input = new Scanner (System.in);
			if(movimento<=10) {
			
			System.out.println("\nVoce deseja solicitar um emprestimo?");
			act=input.next();
			
			if(act!="S") {
					
					System.out.println("Informe o valor que deseja solicitar:");	
					double valor=input.nextDouble();
					
					//System.out.println("Valor do emprestimo: \nR$"+ valor);
									
							if(valor<=emprestimoEmpresa) {
							saldo+= valor;
							emprestimoEmpresa-=valor;
							movimento++;							
							
							}else {
								System.out.println("Este valor nao esta disponivel, por gentileza insira outro valor");
							}
				}else{
						System.out.println("Obrigada por usar nossos servicos!");
						
				}
		}else { 
			return;
		}
		}}


