package S9;

import A9.C2985b;
import A9.C2988e;
import A9.C2991h;
import A9.C2993j;
import A9.H;
import A9.I;
import D9.a;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.f;
import ja.C3645a;
import ja.C3655k;
import ja.I;
import ja.w;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k9.C3717q0;
import l9.s0;
import q9.k;
import q9.l;
import x9.C4184f;
import y9.g;
import y9.o;

public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f33968d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f33969b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33970c;

    public d() {
        this(0, true);
    }

    private static void b(int i10, List list) {
        if (f.j(f33968d, i10) != -1 && !list.contains(Integer.valueOf(i10))) {
            list.add(Integer.valueOf(i10));
        }
    }

    private k d(int i10, C3717q0 q0Var, List list, I i11) {
        if (i10 == 0) {
            return new C2985b();
        }
        if (i10 == 1) {
            return new C2988e();
        }
        if (i10 == 2) {
            return new C2991h();
        }
        if (i10 == 7) {
            return new C4184f(0, 0);
        }
        if (i10 == 8) {
            return e(i11, q0Var, list);
        }
        if (i10 == 11) {
            return f(this.f33969b, this.f33970c, q0Var, list, i11);
        }
        if (i10 != 13) {
            return null;
        }
        return new t(q0Var.f45761c, i11);
    }

    private static g e(I i10, C3717q0 q0Var, List list) {
        int i11;
        if (g(q0Var)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new g(i11, i10, (o) null, list);
    }

    private static H f(int i10, boolean z10, C3717q0 q0Var, List list, I i11) {
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else if (z10) {
            list = Collections.singletonList(new C3717q0.b().e0("application/cea-608").E());
        } else {
            list = Collections.emptyList();
        }
        String str = q0Var.f45767i;
        if (!TextUtils.isEmpty(str)) {
            if (!w.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!w.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        return new H(2, i11, (I.c) new C2993j(i12, list));
    }

    private static boolean g(C3717q0 q0Var) {
        a aVar = q0Var.f45768j;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof q) {
                return !((q) c10).f34127c.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private static boolean h(k kVar, l lVar) {
        try {
            boolean h10 = kVar.h(lVar);
            lVar.e();
            return h10;
        } catch (EOFException unused) {
            lVar.e();
            return false;
        } catch (Throwable th2) {
            lVar.e();
            throw th2;
        }
    }

    /* renamed from: c */
    public b a(Uri uri, C3717q0 q0Var, List list, ja.I i10, Map map, l lVar, s0 s0Var) {
        int a10 = C3655k.a(q0Var.f45770l);
        int b10 = C3655k.b(map);
        int c10 = C3655k.c(uri);
        int[] iArr = f33968d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int b11 : iArr) {
            b(b11, arrayList);
        }
        lVar.e();
        k kVar = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            k kVar2 = (k) C3645a.e(d(intValue, q0Var, list, i10));
            if (h(kVar2, lVar)) {
                return new b(kVar2, q0Var, i10);
            }
            if (kVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                kVar = kVar2;
            }
        }
        return new b((k) C3645a.e(kVar), q0Var, i10);
    }

    public d(int i10, boolean z10) {
        this.f33969b = i10;
        this.f33970c = z10;
    }
}
