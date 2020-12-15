package br.edu.iftm.classe;

import java.util.ArrayList;

public class Carrinho{

    private float valorTotal;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    public Carrinho() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionar(Produto produto){ 
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void mostrarProdutos(){
        System.out.println("\nPRODUTOS DO CARRINHO");

        for(int i = 0; i < produtos.size(); i++){
            String nome = produtos.get(i).getNome();
            String categoria = produtos.get(i).getCategoria();
            float preco = produtos.get(i).getPreco();
            System.out.format("%d. %s (categoria: %s) - R$%.2f\n", i + 1, nome, categoria, preco);
        }
        System.out.format("Valor total: R$%.2f\n", getValorTotal());
    }

    //retornar o Valor Total da compra
    public float getValorTotal(){
        return valorTotal;
    }
}
