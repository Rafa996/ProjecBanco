package banco;

import java.io.IOException;
import java.util.Scanner;

public class TelaInicial extends Conta{

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner (System.in);
		
		Conta Menu = new Conta();
		ContaPoupanca M1 = new ContaPoupanca();
		ContaCorrente M2 = new ContaCorrente();
		ContaEspecial M3 = new ContaEspecial();
		ContaEmpresa  M4 = new ContaEmpresa();
		ContaEstudantil M5 = new ContaEstudantil();
		
		
		//Menu		
		Menu.telaInicial();
		Menu.dados();
		Menu.operacao();
		
	switch (type) {
	case 1: 
		M1.correcao();
		break;
	case 2:
		M2.pedirTalao();
		break;
	case 3:
		M3.usarLimite();
		break;
	case 4:
		M4.pedirEmprestimo();
		break;
	case 5: 
		M5.usarEstudantil();
		break;
		
		
	}
}}




