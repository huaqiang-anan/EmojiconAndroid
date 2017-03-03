package huaqiang.cn.emojiconandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import huaqiang.cn.emojiconlibrary.FaceConversionUtil;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FaceConversionUtil.getInstace().getFileText(getApplication());

        findViewById(R.id.show_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmoiconActivity.class));
            }
        });
    }
}
