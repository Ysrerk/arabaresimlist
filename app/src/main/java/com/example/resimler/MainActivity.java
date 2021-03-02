package com.example.resimler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Model.Resimler;
import RestApi.ManagerAll;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Resimler> resimlerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();
        istek();
    }
    public void tanimlama(){
        listView=findViewById(R.id.listview);
        resimlerList=new ArrayList<>();

    }

    public void istek(){

        ManagerAll managerAll=new ManagerAll();
        Call<List<Resimler>>listCall=managerAll.getrestapi().getresimler();
        listCall.enqueue(new Callback<List<Resimler>>() {
            @Override
            public void onResponse(Call<List<Resimler>> call, Response<List<Resimler>> response) {
                Log.i("resimmm",response.body().toString());
                resimlerList=response.body();
                Resimleradapter resimleradapter=new Resimleradapter(resimlerList,getApplicationContext());
                listView.setAdapter(resimleradapter);
            }

            @Override
            public void onFailure(Call<List<Resimler>> call, Throwable t) {

            }
        });
    }
}