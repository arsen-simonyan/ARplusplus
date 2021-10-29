package com.example.test1.main.view_model;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.test1.main.main_data.BasicResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    MutableLiveData<BasicResponse> body;

    public LiveData<BasicResponse> getData() {
        if (body == null) {
            body = new MutableLiveData<>();
            loadData();
        }
        return body;
    }

    private void loadData() {
        MainModel.getInstance()
                .getJSONApi()
                .getContentX()
                .enqueue(new Callback<BasicResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<BasicResponse> call,
                                           @NonNull Response<BasicResponse> response) {
                        body.postValue(response.body());
                    }

                    @Override
                    public void onFailure(@NonNull Call<BasicResponse> call, @NonNull Throwable t) {
                        t.printStackTrace();
                    }
                });
    }
}
