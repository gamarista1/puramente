package androidx.emoji2.text;

import P1.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public class p {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f16674d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final int f16675a;

    /* renamed from: b  reason: collision with root package name */
    private final n f16676b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f16677c = 0;

    p(n nVar, int i10) {
        this.f16676b = nVar;
        this.f16675a = i10;
    }

    private a g() {
        ThreadLocal threadLocal = f16674d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f16676b.d().j(aVar, this.f16675a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f16676b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f16676b.c(), this.f16675a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f16677c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        if ((this.f16677c & 4) > 0) {
            return true;
        }
        return false;
    }

    public void l(boolean z10) {
        int d10 = d();
        if (z10) {
            this.f16677c = d10 | 4;
        } else {
            this.f16677c = d10;
        }
    }

    public void m(boolean z10) {
        int i10;
        int i11 = this.f16677c & 4;
        if (z10) {
            i10 = i11 | 2;
        } else {
            i10 = i11 | 1;
        }
        this.f16677c = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb2.toString();
    }
}
