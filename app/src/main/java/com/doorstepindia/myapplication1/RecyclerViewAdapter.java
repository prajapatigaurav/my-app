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

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    List<Book> list;
    Context context;


    public RecyclerViewAdapter(List<Book> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.cardview_item_book, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.img_book_thumbnail.setImageResource(list.get(i).getImage());
        myViewHolder.tv_book_title.setText(list.get(i).getTitle());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i == 0) {

                    Intent intent = new Intent(context, ACActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    // passing data to the book activity
                    intent.putExtra("Title", list.get(i).getTitle());
                    //      intent.putExtra("Description",mData.get(position).getDescription());
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    // start the activity
                    context.startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(context, ElectricalActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(context, PlumbingActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(context, PaintingActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 4) {
                    Intent intent = new Intent(context, CarpentryActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 5) {
                    Intent intent = new Intent(context, CCTVActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 6) {
                    Intent intent = new Intent(context, AppliancesActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                } else if (i == 7) {
                    Intent intent = new Intent(context, CarCareActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("Thumbnail", list.get(i).getImage());
                    context.startActivity(intent);
                }
            }

        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_book_title = itemView.findViewById(R.id.card_view_image_title);
            img_book_thumbnail = itemView.findViewById(R.id.card_view_image);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }


}
