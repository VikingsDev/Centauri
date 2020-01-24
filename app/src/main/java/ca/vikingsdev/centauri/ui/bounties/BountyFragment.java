package ca.vikingsdev.centauri.ui.bounties;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ca.vikingsdev.centauri.R;

public class BountyFragment extends Fragment {

    private BountyViewModel bountyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bountyViewModel =
                ViewModelProviders.of(this).get(BountyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bounties, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        bountyViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}