package N5;

import M5.c;
import M5.g;
import M5.h;
import T5.k;
import T5.n;
import android.content.Context;
import java.io.File;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f32952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32953b;

    /* renamed from: c  reason: collision with root package name */
    private final n f32954c;

    /* renamed from: d  reason: collision with root package name */
    private final long f32955d;

    /* renamed from: e  reason: collision with root package name */
    private final long f32956e;

    /* renamed from: f  reason: collision with root package name */
    private final long f32957f;

    /* renamed from: g  reason: collision with root package name */
    private final j f32958g;

    /* renamed from: h  reason: collision with root package name */
    private final M5.a f32959h;

    /* renamed from: i  reason: collision with root package name */
    private final c f32960i;

    /* renamed from: j  reason: collision with root package name */
    private final Q5.b f32961j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Context f32962k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f32963l;

    class a implements n {
        a() {
        }

        /* renamed from: a */
        public File get() {
            k.g(d.this.f32962k);
            return d.this.f32962k.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f32965a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f32966b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public n f32967c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f32968d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public long f32969e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public long f32970f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public j f32971g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public M5.a f32972h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public c f32973i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Q5.b f32974j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f32975k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public final Context f32976l;

        public d n() {
            return new d(this);
        }

        private b(Context context) {
            this.f32965a = 1;
            this.f32966b = "image_cache";
            this.f32968d = 41943040;
            this.f32969e = 10485760;
            this.f32970f = 2097152;
            this.f32971g = new c();
            this.f32976l = context;
        }
    }

    protected d(b bVar) {
        boolean z10;
        M5.a aVar;
        c cVar;
        Q5.b bVar2;
        Context e10 = bVar.f32976l;
        this.f32962k = e10;
        if (bVar.f32967c == null && e10 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        k.j(z10, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f32967c == null && e10 != null) {
            bVar.f32967c = new a();
        }
        this.f32952a = bVar.f32965a;
        this.f32953b = (String) k.g(bVar.f32966b);
        this.f32954c = (n) k.g(bVar.f32967c);
        this.f32955d = bVar.f32968d;
        this.f32956e = bVar.f32969e;
        this.f32957f = bVar.f32970f;
        this.f32958g = (j) k.g(bVar.f32971g);
        if (bVar.f32972h == null) {
            aVar = g.b();
        } else {
            aVar = bVar.f32972h;
        }
        this.f32959h = aVar;
        if (bVar.f32973i == null) {
            cVar = h.i();
        } else {
            cVar = bVar.f32973i;
        }
        this.f32960i = cVar;
        if (bVar.f32974j == null) {
            bVar2 = Q5.c.b();
        } else {
            bVar2 = bVar.f32974j;
        }
        this.f32961j = bVar2;
        this.f32963l = bVar.f32975k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f32953b;
    }

    public n c() {
        return this.f32954c;
    }

    public M5.a d() {
        return this.f32959h;
    }

    public c e() {
        return this.f32960i;
    }

    public long f() {
        return this.f32955d;
    }

    public Q5.b g() {
        return this.f32961j;
    }

    public j h() {
        return this.f32958g;
    }

    public boolean i() {
        return this.f32963l;
    }

    public long j() {
        return this.f32956e;
    }

    public long k() {
        return this.f32957f;
    }

    public int l() {
        return this.f32952a;
    }
}
