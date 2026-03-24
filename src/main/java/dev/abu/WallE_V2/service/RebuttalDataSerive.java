package dev.abu.WallE_V2.service;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:41
 *projectName:WallE_V2

 */

import dev.abu.WallE_V2.dto.RebuttalDataDTO;
import dev.abu.WallE_V2.model.RebuttalData;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface RebuttalDataSerive {

    RebuttalDataDTO create(RebuttalDataDTO dataDTO);
    List<RebuttalDataDTO> createBulk(List<RebuttalDataDTO> dtos);
    List<RebuttalDataDTO> getAll();
    RebuttalDataDTO getById(Integer id);

    void delete(Integer id);

    RebuttalDataDTO update(Integer id, RebuttalDataDTO dto);

    Page<RebuttalDataDTO> getAllPages(int page, int size);

    public Map<String, Long> getClosedAsCount();

    List<RebuttalDataDTO> getByWorkStream(String workStream);


}
