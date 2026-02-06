package r2;

import android.content.Context;
import f2.C1960A;
import i2.L;
import i2.p;
import r2.C2562b;
import r2.H;
import r2.j;

/* renamed from: r2.i  reason: case insensitive filesystem */
public final class C2569i implements j.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f25642a;

    /* renamed from: b  reason: collision with root package name */
    private int f25643b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25644c = true;

    public C2569i(Context context) {
        this.f25642a = context;
    }

    private boolean b() {
        int i10 = L.f22072a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f25642a;
        if (context == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")) {
            return false;
        }
        return true;
    }

    public j a(j.a aVar) {
        int i10;
        if (L.f22072a < 23 || ((i10 = this.f25643b) != 1 && (i10 != 0 || !b()))) {
            return new H.b().a(aVar);
        }
        int i11 = C1960A.i(aVar.f25647c.f20083n);
        p.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + L.p0(i11));
        C2562b.C0430b bVar = new C2562b.C0430b(i11);
        bVar.e(this.f25644c);
        return bVar.a(aVar);
    }
}
