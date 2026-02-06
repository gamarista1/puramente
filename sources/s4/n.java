package S4;

public final class n {

    /* renamed from: c  reason: collision with root package name */
    public static final n f33896c = new b().f().c();

    /* renamed from: d  reason: collision with root package name */
    public static final n f33897d = new b().e().c();

    /* renamed from: e  reason: collision with root package name */
    public static final n f33898e = new b().d().c();

    /* renamed from: a  reason: collision with root package name */
    private c f33899a;

    /* renamed from: b  reason: collision with root package name */
    private int f33900b;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public c f33901a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f33902b;

        public n c() {
            return new n(this);
        }

        public b d() {
            this.f33901a = c.CACHE_ALL;
            return this;
        }

        public b e() {
            this.f33901a = c.CACHE_AUTO;
            return this;
        }

        public b f() {
            this.f33901a = c.CACHE_NONE;
            return this;
        }
    }

    public enum c {
        CACHE_NONE,
        CACHE_LIMITED,
        CACHE_AUTO,
        CACHE_ALL
    }

    public boolean a() {
        if (this.f33899a == c.CACHE_ALL) {
            return true;
        }
        return false;
    }

    public int b() {
        return this.f33900b;
    }

    public boolean c() {
        if (this.f33899a == c.CACHE_NONE) {
            return true;
        }
        return false;
    }

    private n(b bVar) {
        this.f33899a = bVar.f33901a;
        this.f33900b = bVar.f33902b;
    }
}
