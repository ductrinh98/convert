package com.example.projectcalculator.ui.doidonvi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoiDonViViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DoiDonViViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}