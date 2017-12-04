/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author aluno
 */
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable{
    @Id @GeneratedValue
    private int id;
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    private int telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, Date nascimento, int telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", nascimento=" + nascimento + ", telefone=" + telefone + '}';
    }
    
    
}
