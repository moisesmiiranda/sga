
package DAO_Generico;

import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.Utilitaria;

/**
 *
 * @author moises
 */
public class Dao<T> {
    
    private Session sessao;
    
    public Dao(){
        
    }
    
    public void gravar( T t){
        sessao = Utilitaria.getSession();
        sessao.beginTransaction();
        sessao.save(t);
        sessao.getTransaction().commit();
        if(sessao.isOpen())
            sessao.close();
        JOptionPane.showMessageDialog(null,"Dados salvos com sucesso!");
    }
    
    public void atualizar(T t){
        sessao = Utilitaria.getSession();
        sessao.beginTransaction();
        sessao.update(t);
        sessao.getTransaction().commit();
        if(sessao.isOpen())
            sessao.close();
    JOptionPane.showMessageDialog(null, "Cadastro atualizado.");
    }
    
    public void excluir(T t){
        sessao = Utilitaria.getSession();
        sessao.beginTransaction();
         Query q;
         
         
        
        
        sessao.delete(t);
        sessao.getTransaction().commit();
        if(sessao.isOpen())
            sessao.close();
   
  
    
    }
  
    
}
