
package controller;

import java.util.ArrayList;
import model.bean.Cliente;
import model.dao.ClienteDAO;


public class ClienteController {
    
    public void create(String nome, String email, String cpf, String telefone, String dataAniversario){
        Cliente cliente = new Cliente(); 
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setDataAniversario(dataAniversario);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(cliente);
    }
    
    public void update(int idCliente, String nome, String email, String cpf, String telefone, String dataAniversario){
        Cliente cliente = new Cliente(); 
        ClienteDAO clienteDAO = new ClienteDAO();
        
        cliente.setIdCliente(idCliente);
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setDataAniversario(dataAniversario);
        
        clienteDAO.update(cliente);
    }
    
    public void delete(int idCliente){
        Cliente cliente = new Cliente(); 
        ClienteDAO clienteDAO = new ClienteDAO();
        
        cliente.setIdCliente(idCliente);
        
        clienteDAO.delete(cliente);
    }
    public ArrayList<Cliente> read(){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.read();
    }
    
    public ArrayList<Cliente> getListaClientesporNome(String nome){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.getListaClientesporNome(nome);
    }
}
