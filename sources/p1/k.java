package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.Y;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o1.e;
import v1.k;

class k extends o {

    /* renamed from: b  reason: collision with root package name */
    private static final Class f25163b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor f25164c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f25165d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f25166e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            Constructor<?> constructor3 = constructor2;
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor3;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            method = null;
        }
        f25164c = constructor;
        f25163b = cls;
        f25165d = method;
        f25166e = method2;
    }

    k() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f25165d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(f25163b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f25166e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f25165d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    private static Object l() {
        try {
            return f25164c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b10 = p.b(context, resources, dVar.b());
            if (b10 == null || !i(l10, b10, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(l10);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        Y y10 = new Y();
        for (k.b bVar : bVarArr) {
            Uri d10 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) y10.get(d10);
            if (byteBuffer == null) {
                byteBuffer = p.f(context, cancellationSignal, d10);
                y10.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !i(l10, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface j10 = j(l10);
        if (j10 == null) {
            return null;
        }
        return Typeface.create(j10, i10);
    }
}
