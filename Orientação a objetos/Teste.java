public class Teste {
        public static void main(String[] args) {
            // Objeto
           Livro livro = new Livro();
            livro.setNome ("Rawler");
            livro.setAutor ("Willie wonka");
            livro.setGenero ("Horror");
            livro.setPaginas (156);

            // System.out.println("Nome do livro = " + livro.getNome());
            // System.out.println("Autor = " + livro.getAutor());
            // System.out.println("Genero = " + livro.getGenero());
            // System.out.println("Páginas = " + livro.getPaginas());
            System.out.println(livro);
        }

    
}
