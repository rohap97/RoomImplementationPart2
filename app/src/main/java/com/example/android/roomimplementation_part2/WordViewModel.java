package com.example.android.roomimplementation_part2;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    WordRepository mWordRepository;

    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
        mAllWords = mWordRepository.getAllWords();


    }

    LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word){ mWordRepository.insert(word); }
}
