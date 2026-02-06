package T1;

import androidx.fragment.app.C1769q;
import kotlin.jvm.internal.C6496s;

public final class a extends m {

    /* renamed from: b  reason: collision with root package name */
    private final String f5948b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(C1769q qVar, String str) {
        super(qVar, "Attempting to reuse fragment " + qVar + " with previous ID " + str);
        C6496s.h(qVar, "fragment");
        C6496s.h(str, "previousFragmentId");
        this.f5948b = str;
    }
}
