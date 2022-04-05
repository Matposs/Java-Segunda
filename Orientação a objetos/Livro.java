public class Livro {
/*
    ><><><><>< Construtor ><><><><<
    deve ter o mesmo nome da classe
*/
    public Livro (){
        // this.nome = nome;
        // this.autor = autor;
        // this.genero = genero;
        // this.paginas = paginas;

    }

    private String nome;
    private String autor;
    private String genero;
    private int paginas;

    // Métodos de acesso aos atributos
    // Método retorna alguma coisa, diferente do construtor
    //modificador tipo nome (params){
    // colocar o curso em cima de alguma palavra e apertar f12, vai até a fonte de desse nome
    // ctrl + k + c == comentar , ctrl + k + u == descomentar 

    //}
     // Exemplo
     // toda vez que algum objeto for privado, precisamos usar set
     // para incluir uma informação a ele, e get para usar essa informação

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
     // código abaixo, usado para quando voce chamar a nova classe chamada de livro, irá mostrar a mensagem abaixo
     @Override
     public String toString() {
        
         return "\nNome: " + nome  + "\nAutor: " + autor + "\nGenero: " + genero
         + "\nPáginas: " + paginas ;
     }
     
     //Método equals (retorna um booleano, retorando um valor verdadeiro ou falso, sendo ele do tipo Object, e o nome obj)
     //Quando estamos comparando uma string com outra, usamos o método equals, e quando for algum numero usamos == 
     //Livro outrolivro = (Livro) obj; >> outrolivro é um novo nome  dado para forçar a classe obj a se identificar como a classe criada Livro
     @Override
     public boolean equals(Object obj) {
         Livro outrolivro = (Livro) obj;
        if (getNome().equals(outrolivro.getNome())){
            return true;
        }
        else {

        
        return false;
    }

     }

}
