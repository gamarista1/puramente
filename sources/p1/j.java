package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o1.e;
import v1.k;

class j extends o {

    /* renamed from: b  reason: collision with root package name */
    private static Class f25158b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor f25159c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f25160d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f25161e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f25162f = false;

    j() {
    }

    private static boolean i(Object obj, String str, int i10, boolean z10) {
        l();
        try {
            return ((Boolean) f25160d.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface j(Object obj) {
        l();
        try {
            Object newInstance = Array.newInstance(f25158b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f25161e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void l() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f25162f) {
            f25162f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                method2 = null;
                cls = null;
                method = null;
            }
            f25159c = constructor;
            f25158b = cls;
            f25160d = method;
            f25161e = method2;
        }
    }

    private static Object m() {
        l();
        try {
            return f25159c.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        Object m10 = m();
        e.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            e.d dVar = a10[i11];
            File e10 = p.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!p.c(e10, resources, dVar.b())) {
                    e10.delete();
                    return null;
                } else if (!i(m10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    e10.delete();
                    i11++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return j(m10);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        k.b h10 = h(bVarArr, i10);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File k10 = k(openFileDescriptor);
            if (k10 != null) {
                if (k10.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(k10);
                    openFileDescriptor.close();
                    return createFromFile;
                }
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d10 = super.d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return d10;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
        throw th;
    }
}
