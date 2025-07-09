package com.data.demo2.repository;


import com.data.demo2.model.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findBySeatNumber(String seatNumber);
    List<Seat> findByScreenRoom_Id(Long screenRoomId);
}