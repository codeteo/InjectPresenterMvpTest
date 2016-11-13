package sample.css.injectpresentermvptest;

/**
 * DataSource in Prod sourceSet to return production data.
 */
public class DataSource {

    public static final String PRODUCTION_STRING = "Production String";

    public String getReleaseString() {
        return PRODUCTION_STRING;
    }

}
