package T8;

import kotlin.Lazy;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import w.C2760D;
import w.C2769M;
import w.C2785b0;
import w.C2798j;
import yf.C6787a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34203a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Lazy f34204b = C6531o.b(C0556a.f34207a);

    /* renamed from: c  reason: collision with root package name */
    private static final Lazy f34205c = C6531o.b(b.f34208a);

    /* renamed from: d  reason: collision with root package name */
    public static final int f34206d = 8;

    /* renamed from: T8.a$a  reason: collision with other inner class name */
    static final class C0556a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0556a f34207a = new C0556a();

        C0556a() {
            super(0);
        }

        /* renamed from: a */
        public final C2769M invoke() {
            return C2798j.e(C2798j.j(600, 200, (C2760D) null, 4, (Object) null), C2785b0.Reverse, 0, 4, (Object) null);
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34208a = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final C2769M invoke() {
            return C2798j.e(C2798j.j(1700, 200, (C2760D) null, 4, (Object) null), C2785b0.Restart, 0, 4, (Object) null);
        }
    }

    private a() {
    }

    public final C2769M a() {
        return (C2769M) f34205c.getValue();
    }
}
