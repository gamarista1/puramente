package T5;

import java.util.Arrays;

public abstract class i {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f34171a;

        /* renamed from: b  reason: collision with root package name */
        private final C0554a f34172b;

        /* renamed from: c  reason: collision with root package name */
        private C0554a f34173c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f34174d;

        /* renamed from: T5.i$a$a  reason: collision with other inner class name */
        private static final class C0554a {

            /* renamed from: a  reason: collision with root package name */
            String f34175a;

            /* renamed from: b  reason: collision with root package name */
            Object f34176b;

            /* renamed from: c  reason: collision with root package name */
            C0554a f34177c;

            private C0554a() {
            }
        }

        private C0554a d() {
            C0554a aVar = new C0554a();
            this.f34173c.f34177c = aVar;
            this.f34173c = aVar;
            return aVar;
        }

        private a e(String str, Object obj) {
            C0554a d10 = d();
            d10.f34176b = obj;
            d10.f34175a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f34174d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f34171a);
            sb2.append('{');
            String str = "";
            for (C0554a aVar = this.f34172b.f34177c; aVar != null; aVar = aVar.f34177c) {
                Object obj = aVar.f34176b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f34175a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private a(String str) {
            C0554a aVar = new C0554a();
            this.f34172b = aVar;
            this.f34173c = aVar;
            this.f34174d = false;
            this.f34171a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
