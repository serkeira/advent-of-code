package com.serkeira.adventofcode;

public class Password {

	private Integer min;
	private Integer max;
	private char letra;
	private String combinacao;
	
	public Password() {
		
	}
	
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public String getCombinacao() {
		return combinacao;
	}
	public void setCombinacao(String combinacao) {
		this.combinacao = combinacao;
	}

	@Override
	public String toString() {
		return "Password [min=" + min + ", max=" + max + ", letra=" + letra + ", combinacao=" + combinacao + "]";
	}
	
	
	
	
	
}
