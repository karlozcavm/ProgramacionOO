/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mundo;

/**
 * Clase para guardar los datos de una persona
 * @author Carlos Villa
 * @version 0.1
 */
public class DatosPersona {
    /**
     * color de piel de la persona
     */
    String colorPiel;
    /**
     * Edad de la persona
     */
    int edad;
    /**
     * Estatura de la persona
     */
    double estatura;
    /**
     * Nombre de la persona
     */
    String nombre;
    /**
     * Peso de la persona
     */
    double peso;
    /**
     * Construcor de la clase
     * Inicializa los atributos de 0 o en cadena bacia
     */
    void DatosPersona(){
        colorPiel = "";
        edad = 0;
        estatura = 0.0;
        nombre = "";
        peso = 0.0;
        /**
         * constructor de la clase con parametros
         * @param pColorPiel Color de la piel
         * @param pEdad Edad de la persona
         * @param pEstatura Estatura de la persona
         * @param pNombre Nombre de la persona
         * @param pPeso Peso de la persona
         */
    }
    void DatosPersona(String pColorPiel, int pEdad, double pEstatura, String pNombre, double pPeso){
        colorPiel = pColorPiel;
        edad = pEdad;
        estatura = pEstatura;
        nombre = pNombre;
        peso = pPeso;        
    }
    /**
     * Asigna valor a colorPiel
     * @param pColorPiel Color de la piel
     */
    public void setColorPiel (String pColorPiel){
        colorPiel = pColorPiel;
    }
    /**
     * Retorna en color de la piel
     * @return colorPiel
     */
    public String getColorPiel(){
        return colorPiel;
    }
    /**
     * Asigna valor a edad
     * @param pEdad 
     */
    public void setEdad (int pEdad){
        edad = pEdad;
    }
    /**
     * Retorna en edad
     * @return edad
     */
    public int getEdad(){
        return edad;
    }
    /**
     * Asigna valor a Estatura
     * @param pEstatura 
     */
    public  void setEstatura(double pEstatura){
        estatura = pEstatura;
    }
    /**
     * Retorna en Estatura
     * @return estatura
     */
    public double getEstatura(){
        return estatura;
    }
    /**
     * Asigna valor Nombre
     * @param pNombre 
     */
    public void setNombre(String pNombre){
        nombre = pNombre;             
    }
    /**
     * Retorna en Nombre
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Asigna valor peso
     * @param pPeso 
     */
    public void setPeso(double pPeso){
        peso = pPeso;
    }
    /**
     * Retorna en peso
     * @return peso
     */
    public double getPeso(){
        return peso;
    }
}
