package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C1609x;
import java.util.List;
import o1.e;
import o1.h;
import v1.k;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final o f25155a;

    /* renamed from: b  reason: collision with root package name */
    private static final C1609x f25156b = new C1609x(16);

    public static class a extends k.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f25157a;

        public a(h.e eVar) {
            this.f25157a = eVar;
        }

        public void a(int i10) {
            h.e eVar = this.f25157a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        public void b(Typeface typeface) {
            h.e eVar = this.f25157a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        D3.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f25155a = new n();
        } else if (i10 >= 28) {
            f25155a = new m();
        } else if (i10 >= 26) {
            f25155a = new l();
        } else if (k.k()) {
            f25155a = new k();
        } else {
            f25155a = new j();
        }
        D3.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        D3.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f25155a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            D3.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        D3.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f25155a.c(context, cancellationSignal, list, i10);
        } finally {
            D3.a.f();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typeface;
        boolean z11;
        int i13;
        List a10;
        e.b bVar2 = bVar;
        h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof e.C0419e) {
            e.C0419e eVar3 = (e.C0419e) bVar2;
            Typeface h10 = h(eVar3.d());
            if (h10 != null) {
                if (eVar2 != null) {
                    eVar2.d(h10, handler2);
                }
                return h10;
            }
            if (!z10 ? eVar2 != null : eVar3.b() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10) {
                i13 = eVar3.e();
            } else {
                i13 = -1;
            }
            int i14 = i13;
            Handler e10 = h.e.e(handler);
            a aVar = new a(eVar2);
            if (eVar3.a() != null) {
                a10 = h.a(new Object[]{eVar3.c(), eVar3.a()});
            } else {
                a10 = h.a(new Object[]{eVar3.c()});
            }
            typeface = k.c(context, a10, i12, z11, i14, e10, aVar);
            Resources resources2 = resources;
            int i15 = i12;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f25155a.a(context, (e.c) bVar2, resources, i12);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f25156b.put(f(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e10 = f25155a.e(context, resources, i10, str, i12);
        if (e10 != null) {
            f25156b.put(f(resources, i10, str, i11, i12), e10);
        }
        return e10;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f25156b.get(f(resources, i10, str, i11, i12));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
