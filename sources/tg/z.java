package tg;

import Fg.S;
import Of.H;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class z extends C6736b {

    /* renamed from: c  reason: collision with root package name */
    private final S f73580c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(List list, S s10) {
        super(list, new y(s10));
        C6496s.h(list, "value");
        C6496s.h(s10, "type");
        this.f73580c = s10;
    }

    /* access modifiers changed from: private */
    public static final S c(S s10, H h10) {
        C6496s.h(h10, "it");
        return s10;
    }

    public final S e() {
        return this.f73580c;
    }
}
