package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import lf.C6514M;
import qf.g;
import yf.p;

/* renamed from: qf.c  reason: case insensitive filesystem */
public final class C6657c implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final g f72635a;

    /* renamed from: b  reason: collision with root package name */
    private final g.b f72636b;

    /* renamed from: qf.c$a */
    private static final class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        public static final C1050a f72637b = new C1050a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final g[] f72638a;

        /* renamed from: qf.c$a$a  reason: collision with other inner class name */
        public static final class C1050a {
            public /* synthetic */ C1050a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1050a() {
            }
        }

        public a(g[] gVarArr) {
            C6496s.h(gVarArr, "elements");
            this.f72638a = gVarArr;
        }

        private final Object readResolve() {
            g[] gVarArr = this.f72638a;
            g gVar = h.f72645a;
            for (g n12 : gVarArr) {
                gVar = gVar.n1(n12);
            }
            return gVar;
        }
    }

    /* renamed from: qf.c$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72639a = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            C6496s.h(str, "acc");
            C6496s.h(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: qf.c$c  reason: collision with other inner class name */
    static final class C1051c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g[] f72640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ L f72641b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1051c(g[] gVarArr, L l10) {
            super(2);
            this.f72640a = gVarArr;
            this.f72641b = l10;
        }

        public final void a(C6514M m10, g.b bVar) {
            C6496s.h(m10, "<anonymous parameter 0>");
            C6496s.h(bVar, "element");
            g[] gVarArr = this.f72640a;
            L l10 = this.f72641b;
            int i10 = l10.f71757a;
            l10.f71757a = i10 + 1;
            gVarArr[i10] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C6514M) obj, (g.b) obj2);
            return C6514M.f71813a;
        }
    }

    public C6657c(g gVar, g.b bVar) {
        C6496s.h(gVar, BlockAlignment.LEFT);
        C6496s.h(bVar, "element");
        this.f72635a = gVar;
        this.f72636b = bVar;
    }

    private final boolean c(g.b bVar) {
        return C6496s.c(b(bVar.getKey()), bVar);
    }

    private final boolean d(C6657c cVar) {
        while (c(cVar.f72636b)) {
            g gVar = cVar.f72635a;
            if (gVar instanceof C6657c) {
                cVar = (C6657c) gVar;
            } else {
                C6496s.f(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        C6657c cVar = this;
        while (true) {
            g gVar = cVar.f72635a;
            if (gVar instanceof C6657c) {
                cVar = (C6657c) gVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int e10 = e();
        g[] gVarArr = new g[e10];
        L l10 = new L();
        f0(C6514M.f71813a, new C1051c(gVarArr, l10));
        if (l10.f71757a == e10) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public g R0(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (this.f72636b.b(cVar) != null) {
            return this.f72635a;
        }
        g R02 = this.f72635a.R0(cVar);
        if (R02 == this.f72635a) {
            return this;
        }
        if (R02 == h.f72645a) {
            return this.f72636b;
        }
        return new C6657c(R02, this.f72636b);
    }

    public g.b b(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C6657c cVar2 = this;
        while (true) {
            g.b b10 = cVar2.f72636b.b(cVar);
            if (b10 != null) {
                return b10;
            }
            g gVar = cVar2.f72635a;
            if (!(gVar instanceof C6657c)) {
                return gVar.b(cVar);
            }
            cVar2 = (C6657c) gVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6657c) {
                C6657c cVar = (C6657c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Object f0(Object obj, p pVar) {
        C6496s.h(pVar, "operation");
        return pVar.invoke(this.f72635a.f0(obj, pVar), this.f72636b);
    }

    public int hashCode() {
        return this.f72635a.hashCode() + this.f72636b.hashCode();
    }

    public g n1(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) f0("", b.f72639a)) + ']';
    }
}
