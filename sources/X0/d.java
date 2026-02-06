package X0;

import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9566b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Locale f9567a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Locale locale) {
        this.f9567a = locale;
    }

    public final Locale a() {
        return this.f9567a;
    }

    public final String b() {
        return h.a(this.f9567a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C6496s.c(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    public d(String str) {
        this(g.a().c(str));
    }
}
