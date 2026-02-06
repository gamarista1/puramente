package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.p;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f42337a = new c();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42338a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.facebook.yoga.p[] r0 = com.facebook.yoga.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.p r1 = com.facebook.yoga.p.EXACTLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.yoga.p r1 = com.facebook.yoga.p.AT_MOST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f42338a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.c.a.<clinit>():void");
        }
    }

    private c() {
    }

    public static final int a(float f10, p pVar) {
        C6496s.h(pVar, "mode");
        int i10 = a.f42338a[pVar.ordinal()];
        if (i10 == 1) {
            return View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824);
        }
        if (i10 != 2) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec((int) f10, Integer.MIN_VALUE);
    }
}
