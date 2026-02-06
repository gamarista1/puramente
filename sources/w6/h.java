package W6;

import b6.C3157b;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34907c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h f34908d = new h(-1, false);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h f34909e = new h(-2, false);

    /* renamed from: f  reason: collision with root package name */
    private static final h f34910f = new h(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f34911a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34912b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f34908d;
        }

        public final h b() {
            return h.f34909e;
        }

        private a() {
        }
    }

    private h(int i10, boolean z10) {
        this.f34911a = i10;
        this.f34912b = z10;
    }

    public static final h c() {
        return f34907c.a();
    }

    public static final h e() {
        return f34907c.b();
    }

    public final boolean d() {
        return this.f34912b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f34911a == hVar.f34911a && this.f34912b == hVar.f34912b) {
            return true;
        }
        return false;
    }

    public final int f() {
        if (!h()) {
            return this.f34911a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public final boolean g() {
        if (this.f34911a != -2) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f34911a == -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C3157b.b(Integer.valueOf(this.f34911a), Boolean.valueOf(this.f34912b));
    }

    public String toString() {
        U u10 = U.f71764a;
        String format = String.format((Locale) null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f34911a), Boolean.valueOf(this.f34912b)}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }
}
