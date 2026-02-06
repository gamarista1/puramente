package j4;

import Ug.G;
import a4.C3117j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C1790m;
import h4.C3568c;
import j4.C3628o;
import java.util.List;
import java.util.Map;
import k4.C3660b;
import k4.C3662d;
import k4.C3663e;
import k4.C3666h;
import k4.C3667i;
import k4.C3668j;
import k4.C3669k;
import k4.C3670l;
import k4.C3671m;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l4.C3736b;
import l4.C3737c;
import l4.C3738d;
import m4.e;
import mf.C6559l;
import mf.C6565s;
import mf.O;
import n4.C3854a;
import n4.C3856c;
import o4.C3880c;
import o4.C3881d;
import o4.k;
import o4.l;
import rh.u;

/* renamed from: j4.i  reason: case insensitive filesystem */
public final class C3622i {

    /* renamed from: A  reason: collision with root package name */
    private final C1790m f44669A;

    /* renamed from: B  reason: collision with root package name */
    private final C3668j f44670B;

    /* renamed from: C  reason: collision with root package name */
    private final C3666h f44671C;

    /* renamed from: D  reason: collision with root package name */
    private final C3628o f44672D;

    /* renamed from: E  reason: collision with root package name */
    private final C3568c.b f44673E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final Integer f44674F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final Drawable f44675G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public final Integer f44676H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final Drawable f44677I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final Integer f44678J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final Drawable f44679K;

    /* renamed from: L  reason: collision with root package name */
    private final C3617d f44680L;

    /* renamed from: M  reason: collision with root package name */
    private final C3616c f44681M;

    /* renamed from: a  reason: collision with root package name */
    private final Context f44682a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f44683b;

    /* renamed from: c  reason: collision with root package name */
    private final C3737c f44684c;

    /* renamed from: d  reason: collision with root package name */
    private final b f44685d;

    /* renamed from: e  reason: collision with root package name */
    private final C3568c.b f44686e;

    /* renamed from: f  reason: collision with root package name */
    private final String f44687f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f44688g;

    /* renamed from: h  reason: collision with root package name */
    private final ColorSpace f44689h;

    /* renamed from: i  reason: collision with root package name */
    private final C3663e f44690i;

    /* renamed from: j  reason: collision with root package name */
    private final Pair f44691j;

    /* renamed from: k  reason: collision with root package name */
    private final C3117j.a f44692k;

    /* renamed from: l  reason: collision with root package name */
    private final List f44693l;

    /* renamed from: m  reason: collision with root package name */
    private final C3856c.a f44694m;

    /* renamed from: n  reason: collision with root package name */
    private final u f44695n;

    /* renamed from: o  reason: collision with root package name */
    private final C3632s f44696o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f44697p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f44698q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f44699r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f44700s;

    /* renamed from: t  reason: collision with root package name */
    private final C3615b f44701t;

    /* renamed from: u  reason: collision with root package name */
    private final C3615b f44702u;

    /* renamed from: v  reason: collision with root package name */
    private final C3615b f44703v;

    /* renamed from: w  reason: collision with root package name */
    private final G f44704w;

    /* renamed from: x  reason: collision with root package name */
    private final G f44705x;

    /* renamed from: y  reason: collision with root package name */
    private final G f44706y;

    /* renamed from: z  reason: collision with root package name */
    private final G f44707z;

    /* renamed from: j4.i$b */
    public interface b {
        void onCancel(C3622i iVar);

        void onError(C3622i iVar, C3619f fVar);

        void onStart(C3622i iVar);

        void onSuccess(C3622i iVar, C3631r rVar);
    }

