import entity.cliente;
import DAO.clienteDAO;

public class Main {
    public static void main(String[] args) {

        cliente pessoa = new cliente();

        pessoa.setId_cliente(36);
        pessoa.setNome("carlim");
        pessoa.setEmail("carlim@gmail.com");
        pessoa.setEndereco("saopaulo");
        pessoa.setTelefone("9823984");

        new clienteDAO().cadastrarCliente(pessoa);
    }
}