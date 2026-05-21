package br.edu.ifpb.ads.padroes.atv1.Notificacao;

public class NotificarSMS implements CanalDeNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando o SMS: " + mensagem);
    }
}