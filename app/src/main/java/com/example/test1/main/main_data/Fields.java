package com.example.test1.main.main_data;

import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("headline")
    private String headline;
    @SerializedName("starRating")
    private String starRating;
    @SerializedName("shortUrl")
    private String shortUrl;
    @SerializedName("thumbnail")
    private String thumbnail;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getStarRating() {
        return starRating == null ? "0" : starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
