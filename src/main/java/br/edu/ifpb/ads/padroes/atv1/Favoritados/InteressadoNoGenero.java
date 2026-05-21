package br.edu.ifpb.ads.padroes.atv1.Favoritados;

import br.edu.ifpb.ads.padroes.atv1.Notificacao.CanalDeNotificacao;
import br.edu.ifpb.ads.padroes.atv1.Disco;

// Implementação para interessados em Gêneros
public class InteressadoNoGenero implements Favorito {
    private String generoDeInteresse;
    private CanalDeNotificacao canal;

    public InteressadoNoGenero(String generoDeInteresse, CanalDeNotificacao canal) {
        this.generoDeInteresse = generoDeInteresse;
        this.canal = canal;
    }

    @Override
    public void verificarENotificar(Disco disco) {
        if (disco.getGenero().toLowerCase().contains(generoDeInteresse.toLowerCase())) {
            canal.enviar("Novo disco do gênero: " + disco.getGenero());
        }
    }
}