package kh;

import Ef.g;
import Ef.m;
import gh.C5978b;
import ih.e;
import ih.f;
import java.util.Iterator;
import java.util.Map;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.O;

public abstract class W extends C6439a {

    /* renamed from: a  reason: collision with root package name */
    private final C5978b f71638a;

    /* renamed from: b  reason: collision with root package name */
    private final C5978b f71639b;

    public /* synthetic */ W(C5978b bVar, C5978b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    public abstract f getDescriptor();

    public final C5978b m() {
        return this.f71638a;
    }

    public final C5978b n() {
        return this.f71639b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void g(c cVar, Map map, int i10, int i11) {
        C6496s.h(cVar, "decoder");
        C6496s.h(map, "builder");
        if (i11 >= 0) {
            g t10 = m.t(m.u(0, i11 * 2), 2);
            int k10 = t10.k();
            int n10 = t10.n();
            int r10 = t10.r();
            if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
                while (true) {
                    h(cVar, i10 + k10, map, false);
                    if (k10 != n10) {
                        k10 += r10;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void h(c cVar, int i10, Map map, boolean z10) {
        int i11;
        Object obj;
        C6496s.h(cVar, "decoder");
        C6496s.h(map, "builder");
        Object c10 = c.a.c(cVar, getDescriptor(), i10, this.f71638a, (Object) null, 8, (Object) null);
        if (z10) {
            i11 = cVar.o(getDescriptor());
            if (i11 != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (!map.containsKey(c10) || (this.f71639b.getDescriptor().h() instanceof e)) {
            obj = c.a.c(cVar, getDescriptor(), i12, this.f71639b, (Object) null, 8, (Object) null);
        } else {
            obj = cVar.C(getDescriptor(), i12, this.f71639b, O.j(map, c10));
        }
        map.put(c10, obj);
    }

    public void serialize(jh.f fVar, Object obj) {
        C6496s.h(fVar, "encoder");
        int e10 = e(obj);
        f descriptor = getDescriptor();
        d e11 = fVar.e(descriptor, e10);
        Iterator d10 = d(obj);
        int i10 = 0;
        while (d10.hasNext()) {
            Map.Entry entry = (Map.Entry) d10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            e11.B(getDescriptor(), i10, m(), key);
            i10 += 2;
            e11.B(getDescriptor(), i11, n(), value);
        }
        e11.c(descriptor);
    }

    private W(C5978b bVar, C5978b bVar2) {
        super((DefaultConstructorMarker) null);
        this.f71638a = bVar;
        this.f71639b = bVar2;
    }
}
