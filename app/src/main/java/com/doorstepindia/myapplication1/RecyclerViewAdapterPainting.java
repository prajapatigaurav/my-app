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

import com.doorstepindia.myapplication1.painting.ExteriorPaintingActivity;
import com.doorstepindia.myapplication1.painting.FreshPaintingActivity;
import com.doorstepindia.myapplication1.painting.TexturedPaintingActivity;

import java.util.List;

public class RecyclerViewAdapterPainting extends RecyclerView.Adapter<RecyclerViewAdapterPainting.MyViewHolder2> {
    Context context;
    List<Book> bookList;


    public RecyclerViewAdapterPainting(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.cardview_item_book_painting, viewGroup, false);
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
                        Intent intent = new Intent(context, FreshPaintingActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, ExteriorPaintingActivity.class);
                        context.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, TexturedPaintingActivity.class);
                        context.startActivity(intent2);
                }







              /*  Intent intent = new Intent(context, Main2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                // passing data to the book activity
                //   intent.putExtra("Title",list.get(i).getTitle());
                //      intent.putExtra("Description",mData.get(position).getDescription());
                //    intent.putExtra("Thumbnail",list.get(i).getImage());
                // start the activity
                context.startActivity(intent);*/
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
