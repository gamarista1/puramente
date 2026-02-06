package E4;

import H4.f;
import android.content.Context;
import android.util.Pair;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import u4.C4071k;
import u4.C4080u;
import u4.U;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f30633a;

    /* renamed from: b  reason: collision with root package name */
    private final f f30634b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30635a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                E4.c[] r0 = E4.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30635a = r0
                E4.c r1 = E4.c.ZIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30635a     // Catch:{ NoSuchFieldError -> 0x001d }
                E4.c r1 = E4.c.GZIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E4.h.a.<clinit>():void");
        }
    }

    public h(g gVar, f fVar) {
        this.f30633a = gVar;
        this.f30634b = fVar;
    }

    private C4071k a(Context context, String str, String str2) {
        g gVar;
        Pair a10;
        U u10;
        if (str2 == null || (gVar = this.f30633a) == null || (a10 = gVar.a(str)) == null) {
            return null;
        }
        InputStream inputStream = (InputStream) a10.second;
        int i10 = a.f30635a[((c) a10.first).ordinal()];
        if (i10 == 1) {
            u10 = C4080u.E(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            u10 = C4080u.q(inputStream, str2);
        } else {
            try {
                u10 = C4080u.q(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                u10 = new U((Throwable) e10);
            }
        }
        if (u10.b() != null) {
            return (C4071k) u10.b();
        }
        return null;
    }

    private U b(Context context, String str, String str2) {
        boolean z10;
        f.a("Fetching " + str);
        d dVar = null;
        try {
            dVar = this.f30634b.a(str);
            if (dVar.m0()) {
                U e10 = e(context, str, dVar.Y(), dVar.W(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                if (e10.b() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sb2.append(z10);
                f.a(sb2.toString());
                try {
                    dVar.close();
                } catch (IOException e11) {
                    f.d("LottieFetchResult close failed ", e11);
                }
                return e10;
            }
            U u10 = new U((Throwable) new IllegalArgumentException(dVar.Y0()));
            try {
                dVar.close();
            } catch (IOException e12) {
                f.d("LottieFetchResult close failed ", e12);
            }
            return u10;
        } catch (Exception e13) {
            U u11 = new U((Throwable) e13);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e14) {
                    f.d("LottieFetchResult close failed ", e14);
                }
            }
            return u11;
        } catch (Throwable th2) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e15) {
                    f.d("LottieFetchResult close failed ", e15);
                }
            }
            throw th2;
        }
    }

    private U d(String str, InputStream inputStream, String str2) {
        g gVar;
        if (str2 == null || (gVar = this.f30633a) == null) {
            return C4080u.q(new GZIPInputStream(inputStream), (String) null);
        }
        return C4080u.q(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    private U e(Context context, String str, InputStream inputStream, String str2, String str3) {
        U u10;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            f.a("Handling zip response.");
            c cVar2 = c.ZIP;
            u10 = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            f.a("Handling gzip response.");
            cVar = c.GZIP;
            u10 = d(str, inputStream, str3);
        } else {
            f.a("Received json response.");
            cVar = c.JSON;
            u10 = f(str, inputStream, str3);
        }
        if (!(str3 == null || u10.b() == null || (gVar = this.f30633a) == null)) {
            gVar.f(str, cVar);
        }
        return u10;
    }

    private U f(String str, InputStream inputStream, String str2) {
        g gVar;
        if (str2 == null || (gVar = this.f30633a) == null) {
            return C4080u.q(inputStream, (String) null);
        }
        return C4080u.q(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private U g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        if (str2 == null || (gVar = this.f30633a) == null) {
            return C4080u.E(context, new ZipInputStream(inputStream), (String) null);
        }
        return C4080u.E(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public U c(Context context, String str, String str2) {
        C4071k a10 = a(context, str, str2);
        if (a10 != null) {
            return new U((Object) a10);
        }
        f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
