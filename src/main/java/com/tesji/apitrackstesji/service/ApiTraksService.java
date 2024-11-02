package com.tesji.apitrackstesji.service;
import com.tesji.apitrackstesji.model.DatosApiTraks;
import java.util.ArrayList;
import java.util.Optional;

//Defiir los metodos abstractos para implementarlas en las End-Points
public interface ApiTraksService {
    ArrayList<DatosApiTraks> mostrarTraks(); //metodo para mostrar todos los traks
    Optional<DatosApiTraks> buscarTrakPorId(long id);
    DatosApiTraks registrarTrak(DatosApiTraks cancion); //Registrar y actualizar
    boolean eliminarTrak(long id);

}
