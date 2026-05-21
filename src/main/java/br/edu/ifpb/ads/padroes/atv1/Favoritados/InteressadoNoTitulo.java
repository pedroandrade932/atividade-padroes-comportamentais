package br.edu.ifpb.ads.padroes.atv1.Favoritados;

import br.edu.ifpb.ads.padroes.atv1.Notificacao.CanalDeNotificacao;
import br.edu.ifpb.ads.padroes.atv1.Disco;


// Implementação para interessados em Títulos
public class InteressadoNoTitulo implements Favorito {
    private String tituloDeInteresse;
    private CanalDeNotificacao canal;

    public InteressadoNoTitulo(String tituloDeInteresse, CanalDeNotificacao canal) {
        this.tituloDeInteresse = tituloDeInteresse;
        this.canal = canal;
    }

    @Override
    public void verificarENotificar(Disco disco) {
        if (disco.getTitulo().toLowerCase().contains(tituloDeInteresse.toLowerCase())) {
            canal.enviar("Novo disco adicionado: " + disco.getTitulo());
        }
    }
}