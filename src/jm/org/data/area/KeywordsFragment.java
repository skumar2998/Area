/**
 * 
 * Got code from here: http://as400samplecode.blogspot.com/2011/10/android-programmatically-generate.html
 */
package jm.org.data.area;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;

import static jm.org.data.area.AreaConstants.*;

public class KeywordsFragment extends Fragment implements OnClickListener {
	public static final String TAG = KeywordsFragment.class.getSimpleName();
	AutoCompleteTextView edt_keyword;
	Button btn_addKeyword;
	LinearLayout ll_keyword;
	OnCountryChangeListener mListener;
	private AreaApplication area;
	private Activity parentActivity;
	private ArrayList<String> countryList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		parentActivity = getActivity();
		edt_keyword = (AutoCompleteTextView) parentActivity
				.findViewById(R.id.edt_keyword);
		btn_addKeyword = (Button) parentActivity
				.findViewById(R.id.btn_keywordAdd);
		area = (AreaApplication) parentActivity.getApplication();
		countryList = new ArrayList<String>();

		btn_addKeyword.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				addKeyword();
			}
		});

		ll_keyword = (LinearLayout) parentActivity
				.findViewById(R.id.ll_keywordList);

		String[] country = area.areaData.getCountry();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(parentActivity,
				android.R.layout.simple_list_item_1, country);
		edt_keyword.setAdapter(adapter);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.keywords, container, false);

		return view;
	}

	/**
	 * Used to ensure that the countryList interface is implemented by the
	 * parent activity
	 */
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mListener = (OnCountryChangeListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ "must implement onKeywordChangeListener");
		}
	}

	public void addKeyword() {
		String keyword = edt_keyword.getText().toString();
		keyword.trim();
		Log.d(TAG, "Keyword is: " + keyword);
		if (keyword.length() > 2) {
			Button newKeyword = new Button(parentActivity);
			newKeyword.setText(keyword);
			newKeyword.setLayoutParams(new LayoutParams(
					LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			newKeyword.setOnClickListener(this);
			ll_keyword.addView(newKeyword);
			countryList.add(keyword);
			mListener.onCountryChange(ADD_KEY, (String) keyword);
			edt_keyword.setText("");
			Log.d(TAG, "The current countryList are: " + countryList);
			// update graph
		}

	}

	@Override
	public void onClick(View v) {
		Button keyword = (Button) v;
		ll_keyword.removeView(v);
		countryList.remove(keyword.getText());
		mListener.onCountryChange(REMOVE_KEY, (String) keyword.getText());
		Log.d(TAG, "The removed keyword is: " + keyword.getText());
		Log.d(TAG, "The current countryList are: " + countryList);
		// update graph

	}

	public String[] getCountryList() {
		return (String[]) countryList.toArray();

	}

	public interface OnCountryChangeListener {

		public void onCountryChange(int change, String keyword);
	}

}