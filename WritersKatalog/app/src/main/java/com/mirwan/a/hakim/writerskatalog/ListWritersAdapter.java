package com.mirwan.a.hakim.writerskatalog;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWritersAdapter extends RecyclerView.Adapter<ListWritersAdapter.ListViewHolder> {
    private ArrayList<Writer> listWriter;
    public ListWritersAdapter(ArrayList<Writer> list){
        this.listWriter = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_writers, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final Writer writer = listWriter.get(position);
        Glide.with(holder.itemView.getContext())
                .load(writer.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(writer.getName());
        holder.tvDetail.setText(writer.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu Memilih" + listWriter.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("image", listWriter.get(position).getPhoto());
                intent.putExtra("name", listWriter.get(position).getName());
                intent.putExtra("detail", listWriter.get(position).getDetail());
                v.getContext().startActivity(intent);
                //Glide.with(holder.itemView.getContext())
                  //      .load(writer.getPhoto())
                    //    .apply(new RequestOptions().override(350, 250))
                      //  .into(holder.imgPhoto);
                //holder.tvName.setText(writer.getName());
                //holder.tvDetail.setText(writer.getDetail());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWriter.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

}
