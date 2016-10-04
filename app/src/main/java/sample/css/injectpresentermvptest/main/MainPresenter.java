package sample.css.injectpresentermvptest.main;

import android.support.annotation.NonNull;
import android.util.Log;

import javax.inject.Inject;
import sample.css.injectpresentermvptest.DataSource;

import static android.content.ContentValues.TAG;

/**
 * Presenter class for {@link MainActivity}
 */
public class MainPresenter implements MainMVP.Presenter {

    MainMVP.View mainView;
    DataSource dataSource;

    @Inject
    public MainPresenter(@NonNull MainMVP.View mainView) {
        this.mainView = mainView;
        dataSource = new DataSource();
    }

    @Override
    public void onButtonGetDataClicked() {
        if (dataSource != null) {
            mainView.showData(dataSource.getReleaseString());
        } else {
            Log.i(TAG, "dataSource IS NULL");
        }
    }

}
