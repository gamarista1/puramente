package com.google.android.gms.measurement.internal;

public final class M1 {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f54767g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f54768a;

    /* renamed from: b  reason: collision with root package name */
    private final K1 f54769b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f54770c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f54771d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f54772e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f54773f;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0048 */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f54771d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.c r4 = com.google.android.gms.measurement.internal.N1.f54789a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f54770c
            return r4
        L_0x000e:
            java.lang.Object r4 = f54767g
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C4583c.a()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.f54773f     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0020
            java.lang.Object r0 = r3.f54770c     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            goto L_0x006c
        L_0x0020:
            java.lang.Object r0 = r3.f54773f     // Catch:{ all -> 0x001e }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            return r0
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            java.util.List r4 = com.google.android.gms.measurement.internal.F.f54635a     // Catch:{ SecurityException -> 0x005a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005a }
        L_0x002d:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005a }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005a }
            com.google.android.gms.measurement.internal.M1 r0 = (com.google.android.gms.measurement.internal.M1) r0     // Catch:{ SecurityException -> 0x005a }
            boolean r1 = com.google.android.gms.measurement.internal.C4583c.a()     // Catch:{ SecurityException -> 0x005a }
            if (r1 != 0) goto L_0x0052
            r1 = 0
            com.google.android.gms.measurement.internal.K1 r2 = r0.f54769b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = f54767g     // Catch:{ SecurityException -> 0x005a }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005a }
            r0.f54773f = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002d
        L_0x004f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005a }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005a }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x005a:
            com.google.android.gms.measurement.internal.K1 r4 = r3.f54769b
            if (r4 != 0) goto L_0x0061
            java.lang.Object r4 = r3.f54770c
            return r4
        L_0x0061:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0069, IllegalStateException -> 0x0066 }
            return r4
        L_0x0066:
            java.lang.Object r4 = r3.f54770c
            return r4
        L_0x0069:
            java.lang.Object r4 = r3.f54770c
            return r4
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r0
        L_0x006e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.M1.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f54768a;
    }

    private M1(String str, Object obj, Object obj2, K1 k12, boolean z10) {
        this.f54771d = new Object();
        this.f54772e = null;
        this.f54773f = null;
        this.f54768a = str;
        this.f54770c = obj;
        this.f54769b = k12;
    }
}
