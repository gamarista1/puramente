package C9;

import android.media.MediaCodec;
import n9.C3870f;

public class m extends C3870f {

    /* renamed from: a  reason: collision with root package name */
    public final n f30164a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30165b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(java.lang.Throwable r4, C9.n r5) {
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
            java.lang.String r2 = r5.f30166a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f30164a = r5
            int r5 = ja.M.f44981a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = a(r4)
        L_0x0027:
            r3.f30165b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.m.<init>(java.lang.Throwable, C9.n):void");
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
