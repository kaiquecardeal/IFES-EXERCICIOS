public class vetor {
	public static void main(String[] args) {
		final int max = 10;
		final int maxRand = 10;
		int[] vet = new int[max];
		vet[0]=6;
		vet[1]=4;
		String saida = "";

		for(int i = 0; i<max ; i++ ) {
			vet[i] = (int)(Math.random()*maxRand);
		}
		for(int i = 0 ; i<max ;i++) {
			saida += "|"+vet[i];
		}
		saida += "|";
		InOut.MsgDeInformação("", saida);
	}

}
