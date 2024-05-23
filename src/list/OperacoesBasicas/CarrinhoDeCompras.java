package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensCarrinho;

    public CarrinhoDeCompras(){
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itensCarrinho.add( new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : itensCarrinho ){
            if( i.getNome().equalsIgnoreCase(nome) ){
                itensParaRemover.add(i);
            }
        }

        itensCarrinho.removeAll(itensParaRemover);
    }

    public int obterTotalDeItens(){
        return itensCarrinho.size();
    }

    public double calcularValorTotal(){
    
        double valorTotal = 0;

        for(Item i : itensCarrinho ){
            valorTotal += ( i.getQuantidade() * i.getPreco() );
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itensCarrinho.toString());
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Total de Itens
        System.out.println("O total de itens do carrinho e : " + carrinhoDeCompras.obterTotalDeItens() );

        // Add itens
        carrinhoDeCompras.adicionarItem("Mouse 1", 1.0, 2);
        carrinhoDeCompras.adicionarItem("Mouse 2", 1.0, 2);
        carrinhoDeCompras.adicionarItem("Teclado", 1.0, 1);
        System.out.println("Valor total do carrinho : " + carrinhoDeCompras.calcularValorTotal() );
        System.out.println("O total de itens do carrinho e : " + carrinhoDeCompras.obterTotalDeItens() );

        // Excluir item
        carrinhoDeCompras.removerItem("Mouse 1");
        System.out.println("Valor total do carrinho : " + carrinhoDeCompras.calcularValorTotal() );
        System.out.println("O total de itens do carrinho e : " + carrinhoDeCompras.obterTotalDeItens() );


        // Exibir itens do carrinho
        carrinhoDeCompras.exibirItens();

    }

}
