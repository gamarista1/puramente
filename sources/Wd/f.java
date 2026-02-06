package wd;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.C6496s;
import vd.q;

public final class f extends b {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f62103e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(q qVar) {
        super(qVar);
        C6496s.h(qVar, "handler");
        this.f62103e = qVar.f0();
    }

    public void a(WritableMap writableMap) {
        C6496s.h(writableMap, "eventData");
        super.a(writableMap);
        writableMap.putBoolean("pointerInside", this.f62103e);
    }
}
