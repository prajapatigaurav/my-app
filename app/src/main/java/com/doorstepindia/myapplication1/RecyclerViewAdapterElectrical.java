package com.doorstepindia.myapplication1;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.doorstepindia.myapplication1.electrical.CeilingFanActivity;
import com.doorstepindia.myapplication1.electrical.ExhaustActivity;
import com.doorstepindia.myapplication1.electrical.GeneralActivity;
import com.doorstepindia.myapplication1.electrical.MCBActivity;
import com.doorstepindia.myapplication1.electrical.WallFanActivity;

import java.util.List;

public class RecyclerViewAdapterElectrical extends RecyclerView.Adapter<RecyclerViewAdapterElectrical.MyViewHolder2> {
    Context context;
    List<Book> bookList;


    public RecyclerViewAdapterElectrical(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.cardview_item_book_electrical, viewGroup, false);
        return new MyViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 myViewHolder2, final int i) {
        myViewHolder2.textView.setText(bookList.get(i).getTitle());
        myViewHolder2.imageView.setImageResource(bookList.get(i).getImage());
        myViewHolder2.cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(context, GeneralActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, CeilingFanActivity.class);
                        context.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, WallFanActivity.class);
                        context.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(context, ExhaustActivity.class);
                        context.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(context, MCBActivity.class);
                        context.startActivity(intent4);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder {
        CardView cardView2;
        ImageView imageView;
        TextView textView;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            cardView2 = itemView.findViewById(R.id.cardView2);
            imageView = itemView.findViewById(R.id.card_view_image);
            textView = itemView.findViewById(R.id.card_view_image_title);
        }
    }
}