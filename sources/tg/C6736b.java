package tg;

import Fg.S;
import Lf.i;
import Of.H;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: tg.b  reason: case insensitive filesystem */
public class C6736b extends g {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f73553b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6736b(List list, C6798l lVar) {
        super(list);
        C6496s.h(list, "value");
        C6496s.h(lVar, "computeType");
        this.f73553b = lVar;
    }

    public S a(H h10) {
        C6496s.h(h10, "module");
        S s10 = (S) this.f73553b.invoke(h10);
        if (!i.c0(s10) && !i.q0(s10)) {
            i.D0(s10);
        }
        return s10;
    }
}
