/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Cliente;
/**
 *
 * @author JOSI
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
       
//       
        
        EntityManager manager = new SingletonPU().getManager();
   DateFormat format = new SimpleDateFormat("dd/MM/yyyy");   
 
           
modelo.CarroUsadoPopular P = new modelo.CarroUsadoPopular();
P.setAnoFabricacao(format.parse("12/12/2012"));
P.setAnoModelo(format.parse("12/12/2012"));
P.setArCondicionado("sim");
P.setCombustivel("alcool");
P.setCor("azul");
P.setDirecaoHidraulica("sim");
P.setModelo("Caravan");
P.setPreco(1202.00);
P.setSom("sim");
P.setTravaEletrica("sim");
P.setVidroEletrico("sim");
P.setMarca("Volks");
P.setPlaca("212222");
P.setQuilometragem("23");

 manager.getTransaction().begin();
        manager.persist(P);
        manager.getTransaction().commit();
        manager.close();

    }
}
