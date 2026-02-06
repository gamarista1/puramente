package Ed;

import Pd.c;
import U7.g;
import U7.h;
import Yd.a;
import Yd.b;
import Yd.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import mf.C6559l;
import mf.C6565s;

public class e implements c, a, Pd.e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50765a;

    /* renamed from: b  reason: collision with root package name */
    private Pd.a f50766b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50767c;

    /* renamed from: d  reason: collision with root package name */
    private Yd.c f50768d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f50769e;

    /* renamed from: f  reason: collision with root package name */
    private final Queue f50770f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    private Yd.c f50771g;

    /* renamed from: h  reason: collision with root package name */
    private SharedPreferences f50772h;

    public e(Context context) {
        C6496s.h(context, "context");
        this.f50765a = context;
    }

    private final b A(String str, int i10) {
        d dVar;
        boolean z10;
        if (i10 == 0) {
            dVar = d.GRANTED;
        } else if (x(str)) {
            dVar = d.DENIED;
        } else {
            dVar = d.UNDETERMINED;
        }
        if (dVar == d.DENIED) {
            z10 = t(str);
        } else {
            z10 = true;
        }
        return new b(dVar, z10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[EDGE_INSN: B:38:0x0065->B:19:0x0065 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C(Md.d r6, java.util.Map r7) {
        /*
            java.lang.String r0 = "permissionsMap"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
        L_0x000d:
            r0 = r2
            goto L_0x0033
        L_0x000f:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x000d
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            Yd.b r3 = (Yd.b) r3
            Yd.d r3 = r3.b()
            Yd.d r4 = Yd.d.GRANTED
            if (r3 != r4) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            r0 = r1
        L_0x0033:
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x0065
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0040
            goto L_0x0063
        L_0x0040:
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0048:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            Yd.b r4 = (Yd.b) r4
            Yd.d r4 = r4.b()
            Yd.d r5 = Yd.d.DENIED
            if (r4 != r5) goto L_0x0065
            goto L_0x0048
        L_0x0063:
            r3 = r2
            goto L_0x0066
        L_0x0065:
            r3 = r1
        L_0x0066:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x006e
        L_0x006c:
            r1 = r2
            goto L_0x008e
        L_0x006e:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0076:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            Yd.b r4 = (Yd.b) r4
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x0076
        L_0x008e:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r2 = "expires"
            java.lang.String r4 = "never"
            r7.putString(r2, r4)
            if (r0 == 0) goto L_0x00a3
            Yd.d r2 = Yd.d.GRANTED
            java.lang.String r2 = r2.b()
            goto L_0x00b2
        L_0x00a3:
            if (r3 == 0) goto L_0x00ac
            Yd.d r2 = Yd.d.DENIED
            java.lang.String r2 = r2.b()
            goto L_0x00b2
        L_0x00ac:
            Yd.d r2 = Yd.d.UNDETERMINED
            java.lang.String r2 = r2.b()
        L_0x00b2:
            java.lang.String r3 = "status"
            r7.putString(r3, r2)
            java.lang.String r2 = "canAskAgain"
            r7.putBoolean(r2, r1)
            java.lang.String r1 = "granted"
            r7.putBoolean(r1, r0)
            r6.resolve(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ed.e.C(Md.d, java.util.Map):void");
    }

    private final boolean D() {
        return Settings.System.canWrite(this.f50765a.getApplicationContext());
    }

    private final boolean E(String str) {
        if (C6496s.c(str, "android.permission.WRITE_SETTINGS")) {
            return D();
        }
        if (y(str) == 0) {
            return true;
        }
        return false;
    }

    private final Map F(String[] strArr, int[] iArr) {
        HashMap hashMap = new HashMap();
        for (Pair pair : C6559l.B1(iArr, strArr)) {
            int intValue = ((Number) pair.a()).intValue();
            String str = (String) pair.b();
            hashMap.put(str, A(str, intValue));
        }
        return hashMap;
    }

    private final void m(String[] strArr) {
        SharedPreferences sharedPreferences = this.f50772h;
        if (sharedPreferences == null) {
            C6496s.v("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String putBoolean : strArr) {
            edit.putBoolean(putBoolean, true);
        }
        edit.apply();
    }

    /* access modifiers changed from: private */
    public static final void q(e eVar, Yd.c cVar, Map map) {
        int i10;
        if (eVar.D()) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        C6496s.e(map);
        map.put("android.permission.WRITE_SETTINGS", eVar.A("android.permission.WRITE_SETTINGS", i10));
        cVar.a(map);
    }

    /* access modifiers changed from: private */
    public static final void r(e eVar, Md.d dVar, String[] strArr, Map map) {
        eVar.h(dVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void s() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        String packageName = this.f50765a.getPackageName();
        intent.setData(Uri.parse("package:" + packageName));
        intent.addFlags(268435456);
        this.f50767c = true;
        this.f50765a.startActivity(intent);
    }

    private final boolean t(String str) {
        Activity a10;
        Pd.a aVar = this.f50766b;
        if (aVar == null || (a10 = aVar.a()) == null || !androidx.core.app.b.k(a10, str)) {
            return false;
        }
        return true;
    }

    private final h u() {
        return new a(this);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean v(Ed.e r5, int r6, java.lang.String[] r7, int[] r8) {
        /*
            java.lang.String r0 = "receivePermissions"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "grantResults"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r0 = 0
            r1 = 13
            if (r6 != r1) goto L_0x00c4
            monitor-enter(r5)
            Yd.c r6 = r5.f50771g     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x00ba
            java.util.Map r7 = r5.F(r7, r8)     // Catch:{ all -> 0x0031 }
            r6.a(r7)     // Catch:{ all -> 0x0031 }
            r6 = 0
            r5.f50771g = r6     // Catch:{ all -> 0x0031 }
            java.util.Queue r7 = r5.f50770f     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x0031 }
            kotlin.Pair r7 = (kotlin.Pair) r7     // Catch:{ all -> 0x0031 }
            if (r7 == 0) goto L_0x00b7
            Pd.a r8 = r5.f50766b     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x0034
            android.app.Activity r8 = r8.a()     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r6 = move-exception
            goto L_0x00c2
        L_0x0034:
            r8 = r6
        L_0x0035:
            boolean r2 = r8 instanceof U7.g     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x003c
            r6 = r8
            U7.g r6 = (U7.g) r6     // Catch:{ all -> 0x0031 }
        L_0x003c:
            if (r6 != 0) goto L_0x00a0
            java.lang.Object r6 = r7.d()     // Catch:{ all -> 0x0031 }
            Yd.c r6 = (Yd.c) r6     // Catch:{ all -> 0x0031 }
            java.lang.Object r8 = r7.c()     // Catch:{ all -> 0x0031 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch:{ all -> 0x0031 }
            int r7 = r7.length     // Catch:{ all -> 0x0031 }
            int[] r1 = new int[r7]     // Catch:{ all -> 0x0031 }
            r2 = r0
        L_0x0054:
            r3 = -1
            if (r2 >= r7) goto L_0x005c
            r1[r2] = r3     // Catch:{ all -> 0x0031 }
            int r2 = r2 + 1
            goto L_0x0054
        L_0x005c:
            java.util.Map r7 = r5.F(r8, r1)     // Catch:{ all -> 0x0031 }
            r6.a(r7)     // Catch:{ all -> 0x0031 }
            java.util.Queue r6 = r5.f50770f     // Catch:{ all -> 0x0031 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0031 }
        L_0x0069:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0031 }
            if (r7 == 0) goto L_0x009a
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0031 }
            kotlin.Pair r7 = (kotlin.Pair) r7     // Catch:{ all -> 0x0031 }
            java.lang.Object r8 = r7.d()     // Catch:{ all -> 0x0031 }
            Yd.c r8 = (Yd.c) r8     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r7.c()     // Catch:{ all -> 0x0031 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch:{ all -> 0x0031 }
            int r7 = r7.length     // Catch:{ all -> 0x0031 }
            int[] r2 = new int[r7]     // Catch:{ all -> 0x0031 }
            r4 = r0
        L_0x008b:
            if (r4 >= r7) goto L_0x0092
            r2[r4] = r3     // Catch:{ all -> 0x0031 }
            int r4 = r4 + 1
            goto L_0x008b
        L_0x0092:
            java.util.Map r7 = r5.F(r1, r2)     // Catch:{ all -> 0x0031 }
            r8.a(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0069
        L_0x009a:
            java.util.Queue r6 = r5.f50770f     // Catch:{ all -> 0x0031 }
            r6.clear()     // Catch:{ all -> 0x0031 }
            goto L_0x00b7
        L_0x00a0:
            java.lang.Object r8 = r7.d()     // Catch:{ all -> 0x0031 }
            Yd.c r8 = (Yd.c) r8     // Catch:{ all -> 0x0031 }
            r5.f50771g = r8     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0031 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0031 }
            U7.h r8 = r5.u()     // Catch:{ all -> 0x0031 }
            r6.b(r7, r1, r8)     // Catch:{ all -> 0x0031 }
            monitor-exit(r5)
            return r0
        L_0x00b7:
            monitor-exit(r5)
            r5 = 1
            return r5
        L_0x00ba:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0031 }
            r7.<init>(r6)     // Catch:{ all -> 0x0031 }
            throw r7     // Catch:{ all -> 0x0031 }
        L_0x00c2:
            monitor-exit(r5)
            throw r6
        L_0x00c4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ed.e.v(Ed.e, int, java.lang.String[], int[]):boolean");
    }

    private final boolean x(String str) {
        SharedPreferences sharedPreferences = this.f50772h;
        if (sharedPreferences == null) {
            C6496s.v("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private final int y(String str) {
        Activity a10;
        Pd.a aVar = this.f50766b;
        if (aVar == null || (a10 = aVar.a()) == null || !(a10 instanceof g)) {
            return z(str);
        }
        return androidx.core.content.c.checkSelfPermission(a10, str);
    }

    public void B(Yd.c cVar, String... strArr) {
        int i10;
        C6496s.h(cVar, "responseListener");
        C6496s.h(strArr, "permissions");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String E10 : strArr) {
            if (E(E10)) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        cVar.a(F(strArr, C6565s.d1(arrayList)));
    }

    public void e(Yd.c cVar, String... strArr) {
        C6496s.h(cVar, "responseListener");
        C6496s.h(strArr, "permissions");
        if (strArr.length == 0) {
            cVar.a(new LinkedHashMap());
        } else if (C6559l.W(strArr, "android.permission.WRITE_SETTINGS")) {
            List w12 = C6559l.w1(strArr);
            w12.remove("android.permission.WRITE_SETTINGS");
            String[] strArr2 = (String[]) w12.toArray(new String[0]);
            d dVar = new d(this, cVar);
            if (!D()) {
                if (this.f50768d == null) {
                    this.f50768d = dVar;
                    this.f50769e = strArr2;
                    m(new String[]{"android.permission.WRITE_SETTINGS"});
                    s();
                    return;
                }
                throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
            } else if (strArr2.length == 0) {
                dVar.a(new LinkedHashMap());
            } else {
                n(strArr2, dVar);
            }
        } else {
            n(strArr, cVar);
        }
    }

    public boolean f(String... strArr) {
        C6496s.h(strArr, "permissions");
        for (String E10 : strArr) {
            if (!E(E10)) {
                return false;
            }
        }
        return true;
    }

    public void g(Md.d dVar, String... strArr) {
        C6496s.h(dVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        C6496s.h(strArr, "permissions");
        e(new b(this, dVar, strArr), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void h(Md.d dVar, String... strArr) {
        C6496s.h(dVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        C6496s.h(strArr, "permissions");
        B(new c(dVar), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* access modifiers changed from: protected */
    public void n(String[] strArr, Yd.c cVar) {
        C6496s.h(strArr, "permissions");
        C6496s.h(cVar, "listener");
        w((String[]) Arrays.copyOf(strArr, strArr.length), cVar);
    }

    public List o() {
        return C6565s.e(a.class);
    }

    public void onHostResume() {
        if (this.f50767c) {
            boolean z10 = false;
            this.f50767c = false;
            Yd.c cVar = this.f50768d;
            C6496s.e(cVar);
            String[] strArr = this.f50769e;
            C6496s.e(strArr);
            this.f50768d = null;
            this.f50769e = null;
            if (strArr.length == 0) {
                z10 = true;
            }
            if (!z10) {
                n(strArr, cVar);
            } else {
                cVar.a(new LinkedHashMap());
            }
        }
    }

    public void p(Md.b bVar) {
        C6496s.h(bVar, "moduleRegistry");
        Pd.a aVar = (Pd.a) bVar.b(Pd.a.class);
        if (aVar != null) {
            this.f50766b = aVar;
            ((Qd.c) bVar.b(Qd.c.class)).c(this);
            this.f50772h = this.f50765a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
            return;
        }
        throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
    }

    /* access modifiers changed from: protected */
    public final void w(String[] strArr, Yd.c cVar) {
        Activity activity;
        C6496s.h(strArr, "permissions");
        C6496s.h(cVar, "listener");
        m(strArr);
        Pd.a aVar = this.f50766b;
        if (aVar != null) {
            activity = aVar.a();
        } else {
            activity = null;
        }
        if (activity instanceof g) {
            synchronized (this) {
                try {
                    if (this.f50771g != null) {
                        this.f50770f.add(C6502A.a(strArr, cVar));
                    } else {
                        this.f50771g = cVar;
                        ((g) activity).b(strArr, 13, u());
                        C6514M m10 = C6514M.f71813a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = -1;
        }
        cVar.a(F(strArr, iArr));
    }

    /* access modifiers changed from: protected */
    public int z(String str) {
        C6496s.h(str, "permission");
        return androidx.core.content.c.checkSelfPermission(this.f50765a, str);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }
}
