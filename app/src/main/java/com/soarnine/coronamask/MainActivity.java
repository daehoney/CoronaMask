package com.soarnine.coronamask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.soarnine.coronamask.databinding.ActivityMainBinding;
import com.soarnine.coronamask.model.GeoStore;
import com.soarnine.coronamask.network.ApiRunner;
import com.soarnine.coronamask.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ApiRunner.getCoronaService().getStoreByGeo().enqueue(new Callback<GeoStore>() {
            @Override
            public void onResponse(Call<GeoStore> call, Response<GeoStore> response) {
                MainViewModel viewModel = new MainViewModel();
                viewModel.setStores(response.body().getStores());
                binding.setViewModel(viewModel);
                binding.setLifecycleOwner(MainActivity.this);
            }

            @Override
            public void onFailure(Call<GeoStore> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
