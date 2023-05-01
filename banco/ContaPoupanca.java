package banco;

public class ContaPoupanca extends Conta {
	
	public int diaAniversario;
	
	
	public int getDiaAniversario() {
		return diaAniversario;
	}


	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}


	public void correcao () {
		System.out.println("Informe a data do seu aniversario: ");
		diaAniversario=input.nextInt();
		
		if(diaAniversario == getDataAniversario()) {
			saldo= (saldo*0.05)+saldo;
			
			System.out.println("\nO saldo da sua conta agora e: "+saldo);
			
		}else {
			System.out.println("A sua data de aniversario esta incorreta!");
		}
		return;
		
	}


	
}
