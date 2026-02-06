package W3;

import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class l extends n {

    /* renamed from: h  reason: collision with root package name */
    private ReactApplicationContext f8686h;

    public l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f8686h = reactApplicationContext;
    }

    /* access modifiers changed from: protected */
    public String b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return Telephony.Sms.getDefaultSmsPackage(this.f8686h);
    }

    /* access modifiers changed from: protected */
    public String i() {
        return "market://details?id=com.android.mms";
    }

    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
