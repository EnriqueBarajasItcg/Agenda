import java.util.*;

public class MPersona
{
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public MPersona()
  {}
  
  public void agregar(String nom, String ap, String tel, String correo)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setCorreoe(correo);
    Arrpersona.add(objPersona);//Agrega el objeto al arrayList
  }
  public void desplegar()
  {
     System.out.println("...PERSONAS EN LA AGENDA...");
     
     Iterator<Persona> itrPersona = Arrpersona.iterator();
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
     System.out.println("Telefono: " + persona.getTelefono());
     }
   }
   public boolean validar(String nom, String tel, String ap){
     Iterator<Persona> itrPersona = Arrpersona.iterator();
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     if((nom.equals(persona.getNombre())&& ap.equals(persona.getApellidos()) )|| tel.equals(persona.getTelefono())){
      return false;
     
     }
      
   }
      return true;
   }
   
  public ArrayList Datos()
  {
     return Arrpersona;
  }
}
