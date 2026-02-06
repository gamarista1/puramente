package e;

import Y.A1;
import Y.C1500m;
import Y.L;
import Y.M;
import Y.P;
import Y.p1;
import g.C2002e;
import g.C2003f;
import h.C2012a;
import h0.C2018b;
import h0.C2026j;
import java.util.UUID;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

/* renamed from: e.c  reason: case insensitive filesystem */
public abstract class C1930c {

    /* renamed from: e.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1928a f19471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2002e f19472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C2012a f19474d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f19475e;

        /* renamed from: e.c$a$a  reason: collision with other inner class name */
        public static final class C0339a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1928a f19476a;

            public C0339a(C1928a aVar) {
                this.f19476a = aVar;
            }

            public void dispose() {
                this.f19476a.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1928a aVar, C2002e eVar, String str, C2012a aVar2, A1 a12) {
            super(1);
            this.f19471a = aVar;
            this.f19472b = eVar;
            this.f19473c = str;
            this.f19474d = aVar2;
            this.f19475e = a12;
        }

        /* access modifiers changed from: private */
        public static final void c(A1 a12, Object obj) {
            ((C6798l) a12.getValue()).invoke(obj);
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            this.f19471a.b(this.f19472b.m(this.f19473c, this.f19474d, new C1929b(this.f19475e)));
            return new C0339a(this.f19471a);
        }
    }

    /* renamed from: e.c$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19477a = new b();

        b() {
            super(0);
        }

        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final C1935h a(C2012a aVar, C6798l lVar, C1500m mVar, int i10) {
        C2012a aVar2 = aVar;
        C1500m mVar2 = mVar;
        mVar2.z(-1408504823);
        A1 o10 = p1.o(aVar, mVar2, i10 & 14);
        A1 o11 = p1.o(lVar, mVar2, (i10 >> 3) & 14);
        String str = (String) C2018b.e(new Object[0], (C2026j) null, (String) null, b.f19477a, mVar, 3072, 6);
        C2003f a10 = C1933f.f19490a.a(mVar2, 6);
        if (a10 != null) {
            C2002e activityResultRegistry = a10.getActivityResultRegistry();
            mVar2.z(-1672765924);
            Object A10 = mVar.A();
            C1500m.a aVar3 = C1500m.f10026a;
            if (A10 == aVar3.a()) {
                A10 = new C1928a();
                mVar2.r(A10);
            }
            C1928a aVar4 = (C1928a) A10;
            mVar.R();
            mVar2.z(-1672765850);
            Object A11 = mVar.A();
            if (A11 == aVar3.a()) {
                A11 = new C1935h(aVar4, o10);
                mVar2.r(A11);
            }
            C1935h hVar = (C1935h) A11;
            mVar.R();
            mVar2.z(-1672765582);
            boolean S10 = mVar2.S(aVar4) | mVar2.S(activityResultRegistry) | mVar2.S(str) | mVar2.S(aVar) | mVar2.S(o11);
            Object A12 = mVar.A();
            if (S10 || A12 == aVar3.a()) {
                a aVar5 = new a(aVar4, activityResultRegistry, str, aVar, o11);
                mVar2.r(aVar5);
                A12 = aVar5;
            }
            mVar.R();
            C2002e eVar = activityResultRegistry;
            String str2 = str;
            C2012a aVar6 = aVar;
            P.a(eVar, str2, aVar6, (C6798l) A12, mVar, (i10 << 6) & 896);
            mVar.R();
            return hVar;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
    }
}
