package h2;

import android.os.Bundle;
import i2.L;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final String f21238d = L.y0(0);

    /* renamed from: e  reason: collision with root package name */
    private static final String f21239e = L.y0(1);

    /* renamed from: f  reason: collision with root package name */
    private static final String f21240f = L.y0(2);

    /* renamed from: a  reason: collision with root package name */
    public int f21241a;

    /* renamed from: b  reason: collision with root package name */
    public int f21242b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21243c;

    public g(int i10, int i11, int i12) {
        this.f21241a = i10;
        this.f21242b = i11;
        this.f21243c = i12;
    }

    public static g a(Bundle bundle) {
        return new g(bundle.getInt(f21238d), bundle.getInt(f21239e), bundle.getInt(f21240f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f21238d, this.f21241a);
        bundle.putInt(f21239e, this.f21242b);
        bundle.putInt(f21240f, this.f21243c);
        return bundle;
    }
}
