package controllers;
import java.util.ArrayList;
import utils.Console;
import models.Produto;

public class ProdutoController {
    int i;
    Produto produto;
    private ArrayList <Produto> produtos = new ArrayList<Produto>();

    
    public void renderizar() {
        System.out.println("\n ------ Cadastrar produtos ------");
            produto = new Produto();
            produto.setNome(Console.readString("\n Informe o produto: "));
            produto.setId(Console.readString("\n Informe o ID: "));
            produto.setPreco(Console.readFloat("\n Informe o preço: "));
            produtos.add(produto);
            System.out.println("----- Produto Cadastrado -----");

    }

    public void listar () {
        System.out.println("\n ------Listar produtos ------");
         for (i=0; i <produtos.size(); i++){
            System.out.println ("\n Produto: " + produtos.get(i).getNome() +
            "\n Preço: " + produtos.get(i).getPreco() + "\n ID: " + produtos.get(i).getId());
            }

    }
    
}
