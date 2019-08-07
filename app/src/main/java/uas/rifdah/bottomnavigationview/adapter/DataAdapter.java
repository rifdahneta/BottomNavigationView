package uas.rifdah.bottomnavigationview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import uas.rifdah.bottomnavigationview.DetailActivity;
import uas.rifdah.bottomnavigationview.R;
import uas.rifdah.bottomnavigationview.fragment.HomeFragment;
import uas.rifdah.bottomnavigationview.model.DataItem;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    Context context;
    List<DataItem> dataItems;
    Fragment fragment;


    public DataAdapter(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.dataItems = dataItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.title.setText(dataItems.get(i).getTitle());
        viewHolder.description.setText(dataItems.get(i).getDescription());

        Glide.with(context)
                .load(dataItems.get(i).getImage())
                .into(viewHolder.image);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataItem data = dataItems.get(i);
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("title", data.getTitle());
                intent.putExtra("description", data.getDescription());
                intent.putExtra("image", data.getImage());
                context.startActivity(intent);
            }
        });

    }
    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            image= itemView.findViewById(R.id.imageView);
            description = itemView.findViewById(R.id.tv_description);

        }
    }
}
