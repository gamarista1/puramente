package rh;

import Gh.C5404e;
import Gh.C5406g;
import Sg.C5541d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import rh.y;
import sh.C6726e;

public abstract class F implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final b f73180b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private Reader f73181a;

    public static final class a extends Reader {

        /* renamed from: a  reason: collision with root package name */
        private final C5406g f73182a;

        /* renamed from: b  reason: collision with root package name */
        private final Charset f73183b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f73184c;

        /* renamed from: d  reason: collision with root package name */
        private Reader f73185d;

        public a(C5406g gVar, Charset charset) {
            C6496s.h(gVar, "source");
            C6496s.h(charset, "charset");
            this.f73182a = gVar;
            this.f73183b = charset;
        }

        public void close() {
            C6514M m10;
            this.f73184c = true;
            Reader reader = this.f73185d;
            if (reader != null) {
                reader.close();
                m10 = C6514M.f71813a;
            } else {
                m10 = null;
            }
            if (m10 == null) {
                this.f73182a.close();
            }
        }

        public int read(char[] cArr, int i10, int i11) {
            C6496s.h(cArr, "cbuf");
            if (!this.f73184c) {
                Reader reader = this.f73185d;
                if (reader == null) {
                    reader = new InputStreamReader(this.f73182a.x1(), C6726e.J(this.f73182a, this.f73183b));
                    this.f73185d = reader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class b {

        public static final class a extends F {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ y f73186c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f73187d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5406g f73188e;

            a(y yVar, long j10, C5406g gVar) {
                this.f73186c = yVar;
                this.f73187d = j10;
                this.f73188e = gVar;
            }

            public long o() {
                return this.f73187d;
            }

            public y q() {
                return this.f73186c;
            }

            public C5406g y() {
                return this.f73188e;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ F f(b bVar, C5406g gVar, y yVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                yVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.a(gVar, yVar, j10);
        }

        public static /* synthetic */ F g(b bVar, byte[] bArr, y yVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                yVar = null;
            }
            return bVar.e(bArr, yVar);
        }

        public final F a(C5406g gVar, y yVar, long j10) {
            C6496s.h(gVar, "<this>");
            return new a(yVar, j10, gVar);
        }

        public final F b(String str, y yVar) {
            C6496s.h(str, "<this>");
            Charset charset = C5541d.f65029b;
            if (yVar != null) {
                Charset d10 = y.d(yVar, (Charset) null, 1, (Object) null);
                if (d10 == null) {
                    y.a aVar = y.f73499e;
                    yVar = aVar.b(yVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            C5404e F12 = new C5404e().F1(str, charset);
            return a(F12, yVar, F12.B0());
        }

        public final F c(y yVar, long j10, C5406g gVar) {
            C6496s.h(gVar, "content");
            return a(gVar, yVar, j10);
        }

        public final F d(y yVar, String str) {
            C6496s.h(str, "content");
            return b(str, yVar);
        }

        public final F e(byte[] bArr, y yVar) {
            C6496s.h(bArr, "<this>");
            return a(new C5404e().n0(bArr), yVar, (long) bArr.length);
        }

        private b() {
        }
    }

    private final Charset n() {
        Charset c10;
        y q10 = q();
        if (q10 == null || (c10 = q10.c(C5541d.f65029b)) == null) {
            return C5541d.f65029b;
        }
        return c10;
    }

    public static final F t(y yVar, long j10, C5406g gVar) {
        return f73180b.c(yVar, j10, gVar);
    }

    public static final F v(y yVar, String str) {
        return f73180b.d(yVar, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        wf.C6763c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String E() {
        /*
            r3 = this;
            Gh.g r0 = r3.y()
            java.nio.charset.Charset r1 = r3.n()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = sh.C6726e.J(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.b1(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            wf.C6763c.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            wf.C6763c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.F.E():java.lang.String");
    }

    public final InputStream a() {
        return y().x1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        wf.C6763c.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] b() {
        /*
            r6 = this;
            long r0 = r6.o()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            Gh.g r2 = r6.y()
            byte[] r3 = r2.H0()     // Catch:{ all -> 0x0049 }
            r4 = 0
            wf.C6763c.a(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0048
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0048:
            return r3
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            wf.C6763c.a(r2, r0)
            throw r1
        L_0x0050:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.F.b():byte[]");
    }

    public void close() {
        C6726e.m(y());
    }

    public final Reader f() {
        Reader reader = this.f73181a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(y(), n());
        this.f73181a = aVar;
        return aVar;
    }

    public abstract long o();

    public abstract y q();

    public abstract C5406g y();
}
