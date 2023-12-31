package exercicio2.amigo.secreto;

import exercicio2.amigo.secreto.Mensagem;

public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean anonima){
        super(texto,emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if(super.ehAnonima()) {
            return "Mensagem para: " + getEmailDestinatario() + ". Texto: " + super.getTexto();
        } else {
            return "Mensagem de: " + super.getEmailRemetente() + ". Para: " + this.getEmailDestinatario() +". Texto: " + super.getTexto();
        }
    }
}
