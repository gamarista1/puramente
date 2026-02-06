package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    private final c f16024a;

    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f16025a;

        a(View view) {
            this.f16025a = view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view = this.f16025a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16025a.getWindowToken(), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f16025a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f16025a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new N(view));
                }
            }
        }
    }

    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f16026b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f16027c;

        b(View view) {
            super(view);
            this.f16026b = view;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i10) {
            boolean z10;
            if ((i10 & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            atomicBoolean.set(z10);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f16027c;
            if (windowInsetsController == null) {
                View view2 = this.f16026b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                W w10 = new W(atomicBoolean);
                windowInsetsController.addOnControllableInsetsChangedListener(w10);
                if (!atomicBoolean.get() && (view = this.f16026b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16026b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(w10);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.a();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f16026b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f16027c;
            if (windowInsetsController == null) {
                View view2 = this.f16026b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract void b();
    }

    public O(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16024a = new b(view);
        } else {
            this.f16024a = new a(view);
        }
    }

    public void a() {
        this.f16024a.a();
    }

    public void b() {
        this.f16024a.b();
    }
}
