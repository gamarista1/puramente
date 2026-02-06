package rh;

import Gh.C5405f;
import Gh.C5407h;
import Sg.C5541d;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import rh.y;
import sh.C6726e;

public abstract class D {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: rh.D$a$a  reason: collision with other inner class name */
        public static final class C1060a extends D {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f73145a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ File f73146b;

            C1060a(y yVar, File file) {
                this.f73145a = yVar;
                this.f73146b = file;
            }

            public long contentLength() {
                return this.f73146b.length();
            }

            public y contentType() {
                return this.f73145a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
                wf.C6763c.a(r0, r3);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void writeTo(Gh.C5405f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "sink"
                    kotlin.jvm.internal.C6496s.h(r3, r0)
                    java.io.File r0 = r2.f73146b
                    Gh.W r0 = Gh.H.k(r0)
                    r3.K(r0)     // Catch:{ all -> 0x0013 }
                    r3 = 0
                    wf.C6763c.a(r0, r3)
                    return
                L_0x0013:
                    r3 = move-exception
                    throw r3     // Catch:{ all -> 0x0015 }
                L_0x0015:
                    r1 = move-exception
                    wf.C6763c.a(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: rh.D.a.C1060a.writeTo(Gh.f):void");
            }
        }

        public static final class b extends D {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f73147a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5407h f73148b;

            b(y yVar, C5407h hVar) {
                this.f73147a = yVar;
                this.f73148b = hVar;
            }

            public long contentLength() {
                return (long) this.f73148b.O();
            }

            public y contentType() {
                return this.f73147a;
            }

            public void writeTo(C5405f fVar) {
                C6496s.h(fVar, "sink");
                fVar.k0(this.f73148b);
            }
        }

        public static final class c extends D {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ y f73149a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f73150b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ byte[] f73151c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f73152d;

            c(y yVar, int i10, byte[] bArr, int i11) {
                this.f73149a = yVar;
                this.f73150b = i10;
                this.f73151c = bArr;
                this.f73152d = i11;
            }

            public long contentLength() {
                return (long) this.f73150b;
            }

            public y contentType() {
                return this.f73149a;
            }

            public void writeTo(C5405f fVar) {
                C6496s.h(fVar, "sink");
                fVar.c1(this.f73151c, this.f73152d, this.f73150b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ D n(a aVar, String str, y yVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                yVar = null;
            }
            return aVar.c(str, yVar);
        }

        public static /* synthetic */ D o(a aVar, y yVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.i(yVar, bArr, i10, i11);
        }

        public static /* synthetic */ D p(a aVar, byte[] bArr, y yVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                yVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m(bArr, yVar, i10, i11);
        }

        public final D a(C5407h hVar, y yVar) {
            C6496s.h(hVar, "<this>");
            return new b(yVar, hVar);
        }

        public final D b(File file, y yVar) {
            C6496s.h(file, "<this>");
            return new C1060a(yVar, file);
        }

        public final D c(String str, y yVar) {
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
            byte[] bytes = str.getBytes(charset);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, yVar, 0, bytes.length);
        }

        public final D d(y yVar, C5407h hVar) {
            C6496s.h(hVar, "content");
            return a(hVar, yVar);
        }

        public final D e(y yVar, File file) {
            C6496s.h(file, "file");
            return b(file, yVar);
        }

        public final D f(y yVar, String str) {
            C6496s.h(str, "content");
            return c(str, yVar);
        }

        public final D g(y yVar, byte[] bArr) {
            C6496s.h(bArr, "content");
            return o(this, yVar, bArr, 0, 0, 12, (Object) null);
        }

        public final D h(y yVar, byte[] bArr, int i10) {
            C6496s.h(bArr, "content");
            return o(this, yVar, bArr, i10, 0, 8, (Object) null);
        }

        public final D i(y yVar, byte[] bArr, int i10, int i11) {
            C6496s.h(bArr, "content");
            return m(bArr, yVar, i10, i11);
        }

        public final D j(byte[] bArr) {
            C6496s.h(bArr, "<this>");
            return p(this, bArr, (y) null, 0, 0, 7, (Object) null);
        }

        public final D k(byte[] bArr, y yVar) {
            C6496s.h(bArr, "<this>");
            return p(this, bArr, yVar, 0, 0, 6, (Object) null);
        }

        public final D l(byte[] bArr, y yVar, int i10) {
            C6496s.h(bArr, "<this>");
            return p(this, bArr, yVar, i10, 0, 4, (Object) null);
        }

        public final D m(byte[] bArr, y yVar, int i10, int i11) {
            C6496s.h(bArr, "<this>");
            C6726e.l((long) bArr.length, (long) i10, (long) i11);
            return new c(yVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    public static final D create(C5407h hVar, y yVar) {
        return Companion.a(hVar, yVar);
    }

    public abstract long contentLength();

    public abstract y contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(C5405f fVar);

    public static final D create(File file, y yVar) {
        return Companion.b(file, yVar);
    }

    public static final D create(String str, y yVar) {
        return Companion.c(str, yVar);
    }

    @C6521e
    public static final D create(y yVar, C5407h hVar) {
        return Companion.d(yVar, hVar);
    }

    @C6521e
    public static final D create(y yVar, File file) {
        return Companion.e(yVar, file);
    }

    @C6521e
    public static final D create(y yVar, String str) {
        return Companion.f(yVar, str);
    }

    @C6521e
    public static final D create(y yVar, byte[] bArr) {
        return Companion.g(yVar, bArr);
    }

    @C6521e
    public static final D create(y yVar, byte[] bArr, int i10) {
        return Companion.h(yVar, bArr, i10);
    }

    @C6521e
    public static final D create(y yVar, byte[] bArr, int i10, int i11) {
        return Companion.i(yVar, bArr, i10, i11);
    }

    public static final D create(byte[] bArr) {
        return Companion.j(bArr);
    }

    public static final D create(byte[] bArr, y yVar) {
        return Companion.k(bArr, yVar);
    }

    public static final D create(byte[] bArr, y yVar, int i10) {
        return Companion.l(bArr, yVar, i10);
    }

    public static final D create(byte[] bArr, y yVar, int i10, int i11) {
        return Companion.m(bArr, yVar, i10, i11);
    }
}
