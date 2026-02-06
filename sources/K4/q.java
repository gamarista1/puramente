package K4;

import N4.f;
import N4.k;
import Sg.C5538a;
import Sg.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f32402a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final f.k f32403b;

    /* renamed from: c  reason: collision with root package name */
    private static final f f32404c;

    static {
        f.k t10 = new f.k().t(new i());
        f32403b = t10;
        f fVar = new f(t10);
        f32404c = fVar;
        fVar.t(Date.class, new p());
    }

    private q() {
    }

    /* access modifiers changed from: private */
    public static final void b(k kVar, Date date) {
        if (date != null) {
            kVar.q(g.c(date));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        wf.C6763c.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map c(java.io.File r4) {
        /*
            r3 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0012, IOException -> 0x0010 }
            r0.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0012, IOException -> 0x0010 }
            K4.q r1 = f32402a     // Catch:{ all -> 0x0014 }
            java.util.Map r1 = r1.d(r0)     // Catch:{ all -> 0x0014 }
            r2 = 0
            wf.C6763c.a(r0, r2)     // Catch:{ FileNotFoundException -> 0x0012, IOException -> 0x0010 }
            return r1
        L_0x0010:
            r0 = move-exception
            goto L_0x001b
        L_0x0012:
            r4 = move-exception
            goto L_0x0027
        L_0x0014:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r2 = move-exception
            wf.C6763c.a(r0, r1)     // Catch:{ FileNotFoundException -> 0x0012, IOException -> 0x0010 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0012, IOException -> 0x0010 }
        L_0x001b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Could not deserialize from "
            java.lang.String r4 = kotlin.jvm.internal.C6496s.o(r2, r4)
            r1.<init>(r4, r0)
            throw r1
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.q.c(java.io.File):java.util.Map");
    }

    public final Map d(InputStream inputStream) {
        Map map = (Map) f32404c.j(Map.class, inputStream);
        if (map != null) {
            return V.d(map);
        }
        throw new IllegalArgumentException("JSON document is invalid");
    }

    public final Long e(Object obj) {
        long j10;
        Long valueOf;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            try {
                valueOf = Long.decode((String) obj);
            } catch (NumberFormatException e10) {
                if (p.J(str, "0x", false, 2, (Object) null)) {
                    if (str.length() == 18) {
                        int length = str.length() - 2;
                        String substring = str.substring(0, length);
                        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String substring2 = str.substring(length, str.length());
                        C6496s.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        j10 = Long.parseLong(substring2, C5538a.a(16)) | (Long.decode(substring).longValue() << 8);
                    } else {
                        throw e10;
                    }
                } else if (str.length() >= 19) {
                    int length2 = str.length() - 3;
                    String substring3 = str.substring(0, length2);
                    C6496s.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    String substring4 = str.substring(length2, str.length());
                    C6496s.g(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                    j10 = Long.decode(substring4).longValue() + (Long.decode(substring3).longValue() * ((long) 1000));
                } else {
                    throw e10;
                }
                valueOf = Long.valueOf(j10);
            }
            return valueOf;
        }
        throw new IllegalArgumentException("Cannot convert " + obj + " to long");
    }

    public final void f(Object obj, OutputStream outputStream) {
        f32404c.w(obj, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        wf.C6763c.a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        wf.C6763c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] g(com.bugsnag.android.K0.a r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.bugsnag.android.K0 r1 = new com.bugsnag.android.K0     // Catch:{ all -> 0x0020 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x0020 }
            r2.<init>(r0)     // Catch:{ all -> 0x0020 }
            r1.<init>(r2)     // Catch:{ all -> 0x0020 }
            r4.toStream(r1)     // Catch:{ all -> 0x0022 }
            lf.M r4 = lf.C6514M.f71813a     // Catch:{ all -> 0x0022 }
            r4 = 0
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0020 }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x0020 }
            wf.C6763c.a(r0, r4)
            return r1
        L_0x0020:
            r4 = move-exception
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            wf.C6763c.a(r1, r4)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0029:
            throw r4     // Catch:{ all -> 0x002a }
        L_0x002a:
            r1 = move-exception
            wf.C6763c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.q.g(com.bugsnag.android.K0$a):byte[]");
    }

    public final String h(Long l10) {
        if (l10 == null) {
            return null;
        }
        if (l10.longValue() >= 0) {
            String format = String.format("0x%x", Arrays.copyOf(new Object[]{l10}, 1));
            C6496s.g(format, "format(this, *args)");
            return format;
        }
        String format2 = String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l10.longValue() >>> 8), Long.valueOf(l10.longValue() & 255)}, 2));
        C6496s.g(format2, "format(this, *args)");
        return format2;
    }
}
