package S9;

import android.text.TextUtils;
import fa.i;
import ja.B;
import ja.C3645a;
import ja.I;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.C3717q0;
import k9.L0;
import q9.C3962B;
import q9.k;
import q9.l;
import q9.m;
import q9.y;
import q9.z;

public final class t implements k {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f34135g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f34136h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f34137a;

    /* renamed from: b  reason: collision with root package name */
    private final I f34138b;

    /* renamed from: c  reason: collision with root package name */
    private final B f34139c = new B();

    /* renamed from: d  reason: collision with root package name */
    private m f34140d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f34141e = new byte[1024];

    /* renamed from: f  reason: collision with root package name */
    private int f34142f;

    public t(String str, I i10) {
        this.f34137a = str;
        this.f34138b = i10;
    }

    private C3962B b(long j10) {
        C3962B d10 = this.f34140d.d(0, 3);
        d10.c(new C3717q0.b().e0("text/vtt").V(this.f34137a).i0(j10).E());
        this.f34140d.k();
        return d10;
    }

    private void c() {
        B b10 = new B(this.f34141e);
        i.e(b10);
        long j10 = 0;
        long j11 = 0;
        for (String p10 = b10.p(); !TextUtils.isEmpty(p10); p10 = b10.p()) {
            if (p10.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f34135g.matcher(p10);
                if (matcher.find()) {
                    Matcher matcher2 = f34136h.matcher(p10);
                    if (matcher2.find()) {
                        j11 = i.d((String) C3645a.e(matcher.group(1)));
                        j10 = I.f(Long.parseLong((String) C3645a.e(matcher2.group(1))));
                    } else {
                        throw L0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + p10, (Throwable) null);
                    }
                } else {
                    throw L0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + p10, (Throwable) null);
                }
            }
        }
        Matcher a10 = i.a(b10);
        if (a10 == null) {
            b(0);
            return;
        }
        long d10 = i.d((String) C3645a.e(a10.group(1)));
        long b11 = this.f34138b.b(I.j((j10 + d10) - j11));
        C3962B b12 = b(b11 - d10);
        this.f34139c.N(this.f34141e, this.f34142f);
        b12.d(this.f34139c, this.f34142f);
        b12.f(b11, 1, this.f34142f, 0, (C3962B.a) null);
    }

    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    public void f(m mVar) {
        this.f34140d = mVar;
        mVar.q(new z.b(-9223372036854775807L));
    }

    public boolean h(l lVar) {
        lVar.c(this.f34141e, 0, 6, false);
        this.f34139c.N(this.f34141e, 6);
        if (i.b(this.f34139c)) {
            return true;
        }
        lVar.c(this.f34141e, 6, 3, false);
        this.f34139c.N(this.f34141e, 9);
        return i.b(this.f34139c);
    }

    public int i(l lVar, y yVar) {
        int i10;
        C3645a.e(this.f34140d);
        int a10 = (int) lVar.a();
        int i11 = this.f34142f;
        byte[] bArr = this.f34141e;
        if (i11 == bArr.length) {
            if (a10 != -1) {
                i10 = a10;
            } else {
                i10 = bArr.length;
            }
            this.f34141e = Arrays.copyOf(bArr, (i10 * 3) / 2);
        }
        byte[] bArr2 = this.f34141e;
        int i12 = this.f34142f;
        int read = lVar.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f34142f + read;
            this.f34142f = i13;
            if (a10 == -1 || i13 != a10) {
                return 0;
            }
        }
        c();
        return -1;
    }

    public void release() {
    }
}
