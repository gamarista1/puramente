package ka;

import android.os.Bundle;
import k9.C3700i;

public final class y implements C3700i {

    /* renamed from: e  reason: collision with root package name */
    public static final y f46095e = new y(0, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final C3700i.a f46096f = new x();

    /* renamed from: a  reason: collision with root package name */
    public final int f46097a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46098b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46099c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46100d;

    public y(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ y c(Bundle bundle) {
        return new y(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f46097a == yVar.f46097a && this.f46098b == yVar.f46098b && this.f46099c == yVar.f46099c && this.f46100d == yVar.f46100d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f46097a) * 31) + this.f46098b) * 31) + this.f46099c) * 31) + Float.floatToRawIntBits(this.f46100d);
    }

    public y(int i10, int i11, int i12, float f10) {
        this.f46097a = i10;
        this.f46098b = i11;
        this.f46099c = i12;
        this.f46100d = f10;
    }
}
