package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C1769q;
import com.facebook.C3286a;
import com.facebook.I;
import com.facebook.r;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import o7.B;
import o7.C3885a;
import o7.C3889e;
import o7.C3892h;
import o7.C3894j;
import o7.C3895k;
import o7.K;
import t5.C4021N;
import u8.C4099a;
import u8.i;
import u8.j;
import u8.m;
import u8.o;
import v8.j;
import v8.k;
import v8.l;
import v8.n;

public class e extends C3895k {

    /* renamed from: k  reason: collision with root package name */
    public static final b f42400k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final String f42401l = e.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private static final int f42402m = C3889e.c.Share.b();

    /* renamed from: h  reason: collision with root package name */
    private boolean f42403h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f42404i;

    /* renamed from: j  reason: collision with root package name */
    private final List f42405j;

    private final class a extends C3895k.b {

        /* renamed from: c  reason: collision with root package name */
        private Object f42406c = d.NATIVE;

        /* renamed from: com.facebook.share.widget.e$a$a  reason: collision with other inner class name */
        public static final class C0655a implements C3894j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3885a f42408a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v8.e f42409b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f42410c;

            C0655a(C3885a aVar, v8.e eVar, boolean z10) {
                this.f42408a = aVar;
                this.f42409b = eVar;
                this.f42410c = z10;
            }

            public Bundle a() {
                return u8.d.a(this.f42408a.c(), this.f42409b, this.f42410c);
            }

            public Bundle getParameters() {
                return u8.f.a(this.f42408a.c(), this.f42409b, this.f42410c);
            }
        }

        public a() {
            super();
        }

        public Object c() {
            return this.f42406c;
        }

