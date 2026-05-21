package br.edu.ifpb.ads.padroes.atv1.Favoritados;

import br.edu.ifpb.ads.padroes.atv1.Notificacao.CanalDeNotificacao;
import br.edu.ifpb.ads.padroes.atv1.Disco;

// Implementação para interessados em Artistas
public class InteressadoEmArtista implements Favorito {
    private String artistaDeInteresse;
    private CanalDeNotificacao canal;

    public InteressadoEmArtista(String artistaDeInteresse, CanalDeNotificacao canal) {
        this.artistaDeInteresse = artistaDeInteresse;
        this.canal = canal;
    }

    @Override
    public void verificarENotificar(Disco disco) {
        if (disco.getArtista().toLowerCase().contains(artistaDeInteresse.toLowerCase())) {
            canal.enviar("Novo disco do artista: " + disco.getArtista());
        }
    }
}