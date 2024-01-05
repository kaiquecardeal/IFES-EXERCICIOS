public class EX1 {
	public static void main(String[] args) {
		// 1) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
		int a = InOut.leInt("Insira um valor: ");
		int b = a-1;
			InOut.MsgDeInformação("", "O antecessor deste valor é: "+b);
	}

}
