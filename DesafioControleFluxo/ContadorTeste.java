package DesafioControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class ContadorTeste {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

        System.out.println("O parametro um é" + parametroUm + "E o dois" + parametroDois);

        contar(parametroUm, parametroDois);

        int contagem = parametroDois - parametroUm; 

        System.out.println("contagem" + contagem);
        
    }

    private static void contar(int parametroUm, int parametroDois) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperati12onException("Unimplemented method 'contar'");
    }
}