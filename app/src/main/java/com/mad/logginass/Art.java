package com.mad.logginass;

public class Art {
    private String artName;
    private int artImage;
    private String artDescription;
    private Double artPrice;


    public Art(String artName, int artImage, String artDescription,Double aPrice ) {
        this.artName = artName;
        this.artImage = artImage;
        this.artDescription = artDescription;
        this.artPrice = aPrice;
    }

    public Double getArtPrice() {
        return artPrice;
    }

    public void setArtPrice(Double artPrice) {
        this.artPrice = artPrice;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public int getArtImage() {
        return artImage;
    }

    public void setArtImage(int artImage) {
        this.artImage = artImage;
    }

    public String getArtDescription() {
        return artDescription;
    }

    public void setArtDescription(String artDescription) {
        this.artDescription = artDescription;
    }
}
