package ca.vikingsdev.centauri.ui.bounties;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BountyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BountyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bounty fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}