package W6;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;

public enum f {
    LOW,
    MEDIUM,
    HIGH;
    

    /* renamed from: a  reason: collision with root package name */
    public static final a f34896a = null;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f fVar, f fVar2) {
            C6496s.h(fVar, "priority1");
            C6496s.h(fVar2, "priority2");
            if (fVar.ordinal() > fVar2.ordinal()) {
                return fVar;
            }
            return fVar2;
        }

        private a() {
        }
    }

    static {
        f[] a10;
        f34901f = C6714a.a(a10);
        f34896a = new a((DefaultConstructorMarker) null);
    }

    public static final f b(f fVar, f fVar2) {
        return f34896a.a(fVar, fVar2);
    }
}
