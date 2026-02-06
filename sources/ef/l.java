package Ef;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l extends j implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62835e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final l f62836f = new l(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(long j10, long j11) {
        super(j10, j11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (!(k() == lVar.k() && n() == lVar.n())) {
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
        return (int) ((((long) 31) * (k() ^ (k() >>> 32))) + (n() ^ (n() >>> 32)));
    }

    public boolean isEmpty() {
        if (k() > n()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public Long g() {
        return Long.valueOf(n());
    }

    public String toString() {
        return k() + ".." + n();
    }

    /* renamed from: v */
    public Long a() {
        return Long.valueOf(k());
    }
}
