package io.itch.api;

import io.itch.api.responses.GamesResponse;
import io.itch.api.responses.GraphsResponse;
import io.itch.api.responses.KeyResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

public interface ItchApi {

    @GET("/my-games")
    public void listMyGames(Callback<GamesResponse> callback);

    // /api/1/login params: username, password, source (must be "android")
    @POST("/login?source=android")
    public KeyResponse login(@Query("username") String username, @Query("password") String password);

    @GET("/my-games/graphs")
    public void listGraphs(@Query("num_days") Integer days, Callback<GraphsResponse> callback);
}
