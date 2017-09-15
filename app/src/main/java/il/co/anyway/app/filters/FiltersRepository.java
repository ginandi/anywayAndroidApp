package il.co.anyway.app.filters;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gindi on 9/11/17.
 */

public class FiltersRepository {
    private static List<UriQueryParamAppender> sFilters;

    public static synchronized Iterable<UriQueryParamAppender> getFilters(Context context) {
        sFilters = new ArrayList<>();
        sFilters.add(new UrbanicityUriQueryParamAppender(context));

        return sFilters;
    }
}
