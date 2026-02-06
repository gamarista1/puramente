package r2;

import android.media.MediaCodec;
import l2.e;

public class l extends e {

    /* renamed from: a  reason: collision with root package name */
    public final m f25651a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25652b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25653c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.Throwable r4, r2.m r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f25654a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f25651a = r5
            int r5 = i2.L.f22072a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = a(r4)
        L_0x0027:
            r3.f25652b = r1
            r0 = 23
            if (r5 < r0) goto L_0x0032
            int r4 = b(r4)
            goto L_0x0036
        L_0x0032:
            int r4 = i2.L.W(r1)
        L_0x0036:
            r3.f25653c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.l.<init>(java.lang.Throwable, r2.m):void");
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }

    private static int b(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
