public class EX3 {
	public static void main(String[] args) {
		//3) Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2 maiores.
		double a = InOut.leDouble("Informe o Primeiro N�mero: ");
		double b = InOut.leDouble("Informe o Segundo N�mero: ");
		double c = InOut.leDouble("Informe o Terceiro N�mero: ");
		double soma;
		
		if(a > b && c > b) {
			soma = a+c;
			InOut.MsgDeInforma��o("", "A soma dos maiores valores que s�o A e C � :"+soma);
		}else if(a > c && b > b) {
			soma = a+b;
			InOut.MsgDeInforma��o("", "A soma dos maiores valores que s�o A e B � :"+soma);
		}else if(b > c && c > a) {
			soma = c+b;
			InOut.MsgDeInforma��o("", "A soma dos maiores valores que s�o C e B � :"+soma);
		}else {
			
		}
	}

}
