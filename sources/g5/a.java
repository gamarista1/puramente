package G5;

import Ef.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import mf.L;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0513a f31461d = new C0513a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private int[] f31462a;

    /* renamed from: b  reason: collision with root package name */
    private int f31463b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f31464c;

    /* renamed from: G5.a$a  reason: collision with other inner class name */
    public static final class C0513a {
        public /* synthetic */ C0513a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(int[] iArr) {
            if (iArr.length != 0) {
                int i10 = iArr[0];
                L t10 = new i(1, C6559l.h0(iArr)).iterator();
                while (t10.hasNext()) {
                    i10 *= iArr[t10.a()];
                }
                return i10;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }

        private C0513a() {
        }
    }

    public a(int[] iArr) {
        C6496s.h(iArr, "shape");
        this.f31462a = iArr;
        int a10 = f31461d.b(iArr);
        this.f31463b = a10;
        this.f31464c = new float[a10];
    }

    public final float[] a() {
        return this.f31464c;
    }

    public final int b(int i10) {
        return this.f31462a[i10];
    }

    public final int c() {
        return this.f31462a.length;
    }

    public final void d(int[] iArr) {
        C6496s.h(iArr, "shape");
        this.f31462a = iArr;
        int a10 = f31461d.b(iArr);
        float[] fArr = new float[a10];
        System.arraycopy(this.f31464c, 0, fArr, 0, Math.min(this.f31463b, a10));
        this.f31464c = fArr;
        this.f31463b = a10;
    }
}
