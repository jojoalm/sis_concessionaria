/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.CarroPopular;
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
public class CarroUsadoPopular extends CarroPopular implements Serializable{
        
    private String marca;
    private String placa;
    private String quilometragem;

    

    public CarroUsadoPopular() {
    }

    public CarroUsadoPopular(String marca, String placa, String quilometragem, Double preco, String vidroEletrico, String som, String arCondicionado, String direcaoHidraulica, String travaEletrica, String modelo, String cor, String combustivel, Date anoFabricacao, Date anoModelo) {
        super(preco, vidroEletrico, som, arCondicionado, direcaoHidraulica, travaEletrica, modelo, cor, combustivel, anoFabricacao, anoModelo);
        this.marca = marca;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "CarroUsadoPopular{"  + ", marca=" + marca + ", placa=" + placa + ", quilometragem=" + quilometragem + '}';
    }
    
    
}
