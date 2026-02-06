package W3;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class v extends n {
    public v(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return "com.whatsapp";
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "market://details?id=com.whatsapp";
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                m();
                Thread.sleep(10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        f().setComponent((ComponentName) null);
        m();
    }
}
