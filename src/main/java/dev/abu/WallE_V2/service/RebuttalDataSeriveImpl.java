package dev.abu.WallE_V2.service;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:42
 *projectName:WallE_V2

 */

import dev.abu.WallE_V2.dto.DataImageDTO;
import dev.abu.WallE_V2.dto.RebuttalDataDTO;
import dev.abu.WallE_V2.model.DataImage;
import dev.abu.WallE_V2.model.RebuttalData;
import dev.abu.WallE_V2.repository.RebuttalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RebuttalDataSeriveImpl implements RebuttalDataSerive {
    @Autowired
    RebuttalDataRepository repository;

    @Override
    public RebuttalDataDTO create(RebuttalDataDTO dataDTO) {
        RebuttalData entity = new RebuttalData();

        entity.setAsin(dataDTO.getAsin());
        entity.setWorkStream(dataDTO.getWorkStream());
        entity.setOperCode(dataDTO.getOperCode());
        entity.setAsin(dataDTO.getAsin());
        entity.setQuarCode(dataDTO.getQuarCode());
        entity.setQuarComment(dataDTO.getQuarComment());
        entity.setOperCode(dataDTO.getOperCode());
        entity.setOperComment(dataDTO.getOperComment());
        entity.setSmeCode(dataDTO.getSmeCode());
        entity.setSmeComment(dataDTO.getSmeComment());
        entity.setFinalCode(dataDTO.getFinalCode());
        entity.setFinalCodeRefComment(dataDTO.getFinalCodeRefComment());
        entity.setClosedAs(dataDTO.getClosedAs());

        if (dataDTO.getImages() != null) {
            List<DataImage> images = dataDTO.getImages().stream().map(imgDto -> {
                DataImage img = new DataImage();
                img.setImageTag(imgDto.getImageTag());
                img.setImageUrl(imgDto.getImageUrl());
                img.setRebuttalData(entity);
                return img;
            }).collect(Collectors.toList());

            entity.setImages(images);
        }

        RebuttalData saved = repository.save(entity);

        return dataDTO;
    }


    public List<RebuttalDataDTO> createBulk(List<RebuttalDataDTO> dtos) {

        List<RebuttalData> entities = dtos.stream().map(dto -> {

            RebuttalData entity = new RebuttalData();

            entity.setAsin(dto.getAsin());
            entity.setWorkStream(dto.getWorkStream());
            entity.setQuarCode(dto.getQuarCode());
            entity.setQuarComment(dto.getQuarComment());
            entity.setOperCode(dto.getOperCode());
            entity.setOperComment(dto.getOperComment());
            entity.setSmeCode(dto.getSmeCode());
            entity.setSmeComment(dto.getSmeComment());
            entity.setFinalCode(dto.getFinalCode());
            entity.setFinalCodeRefComment(dto.getFinalCodeRefComment());
            entity.setClosedAs(dto.getClosedAs());

            if (dto.getImages() != null) {
                List<DataImage> images = dto.getImages().stream().map(imgDto -> {
                    DataImage img = new DataImage();
                    img.setImageTag(imgDto.getImageTag());
                    img.setImageUrl(imgDto.getImageUrl());
                    img.setRebuttalData(entity);
                    return img;
                }).collect(Collectors.toList());

                entity.setImages(images);
            }

            return entity;

        }).collect(Collectors.toList());

        List<RebuttalData> savedEntities = repository.saveAll(entities);

        return savedEntities.stream().map(entity -> {
            RebuttalDataDTO dto = new RebuttalDataDTO();

            dto.setAsin(entity.getAsin());
            dto.setWorkStream(entity.getWorkStream());
            dto.setQuarCode(entity.getQuarCode());
            dto.setQuarComment(entity.getQuarComment());
            dto.setOperCode(entity.getOperCode());
            dto.setOperComment(entity.getOperComment());
            dto.setSmeCode(entity.getSmeCode());
            dto.setSmeComment(entity.getSmeComment());
            dto.setFinalCode(entity.getFinalCode());
            dto.setFinalCodeRefComment(entity.getFinalCodeRefComment());
            dto.setClosedAs(entity.getClosedAs());

            return dto;
        }).collect(Collectors.toList());
    }

    public List<RebuttalDataDTO> getAll() {
        return repository.findAll().stream().map(entity -> {
            RebuttalDataDTO dto = new RebuttalDataDTO();

            dto.setAsin(entity.getAsin());
            dto.setWorkStream(entity.getWorkStream());
            dto.setQuarCode(entity.getQuarCode());
            dto.setQuarComment(entity.getQuarComment());
            dto.setOperCode(entity.getOperCode());
            dto.setOperComment(entity.getOperComment());
            dto.setSmeCode(entity.getSmeCode());
            dto.setSmeComment(entity.getSmeComment());
            dto.setFinalCode(entity.getFinalCode());
            dto.setFinalCodeRefComment(entity.getFinalCodeRefComment());
            dto.setClosedAs(entity.getClosedAs());

            if (entity.getImages() != null) {
                List<DataImageDTO> images = entity.getImages().stream().map(img -> {
                    DataImageDTO imgDto = new DataImageDTO();
                    imgDto.setImageTag(img.getImageTag());
                    imgDto.setImageUrl(img.getImageUrl());
                    return imgDto;
                }).toList();

                dto.setImages(images);
            }

            return dto;
        }).toList();
    }

    public RebuttalDataDTO getById(Integer id) {
        RebuttalData entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));

        RebuttalDataDTO dto = new RebuttalDataDTO();

        dto.setAsin(entity.getAsin());
        dto.setWorkStream(entity.getWorkStream());
        dto.setQuarCode(entity.getQuarCode());
        dto.setQuarComment(entity.getQuarComment());
        dto.setOperCode(entity.getOperCode());
        dto.setOperComment(entity.getOperComment());
        dto.setSmeCode(entity.getSmeCode());
        dto.setSmeComment(entity.getSmeComment());
        dto.setFinalCode(entity.getFinalCode());
        dto.setFinalCodeRefComment(entity.getFinalCodeRefComment());
        dto.setClosedAs(entity.getClosedAs());

        if (entity.getImages() != null) {
            dto.setImages(entity.getImages().stream().map(img -> {
                DataImageDTO imgDto = new DataImageDTO();
                imgDto.setImageTag(img.getImageTag());
                imgDto.setImageUrl(img.getImageUrl());
                return imgDto;
            }).toList());
        }

        return dto;
    }

    @Override
    public void delete(Integer id) {
        RebuttalData entity = repository.findById(id).orElseThrow(()-> new RuntimeException("Data not found"));
        repository.delete(entity);
    }


}
