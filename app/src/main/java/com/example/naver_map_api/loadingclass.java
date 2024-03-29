package com.example.naver_map_api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
// 로딩 화면
// 맵에 마커가 박히는 시간을 위해 사용하는 페이지
public class loadingclass extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadingclass);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);   // 시간 초 조절
    }
}