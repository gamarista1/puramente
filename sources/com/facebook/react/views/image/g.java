package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n6.d;

public abstract class g extends q6.g implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f41880e = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Drawable {
        public void draw(Canvas canvas) {
            C6496s.h(canvas, "canvas");
        }

        public int getOpacity() {
            return -1;
        }

        public void setAlpha(int i10) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    public void a(String str, Object obj) {
        C6496s.h(str, "id");
    }

    public void h(String str) {
        C6496s.h(str, "id");
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        x(i10, 10000);
        return super.onLevelChange(i10);
    }

    public void s(String str, Throwable th2) {
        C6496s.h(str, "id");
        C6496s.h(th2, "throwable");
    }

    public abstract void x(int i10, int i11);
}
