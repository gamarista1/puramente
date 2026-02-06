package T6;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.E;
import rh.u;

public final class d extends Exception {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34196c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Integer f34197a;

    /* renamed from: b  reason: collision with root package name */
    private final u f34198b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(E e10) {
            Integer num;
            C6496s.h(e10, "response");
            E Q10 = e10.Q();
            u uVar = null;
            if (Q10 != null) {
                num = Integer.valueOf(Q10.o());
            } else {
                num = null;
            }
            E Q11 = e10.Q();
            if (Q11 != null) {
                uVar = Q11.F();
            }
            return new d(num, uVar);
        }

        private a() {
        }
    }

    public d(Integer num, u uVar) {
        this.f34197a = num;
        this.f34198b = uVar;
    }
}
