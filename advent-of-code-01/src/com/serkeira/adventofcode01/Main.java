package com.serkeira.adventofcode01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> result = new ArrayList<>();

		try (Scanner s = new Scanner(new FileReader("input.txt"))) {
			while (s.hasNext()) {
				result.add(s.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(result);

		String num1 = "";
		String num2 = "";
		Double soma = 0.0;

		for (int i = 0; i < result.size(); i++) {

			num1 = result.get(i);
			
			for (int j = 1; j < (result.size()); j++) {
				num2 = result.get(j);	
				soma = Double.parseDouble(num1) + Double.parseDouble(num2);
				
				if (soma == 2020.0) {
					System.out.println("numero 1: " + num1);
					System.out.println("numero 2: " + num2);

					double multiplicacao = 0;
					multiplicacao = Double.parseDouble(num1) * Double.parseDouble(num2);

					System.out.println("multiplicacao de ambos é: " + multiplicacao);
					break;

				}

			}

		}

	}

}
