package com.example.test1.main.main_data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Tags {

    Tags(){
        references = new ArrayList<>();
    }

    @SerializedName("id")
    private String id;
    @SerializedName("type")
    private String type;
    @SerializedName("webTitle")
    private String webTitle;
    @SerializedName("webUrl")
    private String webUrl;
    @SerializedName("apiUrl")
    private String apiUrl;
    @SerializedName("references")
    private List<String> references;
    @SerializedName("bio")
    private String bio;
    @SerializedName("bylineImageUrl")
    private String bylineImageUrl;
    @SerializedName("bylineLargeImageUrl")
    private String bylineLargeImageUrl;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("twitterHandle")
    private String twitterHandle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBylineImageUrl() {
        return bylineImageUrl;
    }

    public void setBylineImageUrl(String bylineImageUrl) {
        this.bylineImageUrl = bylineImageUrl;
    }

    public String getBylineLargeImageUrl() {
        return bylineLargeImageUrl;
    }

    public void setBylineLargeImageUrl(String bylineLargeImageUrl) {
        this.bylineLargeImageUrl = bylineLargeImageUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }
}
