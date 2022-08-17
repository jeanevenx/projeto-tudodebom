package br.com.tudodebom.api.services;

public class validarCPF {

	public static String validar(String cpf) {
		if(calcularVeracidade(cpf))
		{
			return cpf;
		}
			return "";
		
	}
	
	public static boolean calcularVeracidade(String CPF) {
		if(
		   (CPF.equals("00000000000")) || (CPF.equals("11111111111")) || (CPF.equals("22222222222")) ||
	       (CPF.equals("33333333333")) || (CPF.equals("44444444444")) || (CPF.equals("55555555555")) ||
	       (CPF.equals("66666666666")) || (CPF.equals("77777777777")) || (CPF.equals("88888888888")) || 
	       (CPF.equals("99999999999")) || (CPF.length() != 11)
	      ){ return(false); }
	      
	     
	      
	     char num10,num11;
	     int soma, aux, result, dig, quant;
	     
	     try {
	    	 soma = 0;
	    	 quant = 10;
	    	 for (aux=0; aux<9; aux++) {
	    		 dig = (int)(CPF.charAt(aux) - 48);
	    		 soma= soma+(dig * quant);
	    		 quant = quant -1; 
	    	 }
	    	 
	    	 result= 11 - (soma % 11);
	    	 if ((result == 10) || (result == 11))
	    		 num10 = '0';
	    	 else num10 = (char)(aux + 48);
	    			 
	    		soma = 0;
	            quant = 11;
	            for(aux=0; aux<10; aux++) {
	            dig = (int)(CPF.charAt(aux) - 48);
	            soma = soma + (dig * quant);
	            quant = quant - 1;
	            }

	            result = 11 - (soma % 11);
	            if ((result == 10) || (result == 11))
	                 num11 = '0';
	            else num11 = (char)(result + 48);

	            if ((num10 == CPF.charAt(9)) && (num11 == CPF.charAt(10)))
	                 return(true);
	            else return(false);
	                } catch (Exception erro) {
	                return(false);
	            }
	        }
	
	
}
