package com.example.proyectofigma;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.proyectofigma.databinding.FragmentRankingBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class rankingFragment extends Fragment {

    private FragmentRankingBinding binding;
    NavController navController;
    ImageView patras6;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentRankingBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        patras6 = view.findViewById(R.id.patras6);

        patras6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_menuFragment);
            }
        });
        binding.viewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                switch (position) {
                    case 0: default:
                        return new ranking1Fragment();
                    case 1:
                        return new ranking2Fragment();
                    case 2:
                        return new ranking3Fragment();
                }
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });

        new TabLayoutMediator(binding.tabLayout, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0: default:
                        tab.setText("Cofre");
                        break;
                    case 1:
                        tab.setText("Correr");
                        break;
                    case 2:
                        tab.setText("Tres en raya");
                        break;
                }
            }
        }).attach();
    }
}