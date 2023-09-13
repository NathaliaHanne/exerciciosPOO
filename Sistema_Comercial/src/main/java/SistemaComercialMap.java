package exercício5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SistemaComercialMap {
    private Map<String,Cliente> clientes;
    private Map <String, Produto> produtos;

    public boolean existeCliente (Cliente cliente) {
        return clientes.containsValue(cliente);
    }
    public Cliente pesquisaCliente (String id)throws ClienteNaoExisteException{
        Cliente c = clientes.get(id);
        if (c != null){
            return c;
        }
        throw new ClienteNaoExisteException ("Cliente não existe");
    }
    public Collection<Produto> pesquisaProdutosDaCategoria (CategoriaProduto categoria) {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SistemaComercialMap that = (SistemaComercialMap) o;

        if (!Objects.equals(clientes, that.clientes)) return false;
        return Objects.equals(produtos, that.produtos);
    }

    @Override
    public int hashCode() {
        int result = clientes != null ? clientes.hashCode() : 0;
        result = 31 * result + (produtos != null ? produtos.hashCode() : 0);
        return result;
    }
}
