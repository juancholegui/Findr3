package infinitum.com.findr;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRecommendations extends RecyclerView.Adapter<AdapterRecommendations.ViewHolderRec> {

    ArrayList<Recommendations> listRec;

    public AdapterRecommendations(ArrayList<Recommendations> listRec) {
        this.listRec = listRec;
    }

    @NonNull
    @Override
    public ViewHolderRec onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recommendations_card, null, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRec holder, int position) {
        holder.barName.setText(listRec.get(position).getRecBarName());
        holder.barLocation.setText(listRec.get(position).getRecBarLocation());
        holder.barPrice.setText(listRec.get(position).getRecBarPrice());
        holder.barPhoto.setImageResource(listRec.get(position).getRecImage());

    }

    @Override
    public int getItemCount() {
        return listRec.size();
    }

    public class ViewHolderRec extends RecyclerView.ViewHolder {

        TextView barName, barLocation,barPrice;
        ImageView barPhoto;

        public ViewHolderRec(View itemView) {
            super(itemView);

            barName = itemView.findViewById(R.id.recs_barname);
            barLocation = itemView.findViewById(R.id.recs_barlocation);
            barPrice = itemView.findViewById(R.id.recs_barprice);
            barPhoto = itemView.findViewById(R.id.recs_image);
        }
    }
}
