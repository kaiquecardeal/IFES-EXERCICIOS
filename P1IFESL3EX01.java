
public class P1IFESL3EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01 - Sejam 3 números distintos A, B, C informados pelo usuário. Coloque-os em ordem crescente.

		double a = InOut.leDouble("Informe o 1º Número!");
		double b = InOut.leDouble("Informe o 2º Número!");
		double c = InOut.leDouble("Informe o 3º Número!");

		if((a > b) && (a > c)) {
			if (b> c) {
				InOut.MsgDeInformação("", "O maior valor é "+a+"\nO valor do meio é"+b+"\nO menor valor é"+c);
			}
			else {
				InOut.MsgDeInformação("", "O maior valor é "+a+"\nO valor do meio é"+c+"\nO menor valor é"+b);
            }
			}
		else if ((b > a) && (b > c)){
			if (a > c) {
				InOut.MsgDeInformação("", "O maior valor é "+b+"\nO valor do meio é"+a+"\nO menor valor é"+c);
			}
			else {
				InOut.MsgDeInformação("", "O maior valor é "+b+"\nO valor do meio é"+c+"\nO menor valor é"+a);
            }
			}
		else {
			if (a > b){
				InOut.MsgDeInformação("", "O maior valor é "+c+"\nO valor do meio é"+a+"\nO menor valor é"+b);
			}
			else {
				InOut.MsgDeInformação("", "O maior valor é "+c+"\nO valor do meio é"+b+"\nO menor valor é"+a);
            
			}
		}
		

	}

}
