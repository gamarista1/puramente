package Z4;

import T4.d;
import W4.b;

public class u implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f35936a;

    public u(b bVar) {
        this.f35936a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.InputStream r5, java.io.File r6, T4.i r7) {
        /*
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            W4.b r0 = r4.f35936a
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.d(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0035 }
        L_0x0015:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2 = -1
            if (r6 == r2) goto L_0x0026
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            goto L_0x0015
        L_0x0020:
            r5 = move-exception
            r2 = r3
            goto L_0x004d
        L_0x0023:
            r5 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0026:
            r3.close()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r3.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            W4.b r5 = r4.f35936a
            r5.c(r0)
            r1 = 1
            goto L_0x004c
        L_0x0033:
            r5 = move-exception
            goto L_0x004d
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0033 }
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            W4.b r5 = r4.f35936a
            r5.c(r0)
        L_0x004c:
            return r1
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            W4.b r6 = r4.f35936a
            r6.c(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.u.a(java.io.InputStream, java.io.File, T4.i):boolean");
    }
}
