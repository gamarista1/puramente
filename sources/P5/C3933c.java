package p5;

/* renamed from: p5.c  reason: case insensitive filesystem */
public abstract class C3933c {

    /* renamed from: p5.c$b */
    private static class b extends C3933c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f47573a;

        b() {
            super();
        }

        public void b(boolean z10) {
            this.f47573a = z10;
        }

        public void c() {
            if (this.f47573a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static C3933c a() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z10);

    public abstract void c();

    private C3933c() {
    }
}
