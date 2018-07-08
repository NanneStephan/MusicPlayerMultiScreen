package nl.nannestephan.musicplayermultiscreen;



public class Collection {



    private int mAlbums;


    private int mSongs;


    private int mArtists;

    private int mAudioResourceId;


    private int mImageResourceId = NO_IMAGE_PROVIDED;


    private static final int NO_IMAGE_PROVIDED = -1;


    public Collection(int Albums, int Songs, int artists, int audioResourceId, int imageResourceId) {
        mAlbums = Albums;
        mSongs = Songs;
        mArtists = artists;
        mAudioResourceId = audioResourceId;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the string resource ID for the default translation of the Catargory.
     */
    public int getAlbums() {
        return mAlbums;
    }

    public int getArtists() {
        return mArtists;
    }

    public int getSongs() {
        return mSongs;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
