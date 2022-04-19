package models;

public class Produto {
    
    private String Nome;
    private String Id;
    private Float Preco;
    private int Quantidade;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public Float getPreco() {
        return Preco;
    }
    public void setPreco(Float preco) {
        Preco = preco;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
    @Override
    public String toString() {
        
        return "Produto" + Nome + "\n Quantidade" + Quantidade
         + "\n Preço" + Preco;
    }
}
