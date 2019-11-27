package com.example.projectcalculator.ui.doicoso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoiCoSoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DoiCoSoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}