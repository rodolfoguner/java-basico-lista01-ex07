package br.fai.ex07;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start() {
		int listaInt[] = {5, 5};
		double listaDouble[] = {10.27, 10.42};
		String listaString[] = {"44", "um texto qualquer"};
		
		calculaArray(listaInt);
		calculaArray(listaDouble);
		calculaArray(listaString);
	}
	
	private void calculaArray(int lista[]) {
		int soma = 0;
		for (int i: lista) {
			soma += i;
		}
		System.out.println("Soma: " + soma);
	}
	
	private void calculaArray(double lista[]) {
		int subtracao = 0;
		for (double i: lista) {
			subtracao -= i;
		}
		System.out.println("Subtracao: " + subtracao);
	}
	
	private void calculaArray(String lista[]) {
		System.out.println("String concatenada: " + lista[0].concat(lista[1]));
	}
}
