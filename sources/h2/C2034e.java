package h2;

import android.os.Bundle;
import i2.C2076a;
import i2.L;

/* renamed from: h2.e  reason: case insensitive filesystem */
public final class C2034e {

    /* renamed from: c  reason: collision with root package name */
    private static final String f21234c = L.y0(0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f21235d = L.y0(1);

    /* renamed from: a  reason: collision with root package name */
    public final String f21236a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21237b;

    public C2034e(String str, int i10) {
        this.f21236a = str;
        this.f21237b = i10;
    }

    public static C2034e a(Bundle bundle) {
        return new C2034e((String) C2076a.e(bundle.getString(f21234c)), bundle.getInt(f21235d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f21234c, this.f21236a);
        bundle.putInt(f21235d, this.f21237b);
        return bundle;
    }
}
