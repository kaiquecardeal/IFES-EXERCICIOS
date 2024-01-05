public class EX4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = InOut.leDouble("Informe o valor de X: ");
		double y = InOut.leDouble("Informe o valor de Y: ");
		double z = (x*y)+5;
		
		if(z<=0) {
			InOut.MsgDeInformação("", "Resposta A!");
		}else if(z<=100) {
			InOut.MsgDeInformação("", "Resposta B!");
		}else {
			InOut.MsgDeInformação("", "Resposta C!");
		}InOut.MsgDeInformação("", "A Resposta de Z é: "+z);
	}
	//Variáveis
	/*X       Y       Z      Resposta
	  3       2       11        B
	  150	  3	      455       C
	  7      -1	     -2         A
	  2      -5      -5         A
	  50      3       155       C
	 */
}
