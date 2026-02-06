package Ha;

import Ha.C4294a;
import android.os.IBinder;
import com.google.android.gms.common.internal.C4536s;
import java.lang.reflect.Field;

/* renamed from: Ha.b  reason: case insensitive filesystem */
public final class C4295b extends C4294a.C0774a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f50857a;

    private C4295b(Object obj) {
        this.f50857a = obj;
    }

    public static Object b(C4294a aVar) {
        if (aVar instanceof C4295b) {
            return ((C4295b) aVar).f50857a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            C4536s.l(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static C4294a c(Object obj) {
        return new C4295b(obj);
    }
}
