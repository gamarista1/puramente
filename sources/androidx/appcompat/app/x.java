package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static Field f11114a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f11115b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f11116c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f11117d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f11118e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f11119f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f11120g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f11121h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f11121h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f11120g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f11121h = true;
        }
        Field field = f11120g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                obj = null;
            }
            if (obj != null) {
                if (!f11115b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f11114a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                    }
                    f11115b = true;
                }
                Field field2 = f11114a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e13) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                    }
                }
                if (obj2 != null) {
                    c(obj2);
                }
            }
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f11117d) {
            try {
                f11116c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f11117d = true;
        }
        Class cls = f11116c;
        if (cls != null) {
            if (!f11119f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f11118e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f11119f = true;
            }
            Field field = f11118e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
