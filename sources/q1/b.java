package Q1;

import android.text.Editable;
import androidx.emoji2.text.o;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5404a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f5405b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f5406c;

    private b() {
        try {
            f5406c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f5405b == null) {
            synchronized (f5404a) {
                try {
                    if (f5405b == null) {
                        f5405b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f5405b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f5406c;
        if (cls != null) {
            return o.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
