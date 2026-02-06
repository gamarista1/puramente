package bb;

import Ua.a;
import android.content.Context;
import android.graphics.Color;
import fb.C4981b;
import p1.C2387c;

/* renamed from: bb.a  reason: case insensitive filesystem */
public class C4467a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f53657f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    private final boolean f53658a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53659b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53660c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53661d;

    /* renamed from: e  reason: collision with root package name */
    private final float f53662e;

    public C4467a(Context context) {
        this(C4981b.b(context, a.f52738p, false), Ya.a.b(context, a.f52737o, 0), Ya.a.b(context, a.f52736n, 0), Ya.a.b(context, a.f52734l, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        if (C2387c.p(i10, 255) == this.f53661d) {
            return true;
        }
        return false;
    }

    public float a(float f10) {
        float f11 = this.f53662e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int h10 = Ya.a.h(C2387c.p(i10, 255), this.f53659b, a10);
        if (a10 > 0.0f && (i11 = this.f53660c) != 0) {
            h10 = Ya.a.g(h10, C2387c.p(i11, f53657f));
        }
        return C2387c.p(h10, alpha);
    }

    public int c(int i10, float f10) {
        if (!this.f53658a || !e(i10)) {
            return i10;
        }
        return b(i10, f10);
    }

    public boolean d() {
        return this.f53658a;
    }

    public C4467a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f53658a = z10;
        this.f53659b = i10;
        this.f53660c = i11;
        this.f53661d = i12;
        this.f53662e = f10;
    }
}
