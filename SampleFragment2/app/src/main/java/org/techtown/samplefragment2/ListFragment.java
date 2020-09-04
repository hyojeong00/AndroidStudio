package org.techtown.samplefragment2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    public static interface ImageSelectionCallBack
    {
        public void onImageSelected(int position);
    }

    public ImageSelectionCallBack callBack;

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);

        if(context instanceof ImageSelectionCallBack)
        {
            callBack=(ImageSelectionCallBack) context;
        }
    }

    @Nullable
    @Override
    Public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list,container,false);
        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(callBack !=null)
                {
                    callBack.onImageSelected(0);
                }
            }
        });

        Button button2 = rootView.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(callBack !=null)
                {
                    callBack.onImageSelected(1);
                }
            }
        });

        Button button3 = rootView.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(callBack !=null)
                {
                    callBack.onImageSelected(2);
                }
            }
        });

        return rootView;
    }