package br.edu.ifpb.ads.padroes.atv2;

public class Servico implements Item {
    private double valor;
    private String descricao;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
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