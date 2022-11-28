package com.example.board.net;

import com.example.board.dto.Board;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {
    @GET("/")
    Call<List<Board>> getboardList();
}
