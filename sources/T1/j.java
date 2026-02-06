package T1;

import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public final class j extends l {

    /* renamed from: b  reason: collision with root package name */
    private final C1769q f5968b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5969c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(C1769q qVar, C1769q qVar2, int i10) {
        super(qVar, "Attempting to set target fragment " + qVar2 + " with request code " + i10 + " for fragment " + qVar);
        C6496s.h(qVar, "fragment");
        C6496s.h(qVar2, "targetFragment");
        this.f5968b = qVar2;
        this.f5969c = i10;
    }
}
