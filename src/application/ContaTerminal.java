package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta!");
		numero = sc.nextInt();
		clearScreen();
		System.out.println("Por favor, digite sua agência!");
		agencia= sc.next();
		sc.nextLine();
		clearScreen();
		System.out.println("Por favor, digite seu nome!");
		nomeCliente = sc.nextLine();
		clearScreen();
		System.out.println("Por favor, digite seu saldo!");
		saldo=sc.nextDouble();
		clearScreen();
		sc.close();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque");
	}
	
	public static void clearScreen() {
		// https://stackoverflow.com/questions/2979383/java-clear-the-console
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
