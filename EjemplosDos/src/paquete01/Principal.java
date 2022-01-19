/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;


/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String direccion;
        String nombreEmpresa;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        direccion = DatoTrabajo.obtenerDireccion();
        nombreEmpresa = DatoTrabajo.obtenerEmpresa();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio= DatoFinal.ObtenerPromedio(misNotas);
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre Empresa: %s\n"
                + "Direccion Empresa: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                direccion,
                nombreEmpresa,
                promedio);
    }
    
}
