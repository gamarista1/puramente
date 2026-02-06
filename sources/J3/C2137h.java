package j3;

import android.os.Bundle;
import kotlin.jvm.internal.C6496s;

/* renamed from: j3.h  reason: case insensitive filesystem */
public final class C2137h {

    /* renamed from: a  reason: collision with root package name */
    private final C2126C f22795a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f22796b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22797c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22798d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f22799e;

    /* renamed from: j3.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C2126C f22800a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f22801b;

        /* renamed from: c  reason: collision with root package name */
        private Object f22802c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22803d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f22804e;

        public final C2137h a() {
            C2126C c10 = this.f22800a;
            if (c10 == null) {
                c10 = C2126C.Companion.c(this.f22802c);
                C6496s.f(c10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new C2137h(c10, this.f22801b, this.f22802c, this.f22803d, this.f22804e);
        }

        public final a b(Object obj) {
            this.f22802c = obj;
            this.f22803d = true;
            return this;
        }

        public final a c(boolean z10) {
            this.f22801b = z10;
            return this;
        }

        public final a d(C2126C c10) {
            C6496s.h(c10, "type");
            this.f22800a = c10;
            return this;
        }
    }

    public C2137h(C2126C c10, boolean z10, Object obj, boolean z11, boolean z12) {
        boolean z13;
        C6496s.h(c10, "type");
        if (!c10.isNullableAllowed() && z10) {
            throw new IllegalArgumentException((c10.getName() + " does not allow nullable values").toString());
        } else if (z10 || !z11 || obj != null) {
            this.f22795a = c10;
            this.f22796b = z10;
            this.f22799e = obj;
            if (z11 || z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f22797c = z13;
            this.f22798d = z12;
        } else {
            throw new IllegalArgumentException(("Argument with type " + c10.getName() + " has null value but is not nullable.").toString());
        }
    }

    public final C2126C a() {
        return this.f22795a;
    }

    public final boolean b() {
        return this.f22797c;
    }

    public final boolean c() {
        return this.f22798d;
    }

    public final boolean d() {
        return this.f22796b;
    }

    public final void e(String str, Bundle bundle) {
        Object obj;
        C6496s.h(str, "name");
        C6496s.h(bundle, "bundle");
        if (this.f22797c && (obj = this.f22799e) != null) {
            this.f22795a.put(bundle, str, obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C6496s.c(C2137h.class, obj.getClass())) {
                C2137h hVar = (C2137h) obj;
                if (this.f22796b != hVar.f22796b || this.f22797c != hVar.f22797c || !C6496s.c(this.f22795a, hVar.f22795a)) {
                    return false;
                }
                Object obj2 = this.f22799e;
                if (obj2 != null) {
                    return C6496s.c(obj2, hVar.f22799e);
                }
                if (hVar.f22799e == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f(String str, Bundle bundle) {
        C6496s.h(str, "name");
        C6496s.h(bundle, "bundle");
        if (!this.f22796b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f22795a.get(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((this.f22795a.hashCode() * 31) + (this.f22796b ? 1 : 0)) * 31) + (this.f22797c ? 1 : 0)) * 31;
        Object obj = this.f22799e;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2137h.class.getSimpleName());
        sb2.append(" Type: " + this.f22795a);
        sb2.append(" Nullable: " + this.f22796b);
        if (this.f22797c) {
            sb2.append(" DefaultValue: " + this.f22799e);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }
}
