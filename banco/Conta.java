package banco;

import java.io.IOException;
import java.util.Scanner;
import Utilitarios.Utils;

public class Conta {

	Scanner input = new Scanner (System.in);
	
	public int numero=1234, cpf=543221, dataAniversario=15, movimento=0;
	public static int type; 
	protected double saldo=3000;
	private double deposito, valorMovimento, saque;
	public char mov;

	public static char continuar;
	public String nome="Rafaela", email="rafaela@ferreira";
	
		
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorMovimento() {
		return valorMovimento;
	}

	public void setValorMovimento(double valorMovimento) {
		this.valorMovimento = valorMovimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String tipoConta;
	

	
	//Declaracao de Métodos//
		
	void dados () {
		System.out.println(//"Insira os seus dados para acessar a conta:"+
				"\nNumero da conta: " + this.getNumero());
				//numero=input.nextInt();
		System.out.println("Nome: "+this.getNome());
				//nome=input.toString();				
		System.out.println("CPF: " + this.getCpf());
				//cpf=input.nextInt();
		System.out.println("Data do Aniversario: "+ this.getDataAniversario());
				//dataAniversario=input.nextInt();
		System.out.println("Email: "+ this.getEmail());
				//email=input.toString();
		System.out.println("Saldo da conta: " +Utils.doubleToString(this.getSaldo()));
				//saldo=input.nextDouble();
		}
	
	

	public void deposito (double Deposito) {
		deposito=input.nextDouble();
		
		if (deposito>0) {
		saldo+=Deposito;
		
		System.out.println("Seu deposito de "+deposito+ " foi realizado com sucesso!");
		System.out.println("O valor atual do saldo é:"+ Utils.doubleToString(saldo));
		movimento++;
		
		} else{ 
			System.out.println("Poxa, nao foi possivel depositar este valor!");
		}
	} 
	
	public void saque (double Saque) {
		saque=input.nextDouble();
		
		if(saque >0 && saldo>=saque) {
		saldo-=saque;
		
		System.out.println("O valor atual do saldo é:"+ Utils.doubleToString(saldo));
		//System.out.println("O valor atual do limite é:");
		movimento++;
		
	} else {
			System.out.println("\nNao foi possivel realizar o saque, pois não existe saldo suficiente ou valor informado é inválido!");
		}
	
		
	}
	
	public  void telaInicial() throws IOException {
		
		do {
					
		System.out.println("\n*_*_*_*_*_Bem vindo ao Banco Hive_*_*_*_*_*\n"+
			"********* O banco mais seguro do mundo **********"+
			"\nEscolha a conta que deseja se conectar\n"+
				"\n| 1 - CONTA POUPANCA  |"+
				"\n| 2 - CONTA CORRENTE  |"+
				"\n| 3 - CONTA ESPECIAL  |"+
				"\n| 4 - CONTA EMPRESA   |"+
				"\n| 5 - CONTA ESTUDANTIL|"+
				"\n| 6 - SAIR 			 |"+
				"\n\nINFORME O CODIGO DA OPCAO DESEJADA: ");
				type=input.nextInt();
		
				if (type<=0||type>6) {
					System.out.println("\nOps!Informacao Invalida! Escolha outra opcao...\n");
				} else {			
				
					switch (type) {
		
					case 1:
						tipoConta="Conta Popanca";
						break;
					case 2:
						tipoConta="Conta Corrente";
						break;
					case 3: 
						tipoConta="Conta Especial";
						break;
					case 4: 
						tipoConta= "Conta Empresa";
						break;
					case 5:
						tipoConta= "Conta Estudantil";
						break;
					case 6:
						System.out.println("\nObrigada por utilizar os nossos servicos! :D");
			
					default:
						System.out.println("\nAte logo!");
						break;
					}
				}
					
		} while (type<=0 || type>6);
		
	}
		public void operacao () throws IOException {
			if (type>=0 && type!=6) {
					
				//Tela 2 - Leitura de dados
				System.out.println("\n\n*_*_*_*_*_ Bem vindo ao Banco Hive _*_*_*_*_*\n"+
					"*_*_*_*_*_ O banco mais seguro do mundo _*_*_*_*_*\n"+
					"\nTipo: "+tipoConta+
					"\nSaldo Atual: R$" +saldo+
					"\nSelecione o movimento que deseja realizar: D-debito ou C-Credito:");
					mov= (char)System.in.read();
					
					//Debitando da conta
					if(mov=='D') {
						
					do{
						System.out.print("\nInforme o valor que deseja movimentar:\n R$");
					valorMovimento=input.nextDouble();
					saldo= saldo-valorMovimento;
					movimento++;
					
					System.out.println("\nO saldo atual e:\n R$"+ saldo);
					System.out.println("\nDeseja continuar? S-sim/N- nao");
					
					continuar= (char)System.in.read();
					}while (continuar=='S');
						System.out.println("\nOperacao Finalizada");
						
					//Inserindo credito						
					} else{
							do{
								System.out.print("\nInforme o valor que deseja movimentar: \n R$");
								valorMovimento=input.nextDouble();
								saldo=saldo+valorMovimento;
								movimento++;
								
								System.out.println("\nO saldo atual e:\n R$"+ saldo);
								System.out.println("\nDeseja continuar? S-sim/N- nao");
							}while(continuar=='S'); 
						
						System.out.println("\nOperacao Finalizada");
						}
			}else {
				return;
			} 
		}
		void movimento() {
			//totalMovimento=movimento;
		}
}

		

