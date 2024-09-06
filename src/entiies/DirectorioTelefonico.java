/*
Un directorio telefónico posee una lista de Contactos de los que interesa conocer su DNI, nombre, apellido, ciudad 
y dirección. Un contacto se empareja con un teléfono tipo Long.
El directorio telefónico posee además las siguientes funcionalidades:


C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados
a dicho apellido.
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java con TreeMap<Long, 
Cliente> y TreeSet. Recuerde el uso de: Iterator y keySet()
 */
package entiies;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author matia
 */
public class DirectorioTelefonico  {
    
    private TreeMap <  Long , Contacto > contactoTreeMap ;
   // private Long numeroTel;

    public DirectorioTelefonico() {
      
        this.contactoTreeMap=  new TreeMap ();
        
    }

    public TreeMap<Long, Contacto> getContactoTreeMap() {
        return contactoTreeMap;
    }

    

   
    /* A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro.
del teléfono la clave del mismo. */
    
    public void agregarContacto( Long tel, Contacto contact ) {
        
        contactoTreeMap.put(tel, contact);

        if (contactoTreeMap.containsKey(tel)) {
            JOptionPane.showMessageDialog(null, " Contacto Agregado Correctamente");
        } else {
            JOptionPane.showMessageDialog(null, " Contacto ya se encuentra Agendado");

        }

    }
    
    
    /*B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.*/
    
    public Contacto buscarContacto( Long tel) {
  

         for (Map.Entry<Long, Contacto> telefonoMap : contactoTreeMap.entrySet())
        {
 
            if (Objects.equals(telefonoMap.getKey(), tel)) {
                    return telefonoMap.getValue();
            }
        }
        return null; 

    }

    @Override
    public String toString() {
       
          StringBuilder sb= new StringBuilder();
        for(Map.Entry<Long, Contacto> setToStringMapContacto : contactoTreeMap.entrySet()){
            sb.append
            ("Telefono: ").append
            (setToStringMapContacto.getKey()).append
            (" ").append
            ("Contacto: ").append
            (setToStringMapContacto.getValue()).append
            ("\n");
        }
        return sb.toString();
        
        
    }
    
    
}
