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
import java.util.TreeMap;

/**
 *
 * @author matia
 */
public class DirectorioTelefonico  {
    
    private TreeMap <  Long , Contacto > contactoTreeMap ;
    private Long numeroTel;

    public DirectorioTelefonico() {
      
        this.contactoTreeMap=  new TreeMap ();
        
    }

    public TreeMap<Long, Contacto> getContactoTreeMap() {
        return contactoTreeMap;
    }

    public Long getNumeroTel() {
        return numeroTel;
    }

   
    /* A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro.
del teléfono la clave del mismo. */
    
    public void agregarContacto(Contacto contact , Long tel) {
        
        contactoTreeMap.put(tel, contact);
        
    }
    
    
    /*B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.*/
    
    public Contacto buscarContacto( Long tel) {
  
        for (Map.Entry<Long, Contacto> entry : contactoTreeMap.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            
            if(key.equals(val)){
                return entry.getValue();
            }
            
            
        }
    return null;
    }
    
}
