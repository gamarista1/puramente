package Y0;

import Q0.C1318a;
import Q0.C1333p;
import Q0.C1335s;
import Q0.T;
import V0.h;
import c1.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class f {
    public static final C1333p a(C1335s sVar, int i10, boolean z10, long j10) {
        C6496s.f(sVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C1318a((d) sVar, i10, z10, j10, (DefaultConstructorMarker) null);
    }

    public static final C1333p b(String str, T t10, List list, List list2, int i10, boolean z10, long j10, d dVar, h.b bVar) {
        return new C1318a(new d(str, t10, list, list2, bVar, dVar), i10, z10, j10, (DefaultConstructorMarker) null);
    }
}
