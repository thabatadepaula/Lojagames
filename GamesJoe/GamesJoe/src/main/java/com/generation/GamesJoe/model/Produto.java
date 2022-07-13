package com.generation.GamesJoe.model;

	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

		@Entity
		@Table(name = "tb_produtosgames")
		public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String nome;
		private double preco;
		private int quantidade;
		
	
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		public Produto () {
			
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		
	}
	
	
	