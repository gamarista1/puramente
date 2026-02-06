package com.facebook.react.views.image;

import Ef.m;
import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.p;
import q6.q;

public final class i extends p {

    /* renamed from: l  reason: collision with root package name */
    public static final a f41908l = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final q f41909m = new i();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return i.f41909m;
        }

        private a() {
        }
    }

    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        C6496s.h(matrix, "outTransform");
        C6496s.h(rect, "parentRect");
        float g10 = m.g(Math.min(f12, f13), 1.0f);
        matrix.setScale(g10, g10);
        matrix.postTranslate((float) Math.round((float) rect.left), (float) Math.round((float) rect.top));
    }

    public String toString() {
        return "start_inside";
    }
}
