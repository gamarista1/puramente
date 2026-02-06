package la;

import ja.B;
import ja.M;
import java.nio.ByteBuffer;
import k9.C3694f;
import k9.C3717q0;
import k9.b1;
import n9.C3871g;

public final class b extends C3694f {

    /* renamed from: n  reason: collision with root package name */
    private final C3871g f46365n = new C3871g(1);

    /* renamed from: o  reason: collision with root package name */
    private final B f46366o = new B();

    /* renamed from: p  reason: collision with root package name */
    private long f46367p;

    /* renamed from: q  reason: collision with root package name */
    private a f46368q;

    /* renamed from: r  reason: collision with root package name */
    private long f46369r;

    public b() {
        super(6);
    }

    private float[] X(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f46366o.N(byteBuffer.array(), byteBuffer.limit());
        this.f46366o.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f46366o.q());
        }
        return fArr;
    }

    private void Y() {
        a aVar = this.f46368q;
        if (aVar != null) {
            aVar.c();
        }
    }

    /* access modifiers changed from: protected */
    public void N() {
        Y();
    }

    /* access modifiers changed from: protected */
    public void P(long j10, boolean z10) {
        this.f46369r = Long.MIN_VALUE;
        Y();
    }

    /* access modifiers changed from: protected */
    public void T(C3717q0[] q0VarArr, long j10, long j11) {
        this.f46367p = j11;
    }

    public int a(C3717q0 q0Var) {
        if ("application/x-camera-motion".equals(q0Var.f45770l)) {
            return b1.o(4);
        }
        return b1.o(0);
    }

    public boolean b() {
        return h();
    }

    public boolean d() {
        return true;
    }

    public void g(long j10, long j11) {
        while (!h() && this.f46369r < 100000 + j10) {
            this.f46365n.i();
            if (U(I(), this.f46365n, 0) == -4 && !this.f46365n.p()) {
                C3871g gVar = this.f46365n;
                this.f46369r = gVar.f46952e;
                if (this.f46368q != null && !gVar.o()) {
                    this.f46365n.y();
                    float[] X10 = X((ByteBuffer) M.j(this.f46365n.f46950c));
                    if (X10 != null) {
                        ((a) M.j(this.f46368q)).a(this.f46369r - this.f46367p, X10);
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

    public void p(int i10, Object obj) {
        if (i10 == 8) {
            this.f46368q = (a) obj;
        } else {
            super.p(i10, obj);
        }
    }
}
