/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author aluno
 */
@Entity
public class Cliente extends Pessoa implements Serializable{
   
    private int CPF;
    private String endereco;

    public Cliente( int CPF, String endereco, String nome, Date nascimento, int telefone) {
        super(nome, nascimento, telefone);
       
        this.CPF = CPF;
        this.endereco = endereco;
    }

    

    

    public Cliente() {
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + ", CPF=" + CPF + ", endereco=" + endereco + '}';
    }
    
    
}
