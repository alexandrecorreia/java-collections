package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String livro, String auto, int anoPublicacao ){
        livroList.add( new Livro(livro, auto, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor ){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if( !livroList.isEmpty() ){

            for( Livro l : livroList){

                if( l.getAutor().equalsIgnoreCase(autor) ){
                    livrosPorAutor.add(l);
                }
            }

        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal ){
        
        List<Livro> livrosPorIntervalos = new ArrayList<>();

        if( !livroList.isEmpty() ){
        
            for(Livro l : livroList ){

                if( l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal ){
                    livrosPorIntervalos.add(l);
                }   
            }
        }

        return livrosPorIntervalos;
    }

    /**
     * Retornar apenas o primeiro que encontrar
     */
    
    public Livro pesquisarPorTitulo( String titulo ){

        Livro livroEncontrado = null;

        if( !livroList.isEmpty() ){
            
            for(Livro l : livroList ){

                if( l.getTitulo().equalsIgnoreCase(titulo) ){
                    livroEncontrado = l;
                    break;
                }   
            }

        }

        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1982);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1983);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1984);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 1982);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1985);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 4", 1983);

        // Procura por Autor
        System.out.println("\nPequisa por Autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        
        // Procura por intervalo de anos
        System.out.println("\nPesquisa por Ano");
        System.out.println( catalogoLivros.pesquisarPorIntervaloAnos(1982, 1983));

        // Procura por titulo
        System.out.println("\nProcurar por Livro");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
