package br.edu.ifpb.ads.padroes.atv2;

public class VisitorRelatorio implements Visitor {

    @Override
    public void visit(ProdutoFisico produto) {
        double imposto = produto.getValor() * 0.10;
        System.out.printf("Relatório Imposto - Produto Físico [%s]: R$ %.2f (10%% de R$ %.2f)%n", 
                          produto.getNome(), imposto, produto.getValor());
    }

    @Override
    public void visit(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.printf("Relatório Imposto - Serviço [%s]: R$ %.2f (15%% de R$ %.2f)%n", 
                          servico.getDescricao(), imposto, servico.getValor());
    }
}