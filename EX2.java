public class EX2 {
	public static void main(String[] args) {
		//2) Faça um algoritmo para ler: número da conta do cliente,
		//saldo, débito e crédito. Após, calcular e escrever o saldo 
		//atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual 
		//for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
		
		double cont = InOut.leDouble("Escreva o Número da conta: ");
		double sald = InOut.leDouble("Informe o seu saldo: ");
		double deb = InOut.leDouble("Informe o seu débito: ");
		double cred = InOut.leDouble("Informe o seu crédito: ");
		double salda = sald-deb+cred;
			InOut.MsgDeInformação("", "O valor do seu saldo é: "+salda);
		
		if(salda>0) { 
			InOut.MsgDeInformação("", "O saldo da conta "+cont+" é positivo!");
		}else if(salda<0) {
			InOut.MsgDeInformação("", "O saldo da conta "+cont+" é Negativo");
		}else {
			
		}
		
		
		
	}

}
