package com.yt.youbike;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BikeAdapter extends RecyclerView.Adapter<BikeAdapter.BikeHolder> {
    private List<Bike> bikes;

    public BikeAdapter(List<Bike> bikes) {
        this.bikes = bikes;
    }

    @NonNull
    @Override
    public BikeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_station, parent, false);
        return new BikeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BikeHolder holder, int position) {
        holder.name.setText(bikes.get(position).getName());
        holder.address.setText(bikes.get(position).getAddress());
        holder.totalNumber.setText(bikes.get(position).getTotalNumber());
        holder.lendNumber.setText(bikes.get(position).getLendNumber());
        holder.returnNumber.setText(bikes.get(position).getReturnNumber());
    }

    @Override
    public int getItemCount() {
        return bikes.size();
    }

    public class BikeHolder extends RecyclerView.ViewHolder {
        private View itemView;
        private TextView name;
        private TextView address;
        private TextView totalNumber;
        private TextView lendNumber;
        private TextView returnNumber;

        public BikeHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            name = itemView.findViewById(R.id.single_txName);
            address = itemView.findViewById(R.id.single_txAddress);
            totalNumber = itemView.findViewById(R.id.single_txTotal);
            lendNumber = itemView.findViewById(R.id.single_txLend);
            returnNumber = itemView.findViewById(R.id.single_txReturn);
        }

        /*public TextView getName(View view) {
            name = view.findViewById(R.id.single_txName);
            return name;
        }

        public TextView getAddress(View view) {
            address = view.findViewById(R.id.single_txAddress);
            return address;
        }

        public TextView getTotalNumber(View view) {
            totalNumber = view.findViewById(R.id.single_txTotal);
            return totalNumber;
        }

        public TextView getLendNumber(View view) {
            lendNumber = view.findViewById(R.id.single_txLend);
            return lendNumber;
        }

        public TextView getReturnNumber(View view) {
            returnNumber = view.findViewById(R.id.single_txReturn);
            return returnNumber;
        }*/
    }
}
