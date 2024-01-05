public class exemplo {
	public static void main(String[] args) {
		int num = 4;
		String saida = "";
		
		for(int i=0; i<10; i++) {
			num+= i;
			saida += "i = "+i+", num = "+num+"\n";
		}
		InOut.MsgDeInformação("", saida);
	}
	
}
