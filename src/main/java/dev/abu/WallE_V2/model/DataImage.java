package dev.abu.WallE_V2.model;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:34
 *projectName:WallE_V2

 */

import jakarta.persistence.*;
import lombok.Data;


@Entity
public class DataImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer imageId;

	private String imageTag;
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "rebuttal_id")
	private RebuttalData rebuttalData;

	public Integer getImageId() {
		return imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public String getImageTag() {
		return imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public RebuttalData getRebuttalData() {
		return rebuttalData;
	}

	public void setRebuttalData(RebuttalData rebuttalData) {
		this.rebuttalData = rebuttalData;
	}
}
