
package DAO_Generico;

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
    }
    
    public void atualizar(T t){
        sessao = Utilitaria.getSession();
        sessao.beginTransaction();
        sessao.update(t);
        sessao.getTransaction().commit();
        if(sessao.isOpen())
            sessao.close();
    }
    public void excluir(T t){
        sessao = Utilitaria.getSession();
        sessao.beginTransaction();
        sessao.delete(t);
        sessao.getTransaction().commit();
        if(sessao.isOpen())
            sessao.close();
                    
    }
    
}
