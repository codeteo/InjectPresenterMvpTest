package sample.css.injectpresentermvptest;

/**
 * Created by css on 10/5/16.
 */

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public final class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