        /* renamed from: d */
        public boolean a(v8.e eVar, boolean z10) {
            C6496s.h(eVar, "content");
            if (!(eVar instanceof v8.d) || !e.f42400k.d(eVar.getClass())) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C3885a b(v8.e eVar) {
            C6496s.h(eVar, "content");
            u8.h.n(eVar);
            C3885a e10 = e.this.e();
            boolean r10 = e.this.r();
            C3892h c10 = e.f42400k.g(eVar.getClass());
            if (c10 == null) {
                return null;
            }
            C3894j.k(e10, new C0655a(e10, eVar, r10), c10);
            return e10;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean d(Class cls) {
            C3892h g10 = g(cls);
            if (g10 == null || !C3894j.b(g10)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean e(v8.e eVar) {
            if (!f(eVar.getClass())) {
                return false;
            }
            return true;
        }

        private final boolean f(Class cls) {
            if (v8.g.class.isAssignableFrom(cls) || (k.class.isAssignableFrom(cls) && C3286a.f39402l.g())) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final C3892h g(Class cls) {
            if (v8.g.class.isAssignableFrom(cls)) {
                return i.SHARE_DIALOG;
            }
            if (k.class.isAssignableFrom(cls)) {
                return i.PHOTOS;
            }
            if (n.class.isAssignableFrom(cls)) {
                return i.VIDEO;
            }
            if (v8.i.class.isAssignableFrom(cls)) {
                return i.MULTIMEDIA;
            }
            if (v8.d.class.isAssignableFrom(cls)) {
                return C4099a.SHARE_CAMERA_EFFECT;
            }
            if (l.class.isAssignableFrom(cls)) {
                return u8.n.SHARE_STORY_ASSET;
            }
            return null;
        }

        private b() {
        }
    }

    private final class c extends C3895k.b {

        /* renamed from: c  reason: collision with root package name */
        private Object f42411c = d.FEED;

        public c() {
            super();
        }

        public Object c() {
            return this.f42411c;
        }

        /* renamed from: d */
        public boolean a(v8.e eVar, boolean z10) {
            C6496s.h(eVar, "content");
            if ((eVar instanceof v8.g) || (eVar instanceof j)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public C3885a b(v8.e eVar) {
            Bundle bundle;
            C6496s.h(eVar, "content");
            e eVar2 = e.this;
            eVar2.s(eVar2.f(), eVar, d.FEED);
            C3885a e10 = e.this.e();
            if (eVar instanceof v8.g) {
                u8.h.p(eVar);
                bundle = o.f((v8.g) eVar);
            } else if (!(eVar instanceof j)) {
                return null;
            } else {
                bundle = o.e((j) eVar);
            }
            C3894j.m(e10, "feed", bundle);
            return e10;
        }
    }

    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.widget.e$e  reason: collision with other inner class name */
    private final class C0656e extends C3895k.b {

        /* renamed from: c  reason: collision with root package name */
        private Object f42418c = d.NATIVE;

        /* renamed from: com.facebook.share.widget.e$e$a */
        public static final class a implements C3894j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3885a f42420a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v8.e f42421b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f42422c;

            a(C3885a aVar, v8.e eVar, boolean z10) {
                this.f42420a = aVar;
                this.f42421b = eVar;
                this.f42422c = z10;
            }

            public Bundle a() {
                return u8.d.a(this.f42420a.c(), this.f42421b, this.f42422c);
            }

            public Bundle getParameters() {
                return u8.f.a(this.f42420a.c(), this.f42421b, this.f42422c);
            }
        }

        public C0656e() {
            super();
        }

        public Object c() {
            return this.f42418c;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(v8.e r4, boolean r5) {
            /*
                r3 = this;
                java.lang.String r0 = "content"
                kotlin.jvm.internal.C6496s.h(r4, r0)
                boolean r0 = r4 instanceof v8.d
                r1 = 0
                if (r0 != 0) goto L_0x0051
                boolean r0 = r4 instanceof v8.l
                if (r0 == 0) goto L_0x000f
                goto L_0x0051
            L_0x000f:
                r0 = 1
                if (r5 != 0) goto L_0x0041
                v8.f r5 = r4.f()
                if (r5 == 0) goto L_0x001f
                u8.i r5 = u8.i.HASHTAG
                boolean r5 = o7.C3894j.b(r5)
                goto L_0x0020
            L_0x001f:
                r5 = r0
            L_0x0020:
                boolean r2 = r4 instanceof v8.g
                if (r2 == 0) goto L_0x0042
                r2 = r4
                v8.g r2 = (v8.g) r2
                java.lang.String r2 = r2.h()
                if (r2 == 0) goto L_0x0042
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0034
                goto L_0x0042
            L_0x0034:
                if (r5 == 0) goto L_0x003f
                u8.i r5 = u8.i.LINK_SHARE_QUOTES
                boolean r5 = o7.C3894j.b(r5)
                if (r5 == 0) goto L_0x003f
                goto L_0x0041
            L_0x003f:
                r5 = r1
                goto L_0x0042
            L_0x0041:
                r5 = r0
            L_0x0042:
                if (r5 == 0) goto L_0x0051
                com.facebook.share.widget.e$b r5 = com.facebook.share.widget.e.f42400k
                java.lang.Class r4 = r4.getClass()
                boolean r4 = r5.d(r4)
                if (r4 == 0) goto L_0x0051
                r1 = r0
            L_0x0051:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.e.C0656e.a(v8.e, boolean):boolean");
        }

        /* renamed from: e */
        public C3885a b(v8.e eVar) {
            C6496s.h(eVar, "content");
            e eVar2 = e.this;
            eVar2.s(eVar2.f(), eVar, d.NATIVE);
            u8.h.n(eVar);
            C3885a e10 = e.this.e();
            boolean r10 = e.this.r();
            C3892h c10 = e.f42400k.g(eVar.getClass());
            if (c10 == null) {
                return null;
            }
            C3894j.k(e10, new a(e10, eVar, r10), c10);
            return e10;
        }
    }

    private final class f extends C3895k.b {

        /* renamed from: c  reason: collision with root package name */
        private Object f42423c = d.NATIVE;

        public static final class a implements C3894j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3885a f42425a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v8.e f42426b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f42427c;

            a(C3885a aVar, v8.e eVar, boolean z10) {
                this.f42425a = aVar;
                this.f42426b = eVar;
                this.f42427c = z10;
            }

            public Bundle a() {
                return u8.d.a(this.f42425a.c(), this.f42426b, this.f42427c);
            }

            public Bundle getParameters() {
                return u8.f.a(this.f42425a.c(), this.f42426b, this.f42427c);
            }
        }

        public f() {
            super();
        }

        public Object c() {
            return this.f42423c;
        }

        /* renamed from: d */
        public boolean a(v8.e eVar, boolean z10) {
            C6496s.h(eVar, "content");
            if (!(eVar instanceof l) || !e.f42400k.d(eVar.getClass())) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public C3885a b(v8.e eVar) {
            C6496s.h(eVar, "content");
            u8.h.o(eVar);
            C3885a e10 = e.this.e();
            boolean r10 = e.this.r();
            C3892h c10 = e.f42400k.g(eVar.getClass());
            if (c10 == null) {
                return null;
            }
            C3894j.k(e10, new a(e10, eVar, r10), c10);
            return e10;
        }
    }

    private final class g extends C3895k.b {

        /* renamed from: c  reason: collision with root package name */
        private Object f42428c = d.WEB;

        public g() {
            super();
        }

        private final k e(k kVar, UUID uuid) {
            k.a r10 = new k.a().r(kVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = kVar.h().size();
            for (int i10 = 0; i10 < size; i10++) {
                v8.j jVar = (v8.j) kVar.h().get(i10);
                Bitmap c10 = jVar.c();
                if (c10 != null) {
                    K.a d10 = K.d(uuid, c10);
                    jVar = new j.a().i(jVar).m(Uri.parse(d10.b())).k((Bitmap) null).d();
                    arrayList2.add(d10);
                }
                arrayList.add(jVar);
            }
            r10.s(arrayList);
            K.a(arrayList2);
            return r10.p();
        }

        private final String g(v8.e eVar) {
            if ((eVar instanceof v8.g) || (eVar instanceof k)) {
                return "share";
            }
            return null;
        }

        public Object c() {
            return this.f42428c;
        }

        /* renamed from: d */
        public boolean a(v8.e eVar, boolean z10) {
            C6496s.h(eVar, "content");
            return e.f42400k.e(eVar);
        }

        /* renamed from: f */
        public C3885a b(v8.e eVar) {
            Bundle bundle;
            C6496s.h(eVar, "content");
            e eVar2 = e.this;
            eVar2.s(eVar2.f(), eVar, d.WEB);
            C3885a e10 = e.this.e();
            u8.h.p(eVar);
            if (eVar instanceof v8.g) {
                bundle = o.b((v8.g) eVar);
            } else if (!(eVar instanceof k)) {
                return null;
            } else {
                bundle = o.c(e((k) eVar, e10.c()));
            }
            C3894j.m(e10, g(eVar), bundle);
            return e10;
        }
    }

    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.share.widget.e$d[] r0 = com.facebook.share.widget.e.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.share.widget.e$d r1 = com.facebook.share.widget.e.d.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.share.widget.e$d r1 = com.facebook.share.widget.e.d.WEB     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.share.widget.e$d r1 = com.facebook.share.widget.e.d.NATIVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f42430a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.e.h.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Activity activity) {
        this(activity, f42402m);
        C6496s.h(activity, "activity");
    }

    /* access modifiers changed from: private */
    public final void s(Context context, v8.e eVar, d dVar) {
        String str;
        if (this.f42404i) {
            dVar = d.AUTOMATIC;
        }
        int i10 = h.f42430a[dVar.ordinal()];
        String str2 = "unknown";
        if (i10 == 1) {
            str = MetricTracker.CarouselSource.AUTOMATIC;
        } else if (i10 == 2) {
            str = "web";
        } else if (i10 != 3) {
            str = str2;
        } else {
            str = "native";
        }
        C3892h c10 = f42400k.g(eVar.getClass());
        if (c10 == i.SHARE_DIALOG) {
            str2 = "status";
        } else if (c10 == i.PHOTOS) {
            str2 = "photo";
        } else if (c10 == i.VIDEO) {
            str2 = "video";
        }
        C4021N a10 = C4021N.f48172b.a(context, I.m());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        a10.g("fb_share_dialog_show", bundle);
    }

    /* access modifiers changed from: protected */
    public C3885a e() {
        return new C3885a(h(), (UUID) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public List g() {
        return this.f42405j;
    }

    /* access modifiers changed from: protected */
    public void k(C3889e eVar, r rVar) {
        C6496s.h(eVar, "callbackManager");
        C6496s.h(rVar, "callback");
        m.w(h(), eVar, rVar);
    }

    public boolean q(v8.e eVar, d dVar) {
        C6496s.h(eVar, "content");
        C6496s.h(dVar, "mode");
        Object obj = dVar;
        if (dVar == d.AUTOMATIC) {
            obj = C3895k.f47263g;
        }
        return c(eVar, obj);
    }

    public boolean r() {
        return this.f42403h;
    }

    public void t(boolean z10) {
        this.f42403h = z10;
    }

    public void u(v8.e eVar, d dVar) {
        boolean z10;
        C6496s.h(eVar, "content");
        C6496s.h(dVar, "mode");
        if (dVar == d.AUTOMATIC) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42404i = z10;
        Object obj = dVar;
        if (z10) {
            obj = C3895k.f47263g;
        }
        n(eVar, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Activity activity, int i10) {
        super(activity, i10);
        C6496s.h(activity, "activity");
        this.f42404i = true;
        this.f42405j = C6565s.h(new C0656e(), new c(), new g(), new a(), new f());
        m.y(i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(C1769q qVar, int i10) {
        this(new B(qVar), i10);
        C6496s.h(qVar, "fragment");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Fragment fragment, int i10) {
        this(new B(fragment), i10);
        C6496s.h(fragment, "fragment");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(B b10, int i10) {
        super(b10, i10);
        C6496s.h(b10, "fragmentWrapper");
        this.f42404i = true;
        this.f42405j = C6565s.h(new C0656e(), new c(), new g(), new a(), new f());
        m.y(i10);
    }
}
