package kotlin.jvm.internal;

import Ff.q;

public abstract class W implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71765a = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: kotlin.jvm.internal.W$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1026a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f71766a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    Ff.s[] r0 = Ff.s.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Ff.s r1 = Ff.s.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Ff.s r1 = Ff.s.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Ff.s r1 = Ff.s.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f71766a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.W.a.C1026a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(q qVar) {
            C6496s.h(qVar, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C1026a.f71766a[qVar.n().ordinal()];
            if (i10 == 2) {
                sb2.append("in ");
            } else if (i10 == 3) {
                sb2.append("out ");
            }
            sb2.append(qVar.getName());
            String sb3 = sb2.toString();
            C6496s.g(sb3, "toString(...)");
            return sb3;
        }

        private a() {
        }
    }
}
