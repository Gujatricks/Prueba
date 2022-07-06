/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
///para realizar el prestamo}
///plantilla idlibro-idSocio-Fecha_prestamo// genera code-->>idsocio -->>> idsocio code => tcode
//tcode=10 status=0 ---tcode<=9 status=1----tcode= 0+code 
//-->status=0 --0 = no prestar libro //Socio_no_fiable// status=1 =si prestar libro
/**
 *
 * @author Lab27
 */
public class Prestamo extends Libro{

    public int getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(int Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public Prestamo() {
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(float idlibro) {
        this.idlibro = idlibro;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public boolean prestamo(){
    boolean disponibilidad = true;
    if(disponibilidad < Ejemplares ){
    }
    
    
    }
}
