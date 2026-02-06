package kh;

import gh.C5978b;
import ih.f;
import java.util.Iterator;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kh.q  reason: case insensitive filesystem */
public abstract class C6470q extends C6439a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5978b f71696a;

    public /* synthetic */ C6470q(C5978b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* access modifiers changed from: protected */
    public final void g(c cVar, Object obj, int i10, int i11) {
        C6496s.h(cVar, "decoder");
        if (i11 >= 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                h(cVar, i10 + i12, obj, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
    }

    public abstract f getDescriptor();

    /* access modifiers changed from: protected */
    public void h(c cVar, int i10, Object obj, boolean z10) {
        C6496s.h(cVar, "decoder");
        n(obj, i10, c.a.c(cVar, getDescriptor(), i10, this.f71696a, (Object) null, 8, (Object) null));
    }

    /* access modifiers changed from: protected */
    public abstract void n(Object obj, int i10, Object obj2);

    public void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        int e10 = e(obj);
        f descriptor = getDescriptor();
        d e11 = fVar.e(descriptor, e10);
        Iterator d10 = d(obj);
        for (int i10 = 0; i10 < e10; i10++) {
            e11.B(getDescriptor(), i10, this.f71696a, d10.next());
        }
        e11.c(descriptor);
    }

    private C6470q(C5978b bVar) {
        super((DefaultConstructorMarker) null);
        this.f71696a = bVar;
    }
}
