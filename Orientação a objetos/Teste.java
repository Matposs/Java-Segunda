public class Teste {
        public static void main(String[] args) {
            // Objeto
           Livro livro1 = new Livro();
            livro1.setNome ("Rawler");
            livro1.setAutor ("Willie wonka");
            livro1.setGenero ("Horror");
            livro1.setPaginas (156);

            
         Livro livro2 = new Livro();
         livro2.setNome ("a");
         livro2.setAutor ("Kappa Pride");
         livro2.setGenero ("Comedy");
         livro2.setPaginas (156);

            // System.out.println("Nome do livro = " + livro.getNome());
            // System.out.println("Autor = " + livro.getAutor());
            // System.out.println("Genero = " + livro.getGenero());
            // System.out.println("Páginas = " + livro.getPaginas());

            System.out.println(livro2);
  
            if (livro1.equals(livro2)){
                System.out.println("Igual");
            }
            else {
                System.out.println("diferente");
            }
}}
