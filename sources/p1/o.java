package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.a;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o1.e;
import v1.k;

abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap f25174a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        /* renamed from: c */
        public int b(k.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean a(k.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    o() {
    }

    private static Object f(Object[] objArr, int i10, b bVar) {
        int i11;
        boolean z10;
        if ((i10 & 1) == 0) {
            i11 = 400;
        } else {
            i11 = 700;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return g(objArr, i11, z10, bVar);
    }

    private static Object g(Object[] objArr, int i10, boolean z10, b bVar) {
        int i11;
        Object obj = null;
        int i12 = a.e.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int abs = Math.abs(bVar.b(obj2) - i10) * 2;
            if (bVar.a(obj2) == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (obj == null || i12 > i13) {
                obj = obj2;
                i12 = i13;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e10 = p.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!p.d(e10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = p.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!p.c(e10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    /* access modifiers changed from: protected */
    public k.b h(k.b[] bVarArr, int i10) {
        return (k.b) f(bVarArr, i10, new a());
    }
}
