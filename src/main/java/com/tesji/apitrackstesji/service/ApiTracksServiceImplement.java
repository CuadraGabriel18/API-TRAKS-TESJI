package com.tesji.apitrackstesji.service;

import com.tesji.apitrackstesji.model.DatosApiTraks;
import com.tesji.apitrackstesji.repository.CrudApiTraksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//Exponer como un servicio en nuestra API REST
@Service
public class ApiTracksServiceImplement implements  ApiTraksService{

    //Inyectar un objeto de la clade CrudApiTraksRepository para las operaciones CRUD
    @Autowired
    CrudApiTraksRepository crudApiTraksRepository;

    @Override
    public ArrayList<DatosApiTraks> mostrarTraks() {
        return (ArrayList<DatosApiTraks>) crudApiTraksRepository.findAll();
    }

    @Override
    public Optional<DatosApiTraks> buscarTrakPorId(long id) {
        return crudApiTraksRepository.findById(id);
    }

    @Override
    public DatosApiTraks registrarTrak(DatosApiTraks cancion) {
        return crudApiTraksRepository.save(cancion);
    }

    @Override
    public boolean eliminarTrak(long id) {
        //obtener el object registro
        try {
            Optional<DatosApiTraks> track = buscarTrakPorId(id);
            crudApiTraksRepository.delete(track.get());
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
