package com.example.magik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.magik.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    int vidas1=25,vidas2=25,veri1=0,veri2=0;
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.SumaVeneno1.setOnClickListener(view1 -> {
            veri1++;
            binding.texto1.setText(vidas1+"/"+veri1);
        });
        binding.RestaVeri1.setOnClickListener(view1 -> {
            veri1--;
            binding.texto1.setText(vidas1+"/"+veri1);
        });
        binding.SumaVida1.setOnClickListener(view1 -> {
            vidas1++;
            binding.texto1.setText(vidas1+"/"+veri1);
        });
        binding.RestaVida1.setOnClickListener(view1 -> {
            vidas1--;
            binding.texto1.setText(vidas1+"/"+veri1);
        });
        binding.RestaVeri2.setOnClickListener(view1 -> {
            veri2--;
            binding.texto2.setText(vidas2+"/"+veri2);
        });
        binding.RestaVida2.setOnClickListener(view1 -> {
            vidas2--;
            binding.texto2.setText(vidas2+"/"+veri2);
        });
        binding.SumaVeri2.setOnClickListener(view1 -> {
            veri2++;
            binding.texto2.setText(vidas2+"/"+veri2);
        });
        binding.SumaVida2.setOnClickListener(view1 -> {
            vidas2++;
            binding.texto2.setText(vidas2+"/"+veri2);
        });
        binding.Actualizador.setOnClickListener(view1 -> {
            vidas1=25;
            vidas2=25;
            veri1=0;
            veri2=0;
            binding.texto1.setText("25/0");
            binding.texto2.setText("25/0");
        });

        binding.Arriba.setOnClickListener(view1 -> {
            vidas1=vidas2;
            veri1=veri2;
            binding.texto1.setText(vidas2+"/"+veri2);
        });
        binding.abajo.setOnClickListener(view1 -> {
            vidas2=vidas1;
            veri2=veri1;
            binding.texto2.setText(vidas1+"/"+veri1);
        });


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}