package V4;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f34538a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f34539b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f34540c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j f34541d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j f34542e = new e();

    class a extends j {
        a() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(T4.a aVar) {
            if (aVar == T4.a.REMOTE) {
                return true;
            }
            return false;
        }

        public boolean d(boolean z10, T4.a aVar, T4.c cVar) {
            if (aVar == T4.a.RESOURCE_DISK_CACHE || aVar == T4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    class b extends j {
        b() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(T4.a aVar) {
            return false;
        }

        public boolean d(boolean z10, T4.a aVar, T4.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(T4.a aVar) {
            if (aVar == T4.a.DATA_DISK_CACHE || aVar == T4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }

        public boolean d(boolean z10, T4.a aVar, T4.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return true;
        }

        public boolean c(T4.a aVar) {
            return false;
        }

        public boolean d(boolean z10, T4.a aVar, T4.c cVar) {
            if (aVar == T4.a.RESOURCE_DISK_CACHE || aVar == T4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    class e extends j {
        e() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(T4.a aVar) {
            if (aVar == T4.a.REMOTE) {
                return true;
            }
            return false;
        }

        public boolean d(boolean z10, T4.a aVar, T4.c cVar) {
            if (((!z10 || aVar != T4.a.DATA_DISK_CACHE) && aVar != T4.a.LOCAL) || cVar != T4.c.TRANSFORMED) {
                return false;
            }
            return true;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(T4.a aVar);

    public abstract boolean d(boolean z10, T4.a aVar, T4.c cVar);
}
