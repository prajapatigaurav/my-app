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

import com.doorstepindia.myapplication1.ac.ACGasRefillActivity;
import com.doorstepindia.myapplication1.ac.ACInstallActivity;
import com.doorstepindia.myapplication1.ac.ACNotCoolingActivity;
import com.doorstepindia.myapplication1.ac.ACServiceActivity;
import com.doorstepindia.myapplication1.ac.ACUnistallActivity;
import com.doorstepindia.myapplication1.carpentry.DoorOrWindowActivity;
import com.doorstepindia.myapplication1.carpentry.FurnitureAssemblyActivity;
import com.doorstepindia.myapplication1.carpentry.FurnitureRepairActivity;
import com.doorstepindia.myapplication1.carpentry.GeneralCarpentryActivity;
import com.doorstepindia.myapplication1.carpentry.NewFurnitureActivity;
import com.doorstepindia.myapplication1.electrical.GeneralActivity;

import java.util.List;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.MyViewHolder1> {
    List<Book> list;
    Context context;


    public RecyclerViewAdapter1(List<Book> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.cardview_item_book1, viewGroup, false);
        return new MyViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 myViewHolder, final int i) {
        myViewHolder.img_book_thumbnail.setImageResource(list.get(i).getImage());
        myViewHolder.tv_book_title.setText(list.get(i).getTitle());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(context, ACServiceActivity.class);
                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(context, ACInstallActivity.class);
                        context.startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(context, ACUnistallActivity.class);
                        context.startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(context, ACNotCoolingActivity.class);
                        context.startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(context, ACGasRefillActivity.class);
                        context.startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(context, GeneralCarpentryActivity.class);
                        context.startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(context, NewFurnitureActivity.class);
                        context.startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(context, FurnitureRepairActivity.class);
                        context.startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(context, FurnitureAssemblyActivity.class);
                        context.startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(context, DoorOrWindowActivity.class);
                        context.startActivity(intent9);
                        break;

                    case 10:
                        Intent intent10 = new Intent(context, GeneralActivity.class);
                        context.startActivity(intent10);


                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class MyViewHolder1 extends RecyclerView.ViewHolder {


        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);

            tv_book_title = itemView.findViewById(R.id.card_view_image_title);
            img_book_thumbnail = itemView.findViewById(R.id.card_view_image);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }


}