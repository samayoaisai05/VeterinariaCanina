package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControladoraPersistencia {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("PeluqueriaCaninaPU");
    DuenioJpaController duenioJpa = new DuenioJpaController(emf);
    MascotaJpaController mascotaJpa = new MascotaJpaController(emf);

    public void guardar(Duenio duenio, Mascota mascota) {
        
        // Crear el objeto en la BD
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }
}
