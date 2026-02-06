package ie;

import kotlin.jvm.internal.C6496s;
import qe.C5155b;

/* renamed from: ie.h  reason: case insensitive filesystem */
public abstract class C5038h extends C5031a {

    /* renamed from: g  reason: collision with root package name */
    private m f60820g = m.DEFAULT;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5038h(String str, C5155b[] bVarArr) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
    }

    /* access modifiers changed from: protected */
    public final m l() {
        return this.f60820g;
    }

    public final C5038h m(m mVar) {
        C6496s.h(mVar, "queue");
        this.f60820g = mVar;
        return this;
    }
}
