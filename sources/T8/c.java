package T8;

import T8.b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C2769M;

public abstract class c {
    public static final b a(b.a aVar, long j10, C2769M m10, float f10) {
        C6496s.h(aVar, "$this$shimmer");
        C6496s.h(m10, "animationSpec");
        return new e(j10, m10, f10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ b b(b.a aVar, long j10, C2769M m10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            m10 = a.f34203a.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 0.6f;
        }
        return a(aVar, j10, m10, f10);
    }
}
