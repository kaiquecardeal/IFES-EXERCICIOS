//Comentario
public class Principal {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*6+1);
			InOut.MsgDeInforma��o("", "O valor do 1� dado �:"+num1);
		int num2 = (int)(Math.random()*6+1);
			InOut.MsgDeInforma��o("", "O valor do 2� dado �:"+num2);
		int num3 = (int)(Math.random()*6+1);
			InOut.MsgDeInforma��o("", "O valor do 3� dado �:"+num3);
			
		String menu = "Digite a op��o desejada";
		menu+= "\n1) Informe se h� valores repetidos ";
		menu+= "\n2) Some e exiba um valor informado pelo usu�rio com o maior n�mero das 3 jogadas";
    	menu+= "\n3) Informe qual o valor do meio (maior que o menor e menor que o maior) ";
    	menu+= "\n4) Exiba a m�dia dos valores elevada a um valor informado pelo usu�rio";
    	menu+= "\n5) Exiba as 3 jogadas como no exemplo abaixo";
    	menu+= "\n0) Sair do programa";
    	
    	int ddd = InOut.leInt(menu);
    	double n1;
    	double media;
    	double media2;
    	
    	if(ddd==1){
    		if (num1 == num2 || num1 == num3) {
    		InOut.MsgDeInforma��o("", "H� Valores repetidos!");
    		}else {
    		InOut.MsgDeInforma��o("", "N�o h� valores repetidos");	
    		}
    	}else if(ddd==2){
    		int num4 = InOut.leInt("Informe mais um valor: ");
    		if(num1 > num2 || num1 > num3 || num2 > num3) {
    			InOut.MsgDeInforma��o("", "A soma do valor informado, mais o maior dos tr�s �: "+(num1+num4));
    		}else if(num1 < num2 || num2 > num3) {
    			InOut.MsgDeInforma��o("", "A soma do valor informado, + mais maior dos tr�s �: "+(num2+num4));
    		}else {
    			InOut.MsgDeInforma��o("", "A soma do valor informado, + mais maior dos tr�s �: "+(num3+num4));
    		}
    	}else if(ddd==3) {
    		if(num1 < num2 || num1 < num3) {
    			InOut.MsgDeInforma��o("", "O valor do meio �: "+(num1));
    		}else if(num2 < num1 || num2 < num3) {
    			InOut.MsgDeInforma��o("", "O valor do meio �: "+(num2));
    		}else {
    			InOut.MsgDeInforma��o("", "O valor do meio �:"+(num3));
    		}
    	}else if(ddd==4) {
    		n1 = InOut.leInt("Informe outro valor : ");
    		media = (num1+num2+num3)/2;
    		media2 = Math.pow(media, n1);
    			InOut.MsgDeInforma��o("", "A media dos valores elevados a "+n1+" �: "+media2);
    	}else if(ddd==5) {
    		InOut.MsgDeInforma��o("", "Dado 1 = "+num1+"\nDado 2 = "+num2+"\nDado 3 = "+num3);
    	}else if(ddd==0) {
    		InOut.MsgDeInforma��o("", "Voc� finalizou o Programa!!");
    	}else {
    		InOut.MsgDeAviso("", "Voc� Digitou um comando invalido!!");
    	}
	}

}

















