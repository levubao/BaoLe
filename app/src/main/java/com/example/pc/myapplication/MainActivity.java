package com.example.pc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvwCauThu;
    ArrayList<CauThu> arrCauThu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrCauThu= new ArrayList<CauThu>();
        lvwCauThu= (ListView) findViewById(R.id.lvw_CauThu);
        adDS(arrCauThu);
        MyArrayAdapter ctAdapter= new MyArrayAdapter(MainActivity.this,R.layout.cauthu, arrCauThu);
        lvwCauThu.setAdapter(ctAdapter);
        lvwCauThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CauThu ct = arrCauThu.get(i);
                Toast.makeText(MainActivity.this, "Ban vua chon " + ct.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void adDS(ArrayList<CauThu> arrCauThu) {
        CauThu sv1= new CauThu( "Nguyễn Văn Bình", "0988648733", R.drawable.a2,R.drawable.a13);
        CauThu sv2= new CauThu( "Nguyễn Tấn Dũng", "0908648734", R.drawable.a2,R.drawable.a13);
        CauThu sv3= new CauThu( "Nguyễn Phú Trọng", "0908648735", R.drawable.a2,R.drawable.a13);
        CauThu sv4= new CauThu( "Hoàng Trung Hải", "0978648736", R.drawable.a2,R.drawable.a13);
        CauThu sv5= new CauThu( "Ngô Xuân Lịch", "0987648737", R.drawable.a2,R.drawable.a13);
        CauThu sv6= new CauThu( "Trần Đại Quang", "0987648737", R.drawable.a2,R.drawable.a13);
        CauThu sv7= new CauThu( "Nguyễn Thiện Nhân", "0987648737", R.drawable.a2,R.drawable.a13);


        arrCauThu.add(sv1);
        arrCauThu.add(sv2);
        arrCauThu.add(sv3);
        arrCauThu.add(sv4);
        arrCauThu.add(sv5);
        arrCauThu.add(sv6);
        arrCauThu.add(sv7);

    }
}
