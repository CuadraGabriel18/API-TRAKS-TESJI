package com.tesji.apitrackstesji.repository;

import com.tesji.apitrackstesji.model.DatosApiTraks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudApiTraksRepository extends CrudRepository <DatosApiTraks,Long> {
}
