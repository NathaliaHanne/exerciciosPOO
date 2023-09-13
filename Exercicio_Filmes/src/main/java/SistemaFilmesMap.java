package exercio.filmes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaFilmesMap {
    private Map<String,Filme> filmes;

    public void cadastrarFilme(Filme f)throws FilmeJaExisteException{
        if (this.filmes.containsKey(f.getCodigo())){
            throw new FilmeJaExisteException("Filme já cadastrado");
        }
    }
    public SistemaFilmesMap(){
        this.filmes = new HashMap<>();
    }
    public List<Filme> pesquisaRomance; {
        //TODO
    }


}
