package f2;

import i2.C2076a;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final C1974i f20132a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20133b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20134c;

    /* renamed from: d  reason: collision with root package name */
    public final float f20135d;

    /* renamed from: e  reason: collision with root package name */
    public final long f20136e;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C1974i f20137a;

        /* renamed from: b  reason: collision with root package name */
        private int f20138b;

        /* renamed from: c  reason: collision with root package name */
        private int f20139c;

        /* renamed from: d  reason: collision with root package name */
        private float f20140d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        private long f20141e;

        public b(C1974i iVar, int i10, int i11) {
            this.f20137a = iVar;
            this.f20138b = i10;
            this.f20139c = i11;
        }

        public t a() {
            return new t(this.f20137a, this.f20138b, this.f20139c, this.f20140d, this.f20141e);
        }

        public b b(float f10) {
            this.f20140d = f10;
            return this;
        }
    }

    private t(C1974i iVar, int i10, int i11, float f10, long j10) {
        boolean z10 = false;
        boolean z11 = i10 > 0;
        C2076a.b(z11, "width must be positive, but is: " + i10);
        z10 = i11 > 0 ? true : z10;
        C2076a.b(z10, "height must be positive, but is: " + i11);
        this.f20132a = iVar;
        this.f20133b = i10;
        this.f20134c = i11;
        this.f20135d = f10;
        this.f20136e = j10;
    }
}
