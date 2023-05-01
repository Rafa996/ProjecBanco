package banco;

public class ContaEspecial extends Conta {
	
	double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	//Métodos
	public void usarLimite() {
		
		System.out.println("\nInforme o valor de limite que deseja usar: \nR$");
		double valor=input.nextDouble();
		
		if (saldo<0) {
			saldo+=valor;
			limite-=valor;
			
			System.out.println("O valor atual do saldo é:"+ saldo);
			System.out.println("O valor atual do limite é:"+ limite);
		}
	}
}
