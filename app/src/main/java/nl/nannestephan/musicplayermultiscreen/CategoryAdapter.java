package nl.nannestephan.musicplayermultiscreen;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position){
        if (position == 0){
            return new MusicPlayerFragment();
        } else if (position == 1) {
            return new SongsFragment();
        } else if (position == 2) {
            return new ArtistsFragment();
        } else
            return new AlbumsFragment();

    }

    @Override
    public int getCount(){
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.NowPlaying);
        } else if (position == 1){
            return mContext.getString(R.string.Cat_Artists);
        } else if (position == 2){
            return mContext.getString(R.string.Cat_Songs);
        } else
            return mContext.getString(R.string.Cat_Albums);

    }
}
