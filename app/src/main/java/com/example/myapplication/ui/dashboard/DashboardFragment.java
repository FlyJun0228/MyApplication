package com.example.myapplication.ui.dashboard;

import static android.app.Activity.RESULT_OK;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.SyncStateContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.Adapter.CloAdapter;
import com.example.myapplication.AddCloest;
import com.example.myapplication.R;
import com.example.myapplication.data.Clothing;
import com.example.myapplication.data.ClothingDao;
import com.example.myapplication.data.ClothingDatabase;
import com.example.myapplication.databinding.FragmentDashboardBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yalantis.ucrop.UCrop;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DashboardFragment extends Fragment {


    private FragmentDashboardBinding binding;
    private FloatingActionButton bt_add;
    private ListView listView;
    private CloAdapter cloAdapter;
    private List<Clothing> list;
    private ClothingDao clothingDao;
    private ClothingDatabase clothingDatabase;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        listView = root.findViewById(R.id.list_clo);
        list = new ArrayList<>();
        clothingDatabase = ClothingDatabase.getClothingDatabase(getActivity());
        clothingDao = clothingDatabase.getDao();
        list = clothingDao.Queryclothing();
        cloAdapter = new CloAdapter(getActivity(),list);
        listView.setAdapter(cloAdapter);
        bt_add = root.findViewById(R.id.add);
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(), AddCloest.class);
                getActivity().startActivity(intent);

            }
        });
        return root;
    }

}