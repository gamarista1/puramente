package nb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: nb.i  reason: case insensitive filesystem */
public abstract class C5114i {

    /* renamed from: nb.i$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f61090a;

        /* renamed from: b  reason: collision with root package name */
        private final a f61091b;

        /* renamed from: c  reason: collision with root package name */
        private a f61092c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f61093d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f61094e;

        /* renamed from: nb.i$b$a */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            String f61095a;

            /* renamed from: b  reason: collision with root package name */
            Object f61096b;

            /* renamed from: c  reason: collision with root package name */
            a f61097c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f61092c.f61097c = aVar;
            this.f61092c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f61096b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof l) {
                    return !((l) obj).c();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        public b c(Object obj) {
            return b(obj);
        }

        public String toString() {
            boolean z10 = this.f61093d;
            boolean z11 = this.f61094e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f61090a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f61091b.f61097c; aVar != null; aVar = aVar.f61097c) {
                Object obj = aVar.f61096b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (z11 && d(obj)) {
                }
                sb2.append(str);
                String str2 = aVar.f61095a;
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
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f61091b = aVar;
            this.f61092c = aVar;
            this.f61093d = false;
            this.f61094e = false;
            this.f61090a = (String) o.j(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
