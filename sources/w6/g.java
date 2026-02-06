package W6;

import b6.C3157b;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34902e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f34903a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34904b;

    /* renamed from: c  reason: collision with root package name */
    public final float f34905c;

    /* renamed from: d  reason: collision with root package name */
    public final float f34906d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f34903a = i10;
        this.f34904b = i11;
        this.f34905c = f10;
        this.f34906d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f34903a == gVar.f34903a && this.f34904b == gVar.f34904b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C3157b.a(this.f34903a, this.f34904b);
    }

    public String toString() {
        U u10 = U.f71764a;
        String format = String.format((Locale) null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f34903a), Integer.valueOf(this.f34904b)}, 2));
        C6496s.g(format, "format(...)");
        return format;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}
