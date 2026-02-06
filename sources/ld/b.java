package Ld;

import Pd.c;
import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import sf.C6714a;

public class b implements c, Wd.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f51994d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f51995a;

    /* renamed from: b  reason: collision with root package name */
    private int f51996b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51997c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(float f10, Context context) {
            return (int) (f10 / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        }

        private a() {
        }
    }

    /* renamed from: Ld.b$b  reason: collision with other inner class name */
    public enum C0796b {
        BARE("bare"),
        STANDALONE("standalone"),
        STORE_CLIENT("storeClient");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f52003a;

        static {
            C0796b[] a10;
            f52002f = C6714a.a(a10);
        }

        private C0796b(String str) {
            this.f52003a = str;
        }

        public final String b() {
            return this.f52003a;
        }
    }

    public b(Context context) {
        int i10;
        C6496s.h(context, "context");
        this.f51995a = context;
        Integer valueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        valueOf = valueOf.intValue() <= 0 ? null : valueOf;
        if (valueOf != null) {
            i10 = f51994d.b((float) context.getResources().getDimensionPixelSize(valueOf.intValue()), context);
        } else {
            i10 = 0;
        }
        this.f51996b = i10;
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "toString(...)");
        this.f51997c = uuid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        wf.C6763c.a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String a() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.f51995a     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
            java.lang.String r2 = "app.config"
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = Lh.d.j(r1, r2)     // Catch:{ all -> 0x0019 }
            wf.C6763c.a(r1, r0)     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
            return r2
        L_0x0017:
            r1 = move-exception
            goto L_0x0020
        L_0x0019:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r3 = move-exception
            wf.C6763c.a(r1, r2)     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0029, Exception -> 0x0017 }
        L_0x0020:
            java.lang.String r2 = Ld.c.f52004a
            java.lang.String r3 = "Error reading embedded app config"
            android.util.Log.e(r2, r3, r1)
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ld.b.a():java.lang.String");
    }

    public String b() {
        String str = Build.MODEL;
        C6496s.g(str, "MODEL");
        return str;
    }

    public List c() {
        return C6565s.q(Constants.NORMAL, "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    public String d() {
        String str = Build.VERSION.RELEASE;
        C6496s.g(str, "RELEASE");
        return str;
    }

    public Map getConstants() {
        return O.n(C6502A.a("sessionId", this.f51997c), C6502A.a("executionEnvironment", C0796b.BARE.b()), C6502A.a("statusBarHeight", Integer.valueOf(this.f51996b)), C6502A.a("deviceName", b()), C6502A.a("systemFonts", c()), C6502A.a("systemVersion", d()), C6502A.a("manifest", a()), C6502A.a("platform", O.f(C6502A.a("android", O.i()))));
    }

    public List o() {
        return C6565s.e(Wd.a.class);
    }
}
