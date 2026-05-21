package br.edu.ifpb.ads.padroes.atv2;

public class VisitorImprimir implements Visitor {

    @Override
    public void visit(ProdutoFisico produto) {
        System.out.printf("Detalhes do Produto Físico [%s]: Valor base R$ %.2f%n", 
                          produto.getNome(), produto.getValor());
    }

    @Override
    public void visit(Servico servico) {
        System.out.printf("Detalhes do Serviço [%s]: Valor base R$ %.2f%n", 
                          servico.getDescricao(), servico.getValor());
    }
}