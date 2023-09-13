package exercio.filmes;

import java.util.List;

public class Filme {
    private String nome;
    private String codigo;
    private List<CategoriaFilme> categorias;

    public Filme(String nome,String codigo, List<CategoriaFilme> categorias){
        this.nome = nome;
        this.codigo = codigo;
        this.categorias = categorias;
    }


    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<CategoriaFilme> getCategorias() {
        return categorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCategorias(List<CategoriaFilme> categorias) {
        this.categorias = categorias;
    }
    public boolean ehDaCategoria(CategoriaFilme c){
        for (CategoriaFilme f: this.categorias){
            if(f.equals(c)){
                return true;
            }
        }
        return false;
    }
}
