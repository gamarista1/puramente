package c7;

import T5.k;
import X5.a;
import X5.h;
import android.graphics.Bitmap;
import m7.C3783c;

/* renamed from: c7.b  reason: case insensitive filesystem */
public class C3182b extends C3181a implements C3186f {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f36531i = false;

    /* renamed from: d  reason: collision with root package name */
    private a f36532d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Bitmap f36533e;

    /* renamed from: f  reason: collision with root package name */
    private final n f36534f;

    /* renamed from: g  reason: collision with root package name */
    private final int f36535g;

    /* renamed from: h  reason: collision with root package name */
    private final int f36536h;

    protected C3182b(Bitmap bitmap, h hVar, n nVar, int i10, int i11) {
        this.f36533e = (Bitmap) k.g(bitmap);
        this.f36532d = a.g0(this.f36533e, (h) k.g(hVar));
        this.f36534f = nVar;
        this.f36535g = i10;
        this.f36536h = i11;
    }

    private synchronized a U() {
        a aVar;
        aVar = this.f36532d;
        this.f36532d = null;
        this.f36533e = null;
        return aVar;
    }

    private static int V(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int f0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean g0() {
        return f36531i;
    }

    public synchronized a B() {
        return a.t(this.f36532d);
    }

    public int M0() {
        return this.f36535g;
    }

    public void close() {
        a U10 = U();
        if (U10 != null) {
            U10.close();
        }
    }

    public int d() {
        int i10;
        if (this.f36535g % 180 != 0 || (i10 = this.f36536h) == 5 || i10 == 7) {
            return f0(this.f36533e);
        }
        return V(this.f36533e);
    }

    public n d1() {
        return this.f36534f;
    }

    public int e() {
        int i10;
        if (this.f36535g % 180 != 0 || (i10 = this.f36536h) == 5 || i10 == 7) {
            return V(this.f36533e);
        }
        return f0(this.f36533e);
    }

    public Bitmap h1() {
        return this.f36533e;
    }

    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f36532d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public int p() {
        return C3783c.j(this.f36533e);
    }

    public int y0() {
        return this.f36536h;
    }

    protected C3182b(a aVar, n nVar, int i10, int i11) {
        a aVar2 = (a) k.g(aVar.q());
        this.f36532d = aVar2;
        this.f36533e = (Bitmap) aVar2.I();
        this.f36534f = nVar;
        this.f36535g = i10;
        this.f36536h = i11;
    }
}
