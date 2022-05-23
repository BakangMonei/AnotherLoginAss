package com.mad.logginass;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.mad.logginass.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.PaintingViewHolder> {

    Context ctx;
    ArrayList<com.mad.logginass.Art> Paintings;

    public ArtAdapter(Context ctx, ArrayList<com.mad.logginass.Art> paintings) {
        this.ctx = ctx;
        Paintings = paintings;
    }

    @NonNull
    @Override
    public PaintingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the item layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.painting_item,parent,false );
        //passing the view to the view holder
        PaintingViewHolder pvh = new PaintingViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PaintingViewHolder holder, int position) {
        holder.txtPaintingName.setText(Paintings.get(position).getArtName());
        holder.txtPaintingDescription.setText(Paintings.get(position).getArtDescription());
        holder.txtPaintingPrice.setText(String.valueOf(Paintings.get(position).getArtPrice()));
        Picasso.get().load((int) Paintings.get(position).getArtImage()).into(holder.imgPainting);

        //implement click listener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedPaintingPosition = holder.getBindingAdapterPosition();
                Intent detailIntent = new Intent(holder.itemView.getContext(), com.mad.logginass.DetailActivity2.class);
                detailIntent.putExtra("pos", selectedPaintingPosition);
                holder.itemView.getContext().startActivity(detailIntent);

                //Snackbar snackbar = Snackbar.make(view,Paintings.get(holder.getBindingAdapterPosition()).getArtName().toString() + " Selected !",Snackbar.LENGTH_LONG);
                //snackbar.show();

            }

        });
    }

    @Override
    public int getItemCount() {
        return Paintings.size();
    }

    public class PaintingViewHolder extends RecyclerView.ViewHolder{
        TextView txtPaintingName;
        TextView txtPaintingDescription;
        TextView txtPaintingPrice;
        ImageView imgPainting;

        public PaintingViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPaintingName = itemView.findViewById(R.id.idTextViewPaintingName);
            txtPaintingDescription = itemView.findViewById(R.id.idTextViewPaintingDescription);
            txtPaintingPrice = itemView.findViewById(R.id.idTextViewPaintingPrice);
            imgPainting = itemView.findViewById(R.id.idImageViewPainting);

        }
    }


}
