
public class P1IFESL3EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01 - Sejam 3 n�meros distintos A, B, C informados pelo usu�rio. Coloque-os em ordem crescente.

		double a = InOut.leDouble("Informe o 1� N�mero!");
		double b = InOut.leDouble("Informe o 2� N�mero!");
		double c = InOut.leDouble("Informe o 3� N�mero!");

		if((a > b) && (a > c)) {
			if (b> c) {
				InOut.MsgDeInforma��o("", "O maior valor � "+a+"\nO valor do meio �"+b+"\nO menor valor �"+c);
			}
			else {
				InOut.MsgDeInforma��o("", "O maior valor � "+a+"\nO valor do meio �"+c+"\nO menor valor �"+b);
            }
			}
		else if ((b > a) && (b > c)){
			if (a > c) {
				InOut.MsgDeInforma��o("", "O maior valor � "+b+"\nO valor do meio �"+a+"\nO menor valor �"+c);
			}
			else {
				InOut.MsgDeInforma��o("", "O maior valor � "+b+"\nO valor do meio �"+c+"\nO menor valor �"+a);
            }
			}
		else {
			if (a > b){
				InOut.MsgDeInforma��o("", "O maior valor � "+c+"\nO valor do meio �"+a+"\nO menor valor �"+b);
			}
			else {
				InOut.MsgDeInforma��o("", "O maior valor � "+c+"\nO valor do meio �"+b+"\nO menor valor �"+a);
            
			}
		}
		

	}

}
