package kh;

import gh.C5978b;
import java.util.Iterator;
import jh.c;
import jh.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kh.a  reason: case insensitive filesystem */
public abstract class C6439a implements C5978b {
    public /* synthetic */ C6439a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void i(C6439a aVar, c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                z10 = true;
            }
            aVar.h(cVar, i10, obj, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    private final int j(c cVar, Object obj) {
        int q10 = cVar.q(getDescriptor());
        c(obj, q10);
        return q10;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract void c(Object obj, int i10);

    /* access modifiers changed from: protected */
    public abstract Iterator d(Object obj);

    public Object deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return f(eVar, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    public final Object f(e eVar, Object obj) {
        Object obj2;
        C6496s.h(eVar, "decoder");
        if (obj == null || (obj2 = k(obj)) == null) {
            obj2 = a();
        }
        int b10 = b(obj2);
        c b11 = eVar.b(getDescriptor());
        if (!b11.p()) {
            while (true) {
                int o10 = b11.o(getDescriptor());
                if (o10 == -1) {
                    break;
                }
                i(this, b11, b10 + o10, obj2, false, 8, (Object) null);
            }
        } else {
            g(b11, obj2, b10, j(b11, obj2));
        }
        b11.c(getDescriptor());
        return l(obj2);
    }

    /* access modifiers changed from: protected */
    public abstract void g(c cVar, Object obj, int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract void h(c cVar, int i10, Object obj, boolean z10);

    /* access modifiers changed from: protected */
    public abstract Object k(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object l(Object obj);

    private C6439a() {
    }
}
