public class EX2 {
	public static void main(String[] args) {
		//2) Fa�a um algoritmo para ler: n�mero da conta do cliente,
		//saldo, d�bito e cr�dito. Ap�s, calcular e escrever o saldo 
		//atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual 
		//for maior ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.
		
		double cont = InOut.leDouble("Escreva o N�mero da conta: ");
		double sald = InOut.leDouble("Informe o seu saldo: ");
		double deb = InOut.leDouble("Informe o seu d�bito: ");
		double cred = InOut.leDouble("Informe o seu cr�dito: ");
		double salda = sald-deb+cred;
			InOut.MsgDeInforma��o("", "O valor do seu saldo �: "+salda);
		
		if(salda>0) { 
			InOut.MsgDeInforma��o("", "O saldo da conta "+cont+" � positivo!");
		}else if(salda<0) {
			InOut.MsgDeInforma��o("", "O saldo da conta "+cont+" � Negativo");
		}else {
			
		}
		
		
		
	}

}
