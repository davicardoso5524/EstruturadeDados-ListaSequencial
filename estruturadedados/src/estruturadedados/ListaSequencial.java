package estruturadedados;

import java.util.Iterator;

public class ListaSequencial {
	private int[] lista;
	private int tamanhoAtual;
	
	public ListaSequencial(int capacidade){
		lista = new int[capacidade];
		tamanhoAtual = 0;
	}
	
	public void inserir(int elemento) {
		if(tamanhoAtual < lista.length) {
			lista[tamanhoAtual] = elemento;
			tamanhoAtual++;
		} else {
			System.out.println("Lista cheia, não é possivel inserir.");
		}
	}
	
		public void remover(int index) {
			if (index >= 0 && index < tamanhoAtual) {
				for (int i = index; i < lista.length - 1; i++) {
					lista[i] = lista[i + 1];
				}
				tamanhoAtual--;
			} else {
				System.out.println("Índice inválido");
			}
		}
	
	public void mostrarLista() {
		for (int i = 0; i < tamanhoAtual; i++) {
			System.out.println("Número " + (i+1) + ": " + lista[i]);
			
		}
	}
}
