package infinitum.com.findr;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterGalleryBar extends RecyclerView.Adapter<AdapterGalleryBar.ViewHolder> {

    ArrayList<GalleryBar> galleryBar;

    public AdapterGalleryBar(ArrayList<GalleryBar> galleryBar) {
        this.galleryBar = galleryBar;
    }

    @NonNull
    @Override
    public AdapterGalleryBar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_gallery_card, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGalleryBar.ViewHolder holder, int position) {

        holder.description.setText(galleryBar.get(position).getDescription());
        holder.galleryImage.setImageResource(galleryBar.get(position).getGalleryImage());
    }

    @Override
    public int getItemCount() {
        return galleryBar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView description;
        ImageView galleryImage;

        public ViewHolder(View itemView) {
            super(itemView);

            description = itemView.findViewById(R.id.description_gallery);
            galleryImage = itemView.findViewById(R.id.postImage_gallery);
        }

        public void asignImagesGallery(String ImgGall) {

        }
    }
}

