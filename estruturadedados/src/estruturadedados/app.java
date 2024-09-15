package estruturadedados;

public class app {

	public static void main(String[] args) {
		ListaSequencial lista = new ListaSequencial(5);
		
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);

		lista.mostrarLista();
		
		lista.remover(2);
		System.out.println("Apos a remoção");
		lista.mostrarLista();
	}

}
