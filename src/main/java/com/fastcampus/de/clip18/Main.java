package com.fastcampus.de.clip18;

import retrofit2.Call;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        /*
            RetrofitClient에 구현해 놓은 해당 api서비스 타입을 가져와서 (getApi부분에서 RetrofitService를 타입으로 지정했음)
            해당 타입에 구현해놓은 api method인 retrofitTest를 호출했음
         */
        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);

        try {
            // 실제 서버의 api를 호추하여 데이터를 확인하는 부분
            System.out.println(retrofitTest.execute().body());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
