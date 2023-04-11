package com.example.partidajogos.data;

import com.example.partidajogos.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json") //nome do arquivo criado no gitHub API
    Call<List<Match>> getMatches();
}
