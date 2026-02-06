package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.C1588b;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class f {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f16588o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final Object f16589p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static volatile f f16590q;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f16591a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set f16592b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f16593c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f16594d;

    /* renamed from: e  reason: collision with root package name */
    private final b f16595e;

    /* renamed from: f  reason: collision with root package name */
    final h f16596f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final j f16597g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f16598h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f16599i;

    /* renamed from: j  reason: collision with root package name */
    final int[] f16600j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f16601k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16602l;

    /* renamed from: m  reason: collision with root package name */
    private final int f16603m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final e f16604n;

    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile i f16605b;

        /* renamed from: c  reason: collision with root package name */
        private volatile n f16606c;

        /* renamed from: androidx.emoji2.text.f$a$a  reason: collision with other inner class name */
        class C0293a extends i {
            C0293a() {
            }

            public void a(Throwable th2) {
                a.this.f16608a.p(th2);
            }

            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        /* access modifiers changed from: package-private */
        public int a(CharSequence charSequence, int i10) {
            return this.f16605b.b(charSequence, i10);
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, int i10) {
            return this.f16605b.c(charSequence, i10);
        }

        /* access modifiers changed from: package-private */
        public void c() {
            try {
                this.f16608a.f16596f.a(new C0293a());
            } catch (Throwable th2) {
                this.f16608a.p(th2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f16605b.j(charSequence, i10, i11, i12, z10);
        }

        /* access modifiers changed from: package-private */
        public void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f16606c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f16608a.f16598h);
        }

        /* access modifiers changed from: package-private */
        public void f(n nVar) {
            if (nVar == null) {
                this.f16608a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f16606c = nVar;
            n nVar2 = this.f16606c;
            j a10 = this.f16608a.f16597g;
            e b10 = this.f16608a.f16604n;
            f fVar = this.f16608a;
            this.f16605b = new i(nVar2, a10, b10, fVar.f16599i, fVar.f16600j, h.a());
            this.f16608a.q();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final f f16608a;

        b(f fVar) {
            this.f16608a = fVar;
        }

        /* access modifiers changed from: package-private */
        public abstract int a(CharSequence charSequence, int i10);

        /* access modifiers changed from: package-private */
        public abstract int b(CharSequence charSequence, int i10);

        /* access modifiers changed from: package-private */
        public abstract void c();

        /* access modifiers changed from: package-private */
        public abstract CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void e(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final h f16609a;

        /* renamed from: b  reason: collision with root package name */
        j f16610b;

        /* renamed from: c  reason: collision with root package name */
        boolean f16611c;

        /* renamed from: d  reason: collision with root package name */
        boolean f16612d;

        /* renamed from: e  reason: collision with root package name */
        int[] f16613e;

        /* renamed from: f  reason: collision with root package name */
        Set f16614f;

        /* renamed from: g  reason: collision with root package name */
        boolean f16615g;

        /* renamed from: h  reason: collision with root package name */
        int f16616h = -16711936;

        /* renamed from: i  reason: collision with root package name */
        int f16617i = 0;

        /* renamed from: j  reason: collision with root package name */
        e f16618j = new e();

        protected c(h hVar) {
            x1.g.g(hVar, "metadataLoader cannot be null.");
            this.f16609a = hVar;
        }

        /* access modifiers changed from: protected */
        public final h a() {
            return this.f16609a;
        }

        public c b(int i10) {
            this.f16617i = i10;
            return this;
        }
    }

    public static class d implements j {
        public j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    public static abstract class C0294f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List f16619a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f16620b;

        /* renamed from: c  reason: collision with root package name */
        private final int f16621c;

        g(C0294f fVar, int i10) {
            this(Arrays.asList(new C0294f[]{(C0294f) x1.g.g(fVar, "initCallback cannot be null")}), i10, (Throwable) null);
        }

        public void run() {
            int size = this.f16619a.size();
            int i10 = 0;
            if (this.f16621c != 1) {
                while (i10 < size) {
                    ((C0294f) this.f16619a.get(i10)).a(this.f16620b);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((C0294f) this.f16619a.get(i10)).b();
                i10++;
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, (Throwable) null);
        }

        g(Collection collection, int i10, Throwable th2) {
            x1.g.g(collection, "initCallbacks cannot be null");
            this.f16619a = new ArrayList(collection);
            this.f16621c = i10;
            this.f16620b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    public interface j {
        j a(p pVar);
    }

    private f(c cVar) {
        this.f16598h = cVar.f16611c;
        this.f16599i = cVar.f16612d;
        this.f16600j = cVar.f16613e;
        this.f16601k = cVar.f16615g;
        this.f16602l = cVar.f16616h;
        this.f16596f = cVar.f16609a;
        this.f16603m = cVar.f16617i;
        this.f16604n = cVar.f16618j;
        this.f16594d = new Handler(Looper.getMainLooper());
        C1588b bVar = new C1588b();
        this.f16592b = bVar;
        j jVar = cVar.f16610b;
        this.f16597g = jVar == null ? new d() : jVar;
        Set set = cVar.f16614f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f16614f);
        }
        this.f16595e = new a(this);
        o();
    }

    public static f c() {
        f fVar;
        boolean z10;
        synchronized (f16588o) {
            fVar = f16590q;
            if (fVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            x1.g.h(z10, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return i.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return i.e(editable, i10, keyEvent);
    }

    public static f j(c cVar) {
        f fVar = f16590q;
        if (fVar == null) {
            synchronized (f16588o) {
                try {
                    fVar = f16590q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f16590q = fVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return fVar;
    }

    public static boolean k() {
        if (f16590q != null) {
            return true;
        }
        return false;
    }

    private boolean m() {
        if (g() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private void o() {
        this.f16591a.writeLock().lock();
        try {
            if (this.f16603m == 0) {
                this.f16593c = 0;
            }
            this.f16591a.writeLock().unlock();
            if (g() == 0) {
                this.f16595e.c();
            }
        } catch (Throwable th2) {
            this.f16591a.writeLock().unlock();
            throw th2;
        }
    }

    public int d(CharSequence charSequence, int i10) {
        return this.f16595e.a(charSequence, i10);
    }

    public int e() {
        return this.f16602l;
    }

    public int f(CharSequence charSequence, int i10) {
        return this.f16595e.b(charSequence, i10);
    }

    public int g() {
        this.f16591a.readLock().lock();
        try {
            return this.f16593c;
        } finally {
            this.f16591a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f16601k;
    }

    public void n() {
        boolean z10 = true;
        if (this.f16603m != 1) {
            z10 = false;
        }
        x1.g.h(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!m()) {
            this.f16591a.writeLock().lock();
            try {
                if (this.f16593c != 0) {
                    this.f16593c = 0;
                    this.f16591a.writeLock().unlock();
                    this.f16595e.c();
                }
            } finally {
                this.f16591a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f16591a.writeLock().lock();
        try {
            this.f16593c = 2;
            arrayList.addAll(this.f16592b);
            this.f16592b.clear();
            this.f16591a.writeLock().unlock();
            this.f16594d.post(new g(arrayList, this.f16593c, th2));
        } catch (Throwable th3) {
            this.f16591a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void q() {
        ArrayList arrayList = new ArrayList();
        this.f16591a.writeLock().lock();
        try {
            this.f16593c = 1;
            arrayList.addAll(this.f16592b);
            this.f16592b.clear();
            this.f16591a.writeLock().unlock();
            this.f16594d.post(new g((Collection) arrayList, this.f16593c));
        } catch (Throwable th2) {
            this.f16591a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        int i10;
        if (charSequence == null) {
            i10 = 0;
        } else {
            i10 = charSequence.length();
        }
        return s(charSequence, 0, i10);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        x1.g.h(m(), "Not initialized yet");
        x1.g.d(i10, "start cannot be negative");
        x1.g.d(i11, "end cannot be negative");
        x1.g.d(i12, "maxEmojiCount cannot be negative");
        boolean z14 = false;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        x1.g.a(z10, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i10 <= charSequence.length()) {
            z11 = true;
        } else {
            z11 = false;
        }
        x1.g.a(z11, "start should be < than charSequence length");
        if (i11 <= charSequence.length()) {
            z12 = true;
        } else {
            z12 = false;
        }
        x1.g.a(z12, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                z14 = this.f16598h;
            }
            z13 = z14;
        } else {
            z13 = true;
        }
        return this.f16595e.d(charSequence, i10, i11, i12, z13);
    }

    public void v(C0294f fVar) {
        x1.g.g(fVar, "initCallback cannot be null");
        this.f16591a.writeLock().lock();
        try {
            if (this.f16593c != 1) {
                if (this.f16593c != 2) {
                    this.f16592b.add(fVar);
                }
            }
            this.f16594d.post(new g(fVar, this.f16593c));
        } finally {
            this.f16591a.writeLock().unlock();
        }
    }

    public void w(C0294f fVar) {
        x1.g.g(fVar, "initCallback cannot be null");
        this.f16591a.writeLock().lock();
        try {
            this.f16592b.remove(fVar);
        } finally {
            this.f16591a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f16595e.e(editorInfo);
        }
    }
}
