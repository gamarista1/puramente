package v;

import H0.C1193n;
import H0.C1194o;
import H0.F;
import H0.U;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

/* renamed from: v.c  reason: case insensitive filesystem */
final class C2720c implements F {

    /* renamed from: a  reason: collision with root package name */
    private final C2723f f26792a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26793b;

    /* renamed from: v.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f26794a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(1);
            this.f26794a = list;
        }

        public final void a(U.a aVar) {
            List list = this.f26794a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                U.a.h(aVar, (U) list.get(i10), 0, 0, 0.0f, 4, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public C2720c(C2723f fVar) {
        this.f26792a = fVar;
    }

    public int a(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).e0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).e0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int b(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).t0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).t0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int g(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).s(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).s(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int h(C1194o oVar, List list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C1193n) list.get(0)).s0(i10));
            int p10 = C6565s.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C1193n) list.get(i11)).s0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: H0.U} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public H0.G j(H0.H r11, java.util.List r12, long r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.size()
            r0.<init>(r1)
            int r1 = r12.size()
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x0021
            java.lang.Object r4 = r12.get(r3)
            H0.E r4 = (H0.E) r4
            H0.U r4 = r4.v0(r13)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0021:
            boolean r12 = r0.isEmpty()
            r13 = 0
            r14 = 1
            if (r12 == 0) goto L_0x002b
            r12 = r13
            goto L_0x0051
        L_0x002b:
            java.lang.Object r12 = r0.get(r2)
            r1 = r12
            H0.U r1 = (H0.U) r1
            int r1 = r1.X0()
            int r3 = mf.C6565s.p(r0)
            if (r14 > r3) goto L_0x0051
            r4 = r14
        L_0x003d:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            H0.U r6 = (H0.U) r6
            int r6 = r6.X0()
            if (r1 >= r6) goto L_0x004c
            r12 = r5
            r1 = r6
        L_0x004c:
            if (r4 == r3) goto L_0x0051
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0051:
            H0.U r12 = (H0.U) r12
            if (r12 == 0) goto L_0x005b
            int r12 = r12.X0()
            r4 = r12
            goto L_0x005c
        L_0x005b:
            r4 = r2
        L_0x005c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x0063
            goto L_0x008a
        L_0x0063:
            java.lang.Object r12 = r0.get(r2)
            r13 = r12
            H0.U r13 = (H0.U) r13
            int r13 = r13.R0()
            int r1 = mf.C6565s.p(r0)
            if (r14 > r1) goto L_0x0089
            r3 = r14
        L_0x0075:
            java.lang.Object r5 = r0.get(r3)
            r6 = r5
            H0.U r6 = (H0.U) r6
            int r6 = r6.R0()
            if (r13 >= r6) goto L_0x0084
            r12 = r5
            r13 = r6
        L_0x0084:
            if (r3 == r1) goto L_0x0089
            int r3 = r3 + 1
            goto L_0x0075
        L_0x0089:
            r13 = r12
        L_0x008a:
            H0.U r13 = (H0.U) r13
            if (r13 == 0) goto L_0x0092
            int r2 = r13.R0()
        L_0x0092:
            r5 = r2
            boolean r12 = r11.r0()
            if (r12 == 0) goto L_0x00ad
            r10.f26793b = r14
            v.f r12 = r10.f26792a
            Y.r0 r12 = r12.a()
            long r13 = c1.s.a(r4, r5)
            c1.r r13 = c1.r.b(r13)
            r12.setValue(r13)
            goto L_0x00c2
        L_0x00ad:
            boolean r12 = r10.f26793b
            if (r12 != 0) goto L_0x00c2
            v.f r12 = r10.f26792a
            Y.r0 r12 = r12.a()
            long r13 = c1.s.a(r4, r5)
            c1.r r13 = c1.r.b(r13)
            r12.setValue(r13)
        L_0x00c2:
            v.c$a r7 = new v.c$a
            r7.<init>(r0)
            r8 = 4
            r9 = 0
            r6 = 0
            r3 = r11
            H0.G r11 = H0.H.N(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C2720c.j(H0.H, java.util.List, long):H0.G");
    }
}
