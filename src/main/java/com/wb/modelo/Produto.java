package com.wb.modelo;

public abstract class Produto {
	public String nome;
	public double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
}