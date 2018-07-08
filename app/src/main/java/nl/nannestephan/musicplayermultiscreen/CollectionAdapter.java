package nl.nannestephan.musicplayermultiscreen;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CollectionAdapter extends ArrayAdapter<Collection> {

    private int mColorResourceId;

    public CollectionAdapter(Context context, ArrayList<Collection> collection, int colorResourceId) {
        super(context, 0, collection);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);


        }
        Collection currentCollection = getItem(position);

        TextView ArtistsTextView = listItemView.findViewById(R.id.Artist_TextView);
        ArtistsTextView.setText(currentCollection.getArtists());

        TextView SongTextView = listItemView.findViewById(R.id.SongTextView);
        SongTextView.setText(currentCollection.getSongs());


        ImageView albumCover = listItemView.findViewById(R.id.AlbumCover);

        if (currentCollection.hasImage()){

            albumCover.setImageResource(currentCollection.getImageResourceId());

            albumCover.setVisibility(View.VISIBLE);
        } else {
            albumCover.setVisibility(View.GONE);
        }
        // color
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }


}
