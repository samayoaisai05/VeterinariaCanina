package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();

    public void guardar(String nombre, String raza, String color, String observaciones, String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
        
        // Creamos a los objetos de las entidades y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCel(celDuenio);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservacion(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setDuenio(duenio);
        
        controladora.guardar(duenio, mascota);
        
    }
}
