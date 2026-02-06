package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37539a = new c("Serializer");

    /* renamed from: b  reason: collision with root package name */
    private static final Class[] f37540b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a A[Catch:{ all -> 0x001d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.Serializable r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r2.writeObject(r6)     // Catch:{ IOException -> 0x0020 }
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x0020 }
            java.lang.String r6 = com.amazon.c.a.a.c.a((byte[]) r1)     // Catch:{ IOException -> 0x0020 }
            com.amazon.a.a.o.a.a((java.io.OutputStream) r2)
            return r6
        L_0x001d:
            r6 = move-exception
            r0 = r2
            goto L_0x0044
        L_0x0020:
            r1 = move-exception
            goto L_0x0026
        L_0x0022:
            r6 = move-exception
            goto L_0x0044
        L_0x0024:
            r1 = move-exception
            r2 = r0
        L_0x0026:
            boolean r3 = com.amazon.a.a.o.c.f37535b     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0040
            com.amazon.a.a.o.c r3 = f37539a     // Catch:{ all -> 0x001d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
            r4.<init>()     // Catch:{ all -> 0x001d }
            java.lang.String r5 = "Could not serialize object: "
            r4.append(r5)     // Catch:{ all -> 0x001d }
            r4.append(r6)     // Catch:{ all -> 0x001d }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x001d }
            r3.b(r6, r1)     // Catch:{ all -> 0x001d }
        L_0x0040:
            com.amazon.a.a.o.a.a((java.io.OutputStream) r2)
            return r0
        L_0x0044:
            com.amazon.a.a.o.a.a((java.io.OutputStream) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.o.c.a.a(java.io.Serializable):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[Catch:{ all -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005e
            int r1 = r6.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x005e
        L_0x000a:
            byte[] r1 = r6.getBytes()     // Catch:{ IOException -> 0x0052 }
            byte[] r1 = com.amazon.c.a.a.c.c((byte[]) r1)     // Catch:{ IOException -> 0x0052 }
            com.amazon.a.a.o.c.a.f r2 = new com.amazon.a.a.o.c.a.f     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            java.lang.Class[] r1 = f37540b     // Catch:{ Exception -> 0x002c }
            r2.a((java.lang.Class<?>[]) r1)     // Catch:{ Exception -> 0x002c }
            java.lang.Object r0 = r2.readObject()     // Catch:{ Exception -> 0x002c }
        L_0x0025:
            com.amazon.a.a.o.a.a((java.io.InputStream) r2)
            goto L_0x004d
        L_0x0029:
            r6 = move-exception
            r0 = r2
            goto L_0x004e
        L_0x002c:
            r1 = move-exception
            goto L_0x0032
        L_0x002e:
            r6 = move-exception
            goto L_0x004e
        L_0x0030:
            r1 = move-exception
            r2 = r0
        L_0x0032:
            boolean r3 = com.amazon.a.a.o.c.f37535b     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0025
            com.amazon.a.a.o.c r3 = f37539a     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Could not read object from string: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r6)     // Catch:{ all -> 0x0029 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.b(r6, r1)     // Catch:{ all -> 0x0029 }
            goto L_0x0025
        L_0x004d:
            return r0
        L_0x004e:
            com.amazon.a.a.o.a.a((java.io.InputStream) r0)
            throw r6
        L_0x0052:
            r6 = move-exception
            boolean r1 = com.amazon.a.a.o.c.f37535b
            if (r1 == 0) goto L_0x005e
            com.amazon.a.a.o.c r1 = f37539a
            java.lang.String r2 = "Could not decode string"
            r1.b(r2, r6)
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.o.c.a.a(java.lang.String):java.lang.Object");
    }
}
