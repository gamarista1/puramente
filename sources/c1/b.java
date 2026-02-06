package c1;

import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19206b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f19207a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            int min = Math.min(i12, 262142);
            int i16 = a.e.API_PRIORITY_OTHER;
            if (i13 == Integer.MAX_VALUE) {
                i14 = Integer.MAX_VALUE;
            } else {
                i14 = Math.min(i13, 262142);
            }
            if (i14 == Integer.MAX_VALUE) {
                i15 = min;
            } else {
                i15 = i14;
            }
            int c10 = c.m(i15);
            if (i11 != Integer.MAX_VALUE) {
                i16 = Math.min(c10, i11);
            }
            return c.a(Math.min(c10, i10), i16, min, i14);
        }

        public final long b(int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            int min = Math.min(i10, 262142);
            int i16 = a.e.API_PRIORITY_OTHER;
            if (i11 == Integer.MAX_VALUE) {
                i14 = Integer.MAX_VALUE;
            } else {
                i14 = Math.min(i11, 262142);
            }
            if (i14 == Integer.MAX_VALUE) {
                i15 = min;
            } else {
                i15 = i14;
            }
            int c10 = c.m(i15);
            if (i13 != Integer.MAX_VALUE) {
                i16 = Math.min(c10, i13);
            }
            return c.a(min, i14, Math.min(c10, i12), i16);
        }

        public final long c(int i10, int i11) {
            boolean z10;
            if (i10 < 0 || i11 < 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                m.a("width(" + i10 + ") and height(" + i11 + ") must be >= 0");
            }
            return c.j(i10, i10, i11, i11);
        }

        public final long d(int i10) {
            boolean z10;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                m.a("height(" + i10 + ") must be >= 0");
            }
            return c.j(0, a.e.API_PRIORITY_OTHER, i10, i10);
        }

        public final long e(int i10) {
            boolean z10;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                m.a("width(" + i10 + ") must be >= 0");
            }
            return c.j(i10, i10, 0, a.e.API_PRIORITY_OTHER);
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.f19207a = j10;
    }

    public static final /* synthetic */ b a(long j10) {
        return new b(j10);
    }

    public static final long c(long j10, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i12 < 0 || i10 < 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            m.a("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
        }
        if (i11 >= i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            m.a("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
        }
        if (i13 >= i12) {
            z12 = true;
        }
        if (!z12) {
            m.a("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
        }
        return c.j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = k(j10);
        }
        return c(j10, i15, i16, i17, i13);
    }

    public static boolean e(long j10, Object obj) {
        if ((obj instanceof b) && j10 == ((b) obj).r()) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        if ((((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j10) {
        int i10 = (int) (3 & j10);
        if ((((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(long j10) {
        int i10;
        int i11 = (int) (3 & j10);
        int i12 = ((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3);
        int i13 = (1 << (18 - i12)) - 1;
        int i14 = ((int) (j10 >> (i12 + 15))) & i13;
        int i15 = ((int) (j10 >> (i12 + 46))) & i13;
        if (i15 == 0) {
            i10 = a.e.API_PRIORITY_OTHER;
        } else {
            i10 = i15 - 1;
        }
        if (i14 == i10) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j10) {
        int i10;
        int i11 = (int) (3 & j10);
        int i12 = (1 << ((((i11 & 1) << 1) + (((i11 & 2) >> 1) * 3)) + 13)) - 1;
        int i13 = ((int) (j10 >> 2)) & i12;
        int i14 = ((int) (j10 >> 33)) & i12;
        if (i14 == 0) {
            i10 = a.e.API_PRIORITY_OTHER;
        } else {
            i10 = i14 - 1;
        }
        if (i13 == i10) {
            return true;
        }
        return false;
    }

    public static final int k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return a.e.API_PRIORITY_OTHER;
        }
        return i12 - 1;
    }

    public static final int l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return a.e.API_PRIORITY_OTHER;
        }
        return i11 - 1;
    }

    public static final int m(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int n(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        if ((((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0 || (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0) {
            return true;
        }
        return false;
    }

    public static String q(long j10) {
        String str;
        int l10 = l(j10);
        String str2 = "Infinity";
        if (l10 == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(l10);
        }
        int k10 = k(j10);
        if (k10 != Integer.MAX_VALUE) {
            str2 = String.valueOf(k10);
        }
        return "Constraints(minWidth = " + n(j10) + ", maxWidth = " + str + ", minHeight = " + m(j10) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f19207a, obj);
    }

    public int hashCode() {
        return o(this.f19207a);
    }

    public final /* synthetic */ long r() {
        return this.f19207a;
    }

    public String toString() {
        return q(this.f19207a);
    }

    public static long b(long j10) {
        return j10;
    }
}
