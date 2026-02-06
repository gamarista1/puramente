package s0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s0.c  reason: case insensitive filesystem */
public abstract class C2581c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f25790d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f25791a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25792b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25793c;

    /* renamed from: s0.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C2581c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public final int a() {
        return C2580b.f(this.f25792b);
    }

    public final int b() {
        return this.f25793c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f25792b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2581c cVar = (C2581c) obj;
        if (this.f25793c == cVar.f25793c && C6496s.c(this.f25791a, cVar.f25791a)) {
            return C2580b.e(this.f25792b, cVar.f25792b);
        }
        return false;
    }

    public final String f() {
        return this.f25791a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f25791a.hashCode() * 31) + C2580b.g(this.f25792b)) * 31) + this.f25793c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, C2581c cVar);

    public String toString() {
        return this.f25791a + " (id=" + this.f25793c + ", model=" + C2580b.h(this.f25792b) + ')';
    }

    private C2581c(String str, long j10, int i10) {
        this.f25791a = str;
        this.f25792b = j10;
        this.f25793c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
