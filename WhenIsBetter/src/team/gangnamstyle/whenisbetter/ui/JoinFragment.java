package team.gangnamstyle.whenisbetter.ui;

import team.gangnamstyle.whenisbetter.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JoinFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View mainView = inflater.inflate(R.layout.join_fragment, container,
				false);

		return mainView;
	}

}
