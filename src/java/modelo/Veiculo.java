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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author aluno
 */
@Entity

@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Veiculo implements Serializable{
    
    @Id @GeneratedValue
    private int id;
    private String modelo;
    private String cor;
    private String combustivel;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   anoFabricacao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   anoModelo;

    public Veiculo() {
    }

    public Veiculo(String modelo, String cor, String combustivel, Date anoFabricacao, Date anoModelo) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }

    

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", modelo=" + modelo + ", cor=" + cor + ", combustivel=" + combustivel + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + '}';
    }
    
    
}
