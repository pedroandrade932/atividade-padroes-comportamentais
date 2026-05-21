package br.edu.ifpb.ads.padroes.atv1.Notificacao;

public class NotificarPush implements CanalDeNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a notificação PUSH: " + mensagem);
    }
}