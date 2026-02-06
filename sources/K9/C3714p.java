package k9;

import android.os.Bundle;
import k9.C3700i;

/* renamed from: k9.p  reason: case insensitive filesystem */
public final class C3714p implements C3700i {

    /* renamed from: d  reason: collision with root package name */
    public static final C3714p f45746d = new C3714p(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final C3700i.a f45747e = new C3712o();

    /* renamed from: a  reason: collision with root package name */
    public final int f45748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45749b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45750c;

    public C3714p(int i10, int i11, int i12) {
        this.f45748a = i10;
        this.f45749b = i11;
        this.f45750c = i12;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C3714p c(Bundle bundle) {
        return new C3714p(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3714p)) {
            return false;
        }
        C3714p pVar = (C3714p) obj;
        if (this.f45748a == pVar.f45748a && this.f45749b == pVar.f45749b && this.f45750c == pVar.f45750c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f45748a) * 31) + this.f45749b) * 31) + this.f45750c;
    }
}
