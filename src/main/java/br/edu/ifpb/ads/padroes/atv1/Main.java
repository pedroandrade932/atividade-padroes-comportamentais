package br.edu.ifpb.ads.padroes.atv1;


import br.edu.ifpb.ads.padroes.atv1.Favoritados.InteressadoEmArtista;
import br.edu.ifpb.ads.padroes.atv1.Favoritados.InteressadoNoGenero;
import br.edu.ifpb.ads.padroes.atv1.Favoritados.InteressadoNoTitulo;
import br.edu.ifpb.ads.padroes.atv1.Notificacao.NotificarEmail;
import br.edu.ifpb.ads.padroes.atv1.Notificacao.NotificarSMS;
import br.edu.ifpb.ads.padroes.atv1.Notificacao.NotificarPush;

// Classe principal para demonstrar o funcionamento do sistema
public class Main {
    public static void main(String[] args) {
        RepositorioDiscos repo = new RepositorioDiscos();

        repo.inscreverInteressado(new InteressadoNoGenero("Rock", new NotificarSMS()));
        repo.inscreverInteressado(new InteressadoEmArtista("Pink Floyd", new NotificarEmail()));
        repo.inscreverInteressado(new InteressadoNoTitulo("The Dark Side of the Moon", new NotificarPush()));

        repo.addDisco(new Disco("Pink Floyd", "The Dark Side of the Moon", "Rock", 1973));
    }
}
