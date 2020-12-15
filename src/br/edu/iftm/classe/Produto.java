package br.edu.iftm.classe;

public class Produto {
    private String nome;
    private String categoria;
    private float preco;

    public Produto(String nome, String categoria, float preco) {
        this.nome = nome;
        this.setCategoria(categoria);
        this.setPreco(preco);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
