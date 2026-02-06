package expo.modules.adapters.react;

import Ed.e;
import Fd.a;
import Fd.b;
import Pd.c;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;

public class ReactAdapterPackage extends BasePackage {
    public List f(Context context) {
        ReactContext reactContext = (ReactContext) context;
        return Arrays.asList(new c[]{new b(reactContext), new a(reactContext), new e(reactContext)});
    }
}
