package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite ){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){

        Convidado convidadoParaRemover = null;

        if( !convidadoSet.isEmpty() ){

            for(Convidado e : convidadoSet ){
                if( e.getCodigoConvite() == codigoConvite ){
                    convidadoParaRemover = e ;
                    break;
                }
            }

            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println( convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1231);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1232);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1233);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1234);

        System.out.println("Convidados " + conjuntoConvidados.contarConvidados() );

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Convidados " + conjuntoConvidados.contarConvidados() );

        conjuntoConvidados.exibirConvidados();

    }

}
