package P7;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33530a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final f f33531b = new f();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private f() {
    }

    public boolean a() {
        return false;
    }

    public int b() {
        boolean a10 = a();
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + a10);
    }

    public e c() {
        boolean a10 = a();
        throw new IllegalStateException("Should not update as canRetry is: " + a10);
    }

    public e copy() {
        return this;
    }
}
