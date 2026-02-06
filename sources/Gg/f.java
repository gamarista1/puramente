package Gg;

import Fg.C5366d0;
import Fg.C5390q;
import Fg.I;
import Fg.L0;
import Fg.M0;
import Fg.S;
import Fg.V;
import Jg.i;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6535s;
import yf.C6798l;

public abstract class f extends C5390q {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63179a = new a();

        private a() {
        }
    }

    /* synthetic */ class b extends C6493o implements C6798l {
        b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "prepareType";
        }

        public final Ff.f getOwner() {
            return O.b(f.class);
        }

        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        /* renamed from: i */
        public final M0 invoke(i iVar) {
            C6496s.h(iVar, "p0");
            return ((f) this.receiver).a(iVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: Fg.M0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: Fg.Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: Fg.S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: Fg.Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: Fg.Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: Fg.S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: Fg.M0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: Fg.S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: Fg.S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: Fg.M0} */
    /* JADX WARNING: type inference failed for: r3v3, types: [Fg.Q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Fg.C5366d0 c(Fg.C5366d0 r15) {
        /*
            r14 = this;
            Fg.v0 r0 = r15.N0()
            boolean r1 = r0 instanceof sg.C6719c
            r2 = 10
            r3 = 0
            if (r1 == 0) goto L_0x0081
            sg.c r0 = (sg.C6719c) r0
            Fg.B0 r1 = r0.a()
            Fg.N0 r4 = r1.b()
            Fg.N0 r5 = Fg.N0.IN_VARIANCE
            if (r4 != r5) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            if (r1 == 0) goto L_0x0027
            Fg.S r1 = r1.getType()
            if (r1 == 0) goto L_0x0027
            Fg.M0 r3 = r1.Q0()
        L_0x0027:
            r7 = r3
            Gg.n r1 = r0.c()
            if (r1 != 0) goto L_0x0065
            Fg.B0 r9 = r0.a()
            java.util.Collection r1 = r0.l()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = mf.C6565s.y(r1, r2)
            r10.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0045:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()
            Fg.S r2 = (Fg.S) r2
            Fg.M0 r2 = r2.Q0()
            r10.add(r2)
            goto L_0x0045
        L_0x0059:
            Gg.n r1 = new Gg.n
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.e(r1)
        L_0x0065:
            Gg.i r1 = new Gg.i
            Jg.b r5 = Jg.b.FOR_SUBTYPING
            Gg.n r6 = r0.c()
            kotlin.jvm.internal.C6496s.e(r6)
            Fg.r0 r8 = r15.M0()
            boolean r9 = r15.O0()
            r11 = 32
            r12 = 0
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0081:
            boolean r1 = r0 instanceof Fg.Q
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r15.O0()
            if (r1 == 0) goto L_0x00d4
            Fg.Q r0 = (Fg.Q) r0
            java.util.Collection r15 = r0.l()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = mf.C6565s.y(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
            r2 = 0
        L_0x00a1:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r2 = r15.next()
            Fg.S r2 = (Fg.S) r2
            Fg.S r2 = Kg.d.B(r2)
            r1.add(r2)
            r2 = 1
            goto L_0x00a1
        L_0x00b6:
            if (r2 != 0) goto L_0x00b9
            goto L_0x00cc
        L_0x00b9:
            Fg.S r15 = r0.h()
            if (r15 == 0) goto L_0x00c3
            Fg.S r3 = Kg.d.B(r15)
        L_0x00c3:
            Fg.Q r15 = new Fg.Q
            r15.<init>(r1)
            Fg.Q r3 = r15.s(r3)
        L_0x00cc:
            if (r3 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = r3
        L_0x00d0:
            Fg.d0 r15 = r0.f()
        L_0x00d4:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Gg.f.c(Fg.d0):Fg.d0");
    }

    /* renamed from: b */
    public M0 a(i iVar) {
        M0 m02;
        C6496s.h(iVar, "type");
        if (iVar instanceof S) {
            M0 Q02 = ((S) iVar).Q0();
            if (Q02 instanceof C5366d0) {
                m02 = c((C5366d0) Q02);
            } else if (Q02 instanceof I) {
                I i10 = (I) Q02;
                C5366d0 c10 = c(i10.V0());
                C5366d0 c11 = c(i10.W0());
                if (c10 == i10.V0() && c11 == i10.W0()) {
                    m02 = Q02;
                } else {
                    m02 = V.e(c10, c11);
                }
            } else {
                throw new C6535s();
            }
            return L0.c(m02, Q02, new b(this));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
