package com.facebook.react.modules.toast;

import Y7.b;
import Y7.c;
import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;

@Q7.a(name = "ToastAndroid")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/toast/ToastModule;", "Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "message", "", "durationDouble", "Llf/M;", "show", "(Ljava/lang/String;D)V", "gravityDouble", "showWithGravity", "(Ljava/lang/String;DD)V", "xOffsetDouble", "yOffsetDouble", "showWithGravityAndOffset", "(Ljava/lang/String;DDDD)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ToastModule extends NativeToastAndroidSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C6496s.h(reactApplicationContext, "reactContext");
    }

    /* access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule toastModule, String str, int i10) {
        Toast.makeText(toastModule.getReactApplicationContext(), str, i10).show();
    }

    /* access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i10, int i11) {
        Toast makeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i10);
        makeText.setGravity(i11, 0, 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i10, int i11, int i12, int i13) {
        Toast makeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i10);
        makeText.setGravity(i11, i12, i13);
        makeText.show();
    }

    public Map<String, Object> getTypedExportedConstants() {
        return O.n(C6502A.a(DURATION_SHORT_KEY, 0), C6502A.a(DURATION_LONG_KEY, 1), C6502A.a(GRAVITY_TOP_KEY, 49), C6502A.a(GRAVITY_BOTTOM_KEY, 81), C6502A.a(GRAVITY_CENTER, 17));
    }

    public void show(String str, double d10) {
        UiThreadUtil.runOnUiThread(new c(this, str, (int) d10));
    }

    public void showWithGravity(String str, double d10, double d11) {
        UiThreadUtil.runOnUiThread(new b(this, str, (int) d10, (int) d11));
    }

    public void showWithGravityAndOffset(String str, double d10, double d11, double d12, double d13) {
        int i10 = (int) d11;
        UiThreadUtil.runOnUiThread(new Y7.a(this, str, (int) d10, i10, (int) d12, (int) d13));
    }
}
