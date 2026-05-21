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
        repo.inscreverInteressado(new InteressadoEmArtista("Raul Seixas", new NotificarEmail()));
        repo.inscreverInteressado(new InteressadoNoTitulo("Metamorfose Ambulante", new NotificarPush()));

        repo.addDisco(new Disco("Raul Seixas", "Metamorfose Ambulante", "Rock", 1973));
    }
}
