package Ud;

import D3.a;
import Ff.p;
import Ff.r;
import Ug.C5582n;
import android.content.Context;
import android.net.Uri;
import expo.modules.filesystem.next.FileSystemDirectory;
import expo.modules.filesystem.next.FileSystemFile;
import expo.modules.filesystem.next.FileSystemFileHandle;
import expo.modules.filesystem.next.FileSystemPath;
import expo.modules.kotlin.exception.e;
import expo.modules.kotlin.types.Either;
import ie.C5035e;
import io.intercom.android.sdk.models.AttributeType;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import ke.b;
import ke.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lf.v;
import lf.w;
import pe.j;
import qe.C5155b;
import qe.C5157d;
import qf.C6658d;
import rh.C6708e;
import rh.C6709f;
import xf.C6781a;
import yf.C6787a;
import yf.C6798l;
import yf.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LUd/d;", "Lke/b;", "<init>", "()V", "Lke/d;", "b", "()Lke/d;", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "context", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends b {

    public static final class A implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].W0();
            return C6514M.f71813a;
        }
    }

    public static final class B implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final B f53376a = new B();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class C implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].B0();
            return C6514M.f71813a;
        }
    }

    public static final class D implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final D f53377a = new D();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class E implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final E f53378a = new E();

        /* renamed from: a */
        public final p invoke() {
            r.a aVar = r.f62882c;
            return kotlin.jvm.internal.O.n(Either.class, aVar.d(kotlin.jvm.internal.O.m(String.class)), aVar.d(kotlin.jvm.internal.O.m(j.class)));
        }
    }

    public static final class F implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            FileSystemFile fileSystemFile = objArr[0];
            Either either = objArr[1];
            FileSystemFile fileSystemFile2 = fileSystemFile;
            Class<String> cls = String.class;
            if (either.e(kotlin.jvm.internal.O.b(cls))) {
                fileSystemFile2.n1((String) either.b(kotlin.jvm.internal.O.b(cls)));
            }
            Class<j> cls2 = j.class;
            if (either.f(kotlin.jvm.internal.O.b(cls2))) {
                fileSystemFile2.z1((j) either.c(kotlin.jvm.internal.O.b(cls2)));
            }
            return C6514M.f71813a;
        }
    }

    public static final class G implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return Boolean.valueOf(objArr[0].E0());
        }
    }

    public static final class H implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return objArr[0].o0();
        }
    }

    public static final class I implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            try {
                return objArr[0].I0();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class J implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            try {
                return objArr[0].L0();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final class K implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return objArr[0].P0();
        }
    }

    public static final class L implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final L f53379a = new L();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class M implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return new FileSystemFileHandle(objArr[0]);
        }
    }

    public static final class N implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final N f53380a = new N();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFileHandle.class);
        }
    }

    public static final class O implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final O f53381a = new O();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(Integer.TYPE);
        }
    }

    public static final class P implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].g0(objArr[1].intValue());
        }
    }

    public static final class Q implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final Q f53382a = new Q();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFileHandle.class);
        }
    }

    public static final class R implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final R f53383a = new R();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(byte[].class);
        }
    }

    public static final class S implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].j0(objArr[1]);
            return C6514M.f71813a;
        }
    }

    public static final class T implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final T f53384a = new T();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFileHandle.class);
        }
    }

    public static final class U implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].close();
            return C6514M.f71813a;
        }
    }

    public static final class V implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return objArr[0].V();
        }
    }

    public static final class W implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return objArr[0].f0();
        }
    }

    public static final class X implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final X f53385a = new X();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(Long.TYPE);
        }
    }

    public static final class Y implements C6798l {
        public final void a(Object[] objArr) {
            C6496s.h(objArr, "it");
            FileSystemFileHandle fileSystemFileHandle = objArr[0];
            Long l10 = objArr[1];
            if (l10 != null) {
                fileSystemFileHandle.h0(Long.valueOf(l10.longValue()));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Object[]) obj);
            return C6514M.f71813a;
        }
    }

    public static final class Z implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final Z f53386a = new Z();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(URI.class);
        }
    }

    /* renamed from: Ud.d$a  reason: case insensitive filesystem */
    public static final class C4432a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4432a f53387a = new C4432a();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class a0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return new FileSystemDirectory(new File(objArr[0].getPath()));
        }
    }

    /* renamed from: Ud.d$b  reason: case insensitive filesystem */
    public static final class C4433b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4433b f53388a = new C4433b();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFileHandle.class);
        }
    }

    public static final class b0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b0 f53389a = new b0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$c  reason: case insensitive filesystem */
    public static final class C4434c implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4434c f53390a = new C4434c();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    public static final class c0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final c0 f53391a = new c0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemPath.class);
        }
    }

    /* renamed from: Ud.d$d  reason: collision with other inner class name */
    public static final class C0812d implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0812d f53392a = new C0812d();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(URI.class);
        }
    }

    public static final class d0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].g0(objArr[1]);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$e  reason: case insensitive filesystem */
    public static final class C4435e implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4435e f53393a = new C4435e();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemPath.class);
        }
    }

    public static final class e0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f53394a = new e0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$f  reason: case insensitive filesystem */
    public static final class C4436f extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f53395a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f53396b;

        /* renamed from: c  reason: collision with root package name */
        Object f53397c;

        /* renamed from: d  reason: collision with root package name */
        Object f53398d;

        /* renamed from: e  reason: collision with root package name */
        Object f53399e;

        /* renamed from: f  reason: collision with root package name */
        Object f53400f;

        public C4436f(C6658d dVar) {
            super(3, dVar);
        }

        /* renamed from: i */
        public final Object invoke(Ug.K k10, Object[] objArr, C6658d dVar) {
            C4436f fVar = new C4436f(dVar);
            fVar.f53396b = objArr;
            return fVar.invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            wf.C6763c.a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
            wf.C6763c.a(r9, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fb, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r8.f53395a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 != r3) goto L_0x0024
                java.lang.Object r0 = r8.f53400f
                Ud.d$f r0 = (Ud.d.C4436f) r0
                java.lang.Object r0 = r8.f53399e
                rh.C r0 = (rh.C) r0
                java.lang.Object r0 = r8.f53398d
                rh.A r0 = (rh.C6703A) r0
                java.lang.Object r0 = r8.f53397c
                java.net.URI r0 = (java.net.URI) r0
                java.lang.Object r1 = r8.f53396b
                expo.modules.filesystem.next.FileSystemPath r1 = (expo.modules.filesystem.next.FileSystemPath) r1
                lf.w.b(r9)
                goto L_0x0092
            L_0x0024:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x002c:
                lf.w.b(r9)
                java.lang.Object r9 = r8.f53396b
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                r1 = r9[r2]
                r9 = r9[r3]
                expo.modules.filesystem.next.FileSystemPath r9 = (expo.modules.filesystem.next.FileSystemPath) r9
                java.net.URI r1 = (java.net.URI) r1
                Xd.c r4 = Xd.c.WRITE
                r9.h0(r4)
                rh.C$a r4 = new rh.C$a
                r4.<init>()
                java.net.URL r5 = r1.toURL()
                java.lang.String r6 = "toURL(...)"
                kotlin.jvm.internal.C6496s.g(r5, r6)
                rh.C$a r4 = r4.m(r5)
                rh.C r4 = r4.b()
                rh.A r5 = new rh.A
                r5.<init>()
                r8.f53396b = r9
                r8.f53397c = r1
                r8.f53398d = r5
                r8.f53399e = r4
                r8.f53400f = r8
                r8.f53395a = r3
                Ug.o r6 = new Ug.o
                qf.d r7 = rf.C6680b.c(r8)
                r6.<init>(r7, r3)
                r6.E()
                rh.e r3 = r5.a(r4)
                Ud.d$g r4 = new Ud.d$g
                r4.<init>(r6)
                com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r3, r4)
                java.lang.Object r3 = r6.v()
                java.lang.Object r4 = rf.C6680b.f()
                if (r3 != r4) goto L_0x008c
                kotlin.coroutines.jvm.internal.h.c(r8)
            L_0x008c:
                if (r3 != r0) goto L_0x008f
                return r0
            L_0x008f:
                r0 = r1
                r1 = r9
                r9 = r3
            L_0x0092:
                rh.E r9 = (rh.E) r9
                boolean r3 = r9.m0()
                if (r3 == 0) goto L_0x010a
                rh.u r3 = r9.F()
                java.lang.String r4 = "content-disposition"
                java.lang.String r3 = r3.a(r4)
                rh.u r4 = r9.F()
                java.lang.String r5 = "content-type"
                java.lang.String r4 = r4.a(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = android.webkit.URLUtil.guessFileName(r0, r3, r4)
                boolean r3 = r1 instanceof expo.modules.filesystem.next.FileSystemDirectory
                if (r3 == 0) goto L_0x00c4
                java.io.File r3 = new java.io.File
                java.io.File r1 = r1.V()
                r3.<init>(r1, r0)
                goto L_0x00c8
            L_0x00c4:
                java.io.File r3 = r1.V()
            L_0x00c8:
                boolean r0 = r3.exists()
                if (r0 != 0) goto L_0x0104
                rh.F r9 = r9.a()
                if (r9 == 0) goto L_0x00fc
                java.io.InputStream r9 = r9.a()
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ed }
                r0.<init>(r3)     // Catch:{ all -> 0x00ed }
                r1 = 2
                r4 = 0
                wf.C6762b.b(r9, r0, r2, r1, r4)     // Catch:{ all -> 0x00ef }
                wf.C6763c.a(r0, r4)     // Catch:{ all -> 0x00ed }
                wf.C6763c.a(r9, r4)
                java.lang.String r9 = r3.getPath()
                return r9
            L_0x00ed:
                r0 = move-exception
                goto L_0x00f6
            L_0x00ef:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00f1 }
            L_0x00f1:
                r2 = move-exception
                wf.C6763c.a(r0, r1)     // Catch:{ all -> 0x00ed }
                throw r2     // Catch:{ all -> 0x00ed }
            L_0x00f6:
                throw r0     // Catch:{ all -> 0x00f7 }
            L_0x00f7:
                r1 = move-exception
                wf.C6763c.a(r9, r0)
                throw r1
            L_0x00fc:
                Ud.j r9 = new Ud.j
                java.lang.String r0 = "response body is null"
                r9.<init>(r0)
                throw r9
            L_0x0104:
                Ud.b r9 = new Ud.b
                r9.<init>()
                throw r9
            L_0x010a:
                Ud.j r0 = new Ud.j
                int r9 = r9.o()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "response has status: "
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ud.d.C4436f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].B0();
        }
    }

    /* renamed from: Ud.d$g  reason: case insensitive filesystem */
    public static final class C4437g implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f53401a;

        public C4437g(C5582n nVar) {
            this.f53401a = nVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            if (!this.f53401a.isCancelled()) {
                C5582n nVar = this.f53401a;
                v.a aVar = v.f71841b;
                nVar.resumeWith(v.b(w.a(iOException)));
            }
        }

        public void onResponse(C6708e eVar, rh.E e10) {
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            this.f53401a.resumeWith(v.b(e10));
        }
    }

    public static final class g0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final g0 f53402a = new g0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$h  reason: case insensitive filesystem */
    public static final class C4438h implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4438h f53403a = new C4438h();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(URI.class);
        }
    }

    public static final class h0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            FileSystemPath.U(objArr[0], (File) null, 1, (Object) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$i  reason: case insensitive filesystem */
    public static final class C4439i implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return new FileSystemFile(new File(objArr[0].getPath()));
        }
    }

    public static final class i0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final i0 f53404a = new i0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$j  reason: case insensitive filesystem */
    public static final class C4440j implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4440j f53405a = new C4440j();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class j0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].t0();
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$k  reason: case insensitive filesystem */
    public static final class C4441k implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].R0();
        }
    }

    public static final class k0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final k0 f53406a = new k0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$l  reason: case insensitive filesystem */
    public static final class C4442l implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4442l f53407a = new C4442l();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class l0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].E0();
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$m  reason: case insensitive filesystem */
    public static final class C4443m implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].t0();
        }
    }

    public static final class m0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m0 f53408a = new m0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemDirectory.class);
        }
    }

    /* renamed from: Ud.d$n  reason: case insensitive filesystem */
    public static final class C4444n implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4444n f53409a = new C4444n();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class n0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final n0 f53410a = new n0();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemPath.class);
        }
    }

    /* renamed from: Ud.d$o  reason: case insensitive filesystem */
    public static final class C4445o implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return objArr[0].x0();
        }
    }

    public static final class o0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].Q(objArr[1]);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$p  reason: case insensitive filesystem */
    public static final class C4446p implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4446p f53411a = new C4446p();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    public static final class p0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return Boolean.valueOf(objArr[0].x0());
        }
    }

    /* renamed from: Ud.d$q  reason: case insensitive filesystem */
    public static final class C4447q implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4447q f53412a = new C4447q();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemPath.class);
        }
    }

    public static final class q0 implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            return objArr[0].o0();
        }
    }

    /* renamed from: Ud.d$r  reason: case insensitive filesystem */
    public static final class C4448r implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].Q(objArr[1]);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$s  reason: case insensitive filesystem */
    public static final class C4449s implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4449s f53413a = new C4449s();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    /* renamed from: Ud.d$t  reason: case insensitive filesystem */
    public static final class C4450t implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4450t f53414a = new C4450t();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    /* renamed from: Ud.d$u  reason: case insensitive filesystem */
    public static final class C4451u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4451u f53415a = new C4451u();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemPath.class);
        }
    }

    /* renamed from: Ud.d$v  reason: case insensitive filesystem */
    public static final class C4452v implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            objArr[0].g0(objArr[1]);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$w  reason: case insensitive filesystem */
    public static final class C4453w implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4453w f53416a = new C4453w();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    /* renamed from: Ud.d$x  reason: case insensitive filesystem */
    public static final class C4454x implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            return new FileSystemFileHandle(objArr[0]);
        }
    }

    /* renamed from: Ud.d$y  reason: case insensitive filesystem */
    public static final class C4455y implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            FileSystemPath.U(objArr[0], (File) null, 1, (Object) null);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Ud.d$z  reason: case insensitive filesystem */
    public static final class C4456z implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4456z f53417a = new C4456z();

        /* renamed from: a */
        public final p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemFile.class);
        }
    }

    /* access modifiers changed from: private */
    public final Context l() {
        Context u10 = c().u();
        if (u10 != null) {
            return u10;
        }
        throw new e();
    }

    public ke.d b() {
        String str;
        String str2;
        String str3;
        Class<FileSystemPath> cls;
        String str4;
        String str5;
        String str6;
        Class<URI> cls2;
        String str7;
        String str8;
        Class<Object> cls3;
        Class<Either> cls4 = Either.class;
        Class<Boolean> cls5 = Boolean.class;
        Class<URI> cls6 = URI.class;
        Class<byte[]> cls7 = byte[].class;
        Class<Object> cls8 = Object.class;
        Class<FileSystemPath> cls9 = FileSystemPath.class;
        Class<FileSystemFileHandle> cls10 = FileSystemFileHandle.class;
        Class<FileSystemDirectory> cls11 = FileSystemDirectory.class;
        Class<String> cls12 = String.class;
        Class<FileSystemFile> cls13 = FileSystemFile.class;
        Class<C6514M> cls14 = C6514M.class;
        Class<List> cls15 = List.class;
        Class<Long> cls16 = Long.class;
        StringBuilder sb2 = new StringBuilder();
        String str9 = com.amazon.a.a.o.b.au;
        sb2.append("[");
        sb2.append("ExpoModulesCore");
        sb2.append("] ");
        sb2.append(getClass() + ".ModuleDefinition");
        a.c(sb2.toString());
        try {
            c cVar = new c(this);
            cVar.o("FileSystemNext");
            Class<Boolean> cls17 = cls5;
            Class<byte[]> cls18 = cls7;
            cVar.e(C6502A.a("documentDirectory", Uri.fromFile(l().getFilesDir()) + "/"), C6502A.a("cacheDirectory", Uri.fromFile(l().getCacheDir()) + "/"), C6502A.a("bundleDirectory", "asset:///"));
            C5035e c10 = cVar.c("downloadFileAsync");
            String b10 = c10.b();
            C5157d dVar = C5157d.f61437a;
            c cVar2 = cVar;
            Ff.d b11 = kotlin.jvm.internal.O.b(cls6);
            Class<Either> cls19 = cls4;
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b11, bool));
            if (bVar == null) {
                str3 = "create";
                str2 = "validatePath";
                str = "delete";
                bVar = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls6), false, C0812d.f53392a));
            } else {
                str3 = "create";
                str2 = "validatePath";
                str = "delete";
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls9), bool));
            if (bVar2 == null) {
                cls = cls9;
                bVar2 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls9), false, C4435e.f53393a));
            } else {
                cls = cls9;
            }
            c10.c(new ie.p(b10, new C5155b[]{bVar, bVar2}, new C4436f((C6658d) null)));
            Ff.d b12 = kotlin.jvm.internal.O.b(cls13);
            String simpleName = C6781a.b(b12).getSimpleName();
            C6496s.g(simpleName, "getSimpleName(...)");
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4432a.f53387a));
            }
            ee.c cVar3 = new ee.c(simpleName, b12, bVar3);
            C5155b bVar4 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls6), bool));
            if (bVar4 == null) {
                bVar4 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls6), false, C4438h.f53403a));
            }
            C5155b[] bVarArr = {bVar4};
            qe.W w10 = qe.W.f61408a;
            qe.V v10 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls8));
            if (v10 == null) {
                v10 = new qe.V(kotlin.jvm.internal.O.b(cls8));
                w10.a().put(kotlin.jvm.internal.O.b(cls8), v10);
            }
            cVar3.u(new ie.r("constructor", bVarArr, v10, new C4439i()));
            C5155b bVar5 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar5 == null) {
                bVar5 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4450t.f53414a));
            }
            C5155b[] bVarArr2 = {bVar5};
            qe.V v11 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v11 == null) {
                v11 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v11);
            }
            String str10 = str;
            cVar3.n().put(str10, new ie.r(str10, bVarArr2, v11, new C4455y()));
            C5155b bVar6 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar6 == null) {
                bVar6 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4456z.f53417a));
            }
            C5155b[] bVarArr3 = {bVar6};
            qe.V v12 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v12 == null) {
                v12 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v12);
            }
            String str11 = str2;
            cVar3.n().put(str11, new ie.r(str11, bVarArr3, v12, new A()));
            C5155b bVar7 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar7 == null) {
                str4 = str11;
                bVar7 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, B.f53376a));
            } else {
                str4 = str11;
            }
            C5155b[] bVarArr4 = {bVar7};
            qe.V v13 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v13 == null) {
                v13 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v13);
            }
            String str12 = str3;
            cVar3.n().put(str12, new ie.r(str12, bVarArr4, v13, new C()));
            C5155b bVar8 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar8 == null) {
                str6 = str12;
                str5 = str10;
                bVar8 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, D.f53377a));
            } else {
                str5 = str10;
                str6 = str12;
            }
            C5155b bVar9 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls19), bool));
            if (bVar9 == null) {
                E e10 = E.f53378a;
                Ff.d b13 = kotlin.jvm.internal.O.b(cls19);
                cls2 = cls6;
                bVar9 = new C5155b(new qe.O(b13, false, e10));
            } else {
                cls2 = cls6;
            }
            C5155b[] bVarArr5 = {bVar8, bVar9};
            qe.V v14 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v14 == null) {
                v14 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v14);
            }
            cVar3.n().put("write", new ie.r("write", bVarArr5, v14, new F()));
            C5155b bVar10 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar10 == null) {
                bVar10 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4440j.f53405a));
            }
            C5155b[] bVarArr6 = {bVar10};
            qe.V v15 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v15 == null) {
                v15 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v15);
            }
            cVar3.n().put(AttributeType.TEXT, new ie.r(AttributeType.TEXT, bVarArr6, v15, new C4441k()));
            C5155b bVar11 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar11 == null) {
                bVar11 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4442l.f53407a));
            }
            C5155b[] bVarArr7 = {bVar11};
            qe.V v16 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v16 == null) {
                v16 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v16);
            }
            cVar3.n().put("base64", new ie.r("base64", bVarArr7, v16, new C4443m()));
            C5155b bVar12 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar12 == null) {
                bVar12 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4444n.f53409a));
            }
            C5155b[] bVarArr8 = {bVar12};
            qe.V v17 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls18));
            if (v17 == null) {
                v17 = new qe.V(kotlin.jvm.internal.O.b(cls18));
                w10.a().put(kotlin.jvm.internal.O.b(cls18), v17);
            }
            cVar3.n().put("bytes", new ie.r("bytes", bVarArr8, v17, new C4445o()));
            le.j jVar = new le.j(cVar3.t().f(), "exists");
            C5155b[] bVarArr9 = {new C5155b(jVar.d())};
            qe.V v18 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls17));
            if (v18 == null) {
                v18 = new qe.V(kotlin.jvm.internal.O.b(cls17));
                w10.a().put(kotlin.jvm.internal.O.b(cls17), v18);
            }
            String str13 = str9;
            ie.r rVar = new ie.r(str13, bVarArr9, v18, new G());
            rVar.k(jVar.d());
            rVar.j(true);
            jVar.b(rVar);
            cVar3.m().put("exists", jVar);
            C5155b bVar13 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar13 == null) {
                bVar13 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4446p.f53411a));
            }
            C5155b bVar14 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (bVar14 == null) {
                str7 = "constructor";
                bVar14 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls), false, C4447q.f53412a));
            } else {
                str7 = "constructor";
            }
            C5155b[] bVarArr10 = {bVar13, bVar14};
            qe.V v19 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v19 == null) {
                v19 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v19);
            }
            cVar3.n().put("copy", new ie.r("copy", bVarArr10, v19, new C4448r()));
            C5155b bVar15 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar15 == null) {
                bVar15 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4449s.f53413a));
            }
            C5155b bVar16 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (bVar16 == null) {
                bVar16 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls), false, C4451u.f53415a));
            }
            C5155b[] bVarArr11 = {bVar15, bVar16};
            qe.V v20 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v20 == null) {
                v20 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v20);
            }
            cVar3.n().put("move", new ie.r("move", bVarArr11, v20, new C4452v()));
            le.j jVar2 = new le.j(cVar3.t().f(), "uri");
            C5155b[] bVarArr12 = {new C5155b(jVar2.d())};
            qe.V v21 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v21 == null) {
                v21 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v21);
            }
            ie.r rVar2 = new ie.r(str13, bVarArr12, v21, new H());
            rVar2.k(jVar2.d());
            rVar2.j(true);
            jVar2.b(rVar2);
            cVar3.m().put("uri", jVar2);
            le.j jVar3 = new le.j(cVar3.t().f(), "md5");
            C5155b[] bVarArr13 = {new C5155b(jVar3.d())};
            qe.V v22 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v22 == null) {
                v22 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v22);
            }
            ie.r rVar3 = new ie.r(str13, bVarArr13, v22, new I());
            rVar3.k(jVar3.d());
            rVar3.j(true);
            jVar3.b(rVar3);
            cVar3.m().put("md5", jVar3);
            le.j jVar4 = new le.j(cVar3.t().f(), "size");
            C5155b[] bVarArr14 = {new C5155b(jVar4.d())};
            qe.V v23 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls16));
            if (v23 == null) {
                v23 = new qe.V(kotlin.jvm.internal.O.b(cls16));
                w10.a().put(kotlin.jvm.internal.O.b(cls16), v23);
            }
            ie.r rVar4 = new ie.r(str13, bVarArr14, v23, new J());
            rVar4.k(jVar4.d());
            rVar4.j(true);
            jVar4.b(rVar4);
            cVar3.m().put("size", jVar4);
            le.j jVar5 = new le.j(cVar3.t().f(), "type");
            C5155b[] bVarArr15 = {new C5155b(jVar5.d())};
            qe.V v24 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v24 == null) {
                v24 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v24);
            }
            ie.r rVar5 = new ie.r(str13, bVarArr15, v24, new K());
            rVar5.k(jVar5.d());
            rVar5.j(true);
            jVar5.b(rVar5);
            cVar3.m().put("type", jVar5);
            C5155b bVar17 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar17 == null) {
                bVar17 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, C4453w.f53416a));
            }
            C5155b[] bVarArr16 = {bVar17};
            qe.V v25 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls10));
            if (v25 == null) {
                v25 = new qe.V(kotlin.jvm.internal.O.b(cls10));
                w10.a().put(kotlin.jvm.internal.O.b(cls10), v25);
            }
            cVar3.n().put("open", new ie.r("open", bVarArr16, v25, new C4454x()));
            cVar2.q().add(cVar3.q());
            Ff.d b14 = kotlin.jvm.internal.O.b(cls10);
            String simpleName2 = C6781a.b(b14).getSimpleName();
            C6496s.g(simpleName2, "getSimpleName(...)");
            C5155b bVar18 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls10), bool));
            if (bVar18 == null) {
                bVar18 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls10), false, C4433b.f53388a));
            }
            ee.c cVar4 = new ee.c(simpleName2, b14, bVar18);
            C5155b bVar19 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool));
            if (bVar19 == null) {
                bVar19 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, L.f53379a));
            }
            C5155b[] bVarArr17 = {bVar19};
            qe.V v26 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls8));
            if (v26 == null) {
                v26 = new qe.V(kotlin.jvm.internal.O.b(cls8));
                w10.a().put(kotlin.jvm.internal.O.b(cls8), v26);
            }
            String str14 = str7;
            cVar4.u(new ie.r(str14, bVarArr17, v26, new M()));
            C5155b bVar20 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls10), bool));
            if (bVar20 == null) {
                bVar20 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls10), false, N.f53380a));
            }
            C5155b bVar21 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(Integer.class), bool));
            if (bVar21 == null) {
                str8 = str14;
                bVar21 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(Integer.class), false, O.f53381a));
            } else {
                str8 = str14;
            }
            C5155b[] bVarArr18 = {bVar20, bVar21};
            qe.V v27 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls18));
            if (v27 == null) {
                v27 = new qe.V(kotlin.jvm.internal.O.b(cls18));
                w10.a().put(kotlin.jvm.internal.O.b(cls18), v27);
            }
            cVar4.n().put("readBytes", new ie.r("readBytes", bVarArr18, v27, new P()));
            C5155b bVar22 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls10), bool));
            if (bVar22 == null) {
                bVar22 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls10), false, Q.f53382a));
            }
            C5155b bVar23 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls18), bool));
            if (bVar23 == null) {
                bVar23 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls18), false, R.f53383a));
            }
            C5155b[] bVarArr19 = {bVar22, bVar23};
            qe.V v28 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v28 == null) {
                v28 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v28);
            }
            cVar4.n().put("writeBytes", new ie.r("writeBytes", bVarArr19, v28, new S()));
            C5155b bVar24 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls10), bool));
            if (bVar24 == null) {
                bVar24 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls10), false, T.f53384a));
            }
            C5155b[] bVarArr20 = {bVar24};
            qe.V v29 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v29 == null) {
                v29 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v29);
            }
            cVar4.n().put("close", new ie.r("close", bVarArr20, v29, new U()));
            le.j jVar6 = new le.j(cVar4.t().f(), com.amazon.device.iap.internal.c.b.as);
            C5155b[] bVarArr21 = {new C5155b(jVar6.d())};
            qe.V v30 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls16));
            if (v30 == null) {
                v30 = new qe.V(kotlin.jvm.internal.O.b(cls16));
                w10.a().put(kotlin.jvm.internal.O.b(cls16), v30);
            }
            ie.r rVar6 = new ie.r(str13, bVarArr21, v30, new V());
            rVar6.k(jVar6.d());
            rVar6.j(true);
            jVar6.b(rVar6);
            cVar4.m().put(com.amazon.device.iap.internal.c.b.as, jVar6);
            C5155b bVar25 = new C5155b(jVar6.d());
            C5155b bVar26 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls16), bool));
            if (bVar26 == null) {
                cls3 = cls8;
                bVar26 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls16), false, X.f53385a));
            } else {
                cls3 = cls8;
            }
            C5155b[] bVarArr22 = {bVar25, bVar26};
            qe.V v31 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v31 == null) {
                v31 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v31);
            }
            ie.r rVar7 = new ie.r("set", bVarArr22, v31, new Y());
            rVar7.k(jVar6.d());
            rVar7.j(true);
            jVar6.c(rVar7);
            le.j jVar7 = new le.j(cVar4.t().f(), "size");
            C5155b[] bVarArr23 = {new C5155b(jVar7.d())};
            qe.V v32 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls16));
            if (v32 == null) {
                v32 = new qe.V(kotlin.jvm.internal.O.b(cls16));
                w10.a().put(kotlin.jvm.internal.O.b(cls16), v32);
            }
            ie.r rVar8 = new ie.r(str13, bVarArr23, v32, new W());
            rVar8.k(jVar7.d());
            rVar8.j(true);
            jVar7.b(rVar8);
            cVar4.m().put("size", jVar7);
            cVar2.q().add(cVar4.q());
            Ff.d b15 = kotlin.jvm.internal.O.b(cls11);
            String simpleName3 = C6781a.b(b15).getSimpleName();
            C6496s.g(simpleName3, "getSimpleName(...)");
            C5155b bVar27 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar27 == null) {
                bVar27 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, C4434c.f53390a));
            }
            ee.c cVar5 = new ee.c(simpleName3, b15, bVar27);
            C5155b bVar28 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool));
            if (bVar28 == null) {
                bVar28 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls2), false, Z.f53386a));
            }
            C5155b[] bVarArr24 = {bVar28};
            qe.V v33 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (v33 == null) {
                v33 = new qe.V(kotlin.jvm.internal.O.b(cls3));
                w10.a().put(kotlin.jvm.internal.O.b(cls3), v33);
            }
            cVar5.u(new ie.r(str8, bVarArr24, v33, new a0()));
            C5155b bVar29 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar29 == null) {
                bVar29 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, g0.f53402a));
            }
            C5155b[] bVarArr25 = {bVar29};
            qe.V v34 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v34 == null) {
                v34 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v34);
            }
            String str15 = str5;
            cVar5.n().put(str15, new ie.r(str15, bVarArr25, v34, new h0()));
            C5155b bVar30 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar30 == null) {
                bVar30 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, i0.f53404a));
            }
            C5155b[] bVarArr26 = {bVar30};
            qe.V v35 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v35 == null) {
                v35 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v35);
            }
            String str16 = str6;
            cVar5.n().put(str16, new ie.r(str16, bVarArr26, v35, new j0()));
            le.j jVar8 = new le.j(cVar5.t().f(), "exists");
            C5155b[] bVarArr27 = {new C5155b(jVar8.d())};
            qe.V v36 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls17));
            if (v36 == null) {
                v36 = new qe.V(kotlin.jvm.internal.O.b(cls17));
                w10.a().put(kotlin.jvm.internal.O.b(cls17), v36);
            }
            ie.r rVar9 = new ie.r(str13, bVarArr27, v36, new p0());
            rVar9.k(jVar8.d());
            rVar9.j(true);
            jVar8.b(rVar9);
            cVar5.m().put("exists", jVar8);
            C5155b bVar31 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar31 == null) {
                bVar31 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, k0.f53406a));
            }
            C5155b[] bVarArr28 = {bVar31};
            qe.V v37 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v37 == null) {
                v37 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v37);
            }
            String str17 = str4;
            cVar5.n().put(str17, new ie.r(str17, bVarArr28, v37, new l0()));
            C5155b bVar32 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar32 == null) {
                bVar32 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, m0.f53408a));
            }
            C5155b bVar33 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (bVar33 == null) {
                bVar33 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls), false, n0.f53410a));
            }
            C5155b[] bVarArr29 = {bVar32, bVar33};
            qe.V v38 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v38 == null) {
                v38 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v38);
            }
            cVar5.n().put("copy", new ie.r("copy", bVarArr29, v38, new o0()));
            C5155b bVar34 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar34 == null) {
                bVar34 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, b0.f53389a));
            }
            C5155b bVar35 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls), bool));
            if (bVar35 == null) {
                bVar35 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls), false, c0.f53391a));
            }
            C5155b[] bVarArr30 = {bVar34, bVar35};
            qe.V v39 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls14));
            if (v39 == null) {
                v39 = new qe.V(kotlin.jvm.internal.O.b(cls14));
                w10.a().put(kotlin.jvm.internal.O.b(cls14), v39);
            }
            cVar5.n().put("move", new ie.r("move", bVarArr30, v39, new d0()));
            le.j jVar9 = new le.j(cVar5.t().f(), "uri");
            C5155b[] bVarArr31 = {new C5155b(jVar9.d())};
            qe.V v40 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls12));
            if (v40 == null) {
                v40 = new qe.V(kotlin.jvm.internal.O.b(cls12));
                w10.a().put(kotlin.jvm.internal.O.b(cls12), v40);
            }
            ie.r rVar10 = new ie.r(str13, bVarArr31, v40, new q0());
            rVar10.k(jVar9.d());
            rVar10.j(true);
            jVar9.b(rVar10);
            cVar5.m().put("uri", jVar9);
            C5155b bVar36 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool));
            if (bVar36 == null) {
                bVar36 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, e0.f53394a));
            }
            C5155b[] bVarArr32 = {bVar36};
            qe.V v41 = (qe.V) w10.a().get(kotlin.jvm.internal.O.b(cls15));
            if (v41 == null) {
                v41 = new qe.V(kotlin.jvm.internal.O.b(cls15));
                w10.a().put(kotlin.jvm.internal.O.b(cls15), v41);
            }
            cVar5.n().put("listAsRecords", new ie.r("listAsRecords", bVarArr32, v41, new f0()));
            cVar2.q().add(cVar5.q());
            ke.d p10 = cVar2.p();
            a.f();
            return p10;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            a.f();
            throw th3;
        }
    }
}
