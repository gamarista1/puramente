package lh;

import gh.C5977a;
import gh.C5987k;
import gh.C5991o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C6607y;
import mh.K;
import mh.L;
import mh.W;
import mh.Z;
import mh.b0;
import mh.c0;
import mh.d0;
import nh.C6624e;

/* renamed from: lh.b  reason: case insensitive filesystem */
public abstract class C6538b implements C5991o {

    /* renamed from: d  reason: collision with root package name */
    public static final a f71951d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final g f71952a;

    /* renamed from: b  reason: collision with root package name */
    private final C6624e f71953b;

    /* renamed from: c  reason: collision with root package name */
    private final C6607y f71954c;

    /* renamed from: lh.b$a */
    public static final class a extends C6538b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private a() {
            /*
                r20 = this;
                lh.g r15 = new lh.g
                r0 = r15
                r17 = 65535(0xffff, float:9.1834E-41)
                r18 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r19 = r15
                r15 = r16
                r16 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                nh.e r0 = nh.g.a()
                r1 = 0
                r2 = r20
                r3 = r19
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lh.C6538b.a.<init>():void");
        }
    }

    public /* synthetic */ C6538b(g gVar, C6624e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, eVar);
    }

    public C6624e a() {
        return this.f71953b;
    }

    public final Object b(C5977a aVar, String str) {
        C6496s.h(aVar, "deserializer");
        C6496s.h(str, "string");
        Z z10 = new Z(str);
        Object n10 = new W(this, d0.OBJ, z10, aVar.getDescriptor(), (W.a) null).n(aVar);
        z10.v();
        return n10;
    }

    public final String c(C5987k kVar, Object obj) {
        C6496s.h(kVar, "serializer");
        L l10 = new L();
        try {
            K.a(this, l10, kVar, obj);
            return l10.toString();
        } finally {
            l10.h();
        }
    }

    public final Object d(C5977a aVar, i iVar) {
        C6496s.h(aVar, "deserializer");
        C6496s.h(iVar, "element");
        return b0.a(this, iVar, aVar);
    }

    public final i e(C5987k kVar, Object obj) {
        C6496s.h(kVar, "serializer");
        return c0.c(this, obj, kVar);
    }

    public final g f() {
        return this.f71952a;
    }

    public final C6607y g() {
        return this.f71954c;
    }

    private C6538b(g gVar, C6624e eVar) {
        this.f71952a = gVar;
        this.f71953b = eVar;
        this.f71954c = new C6607y();
    }
}
