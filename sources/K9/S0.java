package k9;

import android.os.Bundle;
import ja.C3645a;
import ja.M;
import k9.C3700i;

public final class S0 implements C3700i {

    /* renamed from: d  reason: collision with root package name */
    public static final S0 f45372d = new S0(1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final C3700i.a f45373e = new R0();

    /* renamed from: a  reason: collision with root package name */
    public final float f45374a;

    /* renamed from: b  reason: collision with root package name */
    public final float f45375b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45376c;

    public S0(float f10) {
        this(f10, 1.0f);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ S0 d(Bundle bundle) {
        return new S0(bundle.getFloat(c(0), 1.0f), bundle.getFloat(c(1), 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f45376c);
    }

    public S0 e(float f10) {
        return new S0(f10, this.f45375b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        S0 s02 = (S0) obj;
        if (this.f45374a == s02.f45374a && this.f45375b == s02.f45375b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f45374a)) * 31) + Float.floatToRawIntBits(this.f45375b);
    }

    public String toString() {
        return M.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f45374a), Float.valueOf(this.f45375b));
    }

    public S0(float f10, float f11) {
        boolean z10 = false;
        C3645a.a(f10 > 0.0f);
        C3645a.a(f11 > 0.0f ? true : z10);
        this.f45374a = f10;
        this.f45375b = f11;
        this.f45376c = Math.round(f10 * 1000.0f);
    }
}
