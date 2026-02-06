package y8;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* renamed from: y8.g  reason: case insensitive filesystem */
public class C4221g implements C4222h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49880a;

    /* renamed from: b  reason: collision with root package name */
    private final C4215a f49881b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49882c;

    public C4221g(Context context, C4215a aVar) {
        this.f49880a = context;
        this.f49881b = aVar;
        this.f49882c = aVar.c();
    }

    private boolean b() {
        String c10 = c();
        if (!new File(c10).exists() || !this.f49881b.a(c10)) {
            return false;
        }
        return true;
    }

    private String c() {
        return this.f49880a.getApplicationInfo().sourceDir;
    }

    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            E e10 = eArr[i10];
            if (e10 instanceof w) {
                eArr[i10] = ((w) e10).b(this.f49880a);
            }
        }
    }

    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        } else if (this.f49882c == this.f49881b.c()) {
            return false;
        } else {
            p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
            return true;
        }
    }
}
