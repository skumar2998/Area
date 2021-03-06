package jm.org.data.area;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;

public class IndicatorListAdapter extends SimpleCursorLoader{
	private static final String TAG = IndicatorListAdapter.class.getSimpleName();
	private Context mContext;

	public IndicatorListAdapter(Context context) {
		super(context);
		mContext = context;
	}

	@Override
	public Cursor loadInBackground() {
		area = (AreaApplication) mContext.getApplicationContext();
		Cursor indicatorCursor = area.areaData.getIndicatorList();
		//Log.d(TAG, String.format("Cursor size returned: %d", indicatorCursor.getCount()));
		return indicatorCursor;
	}

}
