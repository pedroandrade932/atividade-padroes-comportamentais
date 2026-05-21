package br.edu.ifpb.ads.padroes.atv2;

public class ProdutoFisico implements Item {
    private double valor;
    private String nome;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}