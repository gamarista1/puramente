package v1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.C1609x;
import androidx.collection.Y;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p1.h;
import v1.k;
import x1.C2896a;

abstract class i {

    /* renamed from: a  reason: collision with root package name */
    static final C1609x f26930a = new C1609x(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f26931b = l.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f26932c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final Y f26933d = new Y();

    class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f26934a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f26935b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f26936c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f26937d;

        a(String str, Context context, e eVar, int i10) {
            this.f26934a = str;
            this.f26935b = context;
            this.f26936c = eVar;
            this.f26937d = i10;
        }

        /* renamed from: a */
        public e call() {
            return i.c(this.f26934a, this.f26935b, h.a(new Object[]{this.f26936c}), this.f26937d);
        }
    }

    class b implements C2896a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2746a f26938a;

        b(C2746a aVar) {
            this.f26938a = aVar;
        }

        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f26938a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f26939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f26940b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f26941c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f26942d;

        c(String str, Context context, List list, int i10) {
            this.f26939a = str;
            this.f26940b = context;
            this.f26941c = list;
            this.f26942d = i10;
        }

        /* renamed from: a */
        public e call() {
            try {
                return i.c(this.f26939a, this.f26940b, this.f26941c, this.f26942d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements C2896a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f26943a;

        d(String str) {
            this.f26943a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 >= r2.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            ((x1.C2896a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(v1.i.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = v1.i.f26932c
                monitor-enter(r0)
                androidx.collection.Y r1 = v1.i.f26933d     // Catch:{ all -> 0x0011 }
                java.lang.String r2 = r4.f26943a     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0011 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r5 = move-exception
                goto L_0x002d
            L_0x0013:
                java.lang.String r3 = r4.f26943a     // Catch:{ all -> 0x0011 }
                r1.remove(r3)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                r0 = 0
            L_0x001a:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002c
                java.lang.Object r1 = r2.get(r0)
                x1.a r1 = (x1.C2896a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.i.d.accept(v1.i$e):void");
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((e) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(k.a aVar) {
        int i10 = 1;
        if (aVar.e() == 0) {
            k.b[] c10 = aVar.c();
            if (!(c10 == null || c10.length == 0)) {
                int length = c10.length;
                i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int b10 = c10[i11].b();
                    if (b10 == 0) {
                        i11++;
                    } else if (b10 < 0) {
                        return -3;
                    } else {
                        return b10;
                    }
                }
            }
            return i10;
        } else if (aVar.e() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4 = new v1.i.e(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        D3.a.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static v1.i.e c(java.lang.String r4, android.content.Context r5, java.util.List r6, int r7) {
        /*
            java.lang.String r0 = "getFontSync"
            D3.a.c(r0)
            androidx.collection.x r0 = f26930a     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            v1.i$e r4 = new v1.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r1)     // Catch:{ all -> 0x0018 }
            D3.a.f()
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x006d
        L_0x001a:
            r1 = 0
            v1.k$a r6 = v1.C2749d.e(r5, r6, r1)     // Catch:{ NameNotFoundException -> 0x0063 }
            int r2 = b(r6)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x002e
            v1.i$e r4 = new v1.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((int) r2)     // Catch:{ all -> 0x0018 }
            D3.a.f()
            return r4
        L_0x002e:
            boolean r2 = r6.f()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0043
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 29
            if (r2 < r3) goto L_0x0043
            java.util.List r6 = r6.d()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = p1.i.c(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
            goto L_0x004b
        L_0x0043:
            v1.k$b[] r6 = r6.c()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = p1.i.b(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
        L_0x004b:
            if (r5 == 0) goto L_0x0059
            r0.put(r4, r5)     // Catch:{ all -> 0x0018 }
            v1.i$e r4 = new v1.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r5)     // Catch:{ all -> 0x0018 }
            D3.a.f()
            return r4
        L_0x0059:
            v1.i$e r4 = new v1.i$e     // Catch:{ all -> 0x0018 }
            r5 = -3
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            D3.a.f()
            return r4
        L_0x0063:
            v1.i$e r4 = new v1.i$e     // Catch:{ all -> 0x0018 }
            r5 = -1
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            D3.a.f()
            return r4
        L_0x006d:
            D3.a.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.c(java.lang.String, android.content.Context, java.util.List, int):v1.i$e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new v1.i.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f26931b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        v1.l.c(r8, r9, new v1.i.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface d(android.content.Context r5, java.util.List r6, int r7, java.util.concurrent.Executor r8, v1.C2746a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            androidx.collection.x r1 = f26930a
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            v1.i$e r5 = new v1.i$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            v1.i$b r1 = new v1.i$b
            r1.<init>(r9)
            java.lang.Object r9 = f26932c
            monitor-enter(r9)
            androidx.collection.Y r2 = f26933d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            v1.i$c r9 = new v1.i$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f26931b
        L_0x0046:
            v1.i$d r5 = new v1.i$d
            r5.<init>(r0)
            v1.l.c(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.d(android.content.Context, java.util.List, int, java.util.concurrent.Executor, v1.a):android.graphics.Typeface");
    }

    static Typeface e(Context context, e eVar, C2746a aVar, int i10, int i11) {
        String a10 = a(h.a(new Object[]{eVar}), i10);
        Typeface typeface = (Typeface) f26930a.get(a10);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i11 == -1) {
            e c10 = c(a10, context, h.a(new Object[]{eVar}), i10);
            aVar.b(c10);
            return c10.f26944a;
        } else {
            try {
                e eVar2 = (e) l.d(f26931b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f26944a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f26944a;

        /* renamed from: b  reason: collision with root package name */
        final int f26945b;

        e(int i10) {
            this.f26944a = null;
            this.f26945b = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f26945b == 0) {
                return true;
            }
            return false;
        }

        e(Typeface typeface) {
            this.f26944a = typeface;
            this.f26945b = 0;
        }
    }
}
