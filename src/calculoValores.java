import java.util.Scanner;

public class calculoValores {

	public static void main(String[] args) {
	
		/*
		// Mensagem na tela
		System.out.println("Prezado(a) usuário(a), informe o seu nome:");
		
		// Criando uma variável, vinculada ao Scanner
		Scanner teclado = new Scanner(System.in);
		String nome=teclado.nextLine();
		
		//Retorno do scanner
		System.out.println(nome+", seja bem vindo(a) a nossa instituição.");
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o 1º número inteiro:");
		
		int valor1=teclado.nextInt();
		
		System.out.println("Informe o 2º número inteiro:");
		
		int valor2=teclado.nextInt();
		
		int multiplicacao=valor1*valor2;
		
		System.out.println("O resultado da multiplicação é "+multiplicacao);
		
		teclado.close();

	}

}
