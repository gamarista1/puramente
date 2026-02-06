package rh;

import Gh.C5405f;
import Gh.C5407h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rh.D;
import rh.u;
import rh.y;
import sh.C6726e;

public final class z extends D {

    /* renamed from: f  reason: collision with root package name */
    public static final b f73506f = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final y f73507g;

    /* renamed from: h  reason: collision with root package name */
    public static final y f73508h;

    /* renamed from: i  reason: collision with root package name */
    public static final y f73509i;

    /* renamed from: j  reason: collision with root package name */
    public static final y f73510j;

    /* renamed from: k  reason: collision with root package name */
    public static final y f73511k;

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f73512l = {58, 32};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f73513m = {13, 10};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f73514n = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    private final C5407h f73515a;

    /* renamed from: b  reason: collision with root package name */
    private final y f73516b;

    /* renamed from: c  reason: collision with root package name */
    private final List f73517c;

    /* renamed from: d  reason: collision with root package name */
    private final y f73518d;

    /* renamed from: e  reason: collision with root package name */
    private long f73519e = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5407h f73520a;

        /* renamed from: b  reason: collision with root package name */
        private y f73521b;

        /* renamed from: c  reason: collision with root package name */
        private final List f73522c;

        public a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public final a a(String str, String str2) {
            C6496s.h(str, "name");
            C6496s.h(str2, "value");
            d(c.f73523c.b(str, str2));
            return this;
        }

        public final a b(String str, String str2, D d10) {
            C6496s.h(str, "name");
            C6496s.h(d10, "body");
            d(c.f73523c.c(str, str2, d10));
            return this;
        }

        public final a c(u uVar, D d10) {
            C6496s.h(d10, "body");
            d(c.f73523c.a(uVar, d10));
            return this;
        }

        public final a d(c cVar) {
            C6496s.h(cVar, "part");
            this.f73522c.add(cVar);
            return this;
        }

        public final z e() {
            if (!this.f73522c.isEmpty()) {
                return new z(this.f73520a, this.f73521b, C6726e.V(this.f73522c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public final a f(y yVar) {
            C6496s.h(yVar, "type");
            if (C6496s.c(yVar.h(), "multipart")) {
                this.f73521b = yVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + yVar).toString());
        }

        public a(String str) {
            C6496s.h(str, "boundary");
            this.f73520a = C5407h.f63295d.d(str);
            this.f73521b = z.f73507g;
            this.f73522c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C6496s.g(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh.z.a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder sb2, String str) {
            C6496s.h(sb2, "<this>");
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            sb2.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == 10) {
                    sb2.append("%0A");
                } else if (charAt == 13) {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
            }
            sb2.append('\"');
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f73523c = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final u f73524a;

        /* renamed from: b  reason: collision with root package name */
        private final D f73525b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(u uVar, D d10) {
                String str;
                String str2;
                C6496s.h(d10, "body");
                if (uVar != null) {
                    str = uVar.a("Content-Type");
                } else {
                    str = null;
                }
                if (str == null) {
                    if (uVar != null) {
                        str2 = uVar.a("Content-Length");
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return new c(uVar, d10, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            public final c b(String str, String str2) {
                C6496s.h(str, "name");
                C6496s.h(str2, "value");
                return c(str, (String) null, D.a.n(D.Companion, str2, (y) null, 1, (Object) null));
            }

            public final c c(String str, String str2, D d10) {
                C6496s.h(str, "name");
                C6496s.h(d10, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = z.f73506f;
                bVar.a(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    bVar.a(sb2, str2);
                }
                String sb3 = sb2.toString();
                C6496s.g(sb3, "StringBuilder().apply(builderAction).toString()");
                return a(new u.a().e("Content-Disposition", sb3).f(), d10);
            }

            private a() {
            }
        }

        public /* synthetic */ c(u uVar, D d10, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, d10);
        }

        public final D a() {
            return this.f73525b;
        }

        public final u b() {
            return this.f73524a;
        }

        private c(u uVar, D d10) {
            this.f73524a = uVar;
            this.f73525b = d10;
        }
    }

    static {
        y.a aVar = y.f73499e;
        f73507g = aVar.a("multipart/mixed");
        f73508h = aVar.a("multipart/alternative");
        f73509i = aVar.a("multipart/digest");
        f73510j = aVar.a("multipart/parallel");
        f73511k = aVar.a("multipart/form-data");
    }

    public z(C5407h hVar, y yVar, List list) {
        C6496s.h(hVar, "boundaryByteString");
        C6496s.h(yVar, "type");
        C6496s.h(list, "parts");
        this.f73515a = hVar;
        this.f73516b = yVar;
        this.f73517c = list;
        y.a aVar = y.f73499e;
        this.f73518d = aVar.a(yVar + "; boundary=" + a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: Gh.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: Gh.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: Gh.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: Gh.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: Gh.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long b(Gh.C5405f r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            Gh.e r13 = new Gh.e
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List r1 = r12.f73517c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List r6 = r12.f73517c
            java.lang.Object r6 = r6.get(r5)
            rh.z$c r6 = (rh.z.c) r6
            rh.u r7 = r6.b()
            rh.D r6 = r6.a()
            kotlin.jvm.internal.C6496s.e(r13)
            byte[] r8 = f73514n
            r13.n0(r8)
            Gh.h r8 = r12.f73515a
            r13.k0(r8)
            byte[] r8 = f73513m
            r13.n0(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = r2
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.g(r9)
            Gh.f r10 = r13.X(r10)
            byte[] r11 = f73512l
            Gh.f r10 = r10.n0(r11)
            java.lang.String r11 = r7.x(r9)
            Gh.f r10 = r10.X(r11)
            byte[] r11 = f73513m
            r10.n0(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            rh.y r7 = r6.contentType()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            Gh.f r8 = r13.X(r8)
            java.lang.String r7 = r7.toString()
            Gh.f r7 = r8.X(r7)
            byte[] r8 = f73513m
            r7.n0(r8)
        L_0x0078:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            Gh.f r9 = r13.X(r9)
            Gh.f r9 = r9.v0(r7)
            byte[] r10 = f73513m
            r9.n0(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            kotlin.jvm.internal.C6496s.e(r0)
            r0.a()
            return r9
        L_0x009b:
            byte[] r9 = f73513m
            r13.n0(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.writeTo(r13)
        L_0x00a7:
            r13.n0(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            kotlin.jvm.internal.C6496s.e(r13)
            byte[] r1 = f73514n
            r13.n0(r1)
            Gh.h r2 = r12.f73515a
            r13.k0(r2)
            r13.n0(r1)
            byte[] r1 = f73513m
            r13.n0(r1)
            if (r14 == 0) goto L_0x00d0
            kotlin.jvm.internal.C6496s.e(r0)
            long r13 = r0.B0()
            long r3 = r3 + r13
            r0.a()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.z.b(Gh.f, boolean):long");
    }

    public final String a() {
        return this.f73515a.W();
    }

    public long contentLength() {
        long j10 = this.f73519e;
        if (j10 != -1) {
            return j10;
        }
        long b10 = b((C5405f) null, true);
        this.f73519e = b10;
        return b10;
    }

    public y contentType() {
        return this.f73518d;
    }

    public void writeTo(C5405f fVar) {
        C6496s.h(fVar, "sink");
        b(fVar, false);
    }
}
