package pl.coderslab.findrehab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.findrehab.entity.Filia;


import java.util.List;

public interface FiliaRepository extends JpaRepository<Filia,Long> {

    List<Filia> findAll();

    @Query("select f from Filia f where f.city = :city")
    List<Filia> findAllByCityUsingQuery(@Param("city") String city);
}
