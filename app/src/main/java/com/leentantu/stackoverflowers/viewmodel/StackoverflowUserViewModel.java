package com.leentantu.stackoverflowers.viewmodel;


import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.leentantu.stackoverflowers.model.StackoverflowUser;

import java.util.List;

public class StackoverflowUserViewModel extends ViewModel {

    private MutableLiveData<List<StackoverflowUser>> mListMutableLiveData;

    /**
     * Helper method that returns a list of user names.
     *
     * @return {@link MutableLiveData} list of users
     */
    public MutableLiveData<List<StackoverflowUser>> getStackoverflowUsers() {
        if (mListMutableLiveData == null) {
            mListMutableLiveData = new MutableLiveData<>();
            loadUserNames();
        }
        return mListMutableLiveData;
    }

    /**
     * Helper method to simulate loading of data from a server. We will replace this later.
     */
    private void loadUserNames() {

    }
}
