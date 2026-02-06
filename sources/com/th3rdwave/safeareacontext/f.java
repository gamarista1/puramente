package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.e;
import kotlin.jvm.internal.C6496s;
import yf.q;

public final class f extends e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private q f60013a;

    /* renamed from: b  reason: collision with root package name */
    private a f60014b;

    /* renamed from: c  reason: collision with root package name */
    private c f60015c;

    public f(Context context) {
        super(context);
    }

    private final void l() {
        a e10;
        q qVar = this.f60013a;
        if (qVar != null && (e10 = h.e(this)) != null) {
            View rootView = getRootView();
            C6496s.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            c a10 = h.a((ViewGroup) rootView, this);
            if (a10 != null) {
                if (!C6496s.c(this.f60014b, e10) || !C6496s.c(this.f60015c, a10)) {
                    qVar.invoke(this, e10, a10);
                    this.f60014b = e10;
                    this.f60015c = a10;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        l();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    public boolean onPreDraw() {
        l();
        return true;
    }

    public final void setOnInsetsChangeHandler(q qVar) {
        this.f60013a = qVar;
        l();
    }
}
