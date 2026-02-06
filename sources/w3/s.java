package W3;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class s extends n {
    public s(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "com.twitter.android";
    }

    /* access modifiers changed from: protected */
    public String i() {
        return null;
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
