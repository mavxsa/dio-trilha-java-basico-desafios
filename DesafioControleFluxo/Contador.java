package DesafioControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static int main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {

            private static int contar(parametroUm, parametroDois){
                return parametroDois - parametroUm;

            }
		
		}catch (UnsupportedOperationException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}