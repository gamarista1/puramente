package com.google.android.gms.common.internal;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.internal.o  reason: case insensitive filesystem */
public class C4533o {

    /* renamed from: b  reason: collision with root package name */
    private static final C4528j f54205b = new C4528j("LibraryVersion", "");

    /* renamed from: c  reason: collision with root package name */
    private static final C4533o f54206c = new C4533o();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f54207a = new ConcurrentHashMap();

    protected C4533o() {
    }

    public static C4533o a() {
        return f54206c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.C4536s.g(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f54207a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L_0x001a
            java.util.concurrent.ConcurrentHashMap r0 = r8.f54207a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            java.lang.Object[] r5 = new java.lang.Object[]{r9}     // Catch:{ IOException -> 0x0075 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ IOException -> 0x0075 }
            java.lang.Class<com.google.android.gms.common.internal.o> r5 = com.google.android.gms.common.internal.C4533o.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch:{ IOException -> 0x0075 }
            if (r4 == 0) goto L_0x005c
            r2.load(r4)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            com.google.android.gms.common.internal.j r2 = f54205b     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.<init>()     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.append(r9)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.append(r3)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r2.d(r1, r5)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            goto L_0x008e
        L_0x0055:
            r9 = move-exception
            goto L_0x0071
        L_0x0057:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L_0x0077
        L_0x005c:
            com.google.android.gms.common.internal.j r2 = f54205b     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.<init>()     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.append(r0)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r5.append(r9)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r2.e(r1, r5)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            goto L_0x008e
        L_0x0071:
            r3 = r4
            goto L_0x00a4
        L_0x0073:
            r9 = move-exception
            goto L_0x00a4
        L_0x0075:
            r2 = move-exception
            r4 = r3
        L_0x0077:
            com.google.android.gms.common.internal.j r5 = f54205b     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r6.<init>()     // Catch:{ all -> 0x0073 }
            r6.append(r0)     // Catch:{ all -> 0x0073 }
            r6.append(r9)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0073 }
            r5.c(r1, r0, r2)     // Catch:{ all -> 0x0073 }
            r7 = r4
            r4 = r3
            r3 = r7
        L_0x008e:
            if (r4 == 0) goto L_0x0093
            Ea.k.a(r4)
        L_0x0093:
            if (r3 != 0) goto L_0x009e
            com.google.android.gms.common.internal.j r0 = f54205b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.b(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        L_0x009e:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f54207a
            r0.put(r9, r3)
            return r3
        L_0x00a4:
            if (r3 == 0) goto L_0x00a9
            Ea.k.a(r3)
        L_0x00a9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4533o.b(java.lang.String):java.lang.String");
    }
}
