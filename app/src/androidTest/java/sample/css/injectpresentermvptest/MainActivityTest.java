package sample.css.injectpresentermvptest;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import sample.css.injectpresentermvptest.main.MainActivity;
import sample.css.injectpresentermvptest.main.MainMVP;
import sample.css.injectpresentermvptest.main.MainPresenter;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Mockito.when;

/**
 * Created by css on 10/5/16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    public static final String MOCK_STRING = "Mock String";

    MainMVP.View mainView;
    DataSource dataSource;

    MainPresenter mainPresenter;

    @Rule
    public ActivityTestRule<MainActivity> mTaskDetailActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true /* Initial touch mode  */,
                    false /* Lazily launch activity */);

    @Before
    public void setUp() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        MyApplication app
                = (MyApplication) instrumentation.getTargetContext().getApplicationContext();

        mainView = Mockito.mock(MainMVP.View.class);
        dataSource = Mockito.mock(DataSource.class);

        mainPresenter = new MainPresenter(mainView, dataSource);

    }


    @Test
    public void onButtonGetDataClicked_textViewDisplaysData() {
        when(dataSource.getReleaseString()).thenReturn(MOCK_STRING);

        mTaskDetailActivityTestRule.launchActivity(new Intent());

        /** Click Button*/
        onView(withId(R.id.btn_get_data))
                .perform(click());

        onView(withId(R.id.tv_show_data))
                .check(matches(withText(MOCK_STRING)));

    }


}
