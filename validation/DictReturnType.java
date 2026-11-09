package validation;


public class DictReturnType  {
    public final String data;
    public final boolean success;
    public final String error;

    public DictReturnType(boolean s,String d) {
        success = s;
        data = d;
        error="";
    }
    public DictReturnType(String e) {
        data="";
        success = false;
        error = e;
    }
}
