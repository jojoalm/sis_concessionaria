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

public class CarroPopular extends Veiculo implements Serializable{
   
    
    private Double preco;
    private String vidroEletrico;
    private String som;
    private String arCondicionado;
    private String direcaoHidraulica;
    private String travaEletrica;

   

    public CarroPopular() {
    }

    public CarroPopular(Double preco, String vidroEletrico, String som, String arCondicionado, String direcaoHidraulica, String travaEletrica, String modelo, String cor, String combustivel, Date anoFabricacao, Date anoModelo) {
        super(modelo, cor, combustivel, anoFabricacao, anoModelo);
        this.preco = preco;
        this.vidroEletrico = vidroEletrico;
        this.som = som;
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
        this.travaEletrica = travaEletrica;
    }

    
    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(String direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getTravaEletrica() {
        return travaEletrica;
    }

    public void setTravaEletrica(String travaEletrica) {
        this.travaEletrica = travaEletrica;
    }

    public String getVidroEletrico() {
        return vidroEletrico;
    }

    public void setVidroEletrico(String vidroEletrico) {
        this.vidroEletrico = vidroEletrico;
    }

    @Override
    public String toString() {
        return "CarroPopular{"  + ", preco=" + preco + ", vidroEletrico=" + vidroEletrico + ", som=" + som + ", arCondicionado=" + arCondicionado + ", direcaoHidraulica=" + direcaoHidraulica + ", travaEletrica=" + travaEletrica + '}';
    }
    
    
}
