package dev.abu.WallE_V2.dto;/*
 *Created by Abuthair
 * Date:23/03/2026
 * time:20:38
 *projectName:WallE_V2

 */

import java.util.List;

public class RebuttalDataDTO {
    private String asin;
    private String workStream;
    private String quarCode;
    private String quarComment;



    private String operCode;
    private String operComment;
    private String smeCode;
    private String smeComment;
    private String finalCode;
    private String finalCodeRefComment;
    private String closedAs;

    private List<DataImageDTO> images;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getWorkStream() {
        return workStream;
    }

    public void setWorkStream(String workStream) {
        this.workStream = workStream;
    }

    public String getQuarCode() {
        return quarCode;
    }

    public void setQuarCode(String quarCode) {
        this.quarCode = quarCode;
    }

    public String getQuarComment() {
        return quarComment;
    }

    public void setQuarComment(String quarComment) {
        this.quarComment = quarComment;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperComment() {
        return operComment;
    }

    public void setOperComment(String operComment) {
        this.operComment = operComment;
    }

    public String getSmeCode() {
        return smeCode;
    }

    public void setSmeCode(String smeCode) {
        this.smeCode = smeCode;
    }

    public String getSmeComment() {
        return smeComment;
    }

    public void setSmeComment(String smeComment) {
        this.smeComment = smeComment;
    }

    public String getFinalCode() {
        return finalCode;
    }

    public void setFinalCode(String finalCode) {
        this.finalCode = finalCode;
    }

    public String getFinalCodeRefComment() {
        return finalCodeRefComment;
    }

    public void setFinalCodeRefComment(String finalCodeRefComment) {
        this.finalCodeRefComment = finalCodeRefComment;
    }

    public String getClosedAs() {
        return closedAs;
    }

    public void setClosedAs(String closedAs) {
        this.closedAs = closedAs;
    }

    public List<DataImageDTO> getImages() {
        return images;
    }

    public void setImages(List<DataImageDTO> images) {
        this.images = images;
    }
}
