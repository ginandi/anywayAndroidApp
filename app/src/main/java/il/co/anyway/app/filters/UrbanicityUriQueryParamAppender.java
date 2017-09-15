package il.co.anyway.app.filters;

import android.content.Context;
import android.net.Uri;

import il.co.anyway.app.R;

/**
 * Created by gindi on 9/11/17.
 */

public class UrbanicityUriQueryParamAppender extends UriQueryParamAppender {

    private static final int URBAN = 2;
    private static final int HIGHWAY = 1;


    public UrbanicityUriQueryParamAppender(Context context) {
        super(context);
    }

    @Override
    public void appendQueryParameter(Uri.Builder uriBuilder) {
        int urbanRoad =
                mSharedPrefs.getBoolean(getString(R.string.pref_urban_road_key), true) ?
                        URBAN : 0;
        int highway =
                mSharedPrefs.getBoolean(getString(R.string.pref_highway_key), true) ?
                        HIGHWAY : 0;

        uriBuilder.appendQueryParameter("show_urban", Integer.toString(urbanRoad | highway));
    }
}
