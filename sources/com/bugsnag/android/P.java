package com.bugsnag.android;

public interface P {

    public static final class a {
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            wf.C6763c.a(r5, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String a(com.bugsnag.android.P r8) {
            /*
                r0 = 1
                r1 = 0
                lf.v$a r2 = lf.v.f71841b     // Catch:{ all -> 0x0062 }
                java.lang.String r2 = "SHA-1"
                java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ all -> 0x0062 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
                java.lang.String r4 = "sha1 "
                r3.<init>(r4)     // Catch:{ all -> 0x0062 }
                java.security.DigestOutputStream r4 = new java.security.DigestOutputStream     // Catch:{ all -> 0x0062 }
                com.bugsnag.android.f1 r5 = new com.bugsnag.android.f1     // Catch:{ all -> 0x0062 }
                r5.<init>()     // Catch:{ all -> 0x0062 }
                r4.<init>(r5, r2)     // Catch:{ all -> 0x0062 }
                java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0056 }
                r6 = 8192(0x2000, float:1.14794E-41)
                r5.<init>(r4, r6)     // Catch:{ all -> 0x0056 }
                byte[] r8 = r8.a()     // Catch:{ all -> 0x0064 }
                r5.write(r8)     // Catch:{ all -> 0x0064 }
                lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x0064 }
                wf.C6763c.a(r5, r1)     // Catch:{ all -> 0x0056 }
                byte[] r8 = r2.digest()     // Catch:{ all -> 0x0056 }
                int r2 = r8.length     // Catch:{ all -> 0x0056 }
                r5 = 0
            L_0x0034:
                if (r5 >= r2) goto L_0x0058
                byte r6 = r8[r5]     // Catch:{ all -> 0x0056 }
                int r5 = r5 + r0
                kotlin.jvm.internal.U r7 = kotlin.jvm.internal.U.f71764a     // Catch:{ all -> 0x0056 }
                java.lang.String r7 = "%02x"
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ all -> 0x0056 }
                java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0056 }
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)     // Catch:{ all -> 0x0056 }
                java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ all -> 0x0056 }
                java.lang.String r7 = "format(format, *args)"
                kotlin.jvm.internal.C6496s.g(r6, r7)     // Catch:{ all -> 0x0056 }
                r3.append(r6)     // Catch:{ all -> 0x0056 }
                goto L_0x0034
            L_0x0056:
                r8 = move-exception
                goto L_0x006b
            L_0x0058:
                lf.M r8 = lf.C6514M.f71813a     // Catch:{ all -> 0x0056 }
                wf.C6763c.a(r4, r1)     // Catch:{ all -> 0x0062 }
                java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0062 }
                return r8
            L_0x0062:
                r8 = move-exception
                goto L_0x0071
            L_0x0064:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x0066 }
            L_0x0066:
                r0 = move-exception
                wf.C6763c.a(r5, r8)     // Catch:{ all -> 0x0056 }
                throw r0     // Catch:{ all -> 0x0056 }
            L_0x006b:
                throw r8     // Catch:{ all -> 0x006c }
            L_0x006c:
                r0 = move-exception
                wf.C6763c.a(r4, r8)     // Catch:{ all -> 0x0062 }
                throw r0     // Catch:{ all -> 0x0062 }
            L_0x0071:
                lf.v$a r0 = lf.v.f71841b
                java.lang.Object r8 = lf.w.a(r8)
                java.lang.Object r8 = lf.v.b(r8)
                java.lang.Throwable r8 = lf.v.e(r8)
                if (r8 == 0) goto L_0x0082
                return r1
            L_0x0082:
                lf.k r8 = new lf.k
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.P.a.a(com.bugsnag.android.P):java.lang.String");
        }
    }

    byte[] a();
}
