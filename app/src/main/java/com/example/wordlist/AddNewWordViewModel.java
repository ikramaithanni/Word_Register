package com.example.wordregister;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class AddNewWordViewModel extends AndroidViewModel {

    private WordRepositery mRepository;


    public AddNewWordViewModel(@NonNull Application application) {

        super(application);
        mRepository = new WordRepositery(application);
    }


    public void insert(Words word) {
        mRepository.Insert(word);
    }

    public void update(Words word) {
        mRepository.Update(word);
    }

}
