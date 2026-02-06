package lh;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.V;
import nh.C6624e;
import nh.g;

final class n extends C6538b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(g gVar, C6624e eVar) {
        super(gVar, eVar, (DefaultConstructorMarker) null);
        C6496s.h(gVar, "configuration");
        C6496s.h(eVar, "module");
        h();
    }

    private final void h() {
        if (!C6496s.c(a(), g.a())) {
            a().a(new V(f().o(), f().d()));
        }
    }
}
