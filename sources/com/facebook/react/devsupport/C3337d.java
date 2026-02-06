package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.devsupport.d  reason: case insensitive filesystem */
class C3337d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final WindowManager f40779a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ReactContext f40780b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f40781c;

    /* renamed from: com.facebook.react.devsupport.d$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f40782a;

        a(boolean z10) {
            this.f40782a = z10;
        }

        public void run() {
            if (!this.f40782a || C3337d.this.f40781c != null) {
                if (!this.f40782a && C3337d.this.f40781c != null) {
                    C3337d.this.f40781c.removeAllViews();
                    C3337d.this.f40779a.removeView(C3337d.this.f40781c);
                    C3337d.this.f40781c = null;
                }
            } else if (!C3337d.g(C3337d.this.f40780b)) {
                U5.a.b("ReactNative", "Wait for overlay permission to be set");
            } else {
                C3337d.this.f40781c = new M(C3337d.this.f40780b);
                C3337d.this.f40779a.addView(C3337d.this.f40781c, new WindowManager.LayoutParams(-1, -1, n0.f40873b, 24, -3));
            }
        }
    }

    public C3337d(ReactContext reactContext) {
        this.f40780b = reactContext;
        this.f40779a = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean f(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (!Settings.canDrawOverlays(context)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            U5.a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (f(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    public void i(boolean z10) {
        UiThreadUtil.runOnUiThread(new a(z10));
    }
}
