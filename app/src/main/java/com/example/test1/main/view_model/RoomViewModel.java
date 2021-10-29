package com.example.test1.main.view_model;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.test1.main.main_data.Items;

import java.util.List;

public class RoomViewModel extends AndroidViewModel {
    MutableLiveData<List<Items>> liveData;

    public RoomViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Items>> getData() {
        if (liveData == null) {
            liveData = new MutableLiveData<>();
            loadData();
        }
        return liveData;
    }

    private void loadData() {

        Context context = getApplication().getApplicationContext();

        List<Items> items = RoomModel.getInstance().setContext(context).getOfflineNews();

        liveData.postValue(items);
    }
}
