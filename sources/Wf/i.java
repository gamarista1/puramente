package wf;

import Rg.h;
import com.google.android.gms.common.api.a;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6549b;
import yf.C6798l;
import yf.p;

public final class i implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f73711a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j f73712b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6798l f73713c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C6798l f73714d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final p f73715e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final int f73716f;

    private static abstract class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            C6496s.h(file, "rootDir");
        }
    }

    private final class b extends C6549b {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayDeque f73717c;

        private final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f73719b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f73720c;

            /* renamed from: d  reason: collision with root package name */
            private int f73721d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f73722e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f73723f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                C6496s.h(file, "rootDir");
                this.f73723f = bVar;
            }

            public File b() {
                if (!this.f73722e && this.f73720c == null) {
                    C6798l e10 = i.this.f73713c;
                    if (e10 != null && !((Boolean) e10.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f73720c = listFiles;
                    if (listFiles == null) {
                        p f10 = i.this.f73715e;
                        if (f10 != null) {
                            f10.invoke(a(), new C6761a(a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f73722e = true;
                    }
                }
                File[] fileArr = this.f73720c;
                if (fileArr != null) {
                    int i10 = this.f73721d;
                    C6496s.e(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f73720c;
                        C6496s.e(fileArr2);
                        int i11 = this.f73721d;
                        this.f73721d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f73719b) {
                    this.f73719b = true;
                    return a();
                }
                C6798l g10 = i.this.f73714d;
                if (g10 != null) {
                    g10.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: wf.i$b$b  reason: collision with other inner class name */
        private final class C1076b extends c {

            /* renamed from: b  reason: collision with root package name */
            private boolean f73724b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f73725c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1076b(b bVar, File file) {
                super(file);
                C6496s.h(file, "rootFile");
                this.f73725c = bVar;
            }

            public File b() {
                if (this.f73724b) {
                    return null;
                }
                this.f73724b = true;
                return a();
            }
        }

        private final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f73726b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f73727c;

            /* renamed from: d  reason: collision with root package name */
            private int f73728d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f73729e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                C6496s.h(file, "rootDir");
                this.f73729e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
                if (r0.length == 0) goto L_0x0081;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f73726b
                    r1 = 0
                    if (r0 != 0) goto L_0x0028
                    wf.i$b r0 = r10.f73729e
                    wf.i r0 = wf.i.this
                    yf.l r0 = r0.f73713c
                    if (r0 == 0) goto L_0x0020
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0020
                    return r1
                L_0x0020:
                    r0 = 1
                    r10.f73726b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L_0x0028:
                    java.io.File[] r0 = r10.f73727c
                    if (r0 == 0) goto L_0x0047
                    int r2 = r10.f73728d
                    kotlin.jvm.internal.C6496s.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0035
                    goto L_0x0047
                L_0x0035:
                    wf.i$b r0 = r10.f73729e
                    wf.i r0 = wf.i.this
                    yf.l r0 = r0.f73714d
                    if (r0 == 0) goto L_0x0046
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0046:
                    return r1
                L_0x0047:
                    java.io.File[] r0 = r10.f73727c
                    if (r0 != 0) goto L_0x0093
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f73727c = r0
                    if (r0 != 0) goto L_0x0077
                    wf.i$b r0 = r10.f73729e
                    wf.i r0 = wf.i.this
                    yf.p r0 = r0.f73715e
                    if (r0 == 0) goto L_0x0077
                    java.io.File r2 = r10.a()
                    wf.a r9 = new wf.a
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x0077:
                    java.io.File[] r0 = r10.f73727c
                    if (r0 == 0) goto L_0x0081
                    kotlin.jvm.internal.C6496s.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0093
                L_0x0081:
                    wf.i$b r0 = r10.f73729e
                    wf.i r0 = wf.i.this
                    yf.l r0 = r0.f73714d
                    if (r0 == 0) goto L_0x0092
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L_0x0092:
                    return r1
                L_0x0093:
                    java.io.File[] r0 = r10.f73727c
                    kotlin.jvm.internal.C6496s.e(r0)
                    int r1 = r10.f73728d
                    int r2 = r1 + 1
                    r10.f73728d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.i.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f73730a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    wf.j[] r0 = wf.j.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    wf.j r1 = wf.j.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    wf.j r1 = wf.j.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f73730a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: wf.i.b.d.<clinit>():void");
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f73717c = arrayDeque;
            if (i.this.f73711a.isDirectory()) {
                arrayDeque.push(g(i.this.f73711a));
            } else if (i.this.f73711a.isFile()) {
                arrayDeque.push(new C1076b(this, i.this.f73711a));
            } else {
                b();
            }
        }

        private final a g(File file) {
            int i10 = d.f73730a[i.this.f73712b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new C6535s();
        }

        private final File j() {
            File b10;
            while (true) {
                c cVar = (c) this.f73717c.peek();
                if (cVar == null) {
                    return null;
                }
                b10 = cVar.b();
                if (b10 == null) {
                    this.f73717c.pop();
                } else if (C6496s.c(b10, cVar.a()) || !b10.isDirectory() || this.f73717c.size() >= i.this.f73716f) {
                    return b10;
                } else {
                    this.f73717c.push(g(b10));
                }
            }
            return b10;
        }

        /* access modifiers changed from: protected */
        public void a() {
            File j10 = j();
            if (j10 != null) {
                c(j10);
            } else {
                b();
            }
        }
    }

    private static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f73731a;

        public c(File file) {
            C6496s.h(file, "root");
            this.f73731a = file;
        }

        public final File a() {
            return this.f73731a;
        }

        public abstract File b();
    }

    private i(File file, j jVar, C6798l lVar, C6798l lVar2, p pVar, int i10) {
        this.f73711a = file;
        this.f73712b = jVar;
        this.f73713c = lVar;
        this.f73714d = lVar2;
        this.f73715e = pVar;
        this.f73716f = i10;
    }

    public final i i(p pVar) {
        C6496s.h(pVar, "function");
        return new i(this.f73711a, this.f73712b, this.f73713c, this.f73714d, pVar, this.f73716f);
    }

    public Iterator iterator() {
        return new b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ i(File file, j jVar, C6798l lVar, C6798l lVar2, p pVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? j.TOP_DOWN : jVar, lVar, lVar2, pVar, (i11 & 32) != 0 ? a.e.API_PRIORITY_OTHER : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(File file, j jVar) {
        this(file, jVar, (C6798l) null, (C6798l) null, (p) null, 0, 32, (DefaultConstructorMarker) null);
        C6496s.h(file, OpsMetricTracker.START);
        C6496s.h(jVar, "direction");
    }
}
