package retrofit2;

import Gh.C5404e;
import Gh.C5405f;
import java.util.regex.Pattern;
import rh.C;
import rh.s;
import rh.u;
import rh.v;
import rh.y;
import rh.z;

final class D {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f72793l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f72794m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    private final String f72795a;

    /* renamed from: b  reason: collision with root package name */
    private final v f72796b;

    /* renamed from: c  reason: collision with root package name */
    private String f72797c;

    /* renamed from: d  reason: collision with root package name */
    private v.a f72798d;

    /* renamed from: e  reason: collision with root package name */
    private final C.a f72799e = new C.a();

    /* renamed from: f  reason: collision with root package name */
    private final u.a f72800f;

    /* renamed from: g  reason: collision with root package name */
    private y f72801g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f72802h;

    /* renamed from: i  reason: collision with root package name */
    private z.a f72803i;

    /* renamed from: j  reason: collision with root package name */
    private s.a f72804j;

    /* renamed from: k  reason: collision with root package name */
    private rh.D f72805k;

    private static class a extends rh.D {

        /* renamed from: a  reason: collision with root package name */
        private final rh.D f72806a;

        /* renamed from: b  reason: collision with root package name */
        private final y f72807b;

        a(rh.D d10, y yVar) {
            this.f72806a = d10;
            this.f72807b = yVar;
        }

        public long contentLength() {
            return this.f72806a.contentLength();
        }

        public y contentType() {
            return this.f72807b;
        }

        public void writeTo(C5405f fVar) {
            this.f72806a.writeTo(fVar);
        }
    }

    D(String str, v vVar, String str2, u uVar, y yVar, boolean z10, boolean z11, boolean z12) {
        this.f72795a = str;
        this.f72796b = vVar;
        this.f72797c = str2;
        this.f72801g = yVar;
        this.f72802h = z10;
        if (uVar != null) {
            this.f72800f = uVar.n();
        } else {
            this.f72800f = new u.a();
        }
        if (z11) {
            this.f72804j = new s.a();
        } else if (z12) {
            z.a aVar = new z.a();
            this.f72803i = aVar;
            aVar.f(z.f73511k);
        }
    }

    private static String i(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                C5404e eVar = new C5404e();
                eVar.a0(str, 0, i10);
                j(eVar, str, i10, length, z10);
                return eVar.p1();
            }
            i10 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(C5404e eVar, String str, int i10, int i11, boolean z10) {
        C5404e eVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new C5404e();
                    }
                    eVar2.I1(codePointAt);
                    while (!eVar2.J0()) {
                        byte readByte = eVar2.readByte();
                        eVar.K0(37);
                        char[] cArr = f72793l;
                        eVar.K0(cArr[((readByte & 255) >> 4) & 15]);
                        eVar.K0(cArr[readByte & 15]);
                    }
                } else {
                    eVar.I1(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f72804j.b(str, str2);
        } else {
            this.f72804j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z10) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f72801g = y.e(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e10);
            }
        } else if (z10) {
            this.f72800f.e(str, str2);
        } else {
            this.f72800f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar) {
        this.f72800f.b(uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(u uVar, rh.D d10) {
        this.f72803i.c(uVar, d10);
    }

    /* access modifiers changed from: package-private */
    public void e(z.c cVar) {
        this.f72803i.d(cVar);
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z10) {
        if (this.f72797c != null) {
            String i10 = i(str2, z10);
            String str3 = this.f72797c;
            String replace = str3.replace("{" + str + "}", i10);
            if (!f72794m.matcher(replace).matches()) {
                this.f72797c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void g(String str, String str2, boolean z10) {
        String str3 = this.f72797c;
        if (str3 != null) {
            v.a l10 = this.f72796b.l(str3);
            this.f72798d = l10;
            if (l10 != null) {
                this.f72797c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f72796b + ", Relative: " + this.f72797c);
            }
        }
        if (z10) {
            this.f72798d.a(str, str2);
        } else {
            this.f72798d.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Class cls, Object obj) {
        this.f72799e.j(cls, obj);
    }

    /* access modifiers changed from: package-private */
    public C.a k() {
        v vVar;
        v.a aVar = this.f72798d;
        if (aVar != null) {
            vVar = aVar.c();
        } else {
            vVar = this.f72796b.r(this.f72797c);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f72796b + ", Relative: " + this.f72797c);
            }
        }
        a aVar2 = this.f72805k;
        if (aVar2 == null) {
            s.a aVar3 = this.f72804j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                z.a aVar4 = this.f72803i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.f72802h) {
                    aVar2 = rh.D.create((y) null, new byte[0]);
                }
            }
        }
        y yVar = this.f72801g;
        if (yVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, yVar);
            } else {
                this.f72800f.a("Content-Type", yVar.toString());
            }
        }
        return this.f72799e.n(vVar).f(this.f72800f.f()).g(this.f72795a, aVar2);
    }

    /* access modifiers changed from: package-private */
    public void l(rh.D d10) {
        this.f72805k = d10;
    }

    /* access modifiers changed from: package-private */
    public void m(Object obj) {
        this.f72797c = obj.toString();
    }
}
