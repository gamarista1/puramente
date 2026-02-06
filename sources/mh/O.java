package mh;

import ih.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.C6539c;
import lh.i;

final class O extends C6586c {

    /* renamed from: f  reason: collision with root package name */
    private final C6539c f72134f;

    /* renamed from: g  reason: collision with root package name */
    private final int f72135g = s0().size();

    /* renamed from: h  reason: collision with root package name */
    private int f72136h = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C6538b bVar, C6539c cVar) {
        super(bVar, cVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(cVar, "value");
        this.f72134f = cVar;
    }

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return String.valueOf(i10);
    }

    /* access modifiers changed from: protected */
    public i e0(String str) {
        C6496s.h(str, "tag");
        return s0().get(Integer.parseInt(str));
    }

    public int o(f fVar) {
        C6496s.h(fVar, "descriptor");
        int i10 = this.f72136h;
        if (i10 >= this.f72135g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f72136h = i11;
        return i11;
    }

    /* renamed from: u0 */
    public C6539c s0() {
        return this.f72134f;
    }
}
