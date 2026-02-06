package Ef;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c extends a implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62813e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final c f62814f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(k() == cVar.k() && n() == cVar.n())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (k() * 31) + n();
    }

    public boolean isEmpty() {
        if (C6496s.i(k(), n()) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public Character g() {
        return Character.valueOf(n());
    }

    public String toString() {
        return k() + ".." + n();
    }

    /* renamed from: v */
    public Character a() {
        return Character.valueOf(k());
    }
}
