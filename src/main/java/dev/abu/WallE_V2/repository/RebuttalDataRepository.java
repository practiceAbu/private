package dev.abu.WallE_V2.repository;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:40
 *projectName:WallE_V2

 */

import dev.abu.WallE_V2.model.RebuttalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface  RebuttalDataRepository extends JpaRepository<RebuttalData,Integer> {
    @Query("SELECT r.closedAs, COUNT(r) FROM RebuttalData r GROUP BY r.closedAs")
    List<Object[]> countByClosedAs();
}
