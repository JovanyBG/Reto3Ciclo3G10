package com.example.demo.Interface;

import com.example.demo.Modelo.Reservation;
import java.util.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository <Reservation, Integer>{
    
    public List<Reservation> findAllByStatus(String status);
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore (Date datoUno, Date datoDos);
    @Query("SELECT c.client, COUNT(c.client) from Reservation As c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();
}
