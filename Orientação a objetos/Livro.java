public class Livro {
/*
><>< ATRIBUTOS OU PROPRIEDADES DO LIVRO ><><
         páginas    -> string
        autor       -> string
        editora     -> string
        nome        -> string
        genero      -> string
        data de lançamento -> date
        edição      -> string
        material capa -> string
        isbn        -> string
*/
 

    public String nome;
    private String autor;
    private String genero;
    private int paginas;

    // Métodos de acesso aos atributos
    //modificador tipo nome (params){

    //}
     // Exemplo

     public void setNome (String nome){
        this.nome = nome;
     }
     public String getNome (){
         return nome;
     }
     public void setAutor (String autor){
         this.autor = autor;
     }
     public String getAutor () {
         return autor;
     }
     public void setGenero (String genero){
         this.genero = genero;
     }
     public String getGenero () {
         return genero;
     }
     public void setPaginas (int paginas) {
         this.paginas = paginas;
     }
     public int getPaginas () {
         return paginas;
     }
     @Override
     public String toString() {
        
         return "Nome: " + nome  + "\n Autor: " + autor + "\n Genero: " + genero
         + "\n Páginas: " + paginas ;
     }

}
