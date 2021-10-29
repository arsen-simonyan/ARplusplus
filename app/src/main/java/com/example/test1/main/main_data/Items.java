package com.example.test1.main.main_data;

import androidx.annotation.NonNull;
import androidx.room.*;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Items {

    public Items(){
        tags = new ArrayList<>();
    }

    @SerializedName("id")
    @PrimaryKey
    @NonNull
    private String id;
    @SerializedName("type")
    private String type;
    @SerializedName("sectionId")
    private String sectionId;
    @SerializedName("sectionName")
    private String sectionName;
    @SerializedName("webPublicationDate")
    private String webPublicationDate;
    @SerializedName("webTitle")
    private String webTitle;
    @SerializedName("webUrl")
    private String webUrl;
    @SerializedName("apiUrl")
    private String apiUrl;
    @SerializedName("fields")
    @Ignore
    private Fields fields;
    @SerializedName("tags")
    @Ignore
    private List<Tags> tags;
    @SerializedName("isHosted")
    private boolean isHosted;
    @SerializedName("pillarId")
    private String pillarId;
    @SerializedName("pillarName")
    private String pillarName;

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

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
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

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public boolean isHosted() {
        return isHosted;
    }

    public void setHosted(boolean hosted) {
        isHosted = hosted;
    }

    public String isPillarId() {
        return pillarId;
    }

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    public String isPillarName() {
        return pillarName;
    }

    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    public String getPillarId() {
        return pillarId;
    }

    public String getPillarName() {
        return pillarName;
    }
}
