package com.tesji.apitrackstesji.controller;

//Clase que define el Acceso a la API mediante URL
//Y tambien los end-points (peticiones http)

import com.tesji.apitrackstesji.model.DatosApiTraks;
import com.tesji.apitrackstesji.service.ApiTraksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api-traks")
public class ApiTraks {

    //Inyectar mi objeto repositorio con las operaciones CRUD
    @Autowired
    ApiTraksService apiTraksService;

    @GetMapping("/get-prueba")
     public String pruebaGet(){
         return "Funciona!!! Bienvenido a API TRAKS TESJI";
     }

     @GetMapping("/get-mostrartodo")
    public ArrayList<DatosApiTraks> mostrarTodosLosTracks(){
        return apiTraksService.mostrarTraks();
     }

     @GetMapping("/get-mostrar-track/{id}")
    public Optional<DatosApiTraks> mostrarTrack(@PathVariable("id") long id){
        return apiTraksService.buscarTrakPorId(id);
     }

     @PostMapping("/post-guardar-track")
    public DatosApiTraks registrarTrack(@RequestBody DatosApiTraks track){
        return apiTraksService.registrarTrak(track);
     }

     @DeleteMapping("/delete-borrar-track/{id}")
    public boolean borrarTrack(@PathVariable("id") long id){
        return  apiTraksService.eliminarTrak(id);
     }
}
