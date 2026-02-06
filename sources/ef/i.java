package Ef;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class i extends g implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62825e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final i f62826f = new i(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f62826f;
        }

        private a() {
        }
    }

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!(k() == iVar.k() && n() == iVar.n())) {
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
        if (k() > n()) {
            return true;
        }
        return false;
    }

    public boolean p(int i10) {
        if (k() > i10 || i10 > n()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return k() + ".." + n();
    }

    /* renamed from: x */
    public Integer g() {
        return Integer.valueOf(n());
    }

    /* renamed from: z */
    public Integer a() {
        return Integer.valueOf(k());
    }
}
