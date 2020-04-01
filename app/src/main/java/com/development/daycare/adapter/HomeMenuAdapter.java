package com.development.daycare.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.development.daycare.R;
import com.development.daycare.model.homeModel.MenuList;
import com.development.daycare.views.activity.signup.SignupScreen;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeMenuAdapter extends RecyclerView.Adapter<HomeMenuAdapter.MyViewHolder> {

    private List<MenuList> menuLists;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView imageView;
        LinearLayout viewLayout;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            imageView = (ImageView)view.findViewById(R.id.image);
            viewLayout = (LinearLayout)view.findViewById(R.id.menu_item);

        }
    }


    public HomeMenuAdapter(Context context,List<MenuList> menuLists) {
        this.context = context;
        this.menuLists = menuLists;
    }

    @Override
    public HomeMenuAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_list_item, parent, false);

        return new HomeMenuAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomeMenuAdapter.MyViewHolder holder, int position) {
        MenuList  menu = menuLists.get(position);
        holder.title.setText(menu.getTitle());


        Picasso.get()
                .load(menu.getImage())
           //     *//*  .placeholder(R.drawable.image1)
                 // .error(R.drawable.err)*//*
                .into(holder.imageView);

        holder.viewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(menu.getTitle().equalsIgnoreCase("Partner") || menu.getId().equals("9")){
                    Intent intent = new Intent(context, SignupScreen.class);
                    context.startActivity(intent);
                }

                //  context.startActivity(new Intent(context, RoomDetail.class));
            }
        });

       /* holder.name.setText(featureProperty.getPropertyName());
        holder.rating.setText(featureProperty.getRating());
        holder.created_date.setText(featureProperty.getCreatedDate());*/

       /* holder.viewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,PropertyDetail.class);
                intent.putExtra("Property_Id",featureProperty.getId());
                context.startActivity(intent);
                //  context.startActivity(new Intent(context, RoomDetail.class));
            }
        });
        Picasso.get()
                .load(homeSliderList.get(0).getImage())
                *//*  .placeholder(R.drawable.image1)
                  .error(R.drawable.err)*//*
                .into(holder.imageView);*/


      /*  holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, RoomDetail.class));
            }
        });*/
        /* holder.title.setText(find_room.getType());*/
    }

    @Override
    public int getItemCount() {
        return menuLists.size();
    }
}
