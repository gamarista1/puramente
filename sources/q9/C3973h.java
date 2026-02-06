package q9;

import A9.A;
import A9.C2985b;
import A9.C2988e;
import A9.C2991h;
import A9.H;
import B9.b;
import android.net.Uri;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import ja.C3655k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r9.C3983b;
import s9.C4000b;
import t9.C4055d;
import u9.c;
import v9.C4114a;
import w9.C4152e;
import x9.C4184f;
import y9.g;
import y9.k;
import z9.d;

/* renamed from: q9.h  reason: case insensitive filesystem */
public final class C3973h implements p {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f47871n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: o  reason: collision with root package name */
    private static final a f47872o = new a(new C3971f());

    /* renamed from: p  reason: collision with root package name */
    private static final a f47873p = new a(new C3972g());

    /* renamed from: b  reason: collision with root package name */
    private boolean f47874b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47875c;

    /* renamed from: d  reason: collision with root package name */
    private int f47876d;

    /* renamed from: e  reason: collision with root package name */
    private int f47877e;

    /* renamed from: f  reason: collision with root package name */
    private int f47878f;

    /* renamed from: g  reason: collision with root package name */
    private int f47879g;

    /* renamed from: h  reason: collision with root package name */
    private int f47880h;

    /* renamed from: i  reason: collision with root package name */
    private int f47881i;

    /* renamed from: j  reason: collision with root package name */
    private int f47882j;

    /* renamed from: k  reason: collision with root package name */
    private int f47883k = 1;

    /* renamed from: l  reason: collision with root package name */
    private int f47884l;

    /* renamed from: m  reason: collision with root package name */
    private int f47885m = 112800;

    /* renamed from: q9.h$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C0721a f47886a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f47887b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        private Constructor f47888c;

        /* renamed from: q9.h$a$a  reason: collision with other inner class name */
        public interface C0721a {
            Constructor a();
        }

        public a(C0721a aVar) {
            this.f47886a = aVar;
        }

        private Constructor b() {
            synchronized (this.f47887b) {
                if (this.f47887b.get()) {
                    Constructor constructor = this.f47888c;
                    return constructor;
                }
                try {
                    Constructor a10 = this.f47886a.a();
                    return a10;
                } catch (ClassNotFoundException unused) {
                    this.f47887b.set(true);
                    return this.f47888c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public k a(Object... objArr) {
            Constructor b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return (k) b10.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void g(int i10, List list) {
        int i11 = 2;
        switch (i10) {
            case 0:
                list.add(new C2985b());
                return;
            case 1:
                list.add(new C2988e());
                return;
            case 2:
                boolean z10 = this.f47876d | this.f47874b;
                if (!this.f47875c) {
                    i11 = 0;
                }
                list.add(new C2991h(i11 | z10 ? 1 : 0));
                return;
            case 3:
                boolean z11 = this.f47877e | this.f47874b;
                if (!this.f47875c) {
                    i11 = 0;
                }
                list.add(new C3983b(i11 | z11 ? 1 : 0));
                return;
            case 4:
                k a10 = f47872o.a(Integer.valueOf(this.f47878f));
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new C4055d(this.f47878f));
                    return;
                }
            case 5:
                list.add(new c());
                return;
            case 6:
                list.add(new C4152e(this.f47879g));
                return;
            case 7:
                boolean z12 = this.f47882j | this.f47874b;
                if (!this.f47875c) {
                    i11 = 0;
                }
                list.add(new C4184f(i11 | z12 ? 1 : 0));
                return;
            case 8:
                list.add(new g(this.f47881i));
                list.add(new k(this.f47880h));
                return;
            case 9:
                list.add(new d());
                return;
            case 10:
                list.add(new A());
                return;
            case 11:
                list.add(new H(this.f47883k, this.f47884l, this.f47885m));
                return;
            case 12:
                list.add(new b());
                return;
            case StdKeyDeserializer.TYPE_URL:
                list.add(new C4114a());
                return;
            case StdKeyDeserializer.TYPE_CLASS:
                k a11 = f47873p.a(new Object[0]);
                if (a11 != null) {
                    list.add(a11);
                    return;
                }
                return;
            case 16:
                list.add(new C4000b());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public static Constructor h() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", (Class[]) null).invoke((Object) null, (Object[]) null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(new Class[]{Integer.TYPE});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Constructor i() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor((Class[]) null);
    }

    public synchronized k[] b(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f47871n;
            arrayList = new ArrayList(iArr.length);
            int b10 = C3655k.b(map);
            if (b10 != -1) {
                g(b10, arrayList);
            }
            int c10 = C3655k.c(uri);
            if (!(c10 == -1 || c10 == b10)) {
                g(c10, arrayList);
            }
            for (int i10 : iArr) {
                if (!(i10 == b10 || i10 == c10)) {
                    g(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    public synchronized k[] d() {
        return b(Uri.EMPTY, new HashMap());
    }
}
