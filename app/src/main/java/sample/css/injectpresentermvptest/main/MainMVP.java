package sample.css.injectpresentermvptest.main;

/**
 *  MVP interface containing View and Presenter interfaces for
 * {@link MainActivity}
 */

public interface MainMVP {

    interface View {

        void showData(String dataString);

    }

    interface Presenter {

        void onButtonGetDataClicked();

    }

}
