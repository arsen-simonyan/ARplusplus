package com.example.test1.main.main_data;

import com.google.gson.annotations.SerializedName;

public class BasicResponse {
    @SerializedName("response")
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
