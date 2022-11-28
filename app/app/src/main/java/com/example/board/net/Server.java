package com.example.board.net;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Server {
    private static Server instance;
    private ServerApi api;

    private Server(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gyudrive.ipdisk.co.kr:8080")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ServerApi.class);
    }

    public static Server getInstance(){
        if ( instance == null ) instance = new Server();
        return instance;
    }

    public ServerApi getApi() { return api; }

    public static MultipartBody.Part getFilePart(String path, String fileName){
        MultipartBody.Part part = null;
        File file = new File(path);
        if(file.exists()){
            RequestBody body = RequestBody.create(MediaType.parse("multipart/form-data"), file);
            part = MultipartBody.Part.createFormData("file1", fileName, body);
        }
        return part;
    }
}
