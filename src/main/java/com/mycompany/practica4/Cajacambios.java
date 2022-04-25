/*
Crea el código de una caja de cambios automática, que actualmente
sube de marcha si el motor supera las 2.000 rpm, y baja si está por
debajo de las 500. La caja de cambios empieza al arrancar en la marcha
1 y tiene 6 marchas posibles, del 1 al 6. Avisa con un mensaje si el
coche no puede subir o bajar más de la marcha actual.s

*/
package com.mycompany.practica4;

public class Cajacambios {
    protected int marcha;
    protected int revoluciones;

    public Cajacambios(int marcha, int revoluciones) {
        this.marcha = marcha;
        this.revoluciones = revoluciones;
    }

    
    protected void CambiarMarcha(){
        if (this.revoluciones > 2000 && marcha <6 ){
            marcha =+ marcha;
        }else if (this.revoluciones > 2000 && marcha >6){
            System.out.println("No se puede subir de marcha");
        }
            
        if (this.revoluciones < 500 && marcha > 1){
            marcha =- marcha;
        }else if (this.revoluciones < 500 && marcha < 1){
            System.out.println("No se puede bajar de marcha");
        }
    }
}
