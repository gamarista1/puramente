package Pc;

import android.support.v4.media.session.c;
import com.google.gson.p;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public abstract class F {

    private static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f52190a;

        class a extends b {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Method f52191b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f52191b = method;
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f52191b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: Pc.F$b$b  reason: collision with other inner class name */
        class C0799b extends b {
            C0799b() {
                super();
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        static {
            /*
                boolean r0 = Pc.x.c()
                if (r0 == 0) goto L_0x001a
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ NoSuchMethodException -> 0x001a }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x001a }
                Pc.F$b$a r1 = new Pc.F$b$a     // Catch:{ NoSuchMethodException -> 0x001a }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x001a }
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r1 != 0) goto L_0x0022
                Pc.F$b$b r1 = new Pc.F$b$b
                r1.<init>()
            L_0x0022:
                f52190a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pc.F.b.<clinit>():void");
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f52190a.a(accessibleObject, obj);
    }

    public static p b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return p.ALLOW;
        }
        c.a(it.next());
        throw null;
    }
}
