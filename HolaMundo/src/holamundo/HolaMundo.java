/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author antonio
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo Java!!!");
        Persona per1 = new Persona();
        per1.setNombre("Antonio");
        System.out.println("Nombre: " + per1.getNombre() );
        per1.comer("hamburguesa hawaiana!!!");
        
        Persona per2=new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("pizza hawaiana");
        
        Automovil miBocho=new Automovil();
        miBocho.setMarca("VW");
        System.out.println("Marca: " + miBocho.getMarca());
        miBocho.setSubMarca("Sedan");
        System.out.println("Submarca: " + miBocho.getSubMarca());
        miBocho.setModelo(1970);
        System.out.println("Modelo: " + miBocho.getModelo());
        miBocho.setColor(Color.BLUE);
        System.out.println("Color: " + miBocho.getColor());
        
        Automovil miAkura=new Automovil();
        miAkura.setMarca("Akura");
        System.out.println("Marca: " + miAkura.getMarca());
        miAkura.setSubMarca("NSX");
        System.out.println("Submarca: " + miAkura.getSubMarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: " + miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color: " + miAkura.getColor());
        
        Automovil miMustang=new Automovil();
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setSubMarca("Mustang");
        System.out.println("Submarca: " + miMustang.getSubMarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Color: " + miMustang.getColor());
    }
    
}
