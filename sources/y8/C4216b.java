package y8;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* renamed from: y8.b  reason: case insensitive filesystem */
public class C4216b implements C4222h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49872a;

    /* renamed from: b  reason: collision with root package name */
    private final C4215a f49873b;

    public C4216b(Context context, C4215a aVar) {
        this.f49872a = context;
        this.f49873b = aVar;
    }

    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f49872a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f49873b.b(sb2);
        throw new v(sb2.toString(), unsatisfiedLinkError);
    }
}
