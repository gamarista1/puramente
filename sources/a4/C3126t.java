package a4;

import Ug.C5594t0;
import a4.C3117j;
import d4.m;
import j4.C3627n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6658d;
import qf.g;

/* renamed from: a4.t  reason: case insensitive filesystem */
public final class C3126t implements C3117j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36092d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final S f36093a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f36094b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36095c;

    /* renamed from: a4.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3126t(S s10, C3627n nVar, boolean z10) {
        this.f36093a = s10;
        this.f36094b = nVar;
        this.f36095c = z10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        wf.C6763c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final a4.C3115h b(a4.C3126t r4) {
        /*
            boolean r0 = r4.f36095c
            if (r0 == 0) goto L_0x0014
            a4.q r0 = new a4.q
            a4.S r1 = r4.f36093a
            Gh.g r1 = r1.n()
            r0.<init>(r1)
            Gh.g r0 = Gh.H.d(r0)
            goto L_0x001a
        L_0x0014:
            a4.S r0 = r4.f36093a
            Gh.g r0 = r0.n()
        L_0x001a:
            java.io.InputStream r1 = r0.x1()     // Catch:{ all -> 0x00b5 }
            android.graphics.Movie r1 = android.graphics.Movie.decodeStream(r1)     // Catch:{ all -> 0x00b5 }
            r2 = 0
            wf.C6763c.a(r0, r2)
            if (r1 == 0) goto L_0x00ad
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x00ad
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x00ad
            c4.c r0 = new c4.c
            boolean r2 = r1.isOpaque()
            if (r2 == 0) goto L_0x0047
            j4.n r2 = r4.f36094b
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0047
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
            goto L_0x005c
        L_0x0047:
            j4.n r2 = r4.f36094b
            android.graphics.Bitmap$Config r2 = r2.f()
            boolean r2 = o4.g.g(r2)
            if (r2 == 0) goto L_0x0056
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x005c
        L_0x0056:
            j4.n r2 = r4.f36094b
            android.graphics.Bitmap$Config r2 = r2.f()
        L_0x005c:
            j4.n r3 = r4.f36094b
            k4.h r3 = r3.n()
            r0.<init>(r1, r2, r3)
            j4.n r1 = r4.f36094b
            j4.o r1 = r1.l()
            java.lang.Integer r1 = j4.C3620g.d(r1)
            if (r1 == 0) goto L_0x0076
            int r1 = r1.intValue()
            goto L_0x0077
        L_0x0076:
            r1 = -1
        L_0x0077:
            r0.e(r1)
            j4.n r1 = r4.f36094b
            j4.o r1 = r1.l()
            yf.a r1 = j4.C3620g.c(r1)
            j4.n r2 = r4.f36094b
            j4.o r2 = r2.l()
            yf.a r2 = j4.C3620g.b(r2)
            if (r1 != 0) goto L_0x0092
            if (r2 == 0) goto L_0x0099
        L_0x0092:
            F3.a r1 = o4.g.c(r1, r2)
            r0.c(r1)
        L_0x0099:
            j4.n r4 = r4.f36094b
            j4.o r4 = r4.l()
            m4.a r4 = j4.C3620g.a(r4)
            r0.d(r4)
            a4.h r4 = new a4.h
            r1 = 0
            r4.<init>(r0, r1)
            return r4
        L_0x00ad:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to decode GIF."
            r4.<init>(r0)
            throw r4
        L_0x00b5:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            wf.C6763c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C3126t.b(a4.t):a4.h");
    }

    public Object decode(C6658d dVar) {
        return C5594t0.c((g) null, new C3125s(this), dVar, 1, (Object) null);
    }

    /* renamed from: a4.t$b */
    public static final class b implements C3117j.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f36096a;

        public b(boolean z10) {
            this.f36096a = z10;
        }

        public C3117j create(m mVar, C3627n nVar, X3.g gVar) {
            if (!r.c(C3116i.f36055a, mVar.c().n())) {
                return null;
            }
            return new C3126t(mVar.c(), nVar, this.f36096a);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return b.class.hashCode();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }
}
