//Comentario
public class Principal {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*6+1);
			InOut.MsgDeInformação("", "O valor do 1º dado é:"+num1);
		int num2 = (int)(Math.random()*6+1);
			InOut.MsgDeInformação("", "O valor do 2º dado é:"+num2);
		int num3 = (int)(Math.random()*6+1);
			InOut.MsgDeInformação("", "O valor do 3º dado é:"+num3);
			
		String menu = "Digite a opção desejada";
		menu+= "\n1) Informe se há valores repetidos ";
		menu+= "\n2) Some e exiba um valor informado pelo usuário com o maior número das 3 jogadas";
    	menu+= "\n3) Informe qual o valor do meio (maior que o menor e menor que o maior) ";
    	menu+= "\n4) Exiba a média dos valores elevada a um valor informado pelo usuário";
    	menu+= "\n5) Exiba as 3 jogadas como no exemplo abaixo";
    	menu+= "\n0) Sair do programa";
    	
    	int ddd = InOut.leInt(menu);
    	double n1;
    	double media;
    	double media2;
    	
    	if(ddd==1){
    		if (num1 == num2 || num1 == num3) {
    		InOut.MsgDeInformação("", "Há Valores repetidos!");
    		}else {
    		InOut.MsgDeInformação("", "Não há valores repetidos");	
    		}
    	}else if(ddd==2){
    		int num4 = InOut.leInt("Informe mais um valor: ");
    		if(num1 > num2 || num1 > num3 || num2 > num3) {
    			InOut.MsgDeInformação("", "A soma do valor informado, mais o maior dos três é: "+(num1+num4));
    		}else if(num1 < num2 || num2 > num3) {
    			InOut.MsgDeInformação("", "A soma do valor informado, + mais maior dos três é: "+(num2+num4));
    		}else {
    			InOut.MsgDeInformação("", "A soma do valor informado, + mais maior dos três é: "+(num3+num4));
    		}
    	}else if(ddd==3) {
    		if(num1 < num2 || num1 < num3) {
    			InOut.MsgDeInformação("", "O valor do meio é: "+(num1));
    		}else if(num2 < num1 || num2 < num3) {
    			InOut.MsgDeInformação("", "O valor do meio é: "+(num2));
    		}else {
    			InOut.MsgDeInformação("", "O valor do meio é:"+(num3));
    		}
    	}else if(ddd==4) {
    		n1 = InOut.leInt("Informe outro valor : ");
    		media = (num1+num2+num3)/2;
    		media2 = Math.pow(media, n1);
    			InOut.MsgDeInformação("", "A media dos valores elevados a "+n1+" é: "+media2);
    	}else if(ddd==5) {
    		InOut.MsgDeInformação("", "Dado 1 = "+num1+"\nDado 2 = "+num2+"\nDado 3 = "+num3);
    	}else if(ddd==0) {
    		InOut.MsgDeInformação("", "Você finalizou o Programa!!");
    	}else {
    		InOut.MsgDeAviso("", "Você Digitou um comando invalido!!");
    	}
	}

}

















