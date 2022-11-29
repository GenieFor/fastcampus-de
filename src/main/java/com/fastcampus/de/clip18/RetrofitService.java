package com.fastcampus.de.clip18;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    /*
        인터페이스 선언만으로 자동으로 메소드가 구현되는 이유는
        retrofit에서 request type과 parameter만으로 알아서 요청 상세를 구현해줌
     */
    @GET("/api/users/")
    Call<Object> retrofitTest(@Query("page") int page);
}
