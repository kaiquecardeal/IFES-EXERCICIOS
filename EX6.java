public class EX6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = InOut.leDouble("Informe o valor A: ");
		double b = InOut.leDouble("Informe o valor B: ");
		double c = InOut.leDouble("Informe o valor C: ");
				
		if(a < b+c && b <a+c && c <a+b) {
			if(a==b && b==c) {
				InOut.MsgDeInformação("", "Triangulo Equilátero");
			}else if(a==b || b==c || a==c) {
				InOut.MsgDeInformação("", "Triangulo Isóceles");
			}else {
				InOut.MsgDeInformação("", "Triangulo Escaleno");
			}
		}else {
			InOut.MsgDeInformação("", "Não é póssivel formar o triângulo");
		}
	}
}
//              VARIÁVEIS
//     A           B         C       MENSAGEM
//     1           2         3     Não é póssivel formar o triângulo
//     3           4         5     Triangulo Escaleno
//     2           2         4     Não é póssivel formar o triângulo
//     4           4         4     Triangulo Equilátero
//     5           3         3     Triangulo Isóceles