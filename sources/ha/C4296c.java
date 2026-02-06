package Ha;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: Ha.c  reason: case insensitive filesystem */
public abstract class C4296c {

    /* renamed from: a  reason: collision with root package name */
    private final String f50858a;

    /* renamed from: b  reason: collision with root package name */
    private Object f50859b;

    /* renamed from: Ha.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    protected C4296c(String str) {
        this.f50858a = str;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public final Object b(Context context) {
        if (this.f50859b == null) {
            C4536s.l(context);
            Context d10 = d.d(context);
            if (d10 != null) {
                try {
                    this.f50859b = a((IBinder) d10.getClassLoader().loadClass(this.f50858a).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new a("Could not load creator class.", e10);
                } catch (InstantiationException e11) {
                    throw new a("Could not instantiate creator.", e11);
                } catch (IllegalAccessException e12) {
                    throw new a("Could not access creator.", e12);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f50859b;
    }
}
