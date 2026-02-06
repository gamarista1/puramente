package Ba;

import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4528j;
import java.util.Locale;

/* renamed from: Ba.a  reason: case insensitive filesystem */
public class C4246a {

    /* renamed from: a  reason: collision with root package name */
    private final String f50313a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50314b;

    /* renamed from: c  reason: collision with root package name */
    private final C4528j f50315c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50316d;

    public C4246a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(f.f37529a);
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f50314b = str2;
        this.f50313a = str;
        this.f50315c = new C4528j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f50313a, i10)) {
            i10++;
        }
        this.f50316d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f50313a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th2, Object... objArr) {
        Log.e(this.f50313a, d(str, objArr), th2);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f50313a, d(str, objArr));
    }

    /* access modifiers changed from: protected */
    public String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f50314b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f50313a, d(str, objArr));
    }

    public boolean f(int i10) {
        if (this.f50316d <= i10) {
            return true;
        }
        return false;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f50313a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f50313a, d(str, objArr));
    }

    public void i(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.f50313a, d(str, objArr), th2);
    }

    public void j(Throwable th2) {
        Log.wtf(this.f50313a, th2);
    }
}
