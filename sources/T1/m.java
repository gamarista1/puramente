package T1;

import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public abstract class m extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final C1769q f5971a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(C1769q qVar, String str) {
        super(str);
        C6496s.h(qVar, "fragment");
        this.f5971a = qVar;
    }

    public final C1769q a() {
        return this.f5971a;
    }
}
