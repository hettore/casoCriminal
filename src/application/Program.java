package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> perguntas = new ArrayList<>();
		System.out.println("Caso criminal");
		System.out.println("________________________________");
		System.out.println("Responda somente a verdade!");
		System.out.println("Para afirmar responda com 's'");
		System.out.println("E para negar responda com 'n'");
		System.out.println();
		perguntas.add("1 - Telefonou para a vítima?");
		perguntas.add("2 - Esteve no local do crime?");
		perguntas.add("3 - Mora perto da vítima?");
		perguntas.add("4 - Devia para a vítima?");
		perguntas.add("5 - Já trabalhou com a vítima?");
		
		int contador = 0;
		for (int i = 0; i < perguntas.size(); i++) {
			System.out.print(perguntas.get(i) + " R: ");
			String resposta = sc.nextLine();
			if (resposta.equals("s")) {
				contador = contador + 1;
			}
		}
		//System.out.println(contador);

		if (contador == 2) {
			System.out.println("Você é uma pessoa suspeita!");
		} 
		else if (contador >= 3 && contador <= 4) {
			System.out.println("Você é cúmplice!");
		}
		else if (contador == 5) {
			System.out.println("Você assassinou a vítima!");
		}
		else {
			System.out.println("Você é inocente.");
		}
			
	}

}
