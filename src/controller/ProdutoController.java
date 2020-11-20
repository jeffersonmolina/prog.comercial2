
package controller;

import java.util.ArrayList;
import model.bean.Produto;
import model.dao.ProdutoDAO;


public class ProdutoController {
    public void create(String descricao, int qtd, double preco){
        Produto produto = new Produto();  
        produto.setDescricao(descricao);
        produto.setQtd(qtd);
        produto.setPreco(preco);
        
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.create(produto);
    }
    
    public void update(int id, String descricao, int qtd, double preco){
        Produto produto = new Produto(); 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        produto.setId(id);
        produto.setDescricao(descricao);
        produto.setQtd(qtd);
        produto.setPreco(preco);  
        
        produtoDAO.update(produto);
    }
    
    public void delete(int id){
        Produto produto = new Produto(); 
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        produto.setId(id);
        
        produtoDAO.delete(produto);
    }
    
    public ArrayList<Produto> read(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.read();
    }
    
    public ArrayList<Produto> getListaProdutosporDescricao(String descricao){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.getListaProdutosporDescricao(descricao);
    }
}
