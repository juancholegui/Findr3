package infinitum.com.findr;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import infinitum.com.findr.GalleryBar;
import infinitum.com.findr.R;
import infinitum.com.findr.AdapterGalleryBar;
import infinitum.com.findr.AdapterRecommendations;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";

    private static final int ACTIVITY_NUM = 0;
    private Context mContext = HomeActivity.this;

    ArrayList<Recommendations> listRecs;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Recycler View
        listRecs = new ArrayList<Recommendations>();
        recyclerView = findViewById(R.id.recycler_recs);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        //Adapter Set up RecyclerView
        AdapterRecommendations adapterRecommendations = new AdapterRecommendations(listRecs);
        recyclerView.setAdapter(adapterRecommendations);

    }

    private void addImages() {
        listRecs.add(new Recommendations(R.drawable.postb,"Bar1","Location1","$11111"));
        listRecs.add(new Recommendations(R.drawable.postc,"Bar2","Location2","$22222"));
        listRecs.add(new Recommendations(R.drawable.postd,"Bar3","Location3","$33333"));
        listRecs.add(new Recommendations(R.drawable.poste,"Bar4","Location4","$44444"));
    }
}