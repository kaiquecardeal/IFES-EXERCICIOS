public class EX5 {
	public static void main(String[] args) {
		
		double code = InOut.leDouble("Informe o Código do funcionário");
		double idade = InOut.leDouble("Informe a data de nascimento do funcionário :");
		double trab = InOut.leDouble("Informe o tempo de trabalho do funcionário: ");
		
		double temp = idade-2019;
		double tt = trab-2019;
			
		if(temp>=60 && tt>=25) {
			InOut.MsgDeInformação("", "Requerer Aposentadoria do funcionário "+code);
		}else {
			InOut.MsgDeInformação("", "Não Requerer Aposentadoria do funcionário "+code);
		}
	}
}
