package W3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.PrintStream;

public abstract class n extends m {

    /* renamed from: f  reason: collision with root package name */
    protected String f8692f = null;

    /* renamed from: g  reason: collision with root package name */
    protected String f8693g = null;

    public n(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void l(ReadableMap readableMap) {
        String str;
        PrintStream printStream = System.out;
        printStream.println(h());
        if (!(h() == null && b() == null && i() == null)) {
            if (m.k(h(), this.f8687a)) {
                printStream.println("INSTALLED");
                if (a() != null) {
                    f().setComponent(new ComponentName(h(), a()));
                } else {
                    f().setPackage(h());
                }
                super.l(readableMap);
                return;
            }
            printStream.println("NOT INSTALLED");
            if (b() != null) {
                str = b().replace("{url}", m.o(readableMap.getString("url"))).replace("{message}", m.o(readableMap.getString(MetricTracker.Object.MESSAGE)));
            } else if (i() != null) {
                str = i();
            } else {
                str = "";
            }
            n(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(str))));
        }
        super.l(readableMap);
    }

    /* access modifiers changed from: protected */
    public void m() {
        p((ReadableMap) null);
    }

    /* access modifiers changed from: protected */
    public void p(ReadableMap readableMap) {
        if (!this.f8691e.hasKey("forceDialog") || !this.f8691e.getBoolean("forceDialog")) {
            f().addFlags(268435456);
            this.f8687a.startActivity(f());
            q.d(true, Boolean.TRUE, f().getPackage());
            return;
        }
        Activity currentActivity = this.f8687a.getCurrentActivity();
        if (currentActivity == null) {
            q.d(false, "Something went wrong");
        } else if (readableMap != null && !m.j("social", readableMap)) {
            throw new IllegalArgumentException("social is empty");
        } else if (q.b()) {
            Intent createChooser = Intent.createChooser(f(), this.f8689c, q.a(this.f8687a));
            createChooser.addFlags(1073741824);
            currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
        } else {
            Intent createChooser2 = Intent.createChooser(f(), this.f8689c);
            createChooser2.addFlags(1073741824);
            currentActivity.startActivityForResult(createChooser2, RNShareModule.SHARE_REQUEST_CODE);
            q.d(true, Boolean.TRUE, "OK");
        }
    }
}
