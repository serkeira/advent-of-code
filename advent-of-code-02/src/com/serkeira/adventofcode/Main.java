package com.serkeira.adventofcode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	//  problema: dado um input com cerca de 1000 linhas em que cada linha � apresentada da seguinte forma:
	//  2-9 q: zqfkrhpsxkxtsxqlnfdm
	//  
	//  os primeiros valores separados por hifen correspondem a quantidade minima e maxima que determinado caracter precisa aparecer em uma senha
	//  para que essa senha seja v�lida.
	//  leia o input com as linhas e verifique a quantidade de senhas v�lidas seguindo esse formato

	public static void main(String[] args) {

		String linhaParaQuebrar = "";
		String[] minMax;

		ArrayList<Password> passwords = new ArrayList<>();

		try (Scanner s = new Scanner(new FileReader("input.txt"))) {
			while (s.hasNext()) {
				
				linhaParaQuebrar = s.nextLine();
				
				Password password = new Password();
				
				String[] campos = linhaParaQuebrar.split(" ");

				// Ap�s o split teremos:
				// min-max letra: combinacao_da_senha
				//
				// campos[0] campos[1] campos[2]

				// ent�o � necess�rio separar o min e max antes de armazen�-los:
				minMax = campos[0].split("-");

				// como o min e max eram separados por hifen, cada posi��o ap�s novo split pode
				// ser armazenada separadamente:
				password.setMin(Integer.parseInt(minMax[0]));
				password.setMax(Integer.parseInt(minMax[1]));

				// pegando apenas a letra (pois a mesma era seguida de dois pontos. Exemplo - b:
				// )
				//
				password.setLetra(campos[1].charAt(0));
				password.setCombinacao(campos[2]);

				passwords.add(password);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// chamar os m�todos para checar cada senha
		
		Utils utils = new Utils();
		Integer ocorrencias = 0;
		Integer senhasValidas = 0;
		
		
		for (Password password : passwords) {
			ocorrencias = utils.checarQuantasOcorrenciasDaLetra(password);
			
			if (utils.validarSenha(password, ocorrencias)) {
				senhasValidas += 1;
			}
			
		}
		
		
		System.out.println(senhasValidas);

	}

}
