package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.c;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.Y;
import androidx.core.view.C1714t;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.M;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

public abstract class h extends Activity implements C1798v, C1714t.a {
    private final Y extraDataMap = new Y(0, 1, (DefaultConstructorMarker) null);
    private final C1800x lifecycleRegistry = new C1800x(this);

    public static class a {
    }

    private final boolean c(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 1455016274:
                if (str.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C6496s.h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        if (C1714t.d(decorView, keyEvent)) {
            return true;
        }
        return C1714t.e(this, decorView, this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C6496s.h(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C6496s.g(decorView, "window.decorView");
        if (C1714t.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @C6521e
    public <T extends a> T getExtraData(Class<T> cls) {
        C6496s.h(cls, "extraDataClass");
        c.a(this.extraDataMap.get(cls));
        return null;
    }

    public C1790m getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M.f17152b.c(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C6496s.h(bundle, "outState");
        this.lifecycleRegistry.n(C1790m.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @C6521e
    public void putExtraData(a aVar) {
        C6496s.h(aVar, "extraData");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !c(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        C6496s.h(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
