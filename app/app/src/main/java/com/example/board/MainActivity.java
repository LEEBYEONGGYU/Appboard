package com.example.board;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.board.dto.Board;
import com.example.board.net.ServerApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public Call<List<Board>> list;
    protected ServerApi serverApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        list = serverApi.getboardList();
        list.enqueue(new Callback<List<Board>>() {
            @Override
            public void onResponse(Call<List<Board>> call, Response<List<Board>> response) {
                if(response.code()==200){


                }else{

                }
            }

            @Override
            public void onFailure(Call<List<Board>> call, Throwable t) {

            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}