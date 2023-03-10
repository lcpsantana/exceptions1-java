package application;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.println("Entre com os dados da conta:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		
		
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Saldo Incicial: ");
		double saldo = sc.nextDouble();
		
		
		System.out.print("Limite de Saque: ");
		double limite = sc.nextDouble();
		
		
		Account conta = new Account(numero, titular, saldo, limite);
		
		
		System.out.print("Insira o valor para saque: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Novo saldo: " + conta.getBalance());
		
		
		
		
		sc.close();
		
		}catch(InputMismatchException e) {
			System.out.println("Teste: " + e.getMessage());
			
		}
		
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		

	}
	
	
	

}
