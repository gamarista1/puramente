package We;

import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003if.a;

/* renamed from: We.o  reason: case insensitive filesystem */
public final class C5643o {

    /* renamed from: d  reason: collision with root package name */
    private static final Map f65920d;

    /* renamed from: a  reason: collision with root package name */
    private final Map f65921a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List f65922b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a f65923c = new a();

    static {
        HashMap hashMap = new HashMap();
        f65920d = hashMap;
        hashMap.put(AttributeType.BOOLEAN, Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put(Constants.LONG, Long.class);
        hashMap.put(AttributeType.FLOAT, Float.class);
        hashMap.put("double", Double.class);
    }

    private boolean b(Object obj, Class cls) {
        Class cls2 = (Class) f65920d.get(cls.getCanonicalName());
        if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
            return false;
        }
        return true;
    }

    public Object a(String str, Class cls) {
        C5664z a10 = this.f65923c.a();
        try {
            Object obj = this.f65921a.get(str);
            if (cls.isInstance(obj)) {
                if (a10 != null) {
                    a10.close();
                }
                return obj;
            } else if (b(obj, cls)) {
                if (a10 != null) {
                    a10.close();
                }
                return obj;
            } else if (a10 == null) {
                return null;
            } else {
                a10.close();
                return null;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void c(String str, Object obj) {
        C5664z a10 = this.f65923c.a();
        try {
            this.f65921a.put(str, obj);
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
