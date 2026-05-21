package br.edu.ifpb.ads.padroes.atv1.Notificacao;

public class NotificarEmail implements CanalDeNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando o EMAIL: " + mensagem);
    }
}
