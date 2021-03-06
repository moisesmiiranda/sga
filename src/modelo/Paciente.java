/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;



/**
 *
 * @author Moises
 */
@Entity
@NamedQueries({
    @NamedQuery (name = "listarPacientes", query = "from Paciente"),
    @NamedQuery (name = "pacientePorID", query ="from Paciente where id = ?"),
    @NamedQuery (name = "pacientePorCPF", query = "from Paciente where cpf like :cpf"),
    @NamedQuery (name = "pacientePorNome", query = "from Paciente where nome like :nome")
})
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nome;
    private Date dataDeNascimento;
    private String sexo;
    @Column(unique = true)
    private String cpf;
    private String endereco;
    private String telefone;
    @OneToMany (mappedBy = "paciente")
    private List<Atendimento> consultas;

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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Atendimento> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Atendimento> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", consultas=" + consultas + '}';
    }


    






}