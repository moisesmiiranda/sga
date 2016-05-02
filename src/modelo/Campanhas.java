
package modelo;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
  @author moises
  
 */
@Entity
@NamedQueries({
@NamedQuery (name = "listarCampanhas", query = "from Campanhas"),
@NamedQuery (name = "CampanhasPorID", query = "from Campanhas where id = ?")
})
public class Campanhas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    private Date dataInicial;
    private Date dataFinal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Campanhas{" + "titulo=" + titulo + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + '}';
    }
    
    
    
}
