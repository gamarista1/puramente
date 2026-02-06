package nb;

import java.io.Serializable;

public abstract class v {

    static class a implements u, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final u f61112a;

        /* renamed from: b  reason: collision with root package name */
        volatile transient boolean f61113b;

        /* renamed from: c  reason: collision with root package name */
        transient Object f61114c;

        a(u uVar) {
            this.f61112a = (u) o.j(uVar);
        }

        public Object get() {
            if (!this.f61113b) {
                synchronized (this) {
                    try {
                        if (!this.f61113b) {
                            Object obj = this.f61112a.get();
                            this.f61114c = obj;
                            this.f61113b = true;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return j.a(this.f61114c);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f61113b) {
                obj = "<supplier that returned " + this.f61114c + ">";
            } else {
                obj = this.f61112a;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b implements u {

        /* renamed from: c  reason: collision with root package name */
        private static final u f61115c = new w();

        /* renamed from: a  reason: collision with root package name */
        private volatile u f61116a;

        /* renamed from: b  reason: collision with root package name */
        private Object f61117b;

        b(u uVar) {
            this.f61116a = (u) o.j(uVar);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        public Object get() {
            u uVar = this.f61116a;
            u uVar2 = f61115c;
            if (uVar != uVar2) {
                synchronized (this) {
                    try {
                        if (this.f61116a != uVar2) {
                            Object obj = this.f61116a.get();
                            this.f61117b = obj;
                            this.f61116a = uVar2;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return j.a(this.f61117b);
        }

        public String toString() {
            Object obj = this.f61116a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f61115c) {
                obj = "<supplier that returned " + this.f61117b + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c implements u, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final Object f61118a;

        c(Object obj) {
            this.f61118a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.f61118a, ((c) obj).f61118a);
            }
            return false;
        }

        public Object get() {
            return this.f61118a;
        }

        public int hashCode() {
            return k.b(this.f61118a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f61118a + ")";
        }
    }

    public static u a(u uVar) {
        if ((uVar instanceof b) || (uVar instanceof a)) {
            return uVar;
        }
        if (uVar instanceof Serializable) {
            return new a(uVar);
        }
        return new b(uVar);
    }

    public static u b(Object obj) {
        return new c(obj);
    }
}
