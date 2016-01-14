package com.youtube.sorcjc.proyectoprofesionales.io;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface HomeSolutionApiService {

    // http://homesolution.com.ar/api/areas
    @GET("areas")
    Call<ZonasResponse> getZonasResponse();

    // http://homesolution.com.ar/api/login?us=info@latrampera.com&ps=lolcats
    // @GET("login?us={email}&ps={password}") I was using @Path, but @Query is better
    @GET("login")
    Call<LoginResponse> getLoginResponse(@Query("us") String email, @Query("ps") String password);

    // http://homesolution.com.ar/api/register?us=Hamilton&email=matias@celani.com.pe&ps=lolcats&accept=1
    @GET("register")
    Call<RegistroResponse> getRegistroResponse(@Query("us") String nombre, @Query("email") String email, @Query("ps") String password, @Query("accept") int accept, @Query("area") String zona);
}
