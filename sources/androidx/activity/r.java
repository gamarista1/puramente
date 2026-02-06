package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.C1800x;
import androidx.lifecycle.f0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x3.C2912d;
import x3.C2913e;
import x3.C2914f;
import x3.C2915g;

public class r extends Dialog implements C1798v, K, C2914f {

    /* renamed from: a  reason: collision with root package name */
    private C1800x f10822a;

    /* renamed from: b  reason: collision with root package name */
    private final C2913e f10823b;

    /* renamed from: c  reason: collision with root package name */
    private final H f10824c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final C1800x b() {
        C1800x xVar = this.f10822a;
        if (xVar != null) {
            return xVar;
        }
        C1800x xVar2 = new C1800x(this);
        this.f10822a = xVar2;
        return xVar2;
    }

    /* access modifiers changed from: private */
    public static final void d(r rVar) {
        C6496s.h(rVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C6496s.h(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        C6496s.e(window);
        View decorView = window.getDecorView();
        C6496s.g(decorView, "window!!.decorView");
        f0.b(decorView, this);
        Window window2 = getWindow();
        C6496s.e(window2);
        View decorView2 = window2.getDecorView();
        C6496s.g(decorView2, "window!!.decorView");
        O.b(decorView2, this);
        Window window3 = getWindow();
        C6496s.e(window3);
        View decorView3 = window3.getDecorView();
        C6496s.g(decorView3, "window!!.decorView");
        C2915g.b(decorView3, this);
    }

    public C1790m getLifecycle() {
        return b();
    }

    public final H getOnBackPressedDispatcher() {
        return this.f10824c;
    }

    public C2912d getSavedStateRegistry() {
        return this.f10823b.b();
    }

    public void onBackPressed() {
        this.f10824c.l();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            H h10 = this.f10824c;
            OnBackInvokedDispatcher a10 = getOnBackInvokedDispatcher();
            C6496s.g(a10, "onBackInvokedDispatcher");
            h10.o(a10);
        }
        this.f10823b.d(bundle);
        b().i(C1790m.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C6496s.g(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f10823b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().i(C1790m.a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        b().i(C1790m.a.ON_DESTROY);
        this.f10822a = null;
        super.onStop();
    }

    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        C6496s.h(context, "context");
        this.f10823b = C2913e.f28425d.a(this);
        this.f10824c = new H(new q(this));
    }

    public void setContentView(View view) {
        C6496s.h(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C6496s.h(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
