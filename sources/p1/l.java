package p1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import o1.e;
import v1.k;

public class l extends j {

    /* renamed from: g  reason: collision with root package name */
    protected final Class f25167g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor f25168h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f25169i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f25170j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f25171k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f25172l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f25173m;

    public l() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = w();
            constructor = x(cls);
            method5 = t(cls);
            method4 = u(cls);
            method3 = y(cls);
            method2 = s(cls);
            method = v(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f25167g = cls;
        this.f25168h = constructor;
        this.f25169i = method5;
        this.f25170j = method4;
        this.f25171k = method3;
        this.f25172l = method2;
        this.f25173m = method;
    }

    private Object m() {
        try {
            return this.f25168h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void n(Object obj) {
        try {
            this.f25172l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean o(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f25169i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f25170j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q(Object obj) {
        try {
            return ((Boolean) this.f25171k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r() {
        if (this.f25169i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f25169i != null) {
            return true;
        }
        return false;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        if (!r()) {
            return super.a(context, cVar, resources, i10);
        }
        Object m10 = m();
        if (m10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!o(context, m10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(m10);
                return null;
            }
        }
        if (!q(m10)) {
            return null;
        }
        return j(m10);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        Typeface j10;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!r()) {
            k.b h10 = h(bVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h10.e()).setItalic(h10.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            Map h11 = p.h(context, bVarArr, cancellationSignal);
            Object m10 = m();
            if (m10 == null) {
                return null;
            }
            boolean z10 = false;
            for (k.b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) h11.get(bVar.d());
                if (byteBuffer != null) {
                    if (!p(m10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        n(m10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                n(m10);
                return null;
            } else if (q(m10) && (j10 = j(m10)) != null) {
                return Typeface.create(j10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!r()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object m10 = m();
        if (m10 == null) {
            return null;
        }
        if (!o(context, m10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            n(m10);
            return null;
        } else if (!q(m10)) {
            return null;
        } else {
            return j(m10);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f25167g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f25173m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method s(Class cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method v(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class w() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor x(Class cls) {
        return cls.getConstructor((Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method y(Class cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }
}
