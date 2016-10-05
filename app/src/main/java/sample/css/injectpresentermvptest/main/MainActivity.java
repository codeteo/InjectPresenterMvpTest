package sample.css.injectpresentermvptest.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import sample.css.injectpresentermvptest.MyApplication;
import sample.css.injectpresentermvptest.R;

public class MainActivity extends AppCompatActivity implements MainMVP.View {

    Button btnGetData;
    TextView tvShowData;

    @Inject
    MainPresenter mainPresenter;

    MainComponent daggerMainComponent;

    private DataRepositoryComponent dataRepositoryComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetData = (Button) findViewById(R.id.btn_get_data);
        tvShowData = (TextView) findViewById(R.id.tv_show_data);

        // create Presenter
        DaggerMainComponent.builder()
                .dataRepositoryComponent(((MyApplication) getApplication()).getDataRepositoryComponent())
                .mainPresenterModule(new MainPresenterModule(this))
                .build()
                .inject(this);

    }


    public void onButtonGetDataClick(View view) {
        mainPresenter.onButtonGetDataClicked();
    }

    @Override
    public void showData(String dataString) {
        tvShowData.setText(dataString);
    }

}
