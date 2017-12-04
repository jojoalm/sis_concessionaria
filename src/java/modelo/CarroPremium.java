/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.CarroPopular;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author aluno
 */
@Entity

public class CarroPremium extends CarroPopular implements Serializable{
    
    private String cambioAutomatico;
    private String airBag;
    private String freioAbs;
    private String ebd;

    

    public CarroPremium() {
    }

    public CarroPremium(String cambioAutomatico, String airBag, String freioAbs, String ebd, Double preco, String vidroEletrico, String som, String arCondicionado, String direcaoHidraulica, String travaEletrica, String modelo, String cor, String combustivel, Date anoFabricacao, Date anoModelo) {
        super(preco, vidroEletrico, som, arCondicionado, direcaoHidraulica, travaEletrica, modelo, cor, combustivel, anoFabricacao, anoModelo);
        this.cambioAutomatico = cambioAutomatico;
        this.airBag = airBag;
        this.freioAbs = freioAbs;
        this.ebd = ebd;
    }

   

    public String getAirBag() {
        return airBag;
    }

    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getEbd() {
        return ebd;
    }

    public void setEbd(String ebd) {
        this.ebd = ebd;
    }

    public String getFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(String freioAbs) {
        this.freioAbs = freioAbs;
    }

    @Override
    public String toString() {
        return "CarroPremium{"  + ", cambioAutomatico=" + cambioAutomatico + ", airBag=" + airBag + ", freioAbs=" + freioAbs + ", ebd=" + ebd + '}';
    }
    
    
    
    
}
