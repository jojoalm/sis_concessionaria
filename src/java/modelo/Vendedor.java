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
public class Vendedor extends Pessoa implements Serializable{
   
    private Double salario;

    public Vendedor(Double salario, String nome, Date nascimento, int telefone) {
        super(nome, nascimento, telefone);
        this.salario = salario;
    }

    public Vendedor() {
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +  ", salario=" + salario + '}';
    }
    
    
}
