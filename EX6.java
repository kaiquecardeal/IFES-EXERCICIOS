public class EX6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = InOut.leDouble("Informe o valor A: ");
		double b = InOut.leDouble("Informe o valor B: ");
		double c = InOut.leDouble("Informe o valor C: ");
				
		if(a < b+c && b <a+c && c <a+b) {
			if(a==b && b==c) {
				InOut.MsgDeInforma��o("", "Triangulo Equil�tero");
			}else if(a==b || b==c || a==c) {
				InOut.MsgDeInforma��o("", "Triangulo Is�celes");
			}else {
				InOut.MsgDeInforma��o("", "Triangulo Escaleno");
			}
		}else {
			InOut.MsgDeInforma��o("", "N�o � p�ssivel formar o tri�ngulo");
		}
	}
}
//              VARI�VEIS
//     A           B         C       MENSAGEM
//     1           2         3     N�o � p�ssivel formar o tri�ngulo
//     3           4         5     Triangulo Escaleno
//     2           2         4     N�o � p�ssivel formar o tri�ngulo
//     4           4         4     Triangulo Equil�tero
//     5           3         3     Triangulo Is�celes