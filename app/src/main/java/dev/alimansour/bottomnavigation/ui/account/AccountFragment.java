package dev.alimansour.bottomnavigation.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dev.alimansour.bottomnavigation.R;


public class AccountFragment extends Fragment {
    private TextView textAccount;
    private AccountViewModel viewModel;

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_account, container, false);
        textAccount = root.findViewById(R.id.text_account);
        viewModel = new ViewModelProvider(this).get(AccountViewModel.class);
        viewModel.getText().observe(getViewLifecycleOwner(),text -> {
            textAccount.setText(text);
        });
        return root;
    }
}