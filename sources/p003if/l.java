package p003if;

/* renamed from: if.l  reason: invalid package */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final b f67898a = new b();

    /* renamed from: if.l$b */
    private static class b extends ThreadLocal {
        private b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public j initialValue() {
            return new j();
        }
    }

    public static j a() {
        return (j) f67898a.get();
    }
}
