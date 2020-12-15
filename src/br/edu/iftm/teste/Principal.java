package br.edu.iftm.teste;

import br.edu.iftm.classe.Produto;
import br.edu.iftm.classe.Carrinho;

public class Principal 
{
    public static void main(String args[])
    {
        Carrinho compras = new Carrinho();
        Produto tv = new Produto("TV Philco 32°", "Eletronicos", 1800.90f);
        Produto notebook = new Produto("ASUS i7 8G", "Eletronicos", 6519.99f);
        Produto livro = new Produto("Harry Potter", "Livro", 38.10f);

        compras.adicionar(tv);
        compras.adicionar(notebook);
        compras.adicionar(livro);
        compras.mostrarProdutos();
    }
    
}
