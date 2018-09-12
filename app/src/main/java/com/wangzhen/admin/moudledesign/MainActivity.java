package com.wangzhen.admin.moudledesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ShareDesc.Builder builder = new ShareDesc.Builder();
        ShareDesc shareDesc = builder.build();*/
        listView =  findViewById(R.id.listView);

        final List<String> list = initArrayList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(linearLayoutManager);
        listView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
                return new Holder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                Holder holder1 = (Holder) holder;
                holder1.textView.setText(list.get(position));
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        });
    }

    private List<String> initArrayList() {
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < 50 ; i++){
            list.add("周吴郑王" + i) ;
        }
        return list;
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView textView ;

        public Holder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
