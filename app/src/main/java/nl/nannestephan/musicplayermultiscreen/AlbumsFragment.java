package nl.nannestephan.musicplayermultiscreen;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_items, container, false);
        // request audio focus

        final ArrayList<Collection> collection = new ArrayList<Collection>();

        collection.add(new Collection(R.string.albumOne, R.string.artistOne, R.string.songOne,
                R.raw.incubus_drive, R.drawable.incubus_cover));
        collection.add(new Collection(R.string.albumTwo, R.string.artistTwo, R.string.songTwo,
                R.raw.incubus_megalomaniac, R.drawable.incubus_cover));
        collection.add(new Collection(R.string.albumThree, R.string.artistThree, R.string.songThree,
                R.raw.extrawelt_soopertrack, R.drawable.extrawelt_cover));


        final CollectionAdapter adapter = new CollectionAdapter(getActivity(), collection, R.color.colorPrimaryLight);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.list, new MusicPlayerFragment());
                ft.commit();



            }
        });

        return rootView;

    }



}
