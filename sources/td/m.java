package Td;

import Gh.C5404e;
import Gh.C5405f;
import Gh.C5406g;
import Gh.C5414o;
import Lh.d;
import M1.a;
import Ug.C5572i;
import Ug.C5600w0;
import Xd.c;
import ae.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.revenuecat.purchases.common.Constants;
import expo.modules.filesystem.DeletingOptions;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.EncodingType;
import expo.modules.filesystem.FileSystemUploadOptions;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.MakeDirectoryOptions;
import expo.modules.filesystem.ReadingOptions;
import expo.modules.filesystem.RelocatingOptions;
import expo.modules.filesystem.WritingOptions;
import expo.modules.kotlin.exception.e;
import ge.C5007a;
import ge.j;
import ie.C5036f;
import ie.C5037g;
import ie.C5039i;
import ie.C5040j;
import ie.k;
import ie.n;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ke.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import lf.C6535s;
import qe.C5155b;
import qe.C5157d;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import rh.C;
import rh.C6703A;
import rh.C6708e;
import rh.C6709f;
import rh.u;
import rh.w;
import rh.y;
import rh.z;
import wf.C6763c;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0005v`Y\\wB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J/\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J'\u00107\u001a\u0002062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u000209H@¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\r2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010\fJ\u0017\u0010B\u001a\u00020A2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010\u001fJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00010#2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020\t*\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u001dH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0017¢\u0006\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d0c8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8BX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010r\u001a\u0004\u0018\u00010[8BX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0018\u0010u\u001a\u00020&*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"LTd/m;", "Lke/b;", "<init>", "()V", "Landroid/net/Uri;", "Llf/M;", "M", "(Landroid/net/Uri;)V", "L", "Ljava/io/File;", "dir", "R", "(Ljava/io/File;)V", "", "path", "Ljava/util/EnumSet;", "LXd/c;", "h0", "(Ljava/lang/String;)Ljava/util/EnumSet;", "uri", "j0", "(Landroid/net/Uri;)Ljava/util/EnumSet;", "i0", "permission", "errorMsg", "T", "(Landroid/net/Uri;LXd/c;Ljava/lang/String;)V", "S", "(Landroid/net/Uri;LXd/c;)V", "Ljava/io/InputStream;", "e0", "(Landroid/net/Uri;)Ljava/io/InputStream;", "resourceName", "f0", "(Ljava/lang/String;)Ljava/io/InputStream;", "LM1/a;", "documentFile", "outputDir", "", "copy", "l0", "(LM1/a;Ljava/io/File;Z)V", "file", "N", "(Ljava/io/File;)Landroid/net/Uri;", "url", "fileUriString", "Lexpo/modules/filesystem/FileSystemUploadOptions;", "options", "LTd/s;", "decorator", "Lrh/C;", "P", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/filesystem/FileSystemUploadOptions;LTd/s;)Lrh/C;", "Lrh/D;", "O", "(Lexpo/modules/filesystem/FileSystemUploadOptions;LTd/s;Ljava/io/File;)Lrh/D;", "LTd/m$a;", "params", "", "Q", "(LTd/m$a;Lqf/d;)Ljava/lang/Object;", "d0", "(Ljava/io/File;)Ljava/lang/String;", "U", "", "W", "(Ljava/io/File;)J", "X", "Ljava/io/OutputStream;", "b0", "(Landroid/net/Uri;)Ljava/io/OutputStream;", "Z", "(Landroid/net/Uri;)LM1/a;", "k0", "(Landroid/net/Uri;)Ljava/io/File;", "uriStr", "g0", "(Ljava/lang/String;)Ljava/lang/String;", "inputStream", "", "Y", "(Ljava/io/InputStream;)[B", "Lrh/u;", "headers", "Landroid/os/Bundle;", "m0", "(Lrh/u;)Landroid/os/Bundle;", "Lke/d;", "b", "()Lke/d;", "Lrh/A;", "d", "Lrh/A;", "client", "Lae/p;", "e", "Lae/p;", "dirPermissionsRequest", "", "LTd/m$e;", "f", "Ljava/util/Map;", "taskHandlers", "LUg/K;", "g", "LUg/K;", "moduleCoroutineScope", "Landroid/content/Context;", "V", "()Landroid/content/Context;", "context", "a0", "()Lrh/A;", "okHttpClient", "c0", "(Landroid/net/Uri;)Z", "isSAFUri", "a", "c", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class m extends b {

    /* renamed from: d  reason: collision with root package name */
    private C6703A f52602d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p f52603e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Map f52604f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Ug.K f52605g = Ug.L.a(Ug.Z.a());

    public static final class A implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final A f52606a = new A();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(MakeDirectoryOptions.class);
        }
    }

    public static final class A0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final A0 f52607a = new A0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class B implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52608a;

        public B(m mVar) {
            this.f52608a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            boolean z10;
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            MakeDirectoryOptions makeDirectoryOptions = objArr[1];
            Uri parse = Uri.parse(n.c(str));
            m mVar = this.f52608a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            if (C6496s.c(parse.getScheme(), "file")) {
                File I10 = this.f52608a.k0(parse);
                boolean isDirectory = I10.isDirectory();
                boolean intermediates = makeDirectoryOptions.getIntermediates();
                if (intermediates) {
                    z10 = I10.mkdirs();
                } else {
                    z10 = I10.mkdir();
                }
                if (z10 || (intermediates && isDirectory)) {
                    return C6514M.f71813a;
                }
                throw new f(parse);
            }
            throw new IOException("Unsupported scheme for location '" + parse + "'.");
        }
    }

    public static final class B0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final B0 f52609a = new B0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class C implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52610a;

        public C(m mVar) {
            this.f52610a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            String str;
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            Uri parse = Uri.parse(n.c((String) pVar));
            m mVar = this.f52610a;
            C6496s.e(parse);
            mVar.S(parse, c.READ);
            if (C6496s.c(parse.getScheme(), "file")) {
                File[] listFiles = this.f52610a.k0(parse).listFiles();
                if (listFiles != null) {
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    for (File file : listFiles) {
                        if (file != null) {
                            str = file.getName();
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                    return;
                }
                throw new j(parse);
            } else if (this.f52610a.c0(parse)) {
                throw new r();
            } else {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class C0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0 f52611a = new C0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class D implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final D f52612a = new D();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(String.class);
        }
    }

    public static final class D0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52613a;

        public D0(m mVar) {
            this.f52613a = mVar;
        }

        public final void a(Activity activity, j jVar) {
            C6496s.h(activity, "sender");
            C6496s.h(jVar, "payload");
            int a10 = jVar.a();
            int b10 = jVar.b();
            Intent c10 = jVar.c();
            if (a10 == 5394 && this.f52613a.f52603e != null) {
                Bundle bundle = new Bundle();
                if (b10 != -1 || c10 == null) {
                    bundle.putBoolean("granted", false);
                } else {
                    Uri data = c10.getData();
                    int flags = c10.getFlags() & 3;
                    if (data != null) {
                        this.f52613a.c().v().getContentResolver().takePersistableUriPermission(data, flags);
                    }
                    bundle.putBoolean("granted", true);
                    bundle.putString("directoryUri", String.valueOf(data));
                }
                p t10 = this.f52613a.f52603e;
                if (t10 != null) {
                    t10.resolve(bundle);
                }
                this.f52613a.f52603e = null;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Activity) obj, (j) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class E implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52614a;

        public E(m mVar) {
            this.f52614a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            String str;
            C6496s.h(objArr, "<destruct>");
            Uri parse = Uri.parse(n.c(objArr[0]));
            m mVar = this.f52614a;
            C6496s.e(parse);
            mVar.S(parse, c.READ);
            if (C6496s.c(parse.getScheme(), "file")) {
                File[] listFiles = this.f52614a.k0(parse).listFiles();
                if (listFiles != null) {
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    for (File file : listFiles) {
                        if (file != null) {
                            str = file.getName();
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                    return arrayList;
                }
                throw new j(parse);
            } else if (this.f52614a.c0(parse)) {
                throw new r();
            } else {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }
    }

    public static final class E0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52615a;

        public E0(m mVar) {
            this.f52615a = mVar;
        }

        public final void a() {
            try {
                m mVar = this.f52615a;
                File filesDir = mVar.V().getFilesDir();
                C6496s.g(filesDir, "getFilesDir(...)");
                mVar.R(filesDir);
                m mVar2 = this.f52615a;
                File cacheDir = mVar2.V().getCacheDir();
                C6496s.g(cacheDir, "getCacheDir(...)");
                mVar2.R(cacheDir);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    public static final class F implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return Double.valueOf(Ef.m.f(BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - ((double) 1)));
        }
    }

    public static final class F0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52616a;

        public F0(m mVar) {
            this.f52616a = mVar;
        }

        public final void a() {
            try {
                Ug.L.c(this.f52616a.f52605g, new Od.c((String) null, 1, (DefaultConstructorMarker) null));
            } catch (IllegalStateException unused) {
                Log.e(n.f52712a, "The scope does not have a job in it");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C6514M.f71813a;
        }
    }

    public static final class G implements C6798l {
        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "it");
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return Double.valueOf(Ef.m.f(BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - ((double) 1)));
        }
    }

    public static final class G0 implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4403c f52617a;

        public G0(C4403c cVar) {
            this.f52617a = cVar;
        }

        public final rh.E intercept(w.a aVar) {
            C6496s.h(aVar, "chain");
            rh.E a10 = aVar.a(aVar.request());
            return a10.T().b(new C4405d(a10.a(), this.f52617a)).c();
        }
    }

    public static final class H implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52618a;

        public H(m mVar) {
            this.f52618a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = (String) pVar;
            Uri parse = Uri.parse(n.c(str));
            m mVar = this.f52618a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            this.f52618a.S(parse, c.READ);
            this.f52618a.L(parse);
            if (C6496s.c(parse.getScheme(), "file")) {
                this.f52618a.N(this.f52618a.k0(parse)).toString();
                return;
            }
            throw new q(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    static final class H0 extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f52619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4399a f52620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f52621c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H0(C4399a aVar, m mVar, C6658d dVar) {
            super(2, dVar);
            this.f52620b = aVar;
            this.f52621c = mVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new H0(this.f52620b, this.f52621c, dVar);
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((H0) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f52619a == 0) {
                lf.w.b(obj);
                C4399a aVar = this.f52620b;
                DownloadOptions a10 = aVar.a();
                C6708e b10 = aVar.b();
                File c10 = aVar.c();
                boolean d10 = aVar.d();
                p e10 = aVar.e();
                try {
                    rh.E execute = FirebasePerfOkHttpClient.execute(b10);
                    rh.F a11 = execute.a();
                    C6496s.e(a11);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(a11.a());
                    FileOutputStream fileOutputStream = new FileOutputStream(c10, d10);
                    byte[] bArr = new byte[1024];
                    kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        l10.f71757a = read;
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    Bundle bundle = new Bundle();
                    m mVar = this.f52621c;
                    bundle.putString("uri", Uri.fromFile(c10).toString());
                    bundle.putInt("status", execute.o());
                    bundle.putBundle("headers", mVar.m0(execute.F()));
                    Boolean a12 = kotlin.coroutines.jvm.internal.b.a(a10.getMd5());
                    if (!a12.booleanValue()) {
                        a12 = null;
                    }
                    if (a12 != null) {
                        bundle.putString("md5", mVar.d0(c10));
                    }
                    execute.close();
                    e10.resolve(bundle);
                } catch (Exception e11) {
                    if (b10.isCanceled()) {
                        e10.resolve((Object) null);
                        return null;
                    }
                    String message = e11.getMessage();
                    if (message != null) {
                        kotlin.coroutines.jvm.internal.b.c(Log.e(n.f52712a, message));
                    }
                    String a13 = n.f52712a;
                    C6496s.g(a13, "access$getTAG$p(...)");
                    e10.reject(a13, e11.getMessage(), e11);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class I implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final I f52622a = new I();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class J implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final J f52623a = new J();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(InfoOptions.class);
        }
    }

    public static final class K implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52624a;

        public K(m mVar) {
            this.f52624a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            Uri parse = Uri.parse(n.c(str));
            m mVar = this.f52624a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            this.f52624a.S(parse, c.READ);
            this.f52624a.L(parse);
            if (C6496s.c(parse.getScheme(), "file")) {
                return this.f52624a.N(this.f52624a.k0(parse)).toString();
            }
            throw new q(str);
        }
    }

    public static final class L implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52625a;

        public L(m mVar) {
            this.f52625a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            Uri parse = Uri.parse(n.c((String) pVar));
            m mVar = this.f52625a;
            C6496s.e(parse);
            mVar.S(parse, c.READ);
            if (this.f52625a.c0(parse)) {
                a h10 = a.h(this.f52625a.V(), parse);
                if (h10 == null || !h10.f() || !h10.k()) {
                    throw new j(parse);
                }
                a[] m10 = h10.m();
                C6496s.g(m10, "listFiles(...)");
                ArrayList arrayList = new ArrayList(m10.length);
                for (a j10 : m10) {
                    arrayList.add(j10.j().toString());
                }
                return;
            }
            throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class M implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final M f52626a = new M();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class N implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52627a;

        public N(m mVar) {
            this.f52627a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            Uri parse = Uri.parse(n.c(objArr[0]));
            m mVar = this.f52627a;
            C6496s.e(parse);
            mVar.S(parse, c.READ);
            if (this.f52627a.c0(parse)) {
                a h10 = a.h(this.f52627a.V(), parse);
                if (h10 == null || !h10.f() || !h10.k()) {
                    throw new j(parse);
                }
                a[] m10 = h10.m();
                C6496s.g(m10, "listFiles(...)");
                ArrayList arrayList = new ArrayList(m10.length);
                for (a j10 : m10) {
                    arrayList.add(j10.j().toString());
                }
                return arrayList;
            }
            throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
        }
    }

    public static final class O implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final O f52628a = new O();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class P implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final P f52629a = new P();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class Q implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52630a;

        public Q(m mVar) {
            this.f52630a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            a aVar;
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            String str2 = objArr[1];
            Uri parse = Uri.parse(n.c(str));
            m mVar = this.f52630a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            if (this.f52630a.c0(parse)) {
                a y10 = this.f52630a.Z(parse);
                if (y10 == null || y10.k()) {
                    if (y10 != null) {
                        aVar = y10.c(str2);
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        return aVar.j().toString();
                    }
                    throw new f((Uri) null);
                }
                throw new f(parse);
            }
            throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.makeDirectoryAsync instead.");
        }
    }

    public static final class R implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final R f52631a = new R();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class S implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final S f52632a = new S();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class T implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final T f52633a = new T();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class U implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52634a;

        public U(m mVar) {
            this.f52634a = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x013c A[Catch:{ FileNotFoundException -> 0x017f }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0179 A[Catch:{ FileNotFoundException -> 0x017f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object[] r15) {
            /*
                r14 = this;
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.C6496s.h(r15, r0)
                r0 = 0
                r1 = r15[r0]
                r2 = 1
                r15 = r15[r2]
                expo.modules.filesystem.InfoOptions r15 = (expo.modules.filesystem.InfoOptions) r15
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = Td.n.c(r1)
                android.net.Uri r3 = android.net.Uri.parse(r1)
                java.lang.String r4 = r3.getScheme()
                java.lang.String r5 = "file"
                boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
                if (r4 == 0) goto L_0x0033
                Td.m r4 = r14.f52634a
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.C6496s.f(r1, r6)
                java.lang.String r1 = r4.g0(r1)
                android.net.Uri r4 = android.net.Uri.parse(r1)
                goto L_0x0034
            L_0x0033:
                r4 = r3
            L_0x0034:
                Td.m r6 = r14.f52634a
                kotlin.jvm.internal.C6496s.e(r4)
                Xd.c r7 = Xd.c.READ
                r6.S(r4, r7)
                java.lang.String r6 = r3.getScheme()
                boolean r5 = kotlin.jvm.internal.C6496s.c(r6, r5)
                java.lang.String r6 = "md5"
                java.lang.String r7 = "size"
                java.lang.String r8 = "uri"
                java.lang.String r9 = "isDirectory"
                java.lang.String r10 = "exists"
                if (r5 == 0) goto L_0x00be
                Td.m r1 = r14.f52634a
                kotlin.jvm.internal.C6496s.e(r4)
                java.io.File r1 = r1.k0(r4)
                boolean r3 = r1.exists()
                if (r3 == 0) goto L_0x00b0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r0.putBoolean(r10, r2)
                boolean r2 = r1.isDirectory()
                r0.putBoolean(r9, r2)
                android.net.Uri r2 = android.net.Uri.fromFile(r1)
                java.lang.String r2 = r2.toString()
                r0.putString(r8, r2)
                Td.m r2 = r14.f52634a
                long r2 = r2.W(r1)
                double r2 = (double) r2
                r0.putDouble(r7, r2)
                long r2 = r1.lastModified()
                double r2 = (double) r2
                r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                double r2 = r2 * r4
                java.lang.String r4 = "modificationTime"
                r0.putDouble(r4, r2)
                java.lang.Boolean r15 = r15.getMd5()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                boolean r2 = kotlin.jvm.internal.C6496s.c(r15, r2)
                if (r2 == 0) goto L_0x00a2
                goto L_0x00a3
            L_0x00a2:
                r15 = 0
            L_0x00a3:
                if (r15 == 0) goto L_0x018c
                Td.m r15 = r14.f52634a
                java.lang.String r15 = r15.d0(r1)
                r0.putString(r6, r15)
                goto L_0x018c
            L_0x00b0:
                android.os.Bundle r15 = new android.os.Bundle
                r15.<init>()
                r15.putBoolean(r10, r0)
                r15.putBoolean(r9, r0)
            L_0x00bb:
                r0 = r15
                goto L_0x018c
            L_0x00be:
                java.lang.String r4 = r3.getScheme()
                java.lang.String r5 = "content"
                boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
                java.lang.String r11 = "asset"
                if (r4 != 0) goto L_0x00f9
                java.lang.String r4 = r3.getScheme()
                boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r11)
                if (r4 != 0) goto L_0x00f9
                java.lang.String r4 = r3.getScheme()
                if (r4 != 0) goto L_0x00dd
                goto L_0x00f9
            L_0x00dd:
                java.io.IOException r15 = new java.io.IOException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unsupported scheme for location '"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = "'."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r15.<init>(r0)
                throw r15
            L_0x00f9:
                java.lang.String r4 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x017f }
                if (r4 == 0) goto L_0x0134
                int r12 = r4.hashCode()     // Catch:{ FileNotFoundException -> 0x017f }
                r13 = 93121264(0x58ceaf0, float:1.3251839E-35)
                if (r12 == r13) goto L_0x0123
                r11 = 951530617(0x38b73479, float:8.735894E-5)
                if (r12 == r11) goto L_0x010e
                goto L_0x0134
            L_0x010e:
                boolean r4 = r4.equals(r5)     // Catch:{ FileNotFoundException -> 0x017f }
                if (r4 == 0) goto L_0x0134
                Td.m r1 = r14.f52634a     // Catch:{ FileNotFoundException -> 0x017f }
                android.content.Context r1 = r1.V()     // Catch:{ FileNotFoundException -> 0x017f }
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x017f }
                java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x017f }
                goto L_0x013a
            L_0x0123:
                boolean r4 = r4.equals(r11)     // Catch:{ FileNotFoundException -> 0x017f }
                if (r4 != 0) goto L_0x012a
                goto L_0x0134
            L_0x012a:
                Td.m r1 = r14.f52634a     // Catch:{ FileNotFoundException -> 0x017f }
                kotlin.jvm.internal.C6496s.e(r3)     // Catch:{ FileNotFoundException -> 0x017f }
                java.io.InputStream r1 = r1.e0(r3)     // Catch:{ FileNotFoundException -> 0x017f }
                goto L_0x013a
            L_0x0134:
                Td.m r4 = r14.f52634a     // Catch:{ FileNotFoundException -> 0x017f }
                java.io.InputStream r1 = r4.f0(r1)     // Catch:{ FileNotFoundException -> 0x017f }
            L_0x013a:
                if (r1 == 0) goto L_0x0179
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ FileNotFoundException -> 0x017f }
                r4.<init>()     // Catch:{ FileNotFoundException -> 0x017f }
                r4.putBoolean(r10, r2)     // Catch:{ FileNotFoundException -> 0x017f }
                r4.putBoolean(r9, r0)     // Catch:{ FileNotFoundException -> 0x017f }
                java.lang.String r2 = r3.toString()     // Catch:{ FileNotFoundException -> 0x017f }
                r4.putString(r8, r2)     // Catch:{ FileNotFoundException -> 0x017f }
                int r2 = r1.available()     // Catch:{ FileNotFoundException -> 0x017f }
                double r2 = (double) r2     // Catch:{ FileNotFoundException -> 0x017f }
                r4.putDouble(r7, r2)     // Catch:{ FileNotFoundException -> 0x017f }
                java.lang.Boolean r15 = r15.getMd5()     // Catch:{ FileNotFoundException -> 0x017f }
                java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ FileNotFoundException -> 0x017f }
                boolean r15 = kotlin.jvm.internal.C6496s.c(r15, r2)     // Catch:{ FileNotFoundException -> 0x017f }
                if (r15 == 0) goto L_0x0177
                byte[] r15 = Kh.a.d(r1)     // Catch:{ FileNotFoundException -> 0x017f }
                char[] r15 = Jh.a.a(r15)     // Catch:{ FileNotFoundException -> 0x017f }
                java.lang.String r1 = "encodeHex(...)"
                kotlin.jvm.internal.C6496s.g(r15, r1)     // Catch:{ FileNotFoundException -> 0x017f }
                java.lang.String r1 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x017f }
                r1.<init>(r15)     // Catch:{ FileNotFoundException -> 0x017f }
                r4.putString(r6, r1)     // Catch:{ FileNotFoundException -> 0x017f }
            L_0x0177:
                r0 = r4
                goto L_0x018c
            L_0x0179:
                java.io.FileNotFoundException r15 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x017f }
                r15.<init>()     // Catch:{ FileNotFoundException -> 0x017f }
                throw r15     // Catch:{ FileNotFoundException -> 0x017f }
            L_0x017f:
                android.os.Bundle r15 = new android.os.Bundle
                r15.<init>()
                r15.putBoolean(r10, r0)
                r15.putBoolean(r9, r0)
                goto L_0x00bb
            L_0x018c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Td.m.U.invoke(java.lang.Object[]):java.lang.Object");
        }
    }

    public static final class V implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52635a;

        public V(m mVar) {
            this.f52635a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            String str2 = objArr[1];
            String str3 = objArr[2];
            String str4 = str2;
            Uri parse = Uri.parse(n.c(str));
            m mVar = this.f52635a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            if (this.f52635a.c0(parse)) {
                a y10 = this.f52635a.Z(parse);
                if (y10 == null || !y10.k()) {
                    throw new g(parse);
                }
                a d10 = y10.d(str3, str4);
                if (d10 != null) {
                    return d10.j().toString();
                }
                throw new g((Uri) null);
            }
            throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI.");
        }
    }

    public static final class W implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52636a;

        public W(m mVar) {
            this.f52636a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6708e a10;
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            C4407e eVar = (C4407e) this.f52636a.f52604f.get((String) pVar);
            if (eVar != null && (a10 = eVar.a()) != null) {
                a10.cancel();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class X implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final X f52637a = new X();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class Y implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52638a;

        public Y(m mVar) {
            this.f52638a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6708e a10;
            C6496s.h(objArr, "<destruct>");
            C4407e eVar = (C4407e) this.f52638a.f52604f.get(objArr[0]);
            if (eVar == null || (a10 = eVar.a()) == null) {
                return null;
            }
            a10.cancel();
            return C6514M.f71813a;
        }
    }

    public static final class Z implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52639a;

        public Z(m mVar) {
            this.f52639a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = (String) pVar;
            C4407e eVar = (C4407e) this.f52639a.f52604f.get(str);
            if (eVar == null) {
                throw new IOException("No download object available");
            } else if (eVar instanceof C4401b) {
                eVar.a().cancel();
                this.f52639a.f52604f.remove(str);
                new Bundle().putString("resumeData", String.valueOf(this.f52639a.k0(((C4401b) eVar).b()).length()));
            } else {
                throw new h();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Td.m$a  reason: case insensitive filesystem */
    private static final class C4399a {

        /* renamed from: a  reason: collision with root package name */
        private final DownloadOptions f52640a;

        /* renamed from: b  reason: collision with root package name */
        private final C6708e f52641b;

        /* renamed from: c  reason: collision with root package name */
        private final File f52642c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f52643d;

        /* renamed from: e  reason: collision with root package name */
        private final p f52644e;

        public C4399a(DownloadOptions downloadOptions, C6708e eVar, File file, boolean z10, p pVar) {
            C6496s.h(downloadOptions, "options");
            C6496s.h(eVar, "call");
            C6496s.h(file, "file");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            this.f52640a = downloadOptions;
            this.f52641b = eVar;
            this.f52642c = file;
            this.f52643d = z10;
            this.f52644e = pVar;
        }

        public final DownloadOptions a() {
            return this.f52640a;
        }

        public final C6708e b() {
            return this.f52641b;
        }

        public final File c() {
            return this.f52642c;
        }

        public final boolean d() {
            return this.f52643d;
        }

        public final p e() {
            return this.f52644e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4399a)) {
                return false;
            }
            C4399a aVar = (C4399a) obj;
            if (C6496s.c(this.f52640a, aVar.f52640a) && C6496s.c(this.f52641b, aVar.f52641b) && C6496s.c(this.f52642c, aVar.f52642c) && this.f52643d == aVar.f52643d && C6496s.c(this.f52644e, aVar.f52644e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f52640a.hashCode() * 31) + this.f52641b.hashCode()) * 31) + this.f52642c.hashCode()) * 31) + Boolean.hashCode(this.f52643d)) * 31) + this.f52644e.hashCode();
        }

        public String toString() {
            DownloadOptions downloadOptions = this.f52640a;
            C6708e eVar = this.f52641b;
            File file = this.f52642c;
            boolean z10 = this.f52643d;
            p pVar = this.f52644e;
            return "DownloadResumableTaskParams(options=" + downloadOptions + ", call=" + eVar + ", file=" + file + ", isResume=" + z10 + ", promise=" + pVar + ")";
        }
    }

    /* renamed from: Td.m$a0  reason: case insensitive filesystem */
    public static final class C4400a0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4400a0 f52645a = new C4400a0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$b  reason: case insensitive filesystem */
    private static final class C4401b extends C4407e {

        /* renamed from: b  reason: collision with root package name */
        private final Uri f52646b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4401b(Uri uri, C6708e eVar) {
            super(eVar);
            C6496s.h(uri, "fileUri");
            C6496s.h(eVar, "call");
            this.f52646b = uri;
        }

        public final Uri b() {
            return this.f52646b;
        }
    }

    /* renamed from: Td.m$b0  reason: case insensitive filesystem */
    public static final class C4402b0 implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52647a;

        public C4402b0(m mVar) {
            this.f52647a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            C4407e eVar = (C4407e) this.f52647a.f52604f.get(str);
            if (eVar == null) {
                throw new IOException("No download object available");
            } else if (eVar instanceof C4401b) {
                eVar.a().cancel();
                this.f52647a.f52604f.remove(str);
                File I10 = this.f52647a.k0(((C4401b) eVar).b());
                Bundle bundle = new Bundle();
                bundle.putString("resumeData", String.valueOf(I10.length()));
                return bundle;
            } else {
                throw new h();
            }
        }
    }

    /* renamed from: Td.m$c  reason: case insensitive filesystem */
    public interface C4403c {
        void a(long j10, long j11, boolean z10);
    }

    /* renamed from: Td.m$c0  reason: case insensitive filesystem */
    public static final class C4404c0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4404c0 f52648a = new C4404c0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$d  reason: case insensitive filesystem */
    private static final class C4405d extends rh.F {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final rh.F f52649c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final C4403c f52650d;

        /* renamed from: e  reason: collision with root package name */
        private C5406g f52651e;

        /* renamed from: Td.m$d$a */
        public static final class a extends C5414o {

            /* renamed from: b  reason: collision with root package name */
            private long f52652b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4405d f52653c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Gh.W w10, C4405d dVar) {
                super(w10);
                this.f52653c = dVar;
            }

            public long y1(C5404e eVar, long j10) {
                long j11;
                boolean z10;
                C6496s.h(eVar, "sink");
                long y12 = super.y1(eVar, j10);
                long j12 = this.f52652b;
                long j13 = -1;
                int i10 = (y12 > -1 ? 1 : (y12 == -1 ? 0 : -1));
                if (i10 != 0) {
                    j11 = y12;
                } else {
                    j11 = 0;
                }
                this.f52652b = j12 + j11;
                C4403c F10 = this.f52653c.f52650d;
                long j14 = this.f52652b;
                rh.F I10 = this.f52653c.f52649c;
                if (I10 != null) {
                    j13 = I10.o();
                }
                long j15 = j13;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                F10.a(j14, j15, z10);
                return y12;
            }
        }

        public C4405d(rh.F f10, C4403c cVar) {
            C6496s.h(cVar, "progressListener");
            this.f52649c = f10;
            this.f52650d = cVar;
        }

        private final Gh.W M(Gh.W w10) {
            return new a(w10, this);
        }

        public long o() {
            rh.F f10 = this.f52649c;
            if (f10 != null) {
                return f10.o();
            }
            return -1;
        }

        public y q() {
            rh.F f10 = this.f52649c;
            if (f10 != null) {
                return f10.q();
            }
            return null;
        }

        public C5406g y() {
            C5406g gVar = this.f52651e;
            if (gVar != null) {
                return gVar;
            }
            rh.F f10 = this.f52649c;
            C6496s.e(f10);
            return Gh.H.d(M(f10.y()));
        }
    }

    /* renamed from: Td.m$d0  reason: case insensitive filesystem */
    public static final class C4406d0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4406d0 f52654a = new C4406d0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(ReadingOptions.class);
        }
    }

    /* renamed from: Td.m$e  reason: case insensitive filesystem */
    private static class C4407e {

        /* renamed from: a  reason: collision with root package name */
        private final C6708e f52655a;

        public C4407e(C6708e eVar) {
            C6496s.h(eVar, "call");
            this.f52655a = eVar;
        }

        public final C6708e a() {
            return this.f52655a;
        }
    }

    /* renamed from: Td.m$e0  reason: case insensitive filesystem */
    public static final class C4408e0 implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52656a;

        public C4408e0(m mVar) {
            this.f52656a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            String str;
            C6496s.h(objArr, "<destruct>");
            String str2 = objArr[0];
            ReadingOptions readingOptions = objArr[1];
            String str3 = str2;
            Uri parse = Uri.parse(n.c(str3));
            m mVar = this.f52656a;
            C6496s.e(parse);
            mVar.S(parse, c.READ);
            if (readingOptions.getEncoding() == EncodingType.BASE64) {
                InputStream v10 = this.f52656a.X(parse);
                try {
                    if (readingOptions.getLength() == null || readingOptions.getPosition() == null) {
                        str = Base64.encodeToString(this.f52656a.Y(v10), 2);
                    } else {
                        byte[] bArr = new byte[readingOptions.getLength().intValue()];
                        v10.skip((long) readingOptions.getPosition().intValue());
                        str = Base64.encodeToString(bArr, 0, v10.read(bArr, 0, readingOptions.getLength().intValue()), 2);
                    }
                    C6514M m10 = C6514M.f71813a;
                    C6763c.a(v10, (Throwable) null);
                    return str;
                } catch (Throwable th2) {
                    C6763c.a(v10, th);
                    throw th2;
                }
            } else if (C6496s.c(parse.getScheme(), "file")) {
                return d.i(new FileInputStream(this.f52656a.k0(parse)));
            } else {
                if (C6496s.c(parse.getScheme(), "asset")) {
                    return d.i(this.f52656a.e0(parse));
                }
                if (parse.getScheme() == null) {
                    return d.i(this.f52656a.f0(str3));
                }
                if (this.f52656a.c0(parse)) {
                    return d.i(this.f52656a.V().getContentResolver().openInputStream(parse));
                }
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }
    }

    /* renamed from: Td.m$f  reason: case insensitive filesystem */
    public /* synthetic */ class C4409f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52657a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                expo.modules.filesystem.FileSystemUploadType[] r0 = expo.modules.filesystem.FileSystemUploadType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                expo.modules.filesystem.FileSystemUploadType r1 = expo.modules.filesystem.FileSystemUploadType.BINARY_CONTENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                expo.modules.filesystem.FileSystemUploadType r1 = expo.modules.filesystem.FileSystemUploadType.MULTIPART     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f52657a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Td.m.C4409f.<clinit>():void");
        }
    }

    /* renamed from: Td.m$f0  reason: case insensitive filesystem */
    public static final class C4410f0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4410f0 f52658a = new C4410f0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$g  reason: case insensitive filesystem */
    public static final class C4411g implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f52659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f52660b;

        C4411g(p pVar, m mVar) {
            this.f52659a = pVar;
            this.f52660b = mVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            Log.e(n.f52712a, String.valueOf(iOException.getMessage()));
            p pVar = this.f52659a;
            String a10 = n.f52712a;
            C6496s.g(a10, "access$getTAG$p(...)");
            pVar.reject(a10, iOException.getMessage(), iOException);
        }

        public void onResponse(C6708e eVar, rh.E e10) {
            String str;
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            Bundle bundle = new Bundle();
            m mVar = this.f52660b;
            rh.F a10 = e10.a();
            if (a10 != null) {
                str = a10.E();
            } else {
                str = null;
            }
            bundle.putString("body", str);
            bundle.putInt("status", e10.o());
            bundle.putBundle("headers", mVar.m0(e10.F()));
            e10.close();
            this.f52659a.resolve(bundle);
        }
    }

    /* renamed from: Td.m$g0  reason: case insensitive filesystem */
    public static final class C4412g0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4412g0 f52661a = new C4412g0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$h  reason: case insensitive filesystem */
    static final class C4413h implements s {

        /* renamed from: a  reason: collision with root package name */
        public static final C4413h f52662a = new C4413h();

        C4413h() {
        }

        public final rh.D a(rh.D d10) {
            C6496s.h(d10, "requestBody");
            return d10;
        }
    }

    /* renamed from: Td.m$h0  reason: case insensitive filesystem */
    public static final class C4414h0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4414h0 f52663a = new C4414h0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(WritingOptions.class);
        }
    }

    /* renamed from: Td.m$i  reason: case insensitive filesystem */
    public static final class C4415i implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f52664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f52665b;

        C4415i(p pVar, m mVar) {
            this.f52664a = pVar;
            this.f52665b = mVar;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            if (eVar.isCanceled()) {
                this.f52664a.resolve((Object) null);
                return;
            }
            Log.e(n.f52712a, String.valueOf(iOException.getMessage()));
            p pVar = this.f52664a;
            String a10 = n.f52712a;
            C6496s.g(a10, "access$getTAG$p(...)");
            pVar.reject(a10, iOException.getMessage(), iOException);
        }

        public void onResponse(C6708e eVar, rh.E e10) {
            String str;
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            Bundle bundle = new Bundle();
            rh.F a10 = e10.a();
            m mVar = this.f52665b;
            if (a10 != null) {
                str = a10.E();
            } else {
                str = null;
            }
            bundle.putString("body", str);
            bundle.putInt("status", e10.o());
            bundle.putBundle("headers", mVar.m0(e10.F()));
            e10.close();
            this.f52664a.resolve(bundle);
        }
    }

    public static final class i0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final i0 f52666a = new i0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemUploadOptions.class);
        }
    }

    /* renamed from: Td.m$j  reason: case insensitive filesystem */
    public static final class C4416j implements c {

        /* renamed from: a  reason: collision with root package name */
        private long f52667a = -1;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f52669c;

        C4416j(String str, m mVar) {
            this.f52668b = str;
            this.f52669c = mVar;
        }

        public void a(long j10, long j11) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f52667a + 100 || j10 == j11) {
                this.f52667a = currentTimeMillis;
                bundle2.putDouble("totalBytesSent", (double) j10);
                bundle2.putDouble("totalBytesExpectedToSend", (double) j11);
                bundle.putString("uuid", this.f52668b);
                bundle.putBundle("data", bundle2);
                this.f52669c.h("expo-file-system.uploadProgress", bundle);
            }
        }
    }

    public static final class j0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52670a;

        public j0(m mVar) {
            this.f52670a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            String str2 = objArr[1];
            String str3 = objArr[2];
            String str4 = str;
            C4416j jVar = new C4416j(str3, this.f52670a);
            m mVar = this.f52670a;
            rh.C m10 = mVar.P(str4, str2, objArr[3], new C4417k(jVar));
            C6703A z10 = this.f52670a.a0();
            C6496s.e(z10);
            C6708e a10 = z10.a(m10);
            this.f52670a.f52604f.put(str3, new C4407e(a10));
            FirebasePerfOkHttpClient.enqueue(a10, new C4415i(pVar, this.f52670a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Td.m$k  reason: case insensitive filesystem */
    static final class C4417k implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f52671a;

        C4417k(c cVar) {
            this.f52671a = cVar;
        }

        public final rh.D a(rh.D d10) {
            C6496s.h(d10, "requestBody");
            return new b(d10, this.f52671a);
        }
    }

    public static final class k0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final k0 f52672a = new k0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$l  reason: case insensitive filesystem */
    public static final class C4418l implements C6709f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f52673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f52674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f52675c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DownloadOptions f52676d;

        C4418l(p pVar, m mVar, Uri uri, DownloadOptions downloadOptions) {
            this.f52673a = pVar;
            this.f52674b = mVar;
            this.f52675c = uri;
            this.f52676d = downloadOptions;
        }

        public void onFailure(C6708e eVar, IOException iOException) {
            C6496s.h(eVar, "call");
            C6496s.h(iOException, "e");
            Log.e(n.f52712a, String.valueOf(iOException.getMessage()));
            p pVar = this.f52673a;
            String a10 = n.f52712a;
            C6496s.g(a10, "access$getTAG$p(...)");
            pVar.reject(a10, iOException.getMessage(), iOException);
        }

        public void onResponse(C6708e eVar, rh.E e10) {
            C6496s.h(eVar, "call");
            C6496s.h(e10, "response");
            m mVar = this.f52674b;
            Uri uri = this.f52675c;
            C6496s.e(uri);
            File I10 = mVar.k0(uri);
            I10.delete();
            C5405f c10 = Gh.H.c(I.h(I10, false, 1, (Object) null));
            rh.F a10 = e10.a();
            C6496s.e(a10);
            c10.K(a10.y());
            c10.close();
            Bundle bundle = new Bundle();
            m mVar2 = this.f52674b;
            DownloadOptions downloadOptions = this.f52676d;
            bundle.putString("uri", Uri.fromFile(I10).toString());
            bundle.putInt("status", e10.o());
            bundle.putBundle("headers", mVar2.m0(e10.F()));
            if (downloadOptions.getMd5()) {
                bundle.putString("md5", mVar2.d0(I10));
            }
            e10.close();
            this.f52673a.resolve(bundle);
        }
    }

    public static final class l0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final l0 f52677a = new l0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(String.class);
        }
    }

    /* renamed from: Td.m$m  reason: collision with other inner class name */
    static final class C0808m extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f52678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f52679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4399a f52680c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0808m(m mVar, C4399a aVar, C6658d dVar) {
            super(2, dVar);
            this.f52679b = mVar;
            this.f52680c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0808m(this.f52679b, this.f52680c, dVar);
        }

        public final Object invoke(Ug.K k10, C6658d dVar) {
            return ((C0808m) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f52678a;
            if (i10 == 0) {
                lf.w.b(obj);
                m mVar = this.f52679b;
                C4399a aVar = this.f52680c;
                this.f52678a = 1;
                if (mVar.Q(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public static final class m0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final m0 f52681a = new m0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(DownloadOptions.class);
        }
    }

    /* renamed from: Td.m$n  reason: case insensitive filesystem */
    public static final class C4419n implements C4403c {

        /* renamed from: a  reason: collision with root package name */
        private long f52682a = -1;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f52683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f52684c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f52685d;

        C4419n(String str, String str2, m mVar) {
            this.f52683b = str;
            this.f52684c = str2;
            this.f52685d = mVar;
        }

        public void a(long j10, long j11, boolean z10) {
            long j12;
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            String str = this.f52683b;
            long j13 = 0;
            if (str != null) {
                j12 = Long.parseLong(str);
            } else {
                j12 = 0;
            }
            long j14 = j10 + j12;
            String str2 = this.f52683b;
            if (str2 != null) {
                j13 = Long.parseLong(str2);
            }
            long j15 = j11 + j13;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f52682a + 100 || j14 == j15) {
                this.f52682a = currentTimeMillis;
                bundle2.putDouble("totalBytesWritten", (double) j14);
                bundle2.putDouble("totalBytesExpectedToWrite", (double) j15);
                bundle.putString("uuid", this.f52684c);
                bundle.putBundle("data", bundle2);
                this.f52685d.h("expo-file-system.downloadProgress", bundle);
            }
        }
    }

    public static final class n0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52686a;

        public n0(m mVar) {
            this.f52686a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6708e a10;
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            String str2 = objArr[1];
            DownloadOptions downloadOptions = objArr[2];
            String str3 = str;
            Uri parse = Uri.parse(n.c(str2));
            m mVar = this.f52686a;
            C6496s.e(parse);
            mVar.S(parse, c.WRITE);
            this.f52686a.L(parse);
            Boolean bool = null;
            if (!Sg.p.O(str3, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, (Object) null)) {
                Context s10 = this.f52686a.V();
                InputStream openRawResource = s10.getResources().openRawResource(s10.getResources().getIdentifier(str3, "raw", s10.getPackageName()));
                C6496s.g(openRawResource, "openRawResource(...)");
                C5406g d10 = Gh.H.d(Gh.H.l(openRawResource));
                File I10 = this.f52686a.k0(parse);
                I10.delete();
                C5405f c10 = Gh.H.c(I.h(I10, false, 1, (Object) null));
                c10.K(d10);
                c10.close();
                Bundle bundle = new Bundle();
                bundle.putString("uri", Uri.fromFile(I10).toString());
                boolean md5 = downloadOptions.getMd5();
                Boolean valueOf = Boolean.valueOf(md5);
                if (md5) {
                    bool = valueOf;
                }
                if (bool != null) {
                    bundle.putString("md5", this.f52686a.d0(I10));
                }
                pVar.resolve(bundle);
            } else if (C6496s.c("file", parse.getScheme())) {
                C.a l10 = new C.a().l(str3);
                if (downloadOptions.getHeaders() != null) {
                    for (Map.Entry next : downloadOptions.getHeaders().entrySet()) {
                        l10.a((String) next.getKey(), (String) next.getValue());
                    }
                }
                C6703A z10 = this.f52686a.a0();
                if (z10 == null || (a10 = z10.a(l10.b())) == null) {
                    pVar.g(new o());
                } else {
                    FirebasePerfOkHttpClient.enqueue(a10, new C4418l(pVar, this.f52686a, parse, downloadOptions));
                }
            } else {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Td.m$o  reason: case insensitive filesystem */
    public static final class C4420o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52687a;

        public C4420o(m mVar) {
            this.f52687a = mVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            wf.C6763c.a(r6, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object[] r6) {
            /*
                r5 = this;
                java.lang.String r0 = "<destruct>"
                kotlin.jvm.internal.C6496s.h(r6, r0)
                r0 = 0
                r1 = r6[r0]
                r2 = 1
                r2 = r6[r2]
                r3 = 2
                r6 = r6[r3]
                expo.modules.filesystem.WritingOptions r6 = (expo.modules.filesystem.WritingOptions) r6
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = Td.n.c(r1)
                android.net.Uri r1 = android.net.Uri.parse(r1)
                Td.m r3 = r5.f52687a
                kotlin.jvm.internal.C6496s.e(r1)
                Xd.c r4 = Xd.c.WRITE
                r3.S(r1, r4)
                expo.modules.filesystem.EncodingType r6 = r6.getEncoding()
                Td.m r3 = r5.f52687a
                java.io.OutputStream r1 = r3.b0(r1)
                expo.modules.filesystem.EncodingType r3 = expo.modules.filesystem.EncodingType.BASE64     // Catch:{ all -> 0x003d }
                r4 = 0
                if (r6 != r3) goto L_0x003f
                byte[] r6 = android.util.Base64.decode(r2, r0)     // Catch:{ all -> 0x003d }
                r1.write(r6)     // Catch:{ all -> 0x003d }
                goto L_0x004c
            L_0x003d:
                r6 = move-exception
                goto L_0x005b
            L_0x003f:
                java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x003d }
                r6.<init>(r1)     // Catch:{ all -> 0x003d }
                r6.write(r2)     // Catch:{ all -> 0x0054 }
                lf.M r0 = lf.C6514M.f71813a     // Catch:{ all -> 0x0054 }
                wf.C6763c.a(r6, r4)     // Catch:{ all -> 0x003d }
            L_0x004c:
                lf.M r6 = lf.C6514M.f71813a     // Catch:{ all -> 0x003d }
                wf.C6763c.a(r1, r4)
                lf.M r6 = lf.C6514M.f71813a
                return r6
            L_0x0054:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0056 }
            L_0x0056:
                r2 = move-exception
                wf.C6763c.a(r6, r0)     // Catch:{ all -> 0x003d }
                throw r2     // Catch:{ all -> 0x003d }
            L_0x005b:
                throw r6     // Catch:{ all -> 0x005c }
            L_0x005c:
                r0 = move-exception
                wf.C6763c.a(r1, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Td.m.C4420o.invoke(java.lang.Object[]):java.lang.Object");
        }
    }

    public static final class o0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final o0 f52688a = new o0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$p  reason: case insensitive filesystem */
    public static final class C4421p implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4421p f52689a = new C4421p();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class p0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final p0 f52690a = new p0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$q  reason: case insensitive filesystem */
    public static final class C4422q implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4422q f52691a = new C4422q();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(DeletingOptions.class);
        }
    }

    public static final class q0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final q0 f52692a = new q0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$r  reason: case insensitive filesystem */
    public static final class C4423r implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52693a;

        public C4423r(m mVar) {
            this.f52693a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            String str = objArr[0];
            DeletingOptions deletingOptions = objArr[1];
            Uri parse = Uri.parse(n.c(str));
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            m mVar = this.f52693a;
            C6496s.e(withAppendedPath);
            c cVar = c.WRITE;
            mVar.T(withAppendedPath, cVar, "Location '" + parse + "' isn't deletable.");
            if (C6496s.c(parse.getScheme(), "file")) {
                m mVar2 = this.f52693a;
                C6496s.e(parse);
                File I10 = mVar2.k0(parse);
                if (I10.exists()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Lh.c.k(I10);
                    } else {
                        this.f52693a.U(I10);
                    }
                } else if (!deletingOptions.getIdempotent()) {
                    throw new l(parse);
                }
            } else {
                m mVar3 = this.f52693a;
                C6496s.e(parse);
                if (mVar3.c0(parse)) {
                    a y10 = this.f52693a.Z(parse);
                    if (y10 != null && y10.f()) {
                        y10.e();
                    } else if (!deletingOptions.getIdempotent()) {
                        throw new l(parse);
                    }
                } else {
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }
            }
            return C6514M.f71813a;
        }
    }

    public static final class r0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final r0 f52694a = new r0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(DownloadOptions.class);
        }
    }

    /* renamed from: Td.m$s  reason: case insensitive filesystem */
    public static final class C4424s implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52695a;

        public C4424s(m mVar) {
            this.f52695a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            RelocatingOptions relocatingOptions = (RelocatingOptions) pVar;
            Uri parse = Uri.parse(n.c(relocatingOptions.getFrom()));
            m mVar = this.f52695a;
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            C6496s.g(withAppendedPath, "withAppendedPath(...)");
            c cVar = c.WRITE;
            mVar.T(withAppendedPath, cVar, "Location '" + parse + "' isn't movable.");
            Uri parse2 = Uri.parse(n.c(relocatingOptions.getTo()));
            m mVar2 = this.f52695a;
            C6496s.e(parse2);
            mVar2.S(parse2, cVar);
            if (C6496s.c(parse.getScheme(), "file")) {
                m mVar3 = this.f52695a;
                C6496s.e(parse);
                if (!mVar3.k0(parse).renameTo(this.f52695a.k0(parse2))) {
                    throw new i(parse, parse2);
                }
                return;
            }
            m mVar4 = this.f52695a;
            C6496s.e(parse);
            if (mVar4.c0(parse)) {
                a y10 = this.f52695a.Z(parse);
                if (y10 == null || !y10.f()) {
                    throw new i(parse, parse2);
                }
                this.f52695a.l0(y10, this.f52695a.k0(parse2), false);
                return;
            }
            throw new IOException("Unsupported scheme for location '" + parse + "'.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class s0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final s0 f52696a = new s0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(String.class);
        }
    }

    /* renamed from: Td.m$t  reason: case insensitive filesystem */
    public static final class C4425t implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4425t f52697a = new C4425t();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(RelocatingOptions.class);
        }
    }

    public static final class t0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final t0 f52698a = new t0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.g(String.class);
        }
    }

    /* renamed from: Td.m$u  reason: case insensitive filesystem */
    public static final class C4426u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52699a;

        public C4426u(m mVar) {
            this.f52699a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            RelocatingOptions relocatingOptions = objArr[0];
            Uri parse = Uri.parse(n.c(relocatingOptions.getFrom()));
            m mVar = this.f52699a;
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            C6496s.g(withAppendedPath, "withAppendedPath(...)");
            c cVar = c.WRITE;
            mVar.T(withAppendedPath, cVar, "Location '" + parse + "' isn't movable.");
            Uri parse2 = Uri.parse(n.c(relocatingOptions.getTo()));
            m mVar2 = this.f52699a;
            C6496s.e(parse2);
            mVar2.S(parse2, cVar);
            if (C6496s.c(parse.getScheme(), "file")) {
                m mVar3 = this.f52699a;
                C6496s.e(parse);
                if (!mVar3.k0(parse).renameTo(this.f52699a.k0(parse2))) {
                    throw new i(parse, parse2);
                }
            } else {
                m mVar4 = this.f52699a;
                C6496s.e(parse);
                if (mVar4.c0(parse)) {
                    a y10 = this.f52699a.Z(parse);
                    if (y10 == null || !y10.f()) {
                        throw new i(parse, parse2);
                    }
                    this.f52699a.l0(y10, this.f52699a.k0(parse2), false);
                } else {
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }
            }
            return C6514M.f71813a;
        }
    }

    public static final class u0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52700a;

        public u0(m mVar) {
            this.f52700a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6703A a10;
            boolean z10;
            C6703A.a B10;
            C6703A.a a11;
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            String str2 = objArr[1];
            String str3 = objArr[2];
            DownloadOptions downloadOptions = objArr[3];
            String str4 = objArr[4];
            DownloadOptions downloadOptions2 = downloadOptions;
            String str5 = str3;
            String str6 = str;
            Uri parse = Uri.parse(n.c(str2));
            m mVar = this.f52700a;
            C6496s.e(parse);
            mVar.L(parse);
            if (C6496s.c(parse.getScheme(), "file")) {
                C4419n nVar = new C4419n(str4, str5, this.f52700a);
                C6703A z11 = this.f52700a.a0();
                if (z11 == null || (B10 = z11.B()) == null || (a11 = B10.a(new G0(nVar))) == null) {
                    a10 = null;
                } else {
                    a10 = a11.c();
                }
                if (a10 == null) {
                    pVar.g(new o());
                    return;
                }
                C.a aVar = new C.a();
                if (str4 != null) {
                    aVar.a("Range", "bytes=" + str4 + "-");
                }
                if (downloadOptions2.getHeaders() != null) {
                    for (Map.Entry next : downloadOptions2.getHeaders().entrySet()) {
                        aVar.a((String) next.getKey(), (String) next.getValue());
                    }
                }
                C6708e a12 = a10.a(aVar.l(str6).b());
                this.f52700a.f52604f.put(str5, new C4401b(parse, a12));
                File I10 = this.f52700a.k0(parse);
                if (str4 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C5600w0 unused = C5576k.d(this.f52700a.f52605g, (g) null, (Ug.M) null, new C0808m(this.f52700a, new C4399a(downloadOptions2, a12, I10, z10, pVar), (C6658d) null), 3, (Object) null);
                return;
            }
            throw new IOException("Unsupported scheme for location '" + parse + "'.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Td.m$v  reason: case insensitive filesystem */
    public static final class C4427v implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52701a;

        public C4427v(m mVar) {
            this.f52701a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<unused var>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            RelocatingOptions relocatingOptions = (RelocatingOptions) pVar;
            Uri parse = Uri.parse(n.c(relocatingOptions.getFrom()));
            m mVar = this.f52701a;
            C6496s.e(parse);
            c cVar = c.READ;
            mVar.T(parse, cVar, "Location '" + parse + "' isn't readable.");
            Uri parse2 = Uri.parse(n.c(relocatingOptions.getTo()));
            m mVar2 = this.f52701a;
            C6496s.e(parse2);
            mVar2.S(parse2, c.WRITE);
            if (C6496s.c(parse.getScheme(), "file")) {
                File I10 = this.f52701a.k0(parse);
                File I11 = this.f52701a.k0(parse2);
                if (I10.isDirectory()) {
                    Lh.c.c(I10, I11);
                } else {
                    Lh.c.f(I10, I11);
                }
            } else if (this.f52701a.c0(parse)) {
                a y10 = this.f52701a.Z(parse);
                if (y10 == null || !y10.f()) {
                    throw new k(parse);
                }
                this.f52701a.l0(y10, this.f52701a.k0(parse2), true);
            } else if (C6496s.c(parse.getScheme(), "content")) {
                d.a(this.f52701a.V().getContentResolver().openInputStream(parse), new FileOutputStream(this.f52701a.k0(parse2)));
            } else if (C6496s.c(parse.getScheme(), "asset")) {
                d.a(this.f52701a.e0(parse), new FileOutputStream(this.f52701a.k0(parse2)));
            } else if (parse.getScheme() == null) {
                d.a(this.f52701a.f0(relocatingOptions.getFrom()), new FileOutputStream(this.f52701a.k0(parse2)));
            } else {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class v0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52702a;

        public v0(m mVar) {
            this.f52702a = mVar;
        }

        public final void a(Object[] objArr, p pVar) {
            Uri parse;
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            if (this.f52702a.f52603e == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (!(Build.VERSION.SDK_INT < 26 || str == null || (parse = Uri.parse(n.c(str))) == null)) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", parse);
                }
                this.f52702a.f52603e = pVar;
                this.f52702a.c().v().startActivityForResult(intent, 5394);
                return;
            }
            throw new p();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: Td.m$w  reason: case insensitive filesystem */
    public static final class C4428w implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4428w f52703a = new C4428w();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(RelocatingOptions.class);
        }
    }

    public static final class w0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final w0 f52704a = new w0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$x  reason: case insensitive filesystem */
    public static final class C4429x implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52705a;

        public C4429x(m mVar) {
            this.f52705a = mVar;
        }

        /* renamed from: a */
        public final Object invoke(Object[] objArr) {
            C6496s.h(objArr, "<destruct>");
            RelocatingOptions relocatingOptions = objArr[0];
            Uri parse = Uri.parse(n.c(relocatingOptions.getFrom()));
            m mVar = this.f52705a;
            C6496s.e(parse);
            c cVar = c.READ;
            mVar.T(parse, cVar, "Location '" + parse + "' isn't readable.");
            Uri parse2 = Uri.parse(n.c(relocatingOptions.getTo()));
            m mVar2 = this.f52705a;
            C6496s.e(parse2);
            mVar2.S(parse2, c.WRITE);
            if (C6496s.c(parse.getScheme(), "file")) {
                File I10 = this.f52705a.k0(parse);
                File I11 = this.f52705a.k0(parse2);
                if (I10.isDirectory()) {
                    Lh.c.c(I10, I11);
                } else {
                    Lh.c.f(I10, I11);
                }
                return C6514M.f71813a;
            } else if (this.f52705a.c0(parse)) {
                a y10 = this.f52705a.Z(parse);
                if (y10 == null || !y10.f()) {
                    throw new k(parse);
                }
                this.f52705a.l0(y10, this.f52705a.k0(parse2), true);
                return C6514M.f71813a;
            } else if (C6496s.c(parse.getScheme(), "content")) {
                return Integer.valueOf(d.a(this.f52705a.V().getContentResolver().openInputStream(parse), new FileOutputStream(this.f52705a.k0(parse2))));
            } else {
                if (C6496s.c(parse.getScheme(), "asset")) {
                    return Integer.valueOf(d.a(this.f52705a.e0(parse), new FileOutputStream(this.f52705a.k0(parse2))));
                }
                if (parse.getScheme() == null) {
                    return Integer.valueOf(d.a(this.f52705a.f0(relocatingOptions.getFrom()), new FileOutputStream(this.f52705a.k0(parse2))));
                }
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
        }
    }

    public static final class x0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final x0 f52706a = new x0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    /* renamed from: Td.m$y  reason: case insensitive filesystem */
    public static final class C4430y implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4430y f52707a = new C4430y();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class y0 implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final y0 f52708a = new y0();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(FileSystemUploadOptions.class);
        }
    }

    /* renamed from: Td.m$z  reason: case insensitive filesystem */
    public static final class C4431z implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4431z f52709a = new C4431z();

        /* renamed from: a */
        public final Ff.p invoke() {
            return kotlin.jvm.internal.O.m(String.class);
        }
    }

    public static final class z0 implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f52710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ke.c f52711b;

        public z0(m mVar, ke.c cVar) {
            this.f52710a = mVar;
            this.f52711b = cVar;
        }

        public final void a(Object[] objArr, p pVar) {
            C6496s.h(objArr, "<destruct>");
            C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
            String str = objArr[0];
            String str2 = str;
            m mVar = this.f52710a;
            rh.C m10 = mVar.P(str2, objArr[1], objArr[2], C4413h.f52662a);
            C6703A z10 = this.f52710a.a0();
            if (z10 != null) {
                FirebasePerfOkHttpClient.enqueue(z10.a(m10), new C4411g(pVar, this.f52710a));
            } else {
                pVar.g(new o());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public final void L(Uri uri) {
        File k02 = k0(uri);
        File parentFile = k02.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            String path = k02.getPath();
            String parent = k02.getParent();
            throw new IOException("Directory for '" + path + "' doesn't exist. Please make sure directory '" + parent + "' exists before calling downloadAsync.");
        }
    }

    private final void M(Uri uri) {
        File k02 = k0(uri);
        if (!k02.exists()) {
            String path = k02.getPath();
            throw new IOException("Directory for '" + path + "' doesn't exist.");
        }
    }

    /* access modifiers changed from: private */
    public final Uri N(File file) {
        Application application = c().v().getApplication();
        String packageName = c().v().getApplication().getPackageName();
        Uri uriForFile = androidx.core.content.d.getUriForFile(application, packageName + ".FileSystemFileProvider", file);
        C6496s.g(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    private final rh.D O(FileSystemUploadOptions fileSystemUploadOptions, s sVar, File file) {
        int i10 = C4409f.f52657a[fileSystemUploadOptions.getUploadType().ordinal()];
        if (i10 == 1) {
            return sVar.a(rh.D.Companion.b(file, (y) null));
        }
        if (i10 == 2) {
            z.a f10 = new z.a((String) null, 1, (DefaultConstructorMarker) null).f(z.f73511k);
            Map<String, String> parameters = fileSystemUploadOptions.getParameters();
            if (parameters != null) {
                for (Map.Entry next : parameters.entrySet()) {
                    f10.a((String) next.getKey(), next.getValue().toString());
                }
            }
            String mimeType = fileSystemUploadOptions.getMimeType();
            if (mimeType == null) {
                mimeType = URLConnection.guessContentTypeFromName(file.getName());
                C6496s.g(mimeType, "guessContentTypeFromName(...)");
            }
            String fieldName = fileSystemUploadOptions.getFieldName();
            if (fieldName == null) {
                fieldName = file.getName();
            }
            C6496s.e(fieldName);
            f10.b(fieldName, file.getName(), sVar.a(rh.D.Companion.b(file, y.f73499e.b(mimeType))));
            return f10.e();
        }
        throw new C6535s();
    }

    /* access modifiers changed from: private */
    public final rh.C P(String str, String str2, FileSystemUploadOptions fileSystemUploadOptions, s sVar) {
        Uri parse = Uri.parse(n.c(str2));
        C6496s.e(parse);
        S(parse, c.READ);
        M(parse);
        C.a l10 = new C.a().l(str);
        Map<String, String> headers = fileSystemUploadOptions.getHeaders();
        if (headers != null) {
            for (Map.Entry next : headers.entrySet()) {
                l10.a((String) next.getKey(), (String) next.getValue());
            }
        }
        return l10.g(fileSystemUploadOptions.getHttpMethod().getValue(), O(fileSystemUploadOptions, sVar, k0(parse))).b();
    }

    /* access modifiers changed from: private */
    public final Object Q(C4399a aVar, C6658d dVar) {
        return C5572i.g(Ug.Z.b(), new H0(aVar, this, (C6658d) null), dVar);
    }

    /* access modifiers changed from: private */
    public final void R(File file) {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Couldn't create directory '" + file + "'");
        }
    }

    /* access modifiers changed from: private */
    public final void S(Uri uri, c cVar) {
        if (cVar == c.READ) {
            T(uri, cVar, "Location '" + uri + "' isn't readable.");
        }
        if (cVar == c.WRITE) {
            T(uri, cVar, "Location '" + uri + "' isn't writable.");
        }
        String name = cVar.name();
        T(uri, cVar, "Location '" + uri + "' doesn't have permission '" + name + "'.");
    }

    /* access modifiers changed from: private */
    public final void T(Uri uri, c cVar, String str) {
        EnumSet j02 = j0(uri);
        if (j02 == null || !j02.contains(cVar)) {
            throw new IOException(str);
        }
    }

    /* access modifiers changed from: private */
    public final void U(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e10 = null;
                for (File file2 : listFiles) {
                    try {
                        C6496s.e(file2);
                        U(file2);
                    } catch (IOException e11) {
                        e10 = e11;
                    }
                }
                if (e10 != null) {
                    throw e10;
                } else if (!file.delete()) {
                    throw new IOException("Unable to delete directory " + file + ".");
                }
            } else {
                throw new IOException("Failed to list contents of " + file);
            }
        } else if (!file.delete()) {
            throw new IOException("Unable to delete file: " + file);
        }
    }

    /* access modifiers changed from: private */
    public final Context V() {
        Context u10 = c().u();
        if (u10 != null) {
            return u10;
        }
        throw new e();
    }

    /* access modifiers changed from: private */
    public final long W(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            C6496s.e(file2);
            arrayList.add(Long.valueOf(W(file2)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it.next()).longValue());
            }
            obj = next;
        }
        Long l10 = (Long) obj;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final InputStream X(Uri uri) {
        if (C6496s.c(uri.getScheme(), "file")) {
            return new FileInputStream(k0(uri));
        }
        if (C6496s.c(uri.getScheme(), "asset")) {
            return e0(uri);
        }
        if (c0(uri)) {
            InputStream openInputStream = V().getContentResolver().openInputStream(uri);
            C6496s.e(openInputStream);
            return openInputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    /* access modifiers changed from: private */
    public final byte[] Y(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    /* access modifiers changed from: private */
    public final a Z(Uri uri) {
        a g10 = a.g(V(), uri);
        if (g10 == null || !g10.l()) {
            return a.h(V(), uri);
        }
        return g10;
    }

    /* access modifiers changed from: private */
    public final synchronized C6703A a0() {
        try {
            if (this.f52602d == null) {
                C6703A.a aVar = new C6703A.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f52602d = aVar.f(60, timeUnit).S(60, timeUnit).W(60, timeUnit).c();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f52602d;
    }

    /* access modifiers changed from: private */
    public final OutputStream b0(Uri uri) {
        if (C6496s.c(uri.getScheme(), "file")) {
            return new FileOutputStream(k0(uri));
        }
        if (c0(uri)) {
            OutputStream openOutputStream = V().getContentResolver().openOutputStream(uri);
            C6496s.e(openOutputStream);
            return openOutputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    /* access modifiers changed from: private */
    public final boolean c0(Uri uri) {
        boolean z10;
        if (!C6496s.c(uri.getScheme(), "content")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            z10 = Sg.p.J(host, "com.android.externalstorage", false, 2, (Object) null);
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        wf.C6763c.a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d0(java.io.File r3) {
        /*
            r2 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            byte[] r3 = Kh.a.d(r0)     // Catch:{ all -> 0x001c }
            char[] r3 = Jh.a.a(r3)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "encodeHex(...)"
            kotlin.jvm.internal.C6496s.g(r3, r1)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x001c }
            r1.<init>(r3)     // Catch:{ all -> 0x001c }
            r3 = 0
            wf.C6763c.a(r0, r3)
            return r1
        L_0x001c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            wf.C6763c.a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.m.d0(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: private */
    public final InputStream e0(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            String substring = path.substring(1);
            C6496s.g(substring, "substring(...)");
            InputStream open = V().getAssets().open(substring);
            C6496s.g(open, "open(...)");
            return open;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final InputStream f0(String str) {
        int identifier = V().getResources().getIdentifier(str, "raw", V().getPackageName());
        if (identifier == 0 && (identifier = V().getResources().getIdentifier(str, "drawable", V().getPackageName())) == 0) {
            throw new FileNotFoundException("No resource found with the name '" + str + "'");
        }
        InputStream openRawResource = V().getResources().openRawResource(identifier);
        C6496s.g(openRawResource, "openRawResource(...)");
        return openRawResource;
    }

    /* access modifiers changed from: private */
    public final String g0(String str) {
        String substring = str.substring(Sg.p.a0(str, ':', 0, false, 6, (Object) null) + 3);
        C6496s.g(substring, "substring(...)");
        return substring;
    }

    private final EnumSet h0(String str) {
        Xd.b n10 = c().n();
        if (n10 != null) {
            return n10.a(V(), str);
        }
        return null;
    }

    private final EnumSet i0(Uri uri) {
        a Z10 = Z(uri);
        EnumSet<E> noneOf = EnumSet.noneOf(c.class);
        if (Z10 != null) {
            if (Z10.a()) {
                noneOf.add(c.READ);
            }
            if (Z10.b()) {
                noneOf.add(c.WRITE);
            }
        }
        C6496s.g(noneOf, "apply(...)");
        return noneOf;
    }

    private final EnumSet j0(Uri uri) {
        if (c0(uri)) {
            return i0(uri);
        }
        if (C6496s.c(uri.getScheme(), "content")) {
            return EnumSet.of(c.READ);
        }
        if (C6496s.c(uri.getScheme(), "asset")) {
            return EnumSet.of(c.READ);
        }
        if (C6496s.c(uri.getScheme(), "file")) {
            return h0(uri.getPath());
        }
        if (uri.getScheme() == null) {
            return EnumSet.of(c.READ);
        }
        return EnumSet.noneOf(c.class);
    }

    /* access modifiers changed from: private */
    public final File k0(Uri uri) {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            C6496s.e(path);
            return new File(path);
        }
        throw new IOException("Invalid Uri: " + uri);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        wf.C6763c.a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        wf.C6763c.a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ac, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0(M1.a r5, java.io.File r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5.f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r6.isDirectory()
            java.lang.String r1 = "Couldn't create folder in output dir."
            if (r0 != 0) goto L_0x0028
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L_0x003b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x003b
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L_0x0022
            goto L_0x003b
        L_0x0022:
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r1)
            throw r5
        L_0x0028:
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x003b
            boolean r0 = r6.mkdirs()
            if (r0 == 0) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r1)
            throw r5
        L_0x003b:
            boolean r0 = r5.k()
            if (r0 == 0) goto L_0x005a
            M1.a[] r0 = r5.m()
            int r1 = r0.length
            r2 = 0
        L_0x0047:
            if (r2 >= r1) goto L_0x0054
            r3 = r0[r2]
            kotlin.jvm.internal.C6496s.e(r3)
            r4.l0(r3, r6, r7)
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0054:
            if (r7 != 0) goto L_0x0059
            r5.e()
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r0 = r5.i()
            if (r0 == 0) goto L_0x00ad
            boolean r1 = r6.isDirectory()
            if (r1 == 0) goto L_0x0070
            java.io.File r1 = new java.io.File
            java.lang.String r6 = r6.getPath()
            r1.<init>(r6, r0)
            goto L_0x0079
        L_0x0070:
            java.io.File r1 = new java.io.File
            java.lang.String r6 = r6.getPath()
            r1.<init>(r6)
        L_0x0079:
            android.content.Context r6 = r4.V()
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r0 = r5.j()
            java.io.InputStream r6 = r6.openInputStream(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x009e }
            r0.<init>(r1)     // Catch:{ all -> 0x009e }
            Lh.d.a(r6, r0)     // Catch:{ all -> 0x00a0 }
            r1 = 0
            wf.C6763c.a(r0, r1)     // Catch:{ all -> 0x009e }
            wf.C6763c.a(r6, r1)
            if (r7 != 0) goto L_0x00ad
            r5.e()
            goto L_0x00ad
        L_0x009e:
            r5 = move-exception
            goto L_0x00a7
        L_0x00a0:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r7 = move-exception
            wf.C6763c.a(r0, r5)     // Catch:{ all -> 0x009e }
            throw r7     // Catch:{ all -> 0x009e }
        L_0x00a7:
            throw r5     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r7 = move-exception
            wf.C6763c.a(r6, r5)
            throw r7
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Td.m.l0(M1.a, java.io.File, boolean):void");
    }

    /* access modifiers changed from: private */
    public final Bundle m0(u uVar) {
        Bundle bundle = new Bundle();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String g10 = uVar.g(i10);
            if (bundle.containsKey(g10)) {
                String string = bundle.getString(g10);
                String x10 = uVar.x(i10);
                bundle.putString(g10, string + ", " + x10);
            } else {
                bundle.putString(g10, uVar.x(i10));
            }
        }
        return bundle;
    }

    @SuppressLint({"WrongConstant", "DiscouragedApi"})
    public ke.d b() {
        Class<C6514M> cls;
        Class<DeletingOptions> cls2;
        Class<p> cls3;
        Object obj;
        Object obj2;
        Object obj3;
        Class<Bundle> cls4;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Class cls5;
        Class<p> cls6;
        Boolean bool;
        Object obj14;
        Class<p> cls7;
        Boolean bool2;
        Object obj15;
        Object fVar;
        Object fVar2;
        Object fVar3;
        Object fVar4;
        Object fVar5;
        Object fVar6;
        Class<MakeDirectoryOptions> cls8 = MakeDirectoryOptions.class;
        Class<DeletingOptions> cls9 = DeletingOptions.class;
        Class<WritingOptions> cls10 = WritingOptions.class;
        Class<ReadingOptions> cls11 = ReadingOptions.class;
        Class<Bundle> cls12 = Bundle.class;
        Class<InfoOptions> cls13 = InfoOptions.class;
        Class<C6514M> cls14 = C6514M.class;
        Class<RelocatingOptions> cls15 = RelocatingOptions.class;
        Class<p> cls16 = p.class;
        Class<String> cls17 = String.class;
        Class<DownloadOptions> cls18 = DownloadOptions.class;
        Class<FileSystemUploadOptions> cls19 = FileSystemUploadOptions.class;
        StringBuilder sb2 = new StringBuilder();
        Class<Double> cls20 = Double.class;
        sb2.append("[");
        sb2.append("ExpoModulesCore");
        sb2.append("] ");
        sb2.append(getClass() + ".ModuleDefinition");
        D3.a.c(sb2.toString());
        try {
            ke.c cVar = new ke.c(this);
            cVar.o("ExponentFileSystem");
            Class<MakeDirectoryOptions> cls21 = cls8;
            Class<RelocatingOptions> cls22 = cls15;
            cVar.e(C6502A.a("documentDirectory", Uri.fromFile(V().getFilesDir()) + "/"), C6502A.a("cacheDirectory", Uri.fromFile(V().getCacheDir()) + "/"), C6502A.a("bundleDirectory", "asset:///"));
            cVar.g("expo-file-system.downloadProgress", "expo-file-system.uploadProgress");
            Map r10 = cVar.r();
            ge.e eVar = ge.e.MODULE_CREATE;
            r10.put(eVar, new C5007a(eVar, new E0(this)));
            C5157d dVar = C5157d.f61437a;
            Ff.d b10 = kotlin.jvm.internal.O.b(cls17);
            Boolean bool3 = Boolean.FALSE;
            C5155b bVar = (C5155b) dVar.a().get(new Pair(b10, bool3));
            if (bVar == null) {
                cls3 = cls16;
                cls2 = cls9;
                cls = cls14;
                bVar = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4430y.f52707a));
            } else {
                cls2 = cls9;
                cls = cls14;
                cls3 = cls16;
            }
            C5155b bVar2 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls13), bool3));
            if (bVar2 == null) {
                bVar2 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls13), false, J.f52623a));
            }
            C5155b[] bVarArr = {bVar, bVar2};
            U u10 = new U(this);
            Class cls23 = Integer.TYPE;
            if (C6496s.c(cls12, cls23)) {
                obj = new ie.l("getInfoAsync", bVarArr, u10);
            } else if (C6496s.c(cls12, Boolean.TYPE)) {
                obj = new C5039i("getInfoAsync", bVarArr, u10);
            } else if (C6496s.c(cls12, Double.TYPE)) {
                obj = new C5040j("getInfoAsync", bVarArr, u10);
            } else if (C6496s.c(cls12, Float.TYPE)) {
                obj = new k("getInfoAsync", bVarArr, u10);
            } else if (C6496s.c(cls12, cls17)) {
                obj = new n("getInfoAsync", bVarArr, u10);
            } else {
                obj = new C5036f("getInfoAsync", bVarArr, u10);
            }
            cVar.k().put("getInfoAsync", obj);
            C5155b bVar3 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar3 == null) {
                bVar3 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4404c0.f52648a));
            }
            C5155b bVar4 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls11), bool3));
            if (bVar4 == null) {
                bVar4 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls11), false, C4406d0.f52654a));
            }
            cVar.k().put("readAsStringAsync", new C5036f("readAsStringAsync", new C5155b[]{bVar3, bVar4}, new C4408e0(this)));
            C5155b bVar5 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar5 == null) {
                bVar5 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4410f0.f52658a));
            }
            C5155b bVar6 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar6 == null) {
                bVar6 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4412g0.f52661a));
            }
            C5155b bVar7 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls10), bool3));
            if (bVar7 == null) {
                bVar7 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls10), false, C4414h0.f52663a));
            }
            C5155b[] bVarArr2 = {bVar5, bVar6, bVar7};
            C4420o oVar = new C4420o(this);
            Class<C6514M> cls24 = cls;
            if (C6496s.c(cls24, cls23)) {
                obj2 = new ie.l("writeAsStringAsync", bVarArr2, oVar);
            } else if (C6496s.c(cls24, Boolean.TYPE)) {
                obj2 = new C5039i("writeAsStringAsync", bVarArr2, oVar);
            } else if (C6496s.c(cls24, Double.TYPE)) {
                obj2 = new C5040j("writeAsStringAsync", bVarArr2, oVar);
            } else if (C6496s.c(cls24, Float.TYPE)) {
                obj2 = new k("writeAsStringAsync", bVarArr2, oVar);
            } else if (C6496s.c(cls24, cls17)) {
                obj2 = new n("writeAsStringAsync", bVarArr2, oVar);
            } else {
                obj2 = new C5036f("writeAsStringAsync", bVarArr2, oVar);
            }
            cVar.k().put("writeAsStringAsync", obj2);
            C5155b bVar8 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar8 == null) {
                bVar8 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4421p.f52689a));
            }
            C5155b bVar9 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool3));
            if (bVar9 == null) {
                bVar9 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls2), false, C4422q.f52691a));
            }
            C5155b[] bVarArr3 = {bVar8, bVar9};
            C4423r rVar = new C4423r(this);
            if (C6496s.c(cls24, cls23)) {
                obj3 = new ie.l("deleteAsync", bVarArr3, rVar);
            } else if (C6496s.c(cls24, Boolean.TYPE)) {
                obj3 = new C5039i("deleteAsync", bVarArr3, rVar);
            } else if (C6496s.c(cls24, Double.TYPE)) {
                obj3 = new C5040j("deleteAsync", bVarArr3, rVar);
            } else if (C6496s.c(cls24, Float.TYPE)) {
                obj3 = new k("deleteAsync", bVarArr3, rVar);
            } else if (C6496s.c(cls24, cls17)) {
                obj3 = new n("deleteAsync", bVarArr3, rVar);
            } else {
                obj3 = new C5036f("deleteAsync", bVarArr3, rVar);
            }
            cVar.k().put("deleteAsync", obj3);
            Class<RelocatingOptions> cls25 = cls22;
            Class<p> cls26 = cls3;
            if (C6496s.c(cls25, cls26)) {
                obj4 = new C5037g("moveAsync", new C5155b[0], new C4424s(this));
                cls4 = cls12;
            } else {
                C5155b bVar10 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls25), bool3));
                if (bVar10 == null) {
                    cls4 = cls12;
                    bVar10 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls25), false, C4425t.f52697a));
                } else {
                    cls4 = cls12;
                }
                C5155b[] bVarArr4 = {bVar10};
                C4426u uVar = new C4426u(this);
                if (C6496s.c(cls24, cls23)) {
                    fVar6 = new ie.l("moveAsync", bVarArr4, uVar);
                } else if (C6496s.c(cls24, Boolean.TYPE)) {
                    fVar6 = new C5039i("moveAsync", bVarArr4, uVar);
                } else if (C6496s.c(cls24, Double.TYPE)) {
                    fVar6 = new C5040j("moveAsync", bVarArr4, uVar);
                } else if (C6496s.c(cls24, Float.TYPE)) {
                    fVar6 = new k("moveAsync", bVarArr4, uVar);
                } else if (C6496s.c(cls24, cls17)) {
                    fVar6 = new n("moveAsync", bVarArr4, uVar);
                } else {
                    fVar6 = new C5036f("moveAsync", bVarArr4, uVar);
                }
                obj4 = fVar6;
            }
            cVar.k().put("moveAsync", obj4);
            if (C6496s.c(cls25, cls26)) {
                obj5 = new C5037g("copyAsync", new C5155b[0], new C4427v(this));
            } else {
                C5155b bVar11 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls25), bool3));
                if (bVar11 == null) {
                    bVar11 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls25), false, C4428w.f52703a));
                }
                C5155b[] bVarArr5 = {bVar11};
                C4429x xVar = new C4429x(this);
                Class<Object> cls27 = Object.class;
                if (C6496s.c(cls27, cls23)) {
                    fVar5 = new ie.l("copyAsync", bVarArr5, xVar);
                } else if (C6496s.c(cls27, Boolean.TYPE)) {
                    fVar5 = new C5039i("copyAsync", bVarArr5, xVar);
                } else if (C6496s.c(cls27, Double.TYPE)) {
                    fVar5 = new C5040j("copyAsync", bVarArr5, xVar);
                } else if (C6496s.c(cls27, Float.TYPE)) {
                    fVar5 = new k("copyAsync", bVarArr5, xVar);
                } else if (C6496s.c(cls27, cls17)) {
                    fVar5 = new n("copyAsync", bVarArr5, xVar);
                } else {
                    fVar5 = new C5036f("copyAsync", bVarArr5, xVar);
                }
                obj5 = fVar5;
            }
            cVar.k().put("copyAsync", obj5);
            C5155b bVar12 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar12 == null) {
                bVar12 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4431z.f52709a));
            }
            C5155b bVar13 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls21), bool3));
            if (bVar13 == null) {
                bVar13 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls21), false, A.f52606a));
            }
            C5155b[] bVarArr6 = {bVar12, bVar13};
            B b11 = new B(this);
            if (C6496s.c(cls24, cls23)) {
                obj6 = new ie.l("makeDirectoryAsync", bVarArr6, b11);
            } else if (C6496s.c(cls24, Boolean.TYPE)) {
                obj6 = new C5039i("makeDirectoryAsync", bVarArr6, b11);
            } else if (C6496s.c(cls24, Double.TYPE)) {
                obj6 = new C5040j("makeDirectoryAsync", bVarArr6, b11);
            } else if (C6496s.c(cls24, Float.TYPE)) {
                obj6 = new k("makeDirectoryAsync", bVarArr6, b11);
            } else if (C6496s.c(cls24, cls17)) {
                obj6 = new n("makeDirectoryAsync", bVarArr6, b11);
            } else {
                obj6 = new C5036f("makeDirectoryAsync", bVarArr6, b11);
            }
            cVar.k().put("makeDirectoryAsync", obj6);
            Class<List> cls28 = List.class;
            if (C6496s.c(cls17, cls26)) {
                obj7 = new C5037g("readDirectoryAsync", new C5155b[0], new C(this));
            } else {
                C5155b bVar14 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), Boolean.TRUE));
                if (bVar14 == null) {
                    bVar14 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), true, D.f52612a));
                }
                C5155b[] bVarArr7 = {bVar14};
                E e10 = new E(this);
                if (C6496s.c(cls28, cls23)) {
                    fVar4 = new ie.l("readDirectoryAsync", bVarArr7, e10);
                } else if (C6496s.c(cls28, Boolean.TYPE)) {
                    fVar4 = new C5039i("readDirectoryAsync", bVarArr7, e10);
                } else if (C6496s.c(cls28, Double.TYPE)) {
                    fVar4 = new C5040j("readDirectoryAsync", bVarArr7, e10);
                } else if (C6496s.c(cls28, Float.TYPE)) {
                    fVar4 = new k("readDirectoryAsync", bVarArr7, e10);
                } else if (C6496s.c(cls28, cls17)) {
                    fVar4 = new n("readDirectoryAsync", bVarArr7, e10);
                } else {
                    fVar4 = new C5036f("readDirectoryAsync", bVarArr7, e10);
                }
                obj7 = fVar4;
            }
            cVar.k().put("readDirectoryAsync", obj7);
            C5155b[] bVarArr8 = new C5155b[0];
            F f10 = new F();
            Class<Double> cls29 = cls20;
            if (C6496s.c(cls29, cls23)) {
                obj8 = new ie.l("getTotalDiskCapacityAsync", bVarArr8, f10);
            } else if (C6496s.c(cls29, Boolean.TYPE)) {
                obj8 = new C5039i("getTotalDiskCapacityAsync", bVarArr8, f10);
            } else if (C6496s.c(cls29, Double.TYPE)) {
                obj8 = new C5040j("getTotalDiskCapacityAsync", bVarArr8, f10);
            } else if (C6496s.c(cls29, Float.TYPE)) {
                obj8 = new k("getTotalDiskCapacityAsync", bVarArr8, f10);
            } else if (C6496s.c(cls29, cls17)) {
                obj8 = new n("getTotalDiskCapacityAsync", bVarArr8, f10);
            } else {
                obj8 = new C5036f("getTotalDiskCapacityAsync", bVarArr8, f10);
            }
            cVar.k().put("getTotalDiskCapacityAsync", obj8);
            C5155b[] bVarArr9 = new C5155b[0];
            G g10 = new G();
            if (C6496s.c(cls29, cls23)) {
                obj9 = new ie.l("getFreeDiskStorageAsync", bVarArr9, g10);
            } else if (C6496s.c(cls29, Boolean.TYPE)) {
                obj9 = new C5039i("getFreeDiskStorageAsync", bVarArr9, g10);
            } else if (C6496s.c(cls29, Double.TYPE)) {
                obj9 = new C5040j("getFreeDiskStorageAsync", bVarArr9, g10);
            } else if (C6496s.c(cls29, Float.TYPE)) {
                obj9 = new k("getFreeDiskStorageAsync", bVarArr9, g10);
            } else if (C6496s.c(cls29, cls17)) {
                obj9 = new n("getFreeDiskStorageAsync", bVarArr9, g10);
            } else {
                obj9 = new C5036f("getFreeDiskStorageAsync", bVarArr9, g10);
            }
            cVar.k().put("getFreeDiskStorageAsync", obj9);
            if (C6496s.c(cls17, cls26)) {
                obj10 = new C5037g("getContentUriAsync", new C5155b[0], new H(this));
            } else {
                C5155b bVar15 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
                if (bVar15 == null) {
                    bVar15 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, I.f52622a));
                }
                C5155b[] bVarArr10 = {bVar15};
                K k10 = new K(this);
                if (C6496s.c(cls17, cls23)) {
                    fVar3 = new ie.l("getContentUriAsync", bVarArr10, k10);
                } else if (C6496s.c(cls17, Boolean.TYPE)) {
                    fVar3 = new C5039i("getContentUriAsync", bVarArr10, k10);
                } else if (C6496s.c(cls17, Double.TYPE)) {
                    fVar3 = new C5040j("getContentUriAsync", bVarArr10, k10);
                } else if (C6496s.c(cls17, Float.TYPE)) {
                    fVar3 = new k("getContentUriAsync", bVarArr10, k10);
                } else if (C6496s.c(cls17, cls17)) {
                    fVar3 = new n("getContentUriAsync", bVarArr10, k10);
                } else {
                    fVar3 = new C5036f("getContentUriAsync", bVarArr10, k10);
                }
                obj10 = fVar3;
            }
            cVar.k().put("getContentUriAsync", obj10);
            if (C6496s.c(cls17, cls26)) {
                obj11 = new C5037g("readSAFDirectoryAsync", new C5155b[0], new L(this));
            } else {
                C5155b bVar16 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
                if (bVar16 == null) {
                    bVar16 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, M.f52626a));
                }
                C5155b[] bVarArr11 = {bVar16};
                N n10 = new N(this);
                if (C6496s.c(cls28, cls23)) {
                    fVar2 = new ie.l("readSAFDirectoryAsync", bVarArr11, n10);
                } else if (C6496s.c(cls28, Boolean.TYPE)) {
                    fVar2 = new C5039i("readSAFDirectoryAsync", bVarArr11, n10);
                } else if (C6496s.c(cls28, Double.TYPE)) {
                    fVar2 = new C5040j("readSAFDirectoryAsync", bVarArr11, n10);
                } else if (C6496s.c(cls28, Float.TYPE)) {
                    fVar2 = new k("readSAFDirectoryAsync", bVarArr11, n10);
                } else if (C6496s.c(cls28, cls17)) {
                    fVar2 = new n("readSAFDirectoryAsync", bVarArr11, n10);
                } else {
                    fVar2 = new C5036f("readSAFDirectoryAsync", bVarArr11, n10);
                }
                obj11 = fVar2;
            }
            cVar.k().put("readSAFDirectoryAsync", obj11);
            C5155b bVar17 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar17 == null) {
                bVar17 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, O.f52628a));
            }
            C5155b bVar18 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar18 == null) {
                bVar18 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, P.f52629a));
            }
            C5155b[] bVarArr12 = {bVar17, bVar18};
            Q q10 = new Q(this);
            if (C6496s.c(cls17, cls23)) {
                obj12 = new ie.l("makeSAFDirectoryAsync", bVarArr12, q10);
            } else if (C6496s.c(cls17, Boolean.TYPE)) {
                obj12 = new C5039i("makeSAFDirectoryAsync", bVarArr12, q10);
            } else if (C6496s.c(cls17, Double.TYPE)) {
                obj12 = new C5040j("makeSAFDirectoryAsync", bVarArr12, q10);
            } else if (C6496s.c(cls17, Float.TYPE)) {
                obj12 = new k("makeSAFDirectoryAsync", bVarArr12, q10);
            } else if (C6496s.c(cls17, cls17)) {
                obj12 = new n("makeSAFDirectoryAsync", bVarArr12, q10);
            } else {
                obj12 = new C5036f("makeSAFDirectoryAsync", bVarArr12, q10);
            }
            cVar.k().put("makeSAFDirectoryAsync", obj12);
            C5155b bVar19 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar19 == null) {
                bVar19 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, R.f52631a));
            }
            C5155b bVar20 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar20 == null) {
                bVar20 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, S.f52632a));
            }
            C5155b bVar21 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar21 == null) {
                bVar21 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, T.f52633a));
            }
            C5155b[] bVarArr13 = {bVar19, bVar20, bVar21};
            V v10 = new V(this);
            if (C6496s.c(cls17, cls23)) {
                obj13 = new ie.l("createSAFFileAsync", bVarArr13, v10);
            } else if (C6496s.c(cls17, Boolean.TYPE)) {
                obj13 = new C5039i("createSAFFileAsync", bVarArr13, v10);
            } else if (C6496s.c(cls17, Double.TYPE)) {
                obj13 = new C5040j("createSAFFileAsync", bVarArr13, v10);
            } else if (C6496s.c(cls17, Float.TYPE)) {
                obj13 = new k("createSAFFileAsync", bVarArr13, v10);
            } else if (C6496s.c(cls17, cls17)) {
                obj13 = new n("createSAFFileAsync", bVarArr13, v10);
            } else {
                obj13 = new C5036f("createSAFFileAsync", bVarArr13, v10);
            }
            cVar.k().put("createSAFFileAsync", obj13);
            Ff.d b12 = kotlin.jvm.internal.O.b(cls17);
            Boolean bool4 = Boolean.TRUE;
            C5155b bVar22 = (C5155b) dVar.a().get(new Pair(b12, bool4));
            if (bVar22 == null) {
                bVar22 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), true, s0.f52696a));
            }
            cVar.k().put("requestDirectoryPermissionsAsync", new C5037g("requestDirectoryPermissionsAsync", new C5155b[]{bVar22}, new v0(this)));
            C5155b bVar23 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar23 == null) {
                bVar23 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, w0.f52704a));
            }
            C5155b bVar24 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar24 == null) {
                cls5 = cls23;
                bVar24 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, x0.f52706a));
            } else {
                cls5 = cls23;
            }
            C5155b bVar25 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls19), bool3));
            if (bVar25 == null) {
                cls6 = cls26;
                bVar25 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls19), false, y0.f52708a));
            } else {
                cls6 = cls26;
            }
            cVar.k().put("uploadAsync", new C5037g("uploadAsync", new C5155b[]{bVar23, bVar24, bVar25}, new z0(this, cVar)));
            C5155b bVar26 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar26 == null) {
                bVar26 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, A0.f52607a));
            }
            C5155b bVar27 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar27 == null) {
                bVar27 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, B0.f52609a));
            }
            C5155b bVar28 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar28 == null) {
                bVar28 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C0.f52611a));
            }
            C5155b bVar29 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls19), bool3));
            if (bVar29 == null) {
                i0 i0Var = i0.f52666a;
                Ff.d b13 = kotlin.jvm.internal.O.b(cls19);
                bool = bool4;
                bVar29 = new C5155b(new qe.O(b13, false, i0Var));
            } else {
                bool = bool4;
            }
            cVar.k().put("uploadTaskStartAsync", new C5037g("uploadTaskStartAsync", new C5155b[]{bVar26, bVar27, bVar28, bVar29}, new j0(this)));
            C5155b bVar30 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar30 == null) {
                bVar30 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, k0.f52672a));
            }
            Boolean bool5 = bool;
            C5155b bVar31 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool5));
            if (bVar31 == null) {
                bVar31 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), true, l0.f52677a));
            }
            C5155b bVar32 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls18), bool3));
            if (bVar32 == null) {
                bVar32 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls18), false, m0.f52681a));
            }
            cVar.k().put("downloadAsync", new C5037g("downloadAsync", new C5155b[]{bVar30, bVar31, bVar32}, new n0(this)));
            Class<p> cls30 = cls6;
            if (C6496s.c(cls17, cls30)) {
                obj14 = new C5037g("networkTaskCancelAsync", new C5155b[0], new W(this));
            } else {
                C5155b bVar33 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
                if (bVar33 == null) {
                    bVar33 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, X.f52637a));
                }
                obj14 = new C5036f("networkTaskCancelAsync", new C5155b[]{bVar33}, new Y(this));
            }
            cVar.k().put("networkTaskCancelAsync", obj14);
            C5155b bVar34 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar34 == null) {
                bVar34 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, o0.f52688a));
            }
            C5155b bVar35 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar35 == null) {
                bVar35 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, p0.f52690a));
            }
            C5155b bVar36 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool3));
            if (bVar36 == null) {
                cls7 = cls30;
                bVar36 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, q0.f52692a));
            } else {
                cls7 = cls30;
            }
            C5155b bVar37 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls18), bool3));
            if (bVar37 == null) {
                r0 r0Var = r0.f52694a;
                Ff.d b14 = kotlin.jvm.internal.O.b(cls18);
                bool2 = bool3;
                bVar37 = new C5155b(new qe.O(b14, false, r0Var));
            } else {
                bool2 = bool3;
            }
            C5155b bVar38 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool5));
            if (bVar38 == null) {
                bVar38 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), true, t0.f52698a));
            }
            cVar.k().put("downloadResumableStartAsync", new C5037g("downloadResumableStartAsync", new C5155b[]{bVar34, bVar35, bVar36, bVar37, bVar38}, new u0(this)));
            if (C6496s.c(cls17, cls7)) {
                obj15 = new C5037g("downloadResumablePauseAsync", new C5155b[0], new Z(this));
            } else {
                C5155b bVar39 = (C5155b) dVar.a().get(new Pair(kotlin.jvm.internal.O.b(cls17), bool2));
                if (bVar39 == null) {
                    bVar39 = new C5155b(new qe.O(kotlin.jvm.internal.O.b(cls17), false, C4400a0.f52645a));
                }
                C5155b[] bVarArr14 = {bVar39};
                C4402b0 b0Var = new C4402b0(this);
                Class<Bundle> cls31 = cls4;
                if (C6496s.c(cls31, cls5)) {
                    fVar = new ie.l("downloadResumablePauseAsync", bVarArr14, b0Var);
                } else if (C6496s.c(cls31, Boolean.TYPE)) {
                    fVar = new C5039i("downloadResumablePauseAsync", bVarArr14, b0Var);
                } else if (C6496s.c(cls31, Double.TYPE)) {
                    fVar = new C5040j("downloadResumablePauseAsync", bVarArr14, b0Var);
                } else if (C6496s.c(cls31, Float.TYPE)) {
                    fVar = new k("downloadResumablePauseAsync", bVarArr14, b0Var);
                } else if (C6496s.c(cls31, cls17)) {
                    fVar = new n("downloadResumablePauseAsync", bVarArr14, b0Var);
                } else {
                    fVar = new C5036f("downloadResumablePauseAsync", bVarArr14, b0Var);
                }
                obj15 = fVar;
            }
            cVar.k().put("downloadResumablePauseAsync", obj15);
            Map r11 = cVar.r();
            ge.e eVar2 = ge.e.ON_ACTIVITY_RESULT;
            r11.put(eVar2, new ge.d(eVar2, new D0(this)));
            Map r12 = cVar.r();
            ge.e eVar3 = ge.e.MODULE_DESTROY;
            r12.put(eVar3, new C5007a(eVar3, new F0(this)));
            ke.d p10 = cVar.p();
            D3.a.f();
            return p10;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            D3.a.f();
            throw th3;
        }
    }
}
