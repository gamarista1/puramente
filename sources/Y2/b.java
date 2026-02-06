package y2;

import androidx.media3.exoplayer.C1806d;
import androidx.media3.exoplayer.r0;
import f2.s;
import i2.C2073A;
import i2.L;
import java.nio.ByteBuffer;
import l2.f;
import t2.C2615C;

public final class b extends C1806d {

    /* renamed from: r  reason: collision with root package name */
    private final f f28632r = new f(1);

    /* renamed from: s  reason: collision with root package name */
    private final C2073A f28633s = new C2073A();

    /* renamed from: t  reason: collision with root package name */
    private long f28634t;

    /* renamed from: u  reason: collision with root package name */
    private C2935a f28635u;

    /* renamed from: v  reason: collision with root package name */
    private long f28636v;

    public b() {
        super(6);
    }

    private float[] p0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f28633s.S(byteBuffer.array(), byteBuffer.limit());
        this.f28633s.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f28633s.u());
        }
        return fArr;
    }

    private void q0() {
        C2935a aVar = this.f28635u;
        if (aVar != null) {
            aVar.c();
        }
    }

    public int a(s sVar) {
        if ("application/x-camera-motion".equals(sVar.f20083n)) {
            return r0.o(4);
        }
        return r0.o(0);
    }

    public boolean b() {
        return h();
    }

    /* access modifiers changed from: protected */
    public void b0() {
        q0();
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        this.f28636v = Long.MIN_VALUE;
        q0();
    }

    public void g(long j10, long j11) {
        while (!h() && this.f28636v < 100000 + j10) {
            this.f28632r.i();
            boolean z10 = false;
            if (m0(V(), this.f28632r, 0) == -4 && !this.f28632r.m()) {
                long j12 = this.f28632r.f23522f;
                this.f28636v = j12;
                if (j12 < X()) {
                    z10 = true;
                }
                if (this.f28635u != null && !z10) {
                    this.f28632r.x();
                    float[] p02 = p0((ByteBuffer) L.h(this.f28632r.f23520d));
                    if (p02 != null) {
                        ((C2935a) L.h(this.f28635u)).a(this.f28636v - this.f28634t, p02);
                    }
                }
            } else {
                return;
            }
        }
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    /* access modifiers changed from: protected */
    public void k0(s[] sVarArr, long j10, long j11, C2615C.b bVar) {
        this.f28634t = j11;
    }

    public void p(int i10, Object obj) {
        if (i10 == 8) {
            this.f28635u = (C2935a) obj;
        } else {
            super.p(i10, obj);
        }
    }
}
