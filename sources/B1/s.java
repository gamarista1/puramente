package b1;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19145c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final s f19146d;

    /* renamed from: e  reason: collision with root package name */
    private static final s f19147e;

    /* renamed from: a  reason: collision with root package name */
    private final int f19148a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19149b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a() {
            return s.f19146d;
        }

        private a() {
        }
    }

    static {
        b.a aVar = b.f19150a;
        f19146d = new s(aVar.a(), false, (DefaultConstructorMarker) null);
        f19147e = new s(aVar.b(), true, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ s(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f19148a;
    }

    public final boolean c() {
        return this.f19149b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (b.e(this.f19148a, sVar.f19148a) && this.f19149b == sVar.f19149b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (b.f(this.f19148a) * 31) + Boolean.hashCode(this.f19149b);
    }

    public String toString() {
        if (C6496s.c(this, f19146d)) {
            return "TextMotion.Static";
        }
        if (C6496s.c(this, f19147e)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    private s(int i10, boolean z10) {
        this.f19148a = i10;
        this.f19149b = z10;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19150a = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f19151b = d(1);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f19152c = d(2);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f19153d = d(3);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f19152c;
            }

            public final int b() {
                return b.f19151b;
            }

            public final int c() {
                return b.f19153d;
            }

            private a() {
            }
        }

        public static final boolean e(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }

        private static int d(int i10) {
            return i10;
        }
    }
}
