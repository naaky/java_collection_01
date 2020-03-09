package br.fai.collections;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private Scanner scanner = new Scanner(System.in);

	private final String VALOR_INVALIDO = "VALOR_INVALIDO";

	private void start() {

		List<String> lista = new ArrayList<String>();

		while (lista.size() < 5) {
			String valorRecebido = obterDados();
			// System.out.println("O Valor recebido foi: " + valorRecebido);
			if (valorRecebido.isEmpty() || valorRecebido.contentEquals(VALOR_INVALIDO)) {
				System.out.println("Este valor foi descartado");
			} else {
				lista.add(valorRecebido);
			}

		}

		System.out.println("------");
		for (String item : lista) {
			System.out.println("O item da Lista eh: " + item);

		}
		
		lista.add("Item adicionado automaticamente 01");
		lista.add("Item adicionado automaticamente 02");
		lista.remove(1);
		lista.remove(1);
		
		for (String item: lista) {
			System.out.println("Novos valores: "+ item);
		}
	}

	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");
			int valor = scanner.nextInt();
			return String.valueOf(valor);

		} catch (Exception e) {

			scanner.next();
			System.out.println("Um Valor invalido foi digitado!");
			return VALOR_INVALIDO;
		}

	}

}
