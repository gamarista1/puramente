package Ea;

import Ga.C4293e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.c;
import java.lang.reflect.Method;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int f50664a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f50665b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f50666c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f50667d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f50668e;

    /* renamed from: f  reason: collision with root package name */
    private static final Method f50669f;

    /* renamed from: g  reason: collision with root package name */
    private static final Method f50670g;

    /* renamed from: h  reason: collision with root package name */
    private static final Method f50671h;

    /* renamed from: i  reason: collision with root package name */
    private static final Method f50672i;

    /* renamed from: j  reason: collision with root package name */
    private static Boolean f50673j = null;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f50664a = r2
            r2 = 0
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0016 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0016 }
            java.lang.reflect.Method r3 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            f50665b = r3
            boolean r3 = Ea.n.c()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == 0) goto L_0x002c
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002c }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch:{ Exception -> 0x002c }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            f50666c = r0
            java.lang.String r0 = "size"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            f50667d = r0
            java.lang.String r0 = "get"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0046 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0046 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            f50668e = r0
            boolean r0 = Ea.n.c()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "getName"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x005c }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x005c }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            f50669f = r0
            boolean r0 = Ea.n.i()
            java.lang.String r3 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "createWorkChain"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x006e }
            goto L_0x0075
        L_0x006e:
            r0 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r3, r5, r0)
        L_0x0074:
            r0 = r2
        L_0x0075:
            f50670g = r0
            boolean r0 = Ea.n.i()
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r5 = "addNode"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0090 }
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r4}     // Catch:{ Exception -> 0x0090 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r0 = move-exception
            java.lang.String r4 = "Missing WorkChain class"
            android.util.Log.w(r3, r4, r0)
        L_0x0096:
            r0 = r2
        L_0x0097:
            f50671h = r0
            boolean r0 = Ea.n.i()
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch:{ Exception -> 0x00aa }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ab
        L_0x00aa:
            r0 = r2
        L_0x00ab:
            f50672i = r0
            f50673j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ea.r.<clinit>():void");
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f50666c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i10), str});
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f50665b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c10 = C4293e.a(context).c(str, 0);
                if (c10 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (r.class) {
            Boolean bool = f50673j;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            boolean z10 = false;
            if (context == null) {
                return false;
            }
            if (c.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z10 = true;
            }
            f50673j = Boolean.valueOf(z10);
            return z10;
        }
    }
}
