package com.yt.youbike;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StationAdapter extends RecyclerView.Adapter<StationAdapter.StationHolder> {
    private Station stations;
    private Records[] records;

    public StationAdapter(Station stations) {
        this.stations = stations;
        records = stations.getResult().getRecords();
    }

    @NonNull
    @Override
    public StationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_station, parent, false);

        return new StationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StationHolder holder, int position) {
        holder.name.setText(records[position].getName());
        holder.address.setText(records[position].getAddress());
        holder.totalNumber.setText(records[position].getTotalNumber());
        holder.lendNumber.setText(records[position].getLendNumber());
        holder.returnNumber.setText(records[position].getReturnNumber());
    }

    @Override
    public int getItemCount() {
        return records.length;
    }

    class StationHolder extends RecyclerView.ViewHolder {
        private View itemView;
        private TextView name;
        private TextView address;
        private TextView totalNumber;
        private TextView lendNumber;
        private TextView returnNumber;

        public StationHolder(@NonNull View itemView) {
            super(itemView);

            this.itemView = itemView;
            name = itemView.findViewById(R.id.single_txName);
            address = itemView.findViewById(R.id.single_txAddress);
            totalNumber = itemView.findViewById(R.id.single_txTotal);
            lendNumber = itemView.findViewById(R.id.single_txLend);
            returnNumber = itemView.findViewById(R.id.single_txReturn);
        }
    }
}
