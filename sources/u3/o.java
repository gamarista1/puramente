package u3;

import Sg.p;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import mf.Y;
import p.C2383b;
import wf.C6763c;
import y3.C2936a;
import y3.g;
import y3.k;

public class o {

    /* renamed from: q  reason: collision with root package name */
    public static final a f26662q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f26663r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    private final u f26664a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f26665b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f26666c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f26667d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f26668e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C2711c f26669f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f26670g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f26671h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k f26672i;

    /* renamed from: j  reason: collision with root package name */
    private final b f26673j;

    /* renamed from: k  reason: collision with root package name */
    private final m f26674k;

    /* renamed from: l  reason: collision with root package name */
    private final C2383b f26675l;

    /* renamed from: m  reason: collision with root package name */
    private r f26676m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f26677n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f26678o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f26679p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g gVar) {
            C6496s.h(gVar, "database");
            if (gVar.q1()) {
                gVar.S();
            } else {
                gVar.g();
            }
        }

        public final String b(String str, String str2) {
            C6496s.h(str, "tableName");
            C6496s.h(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f26680e = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final long[] f26681a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f26682b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f26683c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26684d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f26681a = new long[i10];
            this.f26682b = new boolean[i10];
            this.f26683c = new int[i10];
        }

        public final int[] a() {
            boolean z10;
            synchronized (this) {
                try {
                    if (!this.f26684d) {
                        return null;
                    }
                    long[] jArr = this.f26681a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        if (jArr[i10] > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean[] zArr = this.f26682b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f26683c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f26683c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f26684d = false;
                    int[] iArr2 = (int[]) this.f26683c.clone();
                    return iArr2;
                } finally {
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z10;
            C6496s.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f26681a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            this.f26684d = true;
                            z10 = true;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
            return z10;
        }

        public final boolean c(int... iArr) {
            boolean z10;
            C6496s.h(iArr, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : iArr) {
                        long[] jArr = this.f26681a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            this.f26684d = true;
                            z10 = true;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                } finally {
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f26682b, false);
                this.f26684d = true;
                C6514M m10 = C6514M.f71813a;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f26685a;

        public c(String[] strArr) {
            C6496s.h(strArr, "tables");
            this.f26685a = strArr;
        }

        public final String[] a() {
            return this.f26685a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f26686a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f26687b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f26688c;

        /* renamed from: d  reason: collision with root package name */
        private final Set f26689d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z10;
            Set set;
            C6496s.h(cVar, "observer");
            C6496s.h(iArr, "tableIds");
            C6496s.h(strArr, "tableNames");
            this.f26686a = cVar;
            this.f26687b = iArr;
            this.f26688c = strArr;
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                set = Y.d(strArr[0]);
            } else {
                set = Y.e();
            }
            this.f26689d = set;
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f26687b;
        }

        public final void b(Set set) {
            Set set2;
            C6496s.h(set, "invalidatedTablesIds");
            int[] iArr = this.f26687b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set b10 = Y.b();
                    int[] iArr2 = this.f26687b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i10]))) {
                            b10.add(this.f26688c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    set2 = Y.a(b10);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f26689d;
                } else {
                    set2 = Y.e();
                }
            } else {
                set2 = Y.e();
            }
            if (!set2.isEmpty()) {
                this.f26686a.c(set2);
            }
        }

        public final void c(String[] strArr) {
            Set set;
            C6496s.h(strArr, "tables");
            int length = this.f26688c.length;
            if (length != 0) {
                if (length == 1) {
                    int length2 = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            set = Y.e();
                            break;
                        } else if (p.v(strArr[i10], this.f26688c[0], true)) {
                            set = this.f26689d;
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    Set b10 = Y.b();
                    for (String str : strArr) {
                        for (String str2 : this.f26688c) {
                            if (p.v(str2, str, true)) {
                                b10.add(str2);
                            }
                        }
                    }
                    set = Y.a(b10);
                }
            } else {
                set = Y.e();
            }
            if (!set.isEmpty()) {
                this.f26686a.c(set);
            }
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f26690a;

        e(o oVar) {
            this.f26690a = oVar;
        }

        private final Set a() {
            o oVar = this.f26690a;
            Set b10 = Y.b();
            Cursor y10 = u.y(oVar.e(), new C2936a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null, 2, (Object) null);
            while (y10.moveToNext()) {
                try {
                    b10.add(Integer.valueOf(y10.getInt(0)));
                } catch (Throwable th2) {
                    C6763c.a(y10, th);
                    throw th2;
                }
            }
            C6514M m10 = C6514M.f71813a;
            C6763c.a(y10, (Throwable) null);
            Set a10 = Y.a(b10);
            if (!a10.isEmpty()) {
                if (this.f26690a.d() != null) {
                    k d10 = this.f26690a.d();
                    if (d10 != null) {
                        d10.C();
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return a10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
            if (r2.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
            r0 = r4.f26690a.f();
            r1 = r4.f26690a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.f().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
            if (r1.hasNext() == false) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
            ((u3.o.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
            r1 = lf.C6514M.f71813a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                u3.o r0 = r4.f26690a
                u3.u r0 = r0.e()
                java.util.concurrent.locks.Lock r0 = r0.k()
                r0.lock()
                u3.o r1 = r4.f26690a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.c()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0024
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x0023
                r0.e()
            L_0x0023:
                return
            L_0x0024:
                u3.o r1 = r4.f26690a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.g()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r2 = 1
                r3 = 0
                boolean r1 = r1.compareAndSet(r2, r3)     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0041
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x0040
                r0.e()
            L_0x0040:
                return
            L_0x0041:
                u3.o r1 = r4.f26690a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                u3.u r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.q()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 == 0) goto L_0x005c
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x005b
                r0.e()
            L_0x005b:
                return
            L_0x005c:
                u3.o r1 = r4.f26690a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                u3.u r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y3.h r1 = r1.m()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                y3.g r1 = r1.X0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r1.S()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.Set r2 = r4.a()     // Catch:{ all -> 0x008d }
                r1.j()     // Catch:{ all -> 0x008d }
                r1.k()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x00c0
            L_0x0082:
                r0.e()
                goto L_0x00c0
            L_0x0086:
                r1 = move-exception
                goto L_0x00f9
            L_0x0089:
                r1 = move-exception
                goto L_0x0092
            L_0x008b:
                r1 = move-exception
                goto L_0x00a9
            L_0x008d:
                r2 = move-exception
                r1.k()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                throw r2     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
            L_0x0092:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = mf.Y.e()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00a9:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = mf.Y.e()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00c0:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00f8
                u3.o r0 = r4.f26690a
                p.b r0 = r0.f()
                u3.o r1 = r4.f26690a
                monitor-enter(r0)
                p.b r1 = r1.f()     // Catch:{ all -> 0x00f0 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f0 }
            L_0x00da:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x00f2
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00f0 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00f0 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00f0 }
                u3.o$d r3 = (u3.o.d) r3     // Catch:{ all -> 0x00f0 }
                r3.b(r2)     // Catch:{ all -> 0x00f0 }
                goto L_0x00da
            L_0x00f0:
                r1 = move-exception
                goto L_0x00f6
            L_0x00f2:
                lf.M r1 = lf.C6514M.f71813a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r0)
                goto L_0x00f8
            L_0x00f6:
                monitor-exit(r0)
                throw r1
            L_0x00f8:
                return
            L_0x00f9:
                r0.unlock()
                u3.o r0 = r4.f26690a
                u3.c r0 = r0.f26669f
                if (r0 == 0) goto L_0x0107
                r0.e()
            L_0x0107:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u3.o.e.run():void");
        }
    }

    public o(u uVar, Map map, Map map2, String... strArr) {
        String str;
        C6496s.h(uVar, "database");
        C6496s.h(map, "shadowTablesMap");
        C6496s.h(map2, "viewTables");
        C6496s.h(strArr, "tableNames");
        this.f26664a = uVar;
        this.f26665b = map;
        this.f26666c = map2;
        this.f26673j = new b(strArr.length);
        this.f26674k = new m(uVar);
        this.f26675l = new C2383b();
        this.f26677n = new Object();
        this.f26678o = new Object();
        this.f26667d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f26667d.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f26665b.get(strArr[i10]);
            if (str3 != null) {
                C6496s.g(locale, "US");
                str = str3.toLowerCase(locale);
                C6496s.g(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f26668e = strArr2;
        for (Map.Entry entry : this.f26665b.entrySet()) {
            Locale locale2 = Locale.US;
            C6496s.g(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f26667d.containsKey(lowerCase2)) {
                C6496s.g(locale2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                C6496s.g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f26667d;
                map3.put(lowerCase3, O.j(map3, lowerCase2));
            }
        }
        this.f26679p = new e(this);
    }

    private final String[] n(String[] strArr) {
        Set b10 = Y.b();
        for (String str : strArr) {
            Map map = this.f26666c;
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f26666c;
                C6496s.g(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                C6496s.e(obj);
                b10.addAll((Collection) obj);
            } else {
                b10.add(str);
            }
        }
        Object[] array = Y.a(b10).toArray(new String[0]);
        C6496s.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void q(g gVar, int i10) {
        gVar.z("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f26668e[i10];
        for (String str2 : f26663r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f26662q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i10 + " AND " + "invalidated" + " = 0" + "; END";
            C6496s.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.z(str3);
        }
    }

    private final void r(g gVar, int i10) {
        String str = this.f26668e[i10];
        for (String str2 : f26663r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f26662q.b(str, str2);
            C6496s.g(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.z(str3);
        }
    }

    public void b(c cVar) {
        d dVar;
        C6496s.h(cVar, "observer");
        String[] n10 = n(cVar.a());
        ArrayList arrayList = new ArrayList(n10.length);
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            String str = n10[i10];
            Map map = this.f26667d;
            Locale locale = Locale.US;
            C6496s.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] d12 = C6565s.d1(arrayList);
        d dVar2 = new d(cVar, d12, n10);
        synchronized (this.f26675l) {
            dVar = (d) this.f26675l.k(cVar, dVar2);
        }
        if (dVar == null && this.f26673j.b(Arrays.copyOf(d12, d12.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.f26664a.w()) {
            return false;
        }
        if (!this.f26671h) {
            this.f26664a.m().X0();
        }
        if (this.f26671h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k d() {
        return this.f26672i;
    }

    public final u e() {
        return this.f26664a;
    }

    public final C2383b f() {
        return this.f26675l;
    }

    public final AtomicBoolean g() {
        return this.f26670g;
    }

    public final Map h() {
        return this.f26667d;
    }

    public final void i(g gVar) {
        C6496s.h(gVar, "database");
        synchronized (this.f26678o) {
            if (this.f26671h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.z("PRAGMA temp_store = MEMORY;");
            gVar.z("PRAGMA recursive_triggers='ON';");
            gVar.z("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(gVar);
            this.f26672i = gVar.G0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f26671h = true;
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void j(String... strArr) {
        C6496s.h(strArr, "tables");
        synchronized (this.f26675l) {
            try {
                for (Map.Entry entry : this.f26675l) {
                    C6496s.g(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } finally {
            }
        }
    }

    public final void k() {
        synchronized (this.f26678o) {
            this.f26671h = false;
            this.f26673j.d();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public void l() {
        if (this.f26670g.compareAndSet(false, true)) {
            C2711c cVar = this.f26669f;
            if (cVar != null) {
                cVar.j();
            }
            this.f26664a.n().execute(this.f26679p);
        }
    }

    public void m(c cVar) {
        d dVar;
        C6496s.h(cVar, "observer");
        synchronized (this.f26675l) {
            dVar = (d) this.f26675l.m(cVar);
        }
        if (dVar != null) {
            b bVar = this.f26673j;
            int[] a10 = dVar.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                s();
            }
        }
    }

    public final void o(C2711c cVar) {
        C6496s.h(cVar, "autoCloser");
        this.f26669f = cVar;
        cVar.m(new n(this));
    }

    public final void p(Context context, String str, Intent intent) {
        C6496s.h(context, "context");
        C6496s.h(str, "name");
        C6496s.h(intent, "serviceIntent");
        this.f26676m = new r(context, str, intent, this, this.f26664a.n());
    }

    public final void s() {
        if (this.f26664a.w()) {
            t(this.f26664a.m().X0());
        }
    }

    public final void t(g gVar) {
        Lock k10;
        C6496s.h(gVar, "database");
        if (!gVar.o1()) {
            try {
                k10 = this.f26664a.k();
                k10.lock();
                synchronized (this.f26677n) {
                    int[] a10 = this.f26673j.a();
                    if (a10 == null) {
                        k10.unlock();
                        return;
                    }
                    f26662q.a(gVar);
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                q(gVar, i11);
                            } else if (i12 == 2) {
                                r(gVar, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        gVar.j();
                        gVar.k();
                        C6514M m10 = C6514M.f71813a;
                        k10.unlock();
                    } finally {
                        gVar.k();
                    }
                }
            } catch (IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            } catch (SQLiteException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            } catch (Throwable th2) {
                k10.unlock();
                throw th2;
            }
        }
    }
}
