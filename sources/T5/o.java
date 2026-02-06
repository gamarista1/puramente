package T5;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final n f34178a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final n f34179b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final n f34180c = new d();

    class a implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f34181a;

        a(Object obj) {
            this.f34181a = obj;
        }

        public Object get() {
            return this.f34181a;
        }
    }

    class b implements n {
        b() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements n {
        c() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    class d implements n {
        d() {
        }

        /* renamed from: a */
        public String get() {
            return "";
        }
    }

    public static n a(Object obj) {
        return new a(obj);
    }
}
