package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import com.facebook.react.C3371q;
import kotlin.jvm.internal.C6496s;
import p1.C2388d;
import yf.p;

public final class S extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private final View f40745a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(Activity activity, View view) {
        super(activity, C3371q.f41176b);
        C6496s.h(activity, "context");
        this.f40745a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* access modifiers changed from: private */
    public static final D0 c(int i10, View view, D0 d02) {
        C6496s.h(view, "view");
        C6496s.h(d02, "windowInsets");
        C2388d f10 = d02.f(i10);
        C6496s.g(f10, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C6496s.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(f10.f25150a, f10.f25151b, f10.f25152c, f10.f25153d);
        return D0.f15980b;
    }

    /* access modifiers changed from: private */
    public static final D0 d(p pVar, View view, D0 d02) {
        C6496s.h(view, "p0");
        C6496s.h(d02, "p1");
        return (D0) pVar.invoke(view, d02);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.f40745a;
        if (view != null) {
            C1680b0.C0(view, new Q(new P(D0.n.h() | D0.n.b())));
        }
    }
}
