package v6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import v6.C4106a;

/* renamed from: v6.b  reason: case insensitive filesystem */
public abstract class C4107b implements C4106a {

    /* renamed from: a  reason: collision with root package name */
    private C4106a f48855a;

    /* renamed from: b  reason: collision with root package name */
    private int f48856b = -1;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f48857c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f48858d;

    public C4107b(C4106a aVar) {
        this.f48855a = aVar;
    }

    public int a() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    public int b() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.b();
    }

    public int c() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return -1;
        }
        return aVar.c();
    }

    public void clear() {
        C4106a aVar = this.f48855a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void d(Rect rect) {
        C4106a aVar = this.f48855a;
        if (aVar != null) {
            aVar.d(rect);
        }
        this.f48858d = rect;
    }

    public int e() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return -1;
        }
        return aVar.e();
    }

    public void f(ColorFilter colorFilter) {
        C4106a aVar = this.f48855a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
        this.f48857c = colorFilter;
    }

    public int g() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.g();
    }

    public boolean h(Drawable drawable, Canvas canvas, int i10) {
        C4106a aVar = this.f48855a;
        if (aVar == null || !aVar.h(drawable, canvas, i10)) {
            return false;
        }
        return true;
    }

    public void i(C4106a.C0739a aVar) {
        C4106a aVar2 = this.f48855a;
        if (aVar2 != null) {
            aVar2.i(aVar);
        }
    }

    public int k() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.k();
    }

    public int l(int i10) {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.l(i10);
    }

    public void m(int i10) {
        C4106a aVar = this.f48855a;
        if (aVar != null) {
            aVar.m(i10);
        }
        this.f48856b = i10;
    }

    public int n() {
        C4106a aVar = this.f48855a;
        if (aVar == null) {
            return 0;
        }
        return aVar.n();
    }
}
