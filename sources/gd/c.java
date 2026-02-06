package Gd;

import Ff.p;
import Sg.C5541d;
import Ug.K;
import ae.C4464a;
import android.content.Context;
import android.net.Uri;
import ie.C5035e;
import java.io.File;
import java.net.URI;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.w;
import mf.C6559l;
import qe.C5155b;
import qe.C5157d;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LGd/c;", "Lke/b;", "<init>", "()V", "Ljava/net/URI;", "uri", "", "u", "(Ljava/net/URI;)Ljava/lang/String;", "Ljava/io/File;", "file", "s", "(Ljava/io/File;)Ljava/lang/String;", "Lae/a;", "appContext", "localUrl", "Landroid/net/Uri;", "q", "(Lae/a;Ljava/net/URI;Ljava/io/File;Lqf/d;)Ljava/lang/Object;", "Lke/d;", "b", "()Lke/d;", "Landroid/content/Context;", "r", "()Landroid/content/Context;", "context", "expo-asset_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends ke.b {

    public static final class a implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50844a = new a();

        /* renamed from: a */
        public final p invoke() {
            return O.m(URI.class);
        }
    }

    public static final class b implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f50845a = new b();

        /* renamed from: a */
        public final p invoke() {
            return O.g(String.class);
        }
    }

    /* renamed from: Gd.c$c  reason: collision with other inner class name */
    public static final class C0773c implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0773c f50846a = new C0773c();

        /* renamed from: a */
        public final p invoke() {
            return O.m(String.class);
        }
    }

    public static final class d extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f50847a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f50848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f50849c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C6658d dVar, c cVar) {
            super(3, dVar);
            this.f50849c = cVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, Object[] objArr, C6658d dVar) {
            d dVar2 = new d(dVar, this.f50849c);
            dVar2.f50848b = objArr;
            return dVar2.invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object f10 = C6680b.f();
            int i10 = this.f50847a;
            if (i10 == 0) {
                w.b(obj);
                Object[] objArr = (Object[]) this.f50848b;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                String str2 = (String) objArr[2];
                String str3 = (String) obj3;
                URI uri = (URI) obj2;
                if (uri.getScheme() == "file") {
                    return uri;
                }
                if (str3 == null) {
                    str = this.f50849c.u(uri);
                } else {
                    str = str3;
                }
                File i11 = this.f50849c.c().i();
                File file = new File(i11 + "/ExponentAsset-" + str + "." + str2);
                if (!file.exists()) {
                    c cVar = this.f50849c;
                    C4464a c10 = cVar.c();
                    this.f50847a = 1;
                    obj = cVar.q(c10, uri, file, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (str3 == null || C6496s.c(str3, this.f50849c.s(file))) {
                    return Uri.fromFile(file);
                } else {
                    c cVar2 = this.f50849c;
                    C4464a c11 = cVar2.c();
                    this.f50847a = 2;
                    obj = cVar2.q(c11, uri, file, this);
                    if (obj == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f50850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f50851b;

        /* renamed from: c  reason: collision with root package name */
        int f50852c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C6658d dVar) {
            super(dVar);
            this.f50851b = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f50850a = obj;
            this.f50852c |= Integer.MIN_VALUE;
            return this.f50851b.q((C4464a) null, (URI) null, (File) null, this);
        }
    }

    static final class f extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f50853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ URI f50854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f50855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f50856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(URI uri, c cVar, File file, C6658d dVar) {
            super(2, dVar);
            this.f50854b = uri;
            this.f50855c = cVar;
            this.f50856d = file;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f50854b, this.f50855c, this.f50856d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            wf.C6763c.a(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            wf.C6763c.a(r7, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.String r0 = "toString(...)"
                rf.C6680b.f()
                int r1 = r6.f50853a
                if (r1 != 0) goto L_0x0076
                lf.w.b(r7)
                java.net.URI r7 = r6.f50854b     // Catch:{ Exception -> 0x0067 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0067 }
                kotlin.jvm.internal.C6496s.g(r7, r0)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = ":"
                r2 = 2
                r3 = 0
                r4 = 0
                boolean r7 = Sg.p.O(r7, r1, r3, r2, r4)     // Catch:{ Exception -> 0x0067 }
                if (r7 != 0) goto L_0x0034
                Gd.c r7 = r6.f50855c     // Catch:{ Exception -> 0x0067 }
                android.content.Context r7 = r7.r()     // Catch:{ Exception -> 0x0067 }
                java.net.URI r1 = r6.f50854b     // Catch:{ Exception -> 0x0067 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0067 }
                kotlin.jvm.internal.C6496s.g(r1, r0)     // Catch:{ Exception -> 0x0067 }
                java.io.InputStream r7 = Gd.d.b(r7, r1)     // Catch:{ Exception -> 0x0067 }
                goto L_0x003e
            L_0x0034:
                java.net.URI r7 = r6.f50854b     // Catch:{ Exception -> 0x0067 }
                java.net.URL r7 = r7.toURL()     // Catch:{ Exception -> 0x0067 }
                java.io.InputStream r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r7)     // Catch:{ Exception -> 0x0067 }
            L_0x003e:
                java.io.File r1 = r6.f50856d     // Catch:{ Exception -> 0x0067 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0058 }
                r5.<init>(r1)     // Catch:{ all -> 0x0058 }
                kotlin.jvm.internal.C6496s.e(r7)     // Catch:{ all -> 0x005a }
                wf.C6762b.b(r7, r5, r3, r2, r4)     // Catch:{ all -> 0x005a }
                wf.C6763c.a(r5, r4)     // Catch:{ all -> 0x0058 }
                wf.C6763c.a(r7, r4)     // Catch:{ Exception -> 0x0067 }
                java.io.File r7 = r6.f50856d     // Catch:{ Exception -> 0x0067 }
                android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ Exception -> 0x0067 }
                return r7
            L_0x0058:
                r1 = move-exception
                goto L_0x0061
            L_0x005a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x005c }
            L_0x005c:
                r2 = move-exception
                wf.C6763c.a(r5, r1)     // Catch:{ all -> 0x0058 }
                throw r2     // Catch:{ all -> 0x0058 }
            L_0x0061:
                throw r1     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r2 = move-exception
                wf.C6763c.a(r7, r1)     // Catch:{ Exception -> 0x0067 }
                throw r2     // Catch:{ Exception -> 0x0067 }
            L_0x0067:
                Gd.e r7 = new Gd.e
                java.net.URI r1 = r6.f50854b
                java.lang.String r1 = r1.toString()
                kotlin.jvm.internal.C6496s.g(r1, r0)
                r7.<init>(r1)
                throw r7
            L_0x0076:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Gd.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(ae.C4464a r6, java.net.URI r7, java.io.File r8, qf.C6658d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof Gd.c.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Gd.c$e r0 = (Gd.c.e) r0
            int r1 = r0.f50852c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f50852c = r1
            goto L_0x0018
        L_0x0013:
            Gd.c$e r0 = new Gd.c$e
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f50850a
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f50852c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r9)
            goto L_0x0077
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            lf.w.b(r9)
            java.io.File r9 = r8.getParentFile()
            if (r9 == 0) goto L_0x0041
            boolean r9 = r9.exists()
            if (r9 != r3) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r8.mkdirs()
        L_0x0044:
            Xd.b r9 = r6.n()
            if (r9 == 0) goto L_0x007d
            android.content.Context r2 = r6.u()
            java.lang.String r4 = r8.getParent()
            java.util.EnumSet r9 = r9.a(r2, r4)
            if (r9 == 0) goto L_0x007d
            Xd.c r2 = Xd.c.WRITE
            boolean r9 = r9.contains(r2)
            if (r9 != r3) goto L_0x007d
            Ug.K r6 = r6.h()
            qf.g r6 = r6.getCoroutineContext()
            Gd.c$f r9 = new Gd.c$f
            r2 = 0
            r9.<init>(r7, r5, r8, r2)
            r0.f50852c = r3
            java.lang.Object r9 = Ug.C5572i.g(r6, r9, r0)
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.C6496s.g(r9, r6)
            return r9
        L_0x007d:
            Gd.e r6 = new Gd.e
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r7, r8)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Gd.c.q(ae.a, java.net.URI, java.io.File, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Context r() {
        Context u10 = c().u();
        if (u10 != null) {
            return u10;
        }
        throw new expo.modules.kotlin.exception.e();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        wf.C6763c.a(r13, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        wf.C6763c.a(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s(java.io.File r13) {
        /*
            r12 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038 }
            r1.<init>(r13)     // Catch:{ Exception -> 0x0038 }
            java.security.DigestInputStream r13 = new java.security.DigestInputStream     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ all -> 0x003a }
            r13.<init>(r1, r2)     // Catch:{ all -> 0x003a }
            java.security.MessageDigest r2 = r13.getMessageDigest()     // Catch:{ all -> 0x003c }
            byte[] r3 = r2.digest()     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "digest(...)"
            kotlin.jvm.internal.C6496s.g(r3, r2)     // Catch:{ all -> 0x003c }
            java.lang.String r4 = ""
            Gd.a r9 = new Gd.a     // Catch:{ all -> 0x003c }
            r9.<init>()     // Catch:{ all -> 0x003c }
            r10 = 30
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = mf.C6559l.H0(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x003c }
            wf.C6763c.a(r13, r0)     // Catch:{ all -> 0x003a }
            wf.C6763c.a(r1, r0)     // Catch:{ Exception -> 0x0038 }
            r0 = r2
            goto L_0x004c
        L_0x0038:
            r13 = move-exception
            goto L_0x0049
        L_0x003a:
            r13 = move-exception
            goto L_0x0043
        L_0x003c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r3 = move-exception
            wf.C6763c.a(r13, r2)     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ all -> 0x003a }
        L_0x0043:
            throw r13     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            wf.C6763c.a(r1, r13)     // Catch:{ Exception -> 0x0038 }
            throw r2     // Catch:{ Exception -> 0x0038 }
        L_0x0049:
            r13.printStackTrace()
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Gd.c.s(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: private */
    public static final CharSequence t(byte b10) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        C6496s.g(format, "format(...)");
        return format;
    }

    /* access modifiers changed from: private */
    public final String u(URI uri) {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        String uri2 = uri.toString();
        C6496s.g(uri2, "toString(...)");
        byte[] bytes = uri2.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "getBytes(...)");
        byte[] digest = instance.digest(bytes);
        C6496s.g(digest, "digest(...)");
        return C6559l.H0(digest, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new b(), 30, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final CharSequence v(byte b10) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        C6496s.g(format, "format(...)");
        return format;
    }

    public ke.d b() {
        Class<URI> cls = URI.class;
        Class<String> cls2 = String.class;
        D3.a.c("[" + "ExpoModulesCore" + "] " + (getClass() + ".ModuleDefinition"));
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExpoAsset");
            C5035e c10 = cVar.c("downloadAsync");
            String b10 = c10.b();
            C5157d dVar = C5157d.f61437a;
            Ff.d b11 = O.b(cls);
            Boolean bool = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b11, bool));
            if (bVar == null) {
                bVar = new C5155b(new qe.O(O.b(cls), false, a.f50844a));
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(O.b(cls2), Boolean.TRUE));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(O.b(cls2), true, b.f50845a));
            }
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(O.b(cls2), bool));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(O.b(cls2), false, C0773c.f50846a));
            }
            c10.c(new ie.p(b10, new C5155b[]{bVar, bVar2, bVar3}, new d((C6658d) null, this)));
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            D3.a.f();
            throw th2;
        }
    }
}
