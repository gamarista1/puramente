package gg;

import Bg.C5328n;
import Bg.C5329o;
import Bg.C5336w;
import Eg.f;
import Gg.p;
import Nf.k;
import Nf.w;
import Of.M;
import Rf.C5523l;
import Rf.F;
import Xf.C5687u;
import ag.j;
import ag.o;
import com.amazon.a.a.n.a.a.g;
import dg.C5816b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mg.C6577e;
import og.C6628a;
import wg.C6767c;
import xg.C6784b;

/* renamed from: gg.k  reason: case insensitive filesystem */
public final class C5961k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f67789b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5328n f67790a;

    /* renamed from: gg.k$a */
    public static final class a {

        /* renamed from: gg.k$a$a  reason: collision with other inner class name */
        public static final class C1002a {

            /* renamed from: a  reason: collision with root package name */
            private final C5961k f67791a;

            /* renamed from: b  reason: collision with root package name */
            private final C5964n f67792b;

            public C1002a(C5961k kVar, C5964n nVar) {
                C6496s.h(kVar, "deserializationComponentsForJava");
                C6496s.h(nVar, "deserializedDescriptorResolver");
                this.f67791a = kVar;
                this.f67792b = nVar;
            }

            public final C5961k a() {
                return this.f67791a;
            }

            public final C5964n b() {
                return this.f67792b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1002a a(C5972v vVar, C5972v vVar2, C5687u uVar, String str, C5336w wVar, C5816b bVar) {
            String str2 = str;
            C6496s.h(vVar, "kotlinClassFinder");
            C6496s.h(vVar2, "jvmBuiltInsKotlinClassFinder");
            C5687u uVar2 = uVar;
            C6496s.h(uVar2, "javaClassFinder");
            C6496s.h(str2, "moduleName");
            C6496s.h(wVar, "errorReporter");
            C5816b bVar2 = bVar;
            C6496s.h(bVar2, "javaSourceElementFactory");
            f fVar = new f("DeserializationComponentsForJava.ModuleData");
            k kVar = new k(fVar, k.a.FROM_DEPENDENCIES);
            ng.f m10 = ng.f.m('<' + str2 + '>');
            C6496s.g(m10, "special(...)");
            F f10 = new F(m10, fVar, kVar, (C6628a) null, (Map) null, (ng.f) null, 56, (DefaultConstructorMarker) null);
            kVar.E0(f10);
            kVar.M0(f10, true);
            C5964n nVar = new C5964n();
            o oVar = new o();
            M m11 = new M(fVar, f10);
            C5972v vVar3 = vVar;
            M m12 = m11;
            o oVar2 = oVar;
            C5336w wVar2 = wVar;
            C5964n nVar2 = nVar;
            F f11 = f10;
            k kVar2 = kVar;
            j c10 = C5962l.c(uVar2, f10, fVar, m11, vVar3, nVar, wVar2, bVar2, oVar2, (C5944D) null, 512, (Object) null);
            C5961k a10 = C5962l.a(f11, fVar, m12, c10, vVar3, nVar2, wVar2, C6577e.f72097i);
            C5964n nVar3 = nVar2;
            nVar3.p(a10);
            Yf.j jVar = Yf.j.f66757a;
            C6496s.g(jVar, g.f37322a);
            C6767c cVar = new C6767c(c10, jVar);
            oVar2.c(cVar);
            w wVar3 = new w(fVar, vVar2, f11, m12, kVar2.L0(), kVar2.L0(), C5329o.a.f62566a, p.f63198b.a(), new C6784b(fVar, C6565s.n()));
            F f12 = f11;
            f12.W0(f11);
            List q10 = C6565s.q(cVar.a(), wVar3);
            f12.O0(new C5523l(q10, "CompositeProvider@RuntimeModuleData for " + f12));
            return new C1002a(a10, nVar3);
        }

        private a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0073, code lost:
        r16 = r0.L0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5961k(Eg.n r25, Of.H r26, Bg.C5329o r27, gg.C5965o r28, gg.C5958h r29, ag.j r30, Of.M r31, Bg.C5336w r32, Wf.c r33, Bg.C5327m r34, Gg.p r35, Ig.a r36) {
        /*
            r24 = this;
            r1 = r25
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "moduleDescriptor"
            r2 = r26
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "configuration"
            r3 = r27
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "classDataFinder"
            r4 = r28
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "annotationAndConstantLoader"
            r5 = r29
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "packageFragmentProvider"
            r6 = r30
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "notFoundClasses"
            r12 = r31
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "errorReporter"
            r8 = r32
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "lookupTracker"
            r9 = r33
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "contractDeserializer"
            r13 = r34
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "kotlinTypeChecker"
            r15 = r35
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "typeAttributeTranslators"
            r7 = r36
            kotlin.jvm.internal.C6496s.h(r7, r0)
            r24.<init>()
            Lf.i r0 = r26.m()
            boolean r10 = r0 instanceof Nf.k
            if (r10 == 0) goto L_0x0062
            Nf.k r0 = (Nf.k) r0
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            Bg.n r14 = new Bg.n
            Bg.B$a r10 = Bg.B.a.f62441a
            gg.p r11 = gg.C5966p.f67803a
            java.util.List r16 = mf.C6565s.n()
            r17 = r16
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            if (r0 == 0) goto L_0x007c
            Nf.u r16 = r0.L0()
            if (r16 == 0) goto L_0x007c
        L_0x0079:
            r21 = r16
            goto L_0x007f
        L_0x007c:
            Qf.a$a r16 = Qf.a.C0950a.f64719a
            goto L_0x0079
        L_0x007f:
            if (r0 == 0) goto L_0x008a
            Nf.u r0 = r0.L0()
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r22 = r0
            goto L_0x008d
        L_0x008a:
            Qf.c$b r0 = Qf.c.b.f64721a
            goto L_0x0087
        L_0x008d:
            mg.i r0 = mg.C6581i.f72110a
            pg.g r16 = r0.a()
            xg.b r0 = new xg.b
            r18 = r0
            java.util.List r19 = mf.C6565s.n()
            r2 = r19
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.<init>(r1, r2)
            java.util.List r19 = r36.a()
            Bg.z r20 = Bg.C5339z.f62595a
            r0 = r14
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r10
            r8 = r32
            r9 = r33
            r10 = r11
            r11 = r17
            r12 = r31
            r13 = r34
            r23 = r14
            r14 = r21
            r15 = r22
            r17 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r24
            r1 = r23
            r0.f67790a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.C5961k.<init>(Eg.n, Of.H, Bg.o, gg.o, gg.h, ag.j, Of.M, Bg.w, Wf.c, Bg.m, Gg.p, Ig.a):void");
    }

    public final C5328n a() {
        return this.f67790a;
    }
}
