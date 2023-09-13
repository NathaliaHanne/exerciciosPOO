package exercicio2.amigo.secreto;
import exercicio2.amigo.secreto.Amigo;
import exercicio2.amigo.secreto.Mensagem;

import java.util.LinkedList;
import java.util.List;
public class SistemaAmigo {
    private List<Amigo> amigos;
    private List<Mensagem> mensagems;
    public void cadastraAmigo (String nomeAmigo, String emailAmigo){
        //TODO
    }
    public Amigo pesquisaAmigo (String emailAmigo)throws AmigoNaoExisteException{
        for (Amigo a : amigos){
            if (a.getEmail().equals(emailAmigo)){
                return a;
            }
        }
        throw new AmigoNaoExisteException ("Não foi encontrado no sistema ninguém com o email "+ emailAmigo);
    }
    public void enviarMensagemParaTodos (String texto, String emailRemetente, boolean ehAnonima){
        //TODO
    }
    public void enviarMensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        //TODO
    }
    public List <Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new LinkedList<>();
        for (Mensagem m : mensagems){
            if (m.ehAnonima()){
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }
    public List<Mensagem> pesquisaTodasMensagens (){
        return mensagems;
    }
    public void configuraAmigoSecretoDe (String emailDaPessoa, String emailAmigoSorteado){
        //TODO
    }
    public String pesquisaAmigoSecretoDe (String emailDaPessoa)throws AmigoNaoExisteException, AmigoNaoSorteadoException{
        for (Amigo a : amigos){
            if (a.getEmail().equals(emailDaPessoa)){
                String emailAmigoSorteado = a.getEmailAmigoSorteado();
                if (emailAmigoSorteado == null){
                    throw new AmigoNaoSorteadoException ("Não foi sorteado o amigo de "+ emailDaPessoa);
                }else{
                    return emailAmigoSorteado;
                }
            }
        }
        throw new AmigoNaoExisteException("Não foi encontrado no sistema ninguém com o email "+ emailDaPessoa);
    }
}
