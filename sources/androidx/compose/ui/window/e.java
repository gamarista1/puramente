package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.revenuecat.purchases.common.UtilsKt;
import yf.C6787a;

final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14269a = new e();

    private e() {
    }

    public static final OnBackInvokedCallback b(C6787a aVar) {
        return new d(aVar);
    }

    /* access modifiers changed from: private */
    public static final void c(C6787a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void d(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj);
        }
    }

    public static final void e(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }
}
