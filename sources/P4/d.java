package P4;

import android.util.Log;
import com.google.android.gms.common.api.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f33439a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f33440b;

    /* renamed from: c  reason: collision with root package name */
    private c f33441c;

    /* renamed from: d  reason: collision with root package name */
    private int f33442d = 0;

    private boolean b() {
        if (this.f33441c.f33427b != 0) {
            return true;
        }
        return false;
    }

    private int d() {
        try {
            return this.f33440b.get() & 255;
        } catch (Exception unused) {
            this.f33441c.f33427b = 1;
            return 0;
        }
    }

    private void e() {
        boolean z10;
        this.f33441c.f33429d.f33415a = n();
        this.f33441c.f33429d.f33416b = n();
        this.f33441c.f33429d.f33417c = n();
        this.f33441c.f33429d.f33418d = n();
        int d10 = d();
        boolean z11 = false;
        if ((d10 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        b bVar = this.f33441c.f33429d;
        if ((d10 & 64) != 0) {
            z11 = true;
        }
        bVar.f33419e = z11;
        if (z10) {
            bVar.f33425k = g(pow);
        } else {
            bVar.f33425k = null;
        }
        this.f33441c.f33429d.f33424j = this.f33440b.position();
        r();
        if (!b()) {
            c cVar = this.f33441c;
            cVar.f33428c++;
            cVar.f33430e.add(cVar.f33429d);
        }
    }

    private void f() {
        int d10 = d();
        this.f33442d = d10;
        if (d10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f33442d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f33440b.get(this.f33439a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f33442d, e10);
                    }
                    this.f33441c.f33427b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f33440b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 2;
                i12 += 3;
                int i14 = i11 + 1;
                iArr[i11] = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | -16777216 | (bArr[i13] & 255);
                i11 = i14;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f33441c.f33427b = 1;
        }
        return iArr;
    }

    private void h() {
        i(a.e.API_PRIORITY_OTHER);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f33441c.f33428c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f33441c.f33429d = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f33439a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f33441c;
                if (cVar.f33429d == null) {
                    cVar.f33429d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f33441c.f33427b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        b bVar = this.f33441c.f33429d;
        int i10 = (d10 & 28) >> 2;
        bVar.f33421g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f33421g = 1;
        }
        if ((d10 & 1) == 0) {
            z10 = false;
        }
        bVar.f33420f = z10;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f33441c.f33429d;
        bVar2.f33423i = n10 * 10;
        bVar2.f33422h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f33441c.f33427b = 1;
            return;
        }
        l();
        if (this.f33441c.f33433h && !b()) {
            c cVar = this.f33441c;
            cVar.f33426a = g(cVar.f33434i);
            c cVar2 = this.f33441c;
            cVar2.f33437l = cVar2.f33426a[cVar2.f33435j];
        }
    }

    private void l() {
        boolean z10;
        this.f33441c.f33431f = n();
        this.f33441c.f33432g = n();
        int d10 = d();
        c cVar = this.f33441c;
        if ((d10 & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f33433h = z10;
        cVar.f33434i = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        this.f33441c.f33435j = d();
        this.f33441c.f33436k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.f33439a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            P4.c r2 = r3.f33441c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f33438m = r0
        L_0x001b:
            int r0 = r3.f33442d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.d.m():void");
    }

    private int n() {
        return this.f33440b.getShort();
    }

    private void o() {
        this.f33440b = null;
        Arrays.fill(this.f33439a, (byte) 0);
        this.f33441c = new c();
        this.f33442d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f33440b.position(Math.min(this.f33440b.position() + d10, this.f33440b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f33440b = null;
        this.f33441c = null;
    }

    public c c() {
        if (this.f33440b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.f33441c;
        } else {
            k();
            if (!b()) {
                h();
                c cVar = this.f33441c;
                if (cVar.f33428c < 0) {
                    cVar.f33427b = 1;
                }
            }
            return this.f33441c;
        }
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f33440b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f33440b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
