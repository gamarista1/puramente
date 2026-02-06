package Ac;

import android.os.Bundle;
import uc.C5233a;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final C5233a f50238b = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f50239a;

    public f() {
        this(new Bundle());
    }

    private g d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f50239a.get(str));
        } catch (ClassCastException e10) {
            f50238b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        if (str == null || !this.f50239a.containsKey(str)) {
            return false;
        }
        return true;
    }

    public g b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f50239a.get(str));
        } catch (ClassCastException e10) {
            f50238b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f50239a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f50238b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public g e(String str) {
        g d10 = d(str);
        if (d10.d()) {
            return g.e(Long.valueOf((long) ((Integer) d10.c()).intValue()));
        }
        return g.a();
    }

    public f(Bundle bundle) {
        this.f50239a = (Bundle) bundle.clone();
    }
}
