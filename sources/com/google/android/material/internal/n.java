package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.I;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

public abstract class n {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f56091a;

        a(View view) {
            this.f56091a = view;
        }

        public void run() {
            ((InputMethodManager) this.f56091a.getContext().getSystemService("input_method")).showSoftInput(this.f56091a, 1);
        }
    }

    class b implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f56092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f56093b;

        b(d dVar, e eVar) {
            this.f56092a = dVar;
            this.f56093b = eVar;
        }

        public D0 i(View view, D0 d02) {
            return this.f56092a.a(view, d02, new e(this.f56093b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C1680b0.l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        D0 a(View view, D0 d02, e eVar);
    }

    public static void a(View view, d dVar) {
        C1680b0.C0(view, new b(dVar, new e(C1680b0.F(view), view.getPaddingTop(), C1680b0.E(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += C1680b0.v((View) parent);
        }
        return f10;
    }

    public static boolean e(View view) {
        if (C1680b0.A(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case StdKeyDeserializer.TYPE_URL:
                return PorterDuff.Mode.MULTIPLY;
            case StdKeyDeserializer.TYPE_CLASS:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(View view) {
        if (C1680b0.R(view)) {
            C1680b0.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f56094a;

        /* renamed from: b  reason: collision with root package name */
        public int f56095b;

        /* renamed from: c  reason: collision with root package name */
        public int f56096c;

        /* renamed from: d  reason: collision with root package name */
        public int f56097d;

        public e(int i10, int i11, int i12, int i13) {
            this.f56094a = i10;
            this.f56095b = i11;
            this.f56096c = i12;
            this.f56097d = i13;
        }

        public e(e eVar) {
            this.f56094a = eVar.f56094a;
            this.f56095b = eVar.f56095b;
            this.f56096c = eVar.f56096c;
            this.f56097d = eVar.f56097d;
        }
    }
}
