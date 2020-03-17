package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String [] cars_names,cars_description;
    int [] images;

    public MyAdapter(Context context, String[] cars_names, String[] cars_description, int[] images) {
        this.context = context;
        this.cars_names = cars_names;
        this.cars_description = cars_description;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
      View view = layoutInflater.inflate(R.layout.sample_view,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.cr_names.setText(cars_names[position]);
        holder.cr_description.setText(cars_description[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView cr_names,cr_description;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cr_names = itemView.findViewById(R.id.carsNamesTextID);
            cr_description = itemView.findViewById(R.id.carDescriptionTextID);
            imageView = itemView.findViewById(R.id.imageViewID);
        }
    }
}
