package com.example.lab5_recycleview02;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ModuleActivity extends AppCompatActivity {
    List<Module> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        RecyclerView rvModuleList = findViewById(R.id.rvModuleList);

        modules = new ArrayList<>();
        modules.add(new Module("Android","ListView trong Android","trong Android là một thành phần giao diện người dùng (UI component) cho phép bạn hiển thị một danh sách các mục (items) theo dạng cuộn dọc (scrollable vertical list).",R.drawable.android));
        modules.add(new Module("IOS", "Xử lý sự kiện trong IOS","Xử lý sự kiện trong iOS là một phần quan trọng trong phát triển ứng dụng iOS, giúp tương tác người dùng với giao diện ứng dụng. Các sự kiện có thể bao gồm chạm, vuốt, kéo, và các hành động khác. ", R.drawable.ios));


        rvModuleList.setAdapter(new ModuleAdapter(modules));
        rvModuleList.setLayoutManager(new LinearLayoutManager(this));

    }
}