/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4.modelo;

/**
 *
 * @author SHARK
 */
public class Produto {
    private String nome;
    private Double preco;
    private Integer quant;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Produto(String nome, Double preco, Integer quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    public Double valor(){
        return preco*quant;
    }
}
