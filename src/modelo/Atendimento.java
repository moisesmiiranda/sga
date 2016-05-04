/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import java.sql.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author moises
 */
@Entity
//@NamedQuery (name = "ConsultaPorID", query "select from Atendimento where id :?")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date data;
    private Time hora;
    private String descricao;
    @ManyToOne
    @JoinColumn(name ="profissionalFK")
    private Profissional profissional;
    @ManyToOne 
    @JoinColumn (name = "pacienteFK")
    private Paciente paciente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", data=" + data + ", hora=" + hora + ", descricao=" + descricao + ", profissional=" + profissional + ", paciente=" + paciente + '}';
    }

   

   

   
   
    
    
}
