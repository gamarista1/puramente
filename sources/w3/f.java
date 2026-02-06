package W3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class f extends n {
    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "https://plus.google.com/share?url={url}";
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "com.google.android.apps.plus";
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "market://details?id=com.google.android.apps.plus";
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
