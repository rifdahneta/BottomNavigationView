package uas.rifdah.bottomnavigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import uas.rifdah.bottomnavigationview.model.DataItem;

public class DetailActivity extends AppCompatActivity {

    TextView detailTitle;
    TextView detailDeskripsi;
    ImageView detailGambar;
    List<DataItem> dataItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initData();
        Intent intent = getIntent();
        String dTitle = intent.getStringExtra("title");
        String dDescription = intent.getStringExtra("description");
        Integer dGambar = intent.getIntExtra("image",0);
        detailTitle.setText(dTitle);
        detailDeskripsi.setText(dDescription);
        Glide.with(this)
                .load(dGambar)
                .into(detailGambar);

    }

    private void initData() {
        detailTitle = findViewById(R.id.tv_title_detail);
        detailDeskripsi = findViewById(R.id.tv_desc_detail);
        detailGambar = findViewById(R.id.iv_gambar_detail);

    }
}
