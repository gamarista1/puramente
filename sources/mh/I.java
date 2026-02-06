package mh;

import ih.f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.i;

final class I extends C6586c {

    /* renamed from: f  reason: collision with root package name */
    private final i f72124f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(C6538b bVar, i iVar) {
        super(bVar, iVar, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(iVar, "value");
        this.f72124f = iVar;
        X("primitive");
    }

    /* access modifiers changed from: protected */
    public i e0(String str) {
        C6496s.h(str, "tag");
        if (str == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    public int o(f fVar) {
        C6496s.h(fVar, "descriptor");
        return 0;
    }

    public i s0() {
        return this.f72124f;
    }
}
