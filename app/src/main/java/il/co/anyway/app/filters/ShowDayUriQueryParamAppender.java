package il.co.anyway.app.filters;

import android.content.Context;
import android.net.Uri;

import il.co.anyway.app.filters.BinaryUriQueryParamAppenderBase;

/**
 * Created by gindi on 9/16/17.
 */

public class ShowDayUriQueryParamAppender extends UriQueryParamAppender {

    public ShowDayUriQueryParamAppender(Context context) {
        super(context);
    }

    @Override
    public void appendQueryParameter(Uri.Builder uriBuilder) {
        uriBuilder.appendQueryParameter("show_day", "7");
    }
}
