/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author moises
 */
@Entity
@NamedQueries({
    @NamedQuery (name = "listarProfissionais", query = "from Profissional"),
    @NamedQuery (name = "profissionalPorID", query ="from Profissional where id = ?"),
    @NamedQuery (name = "profissionalPorIdentificacao", query = "from Profissional where identificacao = ?"),
    @NamedQuery (name = "profissionalPorNome", query = "from Profissional where nome like :nome")
})
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nome;
    private String tipo;
    @Column (unique = true)
    private String identificacao;
    @OneToMany (mappedBy = "profissional")
    private List <Atendimento> consulta;

    public List<Atendimento> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<Atendimento> consulta) {
        this.consulta = consulta;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Profissional{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", identificacao=" + identificacao + ", consulta=" + consulta + '}';
    }

  
    
    
    
}
