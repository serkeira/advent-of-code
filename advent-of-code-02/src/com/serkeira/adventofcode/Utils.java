package com.serkeira.adventofcode;

public class Utils {
	
	
	public Integer checarQuantasOcorrenciasDaLetra(Password password) {
		
		Integer ocorrencias = 0;
		
		for (int i = 0; i < (password.getCombinacao().length()); i++) {
			
			if (password.getCombinacao().charAt(i) == password.getLetra()) {
				ocorrencias += 1;
			}	
		}

		return ocorrencias;
		
	}
	
	
	public Boolean validarSenha (Password password, Integer ocorrencias) {
		
		if ((password.getMin() <= ocorrencias) && (ocorrencias <= password.getMax())) {
			
			return true;
			
		}
		
		
		return false;
			
		
	}
	

}
