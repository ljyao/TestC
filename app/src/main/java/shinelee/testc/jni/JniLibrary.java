package shinelee.testc.jni;

/**
 * Created by shine on 2016/11/29.
 */

public class JniLibrary {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
