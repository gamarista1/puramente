package k9;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import k9.C3700i;

public class P0 extends Exception implements C3700i {

    /* renamed from: c  reason: collision with root package name */
    public static final C3700i.a f45347c = new O0();

    /* renamed from: a  reason: collision with root package name */
    public final int f45348a;

    /* renamed from: b  reason: collision with root package name */
    public final long f45349b;

    protected P0(Bundle bundle) {
        this(bundle.getString(d(2)), c(bundle), bundle.getInt(d(0), 1000), bundle.getLong(d(1), SystemClock.elapsedRealtime()));
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class cls, String str) {
        return (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(d(3));
        String string2 = bundle.getString(d(4));
        Throwable th2 = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, P0.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th2 = b(cls, string2);
            }
            if (th2 != null) {
                return th2;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    protected static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    protected P0(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f45348a = i10;
        this.f45349b = j10;
    }
}
