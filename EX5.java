public class EX5 {
	public static void main(String[] args) {
		
		double code = InOut.leDouble("Informe o C�digo do funcion�rio");
		double idade = InOut.leDouble("Informe a data de nascimento do funcion�rio :");
		double trab = InOut.leDouble("Informe o tempo de trabalho do funcion�rio: ");
		
		double temp = idade-2019;
		double tt = trab-2019;
			
		if(temp>=60 && tt>=25) {
			InOut.MsgDeInforma��o("", "Requerer Aposentadoria do funcion�rio "+code);
		}else {
			InOut.MsgDeInforma��o("", "N�o Requerer Aposentadoria do funcion�rio "+code);
		}
	}
}
