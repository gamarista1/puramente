package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import x1.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f15965a;

    /* renamed from: b  reason: collision with root package name */
    private final LocusId f15966b;

    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }

        static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public e(String str) {
        this.f15965a = (String) g.i(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15966b = a.a(str);
        } else {
            this.f15966b = null;
        }
    }

    private String b() {
        int length = this.f15965a.length();
        return length + "_chars";
    }

    public static e d(LocusId locusId) {
        g.g(locusId, "locusId cannot be null");
        return new e((String) g.i(a.b(locusId), "id cannot be empty"));
    }

    public String a() {
        return this.f15965a;
    }

    public LocusId c() {
        return this.f15966b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f15965a;
        if (str != null) {
            return str.equals(eVar.f15965a);
        }
        if (eVar.f15965a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f15965a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return 31 + i10;
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
