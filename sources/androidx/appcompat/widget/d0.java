package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class d0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11880c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList f11881d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f11882a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f11883b;

    private d0(Context context) {
        super(context);
        if (q0.c()) {
            q0 q0Var = new q0(this, context.getResources());
            this.f11882a = q0Var;
            Resources.Theme newTheme = q0Var.newTheme();
            this.f11883b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f11882a = new f0(this, context.getResources());
        this.f11883b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof d0) || (context.getResources() instanceof f0) || (context.getResources() instanceof q0)) {
            return false;
        }
        return q0.c();
    }

    public static Context b(Context context) {
        d0 d0Var;
        if (!a(context)) {
            return context;
        }
        synchronized (f11880c) {
            try {
                ArrayList arrayList = f11881d;
                if (arrayList == null) {
                    f11881d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f11881d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f11881d.remove(size);
                        }
                    }
                    for (int size2 = f11881d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f11881d.get(size2);
                        if (weakReference2 != null) {
                            d0Var = (d0) weakReference2.get();
                        } else {
                            d0Var = null;
                        }
                        if (d0Var != null && d0Var.getBaseContext() == context) {
                            return d0Var;
                        }
                    }
                }
                d0 d0Var2 = new d0(context);
                f11881d.add(new WeakReference(d0Var2));
                return d0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f11882a.getAssets();
    }

    public Resources getResources() {
        return this.f11882a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11883b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f11883b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
