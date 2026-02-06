package a4;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Set;
import lf.C6535s;
import mf.Y;

/* renamed from: a4.o  reason: case insensitive filesystem */
public abstract class C3122o {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f36070a = Y.j(ClipboardModule.MIMETYPE_JPEG, ClipboardModule.MIMETYPE_WEBP, ClipboardModule.MIMETYPE_HEIC, ClipboardModule.MIMETYPE_HEIF);

    /* renamed from: a4.o$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36071a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                a4.m[] r0 = a4.C3120m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a4.m r1 = a4.C3120m.RESPECT_PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                a4.m r1 = a4.C3120m.IGNORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                a4.m r1 = a4.C3120m.RESPECT_ALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f36071a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.C3122o.a.<clinit>():void");
        }
    }

    public static final boolean a(C3118k kVar) {
        if (kVar.a() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(C3118k kVar) {
        if (kVar.a() == 90 || kVar.a() == 270) {
            return true;
        }
        return false;
    }

    public static final boolean c(C3120m mVar, String str) {
        int i10 = a.f36071a[mVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new C6535s();
            }
        } else if (str == null || !f36070a.contains(str)) {
            return false;
        }
        return true;
    }
}
