package com.erzihutama.erzihutamaapps.View.profil;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.erzihutama.erzihutamaapps.R;

public class AboutFragment extends Fragment {

    Dialog myDialog;
    Button btnFollow ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);


        return view;
    }
//    public void ShowPopup(View v) {
//
//        Button btnFollow;
//        myDialog.setContentView(R.layout.custompopup);
//
//        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
//        btnFollow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myDialog.dismiss();
//            }
//        });
//        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        myDialog.show();
//    }
}
