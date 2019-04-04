package com.example.dongej.appmarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] names={"淘宝","QQ","支付宝","京东","地图","邮箱","微信","音乐"};
    private  int[] icons={R.drawable.tb,R.drawable.qq,R.drawable.zfb,R.drawable.jd,R.drawable.dt,R.drawable.yx,R.drawable.wx,R.drawable.yy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView) findViewById(R.id.lv);
        MyBaseAdapter mAdapter=new MyBaseAdapter();
        mListView.setAdapter(mAdapter);
    }
    class MyBaseAdapter extends BaseAdapter{
        public int getCount(){
            return  names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }
        public long getItemId(int position){
            return position;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup parent) {
            View view=View.inflate(MainActivity.this,R.layout.list_item,null);
            TextView mTextView=(TextView) view.findViewById(R.id.tv_list);
            mTextView.setText(names[position]);
            ImageView imageView=(ImageView) view.findViewById(R.id.image);
            imageView.setBackgroundResource(icons[position]);
            return view;
        }
    }
}
