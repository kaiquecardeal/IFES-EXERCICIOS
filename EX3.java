public class EX3 {
	public static void main(String[] args) {
		//3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
		double a = InOut.leDouble("Informe o Primeiro Número: ");
		double b = InOut.leDouble("Informe o Segundo Número: ");
		double c = InOut.leDouble("Informe o Terceiro Número: ");
		double soma;
		
		if(a > b && c > b) {
			soma = a+c;
			InOut.MsgDeInformação("", "A soma dos maiores valores que são A e C é :"+soma);
		}else if(a > c && b > b) {
			soma = a+b;
			InOut.MsgDeInformação("", "A soma dos maiores valores que são A e B é :"+soma);
		}else if(b > c && c > a) {
			soma = c+b;
			InOut.MsgDeInformação("", "A soma dos maiores valores que são C e B é :"+soma);
		}else {
			
		}
	}

}
