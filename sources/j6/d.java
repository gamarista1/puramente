package j6;

import X6.C3096t;
import X6.C3097u;
import X6.x;
import android.content.Context;
import j7.b;
import u6.C4093e;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f44808a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private static g f44809b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f44810c = false;

    public static C3096t a() {
        return b().j();
    }

    public static x b() {
        return x.l();
    }

    public static boolean c() {
        return f44810c;
    }

    public static void d(Context context) {
        e(context, (C3097u) null, (b) null);
    }

    public static void e(Context context, C3097u uVar, b bVar) {
        f(context, uVar, bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (j7.b.d() != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        j7.b.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        w8.C4145a.b(new w8.C4147c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (j7.b.d() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        w8.C4145a.b(new w8.C4147c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (j7.b.d() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        w8.C4145a.b(new w8.C4147c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (j7.b.d() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        w8.C4145a.b(new w8.C4147c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (j7.b.d() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (j7.b.d() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        j7.b.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0054, B:23:0x0063, B:27:0x0072, B:31:0x0081] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0081 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0081=Splitter:B:31:0x0081, B:27:0x0072=Splitter:B:27:0x0072, B:23:0x0063=Splitter:B:23:0x0063, B:19:0x0054=Splitter:B:19:0x0054} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(android.content.Context r2, X6.C3097u r3, j6.b r4, boolean r5) {
        /*
            boolean r0 = j7.b.d()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "Fresco#initialize"
            j7.b.a(r0)
        L_0x000b:
            boolean r0 = f44810c
            if (r0 == 0) goto L_0x0017
            java.lang.Class r0 = f44808a
            java.lang.String r1 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            U5.a.E(r0, r1)
            goto L_0x001a
        L_0x0017:
            r0 = 1
            f44810c = r0
        L_0x001a:
            X6.y.b(r5)
            boolean r5 = w8.C4145a.c()
            if (r5 != 0) goto L_0x009a
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x002e
            java.lang.String r5 = "Fresco.initialize->SoLoader.init"
            j7.b.a(r5)
        L_0x002e:
            java.lang.String r5 = "com.facebook.imagepipeline.nativecode.NativeCodeInitializer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0081, IllegalAccessException -> 0x0072, InvocationTargetException -> 0x0063, NoSuchMethodException -> 0x0054 }
            java.lang.String r0 = "init"
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ ClassNotFoundException -> 0x0081, IllegalAccessException -> 0x0072, InvocationTargetException -> 0x0063, NoSuchMethodException -> 0x0054 }
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0081, IllegalAccessException -> 0x0072, InvocationTargetException -> 0x0063, NoSuchMethodException -> 0x0054 }
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ ClassNotFoundException -> 0x0081, IllegalAccessException -> 0x0072, InvocationTargetException -> 0x0063, NoSuchMethodException -> 0x0054 }
            r1 = 0
            r5.invoke(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0081, IllegalAccessException -> 0x0072, InvocationTargetException -> 0x0063, NoSuchMethodException -> 0x0054 }
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x009a
        L_0x004e:
            j7.b.b()
            goto L_0x009a
        L_0x0052:
            r2 = move-exception
            goto L_0x0090
        L_0x0054:
            w8.c r5 = new w8.c     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            w8.C4145a.b(r5)     // Catch:{ all -> 0x0052 }
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x009a
            goto L_0x004e
        L_0x0063:
            w8.c r5 = new w8.c     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            w8.C4145a.b(r5)     // Catch:{ all -> 0x0052 }
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x009a
            goto L_0x004e
        L_0x0072:
            w8.c r5 = new w8.c     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            w8.C4145a.b(r5)     // Catch:{ all -> 0x0052 }
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x009a
            goto L_0x004e
        L_0x0081:
            w8.c r5 = new w8.c     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            w8.C4145a.b(r5)     // Catch:{ all -> 0x0052 }
            boolean r5 = j7.b.d()
            if (r5 == 0) goto L_0x009a
            goto L_0x004e
        L_0x0090:
            boolean r3 = j7.b.d()
            if (r3 == 0) goto L_0x0099
            j7.b.b()
        L_0x0099:
            throw r2
        L_0x009a:
            android.content.Context r2 = r2.getApplicationContext()
            if (r3 != 0) goto L_0x00a4
            X6.x.r(r2)
            goto L_0x00a7
        L_0x00a4:
            X6.x.q(r3)
        L_0x00a7:
            g(r2, r4)
            boolean r2 = j7.b.d()
            if (r2 == 0) goto L_0x00b3
            j7.b.b()
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.d.f(android.content.Context, X6.u, j6.b, boolean):void");
    }

    private static void g(Context context, b bVar) {
        if (b.d()) {
            b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, bVar);
        f44809b = gVar;
        C4093e.g(gVar);
        if (b.d()) {
            b.b();
        }
    }

    public static f h() {
        return f44809b.get();
    }
}
