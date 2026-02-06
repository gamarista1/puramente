package W3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class k extends n {
    public k(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "com.pinterest";
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "market://details?id=com.pinterest";
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
