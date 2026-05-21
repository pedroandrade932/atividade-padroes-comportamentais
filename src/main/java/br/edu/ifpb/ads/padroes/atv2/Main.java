package br.edu.ifpb.ads.padroes.atv2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new ProdutoFisico("Notebook Gamer", 6000.00));
        itens.add(new ProdutoFisico("Cadeira de Escritório", 800.00));
        itens.add(new Servico("Contabilidade", 500.00));
        itens.add(new Servico("Consultoria de TI", 400.00));

        Visitor visitorImprimir = new VisitorImprimir();
        Visitor visitorImpostos = new VisitorRelatorio();

        System.out.println("---- Executando Operacao de Impressão de Produtos e Servicos ----");
        for (Item item : itens) {
            item.accept(visitorImprimir);
        }

        System.out.println("\n---- Executando Operacao de Relatorio de Impostos ----");
        for (Item item : itens) {
            item.accept(visitorImpostos);
        }
    }
}