package o4;

import kotlin.jvm.internal.C6494p;
import yf.C6787a;

/* renamed from: o4.C  reason: case insensitive filesystem */
public final class C3877C {

    /* renamed from: a  reason: collision with root package name */
    public static final C3877C f46987a = new C3877C();

    /* renamed from: b  reason: collision with root package name */
    private static C6787a f46988b = a.f46989a;

    /* renamed from: o4.C$a */
    /* synthetic */ class a extends C6494p implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46989a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* renamed from: i */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private C3877C() {
    }

    public final long a() {
        return ((Number) f46988b.invoke()).longValue();
    }
}