    public /* synthetic */ C3622i(Context context, Object obj, C3737c cVar, b bVar, C3568c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, C3663e eVar, Pair pair, C3117j.a aVar, List list, C3856c.a aVar2, u uVar, C3632s sVar, boolean z10, boolean z11, boolean z12, boolean z13, C3615b bVar3, C3615b bVar4, C3615b bVar5, G g10, G g11, G g12, G g13, C1790m mVar, C3668j jVar, C3666h hVar, C3628o oVar, C3568c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C3617d dVar, C3616c cVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cVar, bVar, bVar2, str, config, colorSpace, eVar, pair, aVar, list, aVar2, uVar, sVar, z10, z11, z12, z13, bVar3, bVar4, bVar5, g10, g11, g12, g13, mVar, jVar, hVar, oVar, bVar6, num, drawable, num2, drawable2, num3, drawable3, dVar, cVar2);
    }

    public static /* synthetic */ a R(C3622i iVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = iVar.f44682a;
        }
        return iVar.Q(context);
    }

    public final b A() {
        return this.f44685d;
    }

    public final C3568c.b B() {
        return this.f44686e;
    }

    public final C3615b C() {
        return this.f44701t;
    }

    public final C3615b D() {
        return this.f44703v;
    }

    public final C3628o E() {
        return this.f44672D;
    }

    public final Drawable F() {
        return k.c(this, this.f44675G, this.f44674F, this.f44681M.n());
    }

    public final C3568c.b G() {
        return this.f44673E;
    }

    public final C3663e H() {
        return this.f44690i;
    }

    public final boolean I() {
        return this.f44700s;
    }

    public final C3666h J() {
        return this.f44671C;
    }

    public final C3668j K() {
        return this.f44670B;
    }

    public final C3632s L() {
        return this.f44696o;
    }

    public final C3737c M() {
        return this.f44684c;
    }

    public final G N() {
        return this.f44707z;
    }

    public final List O() {
        return this.f44693l;
    }

    public final C3856c.a P() {
        return this.f44694m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3622i) {
            C3622i iVar = (C3622i) obj;
            if (!C6496s.c(this.f44682a, iVar.f44682a) || !C6496s.c(this.f44683b, iVar.f44683b) || !C6496s.c(this.f44684c, iVar.f44684c) || !C6496s.c(this.f44685d, iVar.f44685d) || !C6496s.c(this.f44686e, iVar.f44686e) || !C6496s.c(this.f44687f, iVar.f44687f) || this.f44688g != iVar.f44688g || ((Build.VERSION.SDK_INT >= 26 && !C6496s.c(this.f44689h, iVar.f44689h)) || this.f44690i != iVar.f44690i || !C6496s.c(this.f44691j, iVar.f44691j) || !C6496s.c(this.f44692k, iVar.f44692k) || !C6496s.c(this.f44693l, iVar.f44693l) || !C6496s.c(this.f44694m, iVar.f44694m) || !C6496s.c(this.f44695n, iVar.f44695n) || !C6496s.c(this.f44696o, iVar.f44696o) || this.f44697p != iVar.f44697p || this.f44698q != iVar.f44698q || this.f44699r != iVar.f44699r || this.f44700s != iVar.f44700s || this.f44701t != iVar.f44701t || this.f44702u != iVar.f44702u || this.f44703v != iVar.f44703v || !C6496s.c(this.f44704w, iVar.f44704w) || !C6496s.c(this.f44705x, iVar.f44705x) || !C6496s.c(this.f44706y, iVar.f44706y) || !C6496s.c(this.f44707z, iVar.f44707z) || !C6496s.c(this.f44673E, iVar.f44673E) || !C6496s.c(this.f44674F, iVar.f44674F) || !C6496s.c(this.f44675G, iVar.f44675G) || !C6496s.c(this.f44676H, iVar.f44676H) || !C6496s.c(this.f44677I, iVar.f44677I) || !C6496s.c(this.f44678J, iVar.f44678J) || !C6496s.c(this.f44679K, iVar.f44679K) || !C6496s.c(this.f44669A, iVar.f44669A) || !C6496s.c(this.f44670B, iVar.f44670B) || this.f44671C != iVar.f44671C || !C6496s.c(this.f44672D, iVar.f44672D) || !C6496s.c(this.f44680L, iVar.f44680L) || !C6496s.c(this.f44681M, iVar.f44681M))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.f44697p;
    }

    public final boolean h() {
        return this.f44698q;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int hashCode = ((this.f44682a.hashCode() * 31) + this.f44683b.hashCode()) * 31;
        C3737c cVar = this.f44684c;
        int i23 = 0;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (hashCode + i10) * 31;
        b bVar = this.f44685d;
        if (bVar != null) {
            i11 = bVar.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        C3568c.b bVar2 = this.f44686e;
        if (bVar2 != null) {
            i12 = bVar2.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        String str = this.f44687f;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode2 = (((i26 + i13) * 31) + this.f44688g.hashCode()) * 31;
        ColorSpace colorSpace = this.f44689h;
        if (colorSpace != null) {
            i14 = colorSpace.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode3 = (((hashCode2 + i14) * 31) + this.f44690i.hashCode()) * 31;
        Pair pair = this.f44691j;
        if (pair != null) {
            i15 = pair.hashCode();
        } else {
            i15 = 0;
        }
        int i27 = (hashCode3 + i15) * 31;
        C3117j.a aVar = this.f44692k;
        if (aVar != null) {
            i16 = aVar.hashCode();
        } else {
            i16 = 0;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((i27 + i16) * 31) + this.f44693l.hashCode()) * 31) + this.f44694m.hashCode()) * 31) + this.f44695n.hashCode()) * 31) + this.f44696o.hashCode()) * 31) + Boolean.hashCode(this.f44697p)) * 31) + Boolean.hashCode(this.f44698q)) * 31) + Boolean.hashCode(this.f44699r)) * 31) + Boolean.hashCode(this.f44700s)) * 31) + this.f44701t.hashCode()) * 31) + this.f44702u.hashCode()) * 31) + this.f44703v.hashCode()) * 31) + this.f44704w.hashCode()) * 31) + this.f44705x.hashCode()) * 31) + this.f44706y.hashCode()) * 31) + this.f44707z.hashCode()) * 31) + this.f44669A.hashCode()) * 31) + this.f44670B.hashCode()) * 31) + this.f44671C.hashCode()) * 31) + this.f44672D.hashCode()) * 31;
        C3568c.b bVar3 = this.f44673E;
        if (bVar3 != null) {
            i17 = bVar3.hashCode();
        } else {
            i17 = 0;
        }
        int i28 = (hashCode4 + i17) * 31;
        Integer num = this.f44674F;
        if (num != null) {
            i18 = num.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        Drawable drawable = this.f44675G;
        if (drawable != null) {
            i19 = drawable.hashCode();
        } else {
            i19 = 0;
        }
        int i30 = (i29 + i19) * 31;
        Integer num2 = this.f44676H;
        if (num2 != null) {
            i20 = num2.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        Drawable drawable2 = this.f44677I;
        if (drawable2 != null) {
            i21 = drawable2.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        Integer num3 = this.f44678J;
        if (num3 != null) {
            i22 = num3.hashCode();
        } else {
            i22 = 0;
        }
        int i33 = (i32 + i22) * 31;
        Drawable drawable3 = this.f44679K;
        if (drawable3 != null) {
            i23 = drawable3.hashCode();
        }
        return ((((i33 + i23) * 31) + this.f44680L.hashCode()) * 31) + this.f44681M.hashCode();
    }

    public final boolean i() {
        return this.f44699r;
    }

    public final Bitmap.Config j() {
        return this.f44688g;
    }

    public final ColorSpace k() {
        return this.f44689h;
    }

    public final Context l() {
        return this.f44682a;
    }

    public final Object m() {
        return this.f44683b;
    }

    public final G n() {
        return this.f44706y;
    }

    public final C3117j.a o() {
        return this.f44692k;
    }

    public final C3616c p() {
        return this.f44681M;
    }

    public final C3617d q() {
        return this.f44680L;
    }

    public final String r() {
        return this.f44687f;
    }

    public final C3615b s() {
        return this.f44702u;
    }

    public final Drawable t() {
        return k.c(this, this.f44677I, this.f44676H, this.f44681M.h());
    }

    public final Drawable u() {
        return k.c(this, this.f44679K, this.f44678J, this.f44681M.i());
    }

    public final G v() {
        return this.f44705x;
    }

    public final Pair w() {
        return this.f44691j;
    }

    public final u x() {
        return this.f44695n;
    }

    public final G y() {
        return this.f44704w;
    }

    public final C1790m z() {
        return this.f44669A;
    }

    private C3622i(Context context, Object obj, C3737c cVar, b bVar, C3568c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, C3663e eVar, Pair pair, C3117j.a aVar, List list, C3856c.a aVar2, u uVar, C3632s sVar, boolean z10, boolean z11, boolean z12, boolean z13, C3615b bVar3, C3615b bVar4, C3615b bVar5, G g10, G g11, G g12, G g13, C1790m mVar, C3668j jVar, C3666h hVar, C3628o oVar, C3568c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C3617d dVar, C3616c cVar2) {
        this.f44682a = context;
        this.f44683b = obj;
        this.f44684c = cVar;
        this.f44685d = bVar;
        this.f44686e = bVar2;
        this.f44687f = str;
        this.f44688g = config;
        this.f44689h = colorSpace;
        this.f44690i = eVar;
        this.f44691j = pair;
        this.f44692k = aVar;
        this.f44693l = list;
        this.f44694m = aVar2;
        this.f44695n = uVar;
        this.f44696o = sVar;
        this.f44697p = z10;
        this.f44698q = z11;
        this.f44699r = z12;
        this.f44700s = z13;
        this.f44701t = bVar3;
        this.f44702u = bVar4;
        this.f44703v = bVar5;
        this.f44704w = g10;
        this.f44705x = g11;
        this.f44706y = g12;
        this.f44707z = g13;
        this.f44669A = mVar;
        this.f44670B = jVar;
        this.f44671C = hVar;
        this.f44672D = oVar;
        this.f44673E = bVar6;
        this.f44674F = num;
        this.f44675G = drawable;
        this.f44676H = num2;
        this.f44677I = drawable2;
        this.f44678J = num3;
        this.f44679K = drawable3;
        this.f44680L = dVar;
        this.f44681M = cVar2;
    }

    /* renamed from: j4.i$a */
    public static final class a {

        /* renamed from: A  reason: collision with root package name */
        private G f44708A;

        /* renamed from: B  reason: collision with root package name */
        private C3628o.a f44709B;

        /* renamed from: C  reason: collision with root package name */
        private C3568c.b f44710C;

        /* renamed from: D  reason: collision with root package name */
        private Integer f44711D;

        /* renamed from: E  reason: collision with root package name */
        private Drawable f44712E;

        /* renamed from: F  reason: collision with root package name */
        private Integer f44713F;

        /* renamed from: G  reason: collision with root package name */
        private Drawable f44714G;

        /* renamed from: H  reason: collision with root package name */
        private Integer f44715H;

        /* renamed from: I  reason: collision with root package name */
        private Drawable f44716I;

        /* renamed from: J  reason: collision with root package name */
        private C1790m f44717J;

        /* renamed from: K  reason: collision with root package name */
        private C3668j f44718K;

        /* renamed from: L  reason: collision with root package name */
        private C3666h f44719L;

        /* renamed from: M  reason: collision with root package name */
        private C1790m f44720M;

        /* renamed from: N  reason: collision with root package name */
        private C3668j f44721N;

        /* renamed from: O  reason: collision with root package name */
        private C3666h f44722O;

        /* renamed from: a  reason: collision with root package name */
        private final Context f44723a;

        /* renamed from: b  reason: collision with root package name */
        private C3616c f44724b;

        /* renamed from: c  reason: collision with root package name */
        private Object f44725c;

        /* renamed from: d  reason: collision with root package name */
        private C3737c f44726d;

        /* renamed from: e  reason: collision with root package name */
        private b f44727e;

        /* renamed from: f  reason: collision with root package name */
        private C3568c.b f44728f;

        /* renamed from: g  reason: collision with root package name */
        private String f44729g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f44730h;

        /* renamed from: i  reason: collision with root package name */
        private ColorSpace f44731i;

        /* renamed from: j  reason: collision with root package name */
        private C3663e f44732j;

        /* renamed from: k  reason: collision with root package name */
        private Pair f44733k;

        /* renamed from: l  reason: collision with root package name */
        private C3117j.a f44734l;

        /* renamed from: m  reason: collision with root package name */
        private List f44735m;

        /* renamed from: n  reason: collision with root package name */
        private C3856c.a f44736n;

        /* renamed from: o  reason: collision with root package name */
        private u.a f44737o;

        /* renamed from: p  reason: collision with root package name */
        private Map f44738p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f44739q;

        /* renamed from: r  reason: collision with root package name */
        private Boolean f44740r;

        /* renamed from: s  reason: collision with root package name */
        private Boolean f44741s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f44742t;

        /* renamed from: u  reason: collision with root package name */
        private C3615b f44743u;

        /* renamed from: v  reason: collision with root package name */
        private C3615b f44744v;

        /* renamed from: w  reason: collision with root package name */
        private C3615b f44745w;

        /* renamed from: x  reason: collision with root package name */
        private G f44746x;

        /* renamed from: y  reason: collision with root package name */
        private G f44747y;

        /* renamed from: z  reason: collision with root package name */
        private G f44748z;

        public a(Context context) {
            this.f44723a = context;
            this.f44724b = k.b();
            this.f44725c = null;
            this.f44726d = null;
            this.f44727e = null;
            this.f44728f = null;
            this.f44729g = null;
            this.f44730h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f44731i = null;
            }
            this.f44732j = null;
            this.f44733k = null;
            this.f44734l = null;
            this.f44735m = C6565s.n();
            this.f44736n = null;
            this.f44737o = null;
            this.f44738p = null;
            this.f44739q = true;
            this.f44740r = null;
            this.f44741s = null;
            this.f44742t = true;
            this.f44743u = null;
            this.f44744v = null;
            this.f44745w = null;
            this.f44746x = null;
            this.f44747y = null;
            this.f44748z = null;
            this.f44708A = null;
            this.f44709B = null;
            this.f44710C = null;
            this.f44711D = null;
            this.f44712E = null;
            this.f44713F = null;
            this.f44714G = null;
            this.f44715H = null;
            this.f44716I = null;
            this.f44717J = null;
            this.f44718K = null;
            this.f44719L = null;
            this.f44720M = null;
            this.f44721N = null;
            this.f44722O = null;
        }

        private final void p() {
            this.f44722O = null;
        }

        private final void q() {
            this.f44720M = null;
            this.f44721N = null;
            this.f44722O = null;
        }

        private final C1790m r() {
            Context context;
            C3737c cVar = this.f44726d;
            if (cVar instanceof C3738d) {
                context = ((C3738d) cVar).a().getContext();
            } else {
                context = this.f44723a;
            }
            C1790m c10 = C3881d.c(context);
            if (c10 == null) {
                return C3621h.f44667b;
            }
            return c10;
        }

        private final C3666h s() {
            C3670l lVar;
            C3738d dVar;
            View a10;
            C3668j jVar = this.f44718K;
            View view = null;
            if (jVar instanceof C3670l) {
                lVar = (C3670l) jVar;
            } else {
                lVar = null;
            }
            if (lVar == null || (a10 = lVar.a()) == null) {
                C3737c cVar = this.f44726d;
                if (cVar instanceof C3738d) {
                    dVar = (C3738d) cVar;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    view = dVar.a();
                }
            } else {
                view = a10;
            }
            if (view instanceof ImageView) {
                return l.n((ImageView) view);
            }
            return C3666h.FIT;
        }

        private final C3668j t() {
            ImageView.ScaleType scaleType;
            C3737c cVar = this.f44726d;
            if (!(cVar instanceof C3738d)) {
                return new C3662d(this.f44723a);
            }
            View a10 = ((C3738d) cVar).a();
            if (!(a10 instanceof ImageView) || ((scaleType = ((ImageView) a10).getScaleType()) != ImageView.ScaleType.CENTER && scaleType != ImageView.ScaleType.MATRIX)) {
                return C3671m.b(a10, false, 2, (Object) null);
            }
            return C3669k.a(C3667i.f45119d);
        }

        public static /* synthetic */ a x(a aVar, String str, Object obj, String str2, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = null;
                }
            }
            return aVar.w(str, obj, str2);
        }

        public final a A(C3668j jVar) {
            this.f44718K = jVar;
            q();
            return this;
        }

        public final a B(ImageView imageView) {
            return C(new C3736b(imageView));
        }

        public final a C(C3737c cVar) {
            this.f44726d = cVar;
            q();
            return this;
        }

        public final a D(List list) {
            this.f44735m = C3880c.a(list);
            return this;
        }

        public final a E(e... eVarArr) {
            return D(C6559l.n1(eVarArr));
        }

        public final a F(C3856c.a aVar) {
            this.f44736n = aVar;
            return this;
        }

        public final C3622i a() {
            u uVar;
            C3632s sVar;
            boolean c10;
            boolean d10;
            C3628o oVar;
            Context context = this.f44723a;
            Object obj = this.f44725c;
            if (obj == null) {
                obj = C3624k.f44749a;
            }
            Object obj2 = obj;
            C3737c cVar = this.f44726d;
            b bVar = this.f44727e;
            C3568c.b bVar2 = this.f44728f;
            String str = this.f44729g;
            Bitmap.Config config = this.f44730h;
            if (config == null) {
                config = this.f44724b.e();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f44731i;
            C3663e eVar = this.f44732j;
            if (eVar == null) {
                eVar = this.f44724b.o();
            }
            C3663e eVar2 = eVar;
            Pair pair = this.f44733k;
            C3117j.a aVar = this.f44734l;
            List list = this.f44735m;
            C3856c.a aVar2 = this.f44736n;
            if (aVar2 == null) {
                aVar2 = this.f44724b.q();
            }
            C3856c.a aVar3 = aVar2;
            u.a aVar4 = this.f44737o;
            if (aVar4 != null) {
                uVar = aVar4.f();
            } else {
                uVar = null;
            }
            u x10 = l.x(uVar);
            Map map = this.f44738p;
            if (map != null) {
                sVar = C3632s.f44782b.a(map);
            } else {
                sVar = null;
            }
            C3632s w10 = l.w(sVar);
            boolean z10 = this.f44739q;
            Boolean bool = this.f44740r;
            if (bool != null) {
                c10 = bool.booleanValue();
            } else {
                c10 = this.f44724b.c();
            }
            boolean z11 = c10;
            Boolean bool2 = this.f44741s;
            if (bool2 != null) {
                d10 = bool2.booleanValue();
            } else {
                d10 = this.f44724b.d();
            }
            boolean z12 = d10;
            boolean z13 = this.f44742t;
            C3615b bVar3 = this.f44743u;
            if (bVar3 == null) {
                bVar3 = this.f44724b.l();
            }
            C3615b bVar4 = bVar3;
            C3615b bVar5 = this.f44744v;
            if (bVar5 == null) {
                bVar5 = this.f44724b.g();
            }
            C3615b bVar6 = bVar5;
            C3615b bVar7 = this.f44745w;
            if (bVar7 == null) {
                bVar7 = this.f44724b.m();
            }
            C3615b bVar8 = bVar7;
            G g10 = this.f44746x;
            if (g10 == null) {
                g10 = this.f44724b.k();
            }
            G g11 = g10;
            G g12 = this.f44747y;
            if (g12 == null) {
                g12 = this.f44724b.j();
            }
            G g13 = g12;
            G g14 = this.f44748z;
            if (g14 == null) {
                g14 = this.f44724b.f();
            }
            G g15 = g14;
            G g16 = this.f44708A;
            if (g16 == null) {
                g16 = this.f44724b.p();
            }
            G g17 = g16;
            C1790m mVar = this.f44717J;
            if (mVar == null && (mVar = this.f44720M) == null) {
                mVar = r();
            }
            C1790m mVar2 = mVar;
            C3668j jVar = this.f44718K;
            if (jVar == null && (jVar = this.f44721N) == null) {
                jVar = t();
            }
            C3668j jVar2 = jVar;
            C3666h hVar = this.f44719L;
            if (hVar == null && (hVar = this.f44722O) == null) {
                hVar = s();
            }
            C3666h hVar2 = hVar;
            C3628o.a aVar5 = this.f44709B;
            if (aVar5 != null) {
                oVar = aVar5.a();
            } else {
                oVar = null;
            }
            C3628o v10 = l.v(oVar);
            C3568c.b bVar9 = this.f44710C;
            Integer num = this.f44711D;
            Drawable drawable = this.f44712E;
            Integer num2 = this.f44713F;
            Drawable drawable2 = this.f44714G;
            Integer num3 = this.f44715H;
            Drawable drawable3 = this.f44716I;
            C3617d dVar = r43;
            boolean z14 = z10;
            C3856c.a aVar6 = aVar3;
            List list2 = list;
            C3117j.a aVar7 = aVar;
            Pair pair2 = pair;
            C3663e eVar3 = eVar2;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            C3568c.b bVar10 = bVar2;
            b bVar11 = bVar;
            C3737c cVar2 = cVar;
            Object obj3 = obj2;
            C3617d dVar2 = new C3617d(this.f44717J, this.f44718K, this.f44719L, this.f44746x, this.f44747y, this.f44748z, this.f44708A, this.f44736n, this.f44732j, this.f44730h, this.f44740r, this.f44741s, this.f44743u, this.f44744v, this.f44745w);
            return new C3622i(context, obj3, cVar2, bVar11, bVar10, str2, config3, colorSpace2, eVar3, pair2, aVar7, list2, aVar6, x10, w10, z14, z11, z12, z13, bVar4, bVar6, bVar8, g11, g13, g15, g17, mVar2, jVar2, hVar2, v10, bVar9, num, drawable, num2, drawable2, num3, drawable3, dVar, this.f44724b, (DefaultConstructorMarker) null);
        }

        public final a b(int i10) {
            C3856c.a aVar;
            if (i10 > 0) {
                aVar = new C3854a.C0702a(i10, false, 2, (DefaultConstructorMarker) null);
            } else {
                aVar = C3856c.a.f46857b;
            }
            F(aVar);
            return this;
        }

        public final a c(boolean z10) {
            int i10;
            if (z10) {
                i10 = 100;
            } else {
                i10 = 0;
            }
            return b(i10);
        }

        public final a d(Object obj) {
            this.f44725c = obj;
            return this;
        }

        public final a e(C3616c cVar) {
            this.f44724b = cVar;
            p();
            return this;
        }

        public final a f(String str) {
            this.f44729g = str;
            return this;
        }

        public final a g(G g10) {
            this.f44747y = g10;
            this.f44748z = g10;
            this.f44708A = g10;
            return this;
        }

        public final a h(int i10) {
            this.f44713F = Integer.valueOf(i10);
            this.f44714G = null;
            return this;
        }

        public final a i(Drawable drawable) {
            this.f44714G = drawable;
            this.f44713F = 0;
            return this;
        }

        public final a j(b bVar) {
            this.f44727e = bVar;
            return this;
        }

        public final a k(C3568c.b bVar) {
            this.f44728f = bVar;
            return this;
        }

        public final a l(String str) {
            C3568c.b bVar = null;
            if (str != null) {
                bVar = new C3568c.b(str, (Map) null, 2, (DefaultConstructorMarker) null);
            }
            return k(bVar);
        }

        public final a m(int i10) {
            this.f44711D = Integer.valueOf(i10);
            this.f44712E = null;
            return this;
        }

        public final a n(Drawable drawable) {
            this.f44712E = drawable;
            this.f44711D = 0;
            return this;
        }

        public final a o(C3663e eVar) {
            this.f44732j = eVar;
            return this;
        }

        public final a u(C3666h hVar) {
            this.f44719L = hVar;
            return this;
        }

        public final a v(String str, Object obj) {
            return x(this, str, obj, (String) null, 4, (Object) null);
        }

        public final a w(String str, Object obj, String str2) {
            C3628o.a aVar = this.f44709B;
            if (aVar == null) {
                aVar = new C3628o.a();
                this.f44709B = aVar;
            }
            aVar.b(str, obj, str2);
            return this;
        }

        public final a y(int i10, int i11) {
            return z(C3660b.a(i10, i11));
        }

        public final a z(C3667i iVar) {
            return A(C3669k.a(iVar));
        }

        public a(C3622i iVar, Context context) {
            this.f44723a = context;
            this.f44724b = iVar.p();
            this.f44725c = iVar.m();
            this.f44726d = iVar.M();
            this.f44727e = iVar.A();
            this.f44728f = iVar.B();
            this.f44729g = iVar.r();
            this.f44730h = iVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f44731i = iVar.k();
            }
            this.f44732j = iVar.q().k();
            this.f44733k = iVar.w();
            this.f44734l = iVar.o();
            this.f44735m = iVar.O();
            this.f44736n = iVar.q().o();
            this.f44737o = iVar.x().n();
            this.f44738p = O.B(iVar.L().a());
            this.f44739q = iVar.g();
            this.f44740r = iVar.q().a();
            this.f44741s = iVar.q().b();
            this.f44742t = iVar.I();
            this.f44743u = iVar.q().i();
            this.f44744v = iVar.q().e();
            this.f44745w = iVar.q().j();
            this.f44746x = iVar.q().g();
            this.f44747y = iVar.q().f();
            this.f44748z = iVar.q().d();
            this.f44708A = iVar.q().n();
            this.f44709B = iVar.E().g();
            this.f44710C = iVar.G();
            this.f44711D = iVar.f44674F;
            this.f44712E = iVar.f44675G;
            this.f44713F = iVar.f44676H;
            this.f44714G = iVar.f44677I;
            this.f44715H = iVar.f44678J;
            this.f44716I = iVar.f44679K;
            this.f44717J = iVar.q().h();
            this.f44718K = iVar.q().m();
            this.f44719L = iVar.q().l();
            if (iVar.l() == context) {
                this.f44720M = iVar.z();
                this.f44721N = iVar.K();
                this.f44722O = iVar.J();
                return;
            }
            this.f44720M = null;
            this.f44721N = null;
            this.f44722O = null;
        }
    }
}
