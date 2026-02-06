package D4;

import A4.f;
import C4.h;
import C4.i;
import D4.e;
import F4.C3007j;
import H4.l;
import I4.c;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.C2389e;
import u4.C4065e;
import u4.C4071k;
import u4.L;
import v4.C4103a;
import w4.C4120e;
import x4.C4155a;
import x4.C4158d;
import x4.C4162h;
import x4.p;

public abstract class b implements C4120e, C4155a.b, f {

    /* renamed from: A  reason: collision with root package name */
    private Paint f30270A;

    /* renamed from: B  reason: collision with root package name */
    float f30271B;

    /* renamed from: C  reason: collision with root package name */
    BlurMaskFilter f30272C;

    /* renamed from: D  reason: collision with root package name */
    C4103a f30273D;

    /* renamed from: a  reason: collision with root package name */
    private final Path f30274a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f30275b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f30276c = new Matrix();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f30277d = new C4103a(1);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f30278e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f30279f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f30280g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f30281h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f30282i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f30283j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f30284k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f30285l;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f30286m;

    /* renamed from: n  reason: collision with root package name */
    private final String f30287n;

    /* renamed from: o  reason: collision with root package name */
    final Matrix f30288o;

    /* renamed from: p  reason: collision with root package name */
    final L f30289p;

    /* renamed from: q  reason: collision with root package name */
    final e f30290q;

    /* renamed from: r  reason: collision with root package name */
    private C4162h f30291r;

    /* renamed from: s  reason: collision with root package name */
    private C4158d f30292s;

    /* renamed from: t  reason: collision with root package name */
    private b f30293t;

    /* renamed from: u  reason: collision with root package name */
    private b f30294u;

    /* renamed from: v  reason: collision with root package name */
    private List f30295v;

    /* renamed from: w  reason: collision with root package name */
    private final List f30296w;

    /* renamed from: x  reason: collision with root package name */
    public final p f30297x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30298y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f30299z;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30300a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f30301b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                C4.i$a[] r0 = C4.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30301b = r0
                r1 = 1
                C4.i$a r2 = C4.i.a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30301b     // Catch:{ NoSuchFieldError -> 0x001d }
                C4.i$a r3 = C4.i.a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f30301b     // Catch:{ NoSuchFieldError -> 0x0028 }
                C4.i$a r4 = C4.i.a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f30301b     // Catch:{ NoSuchFieldError -> 0x0033 }
                C4.i$a r5 = C4.i.a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                D4.e$a[] r4 = D4.e.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f30300a = r4
                D4.e$a r5 = D4.e.a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f30300a     // Catch:{ NoSuchFieldError -> 0x004e }
                D4.e$a r4 = D4.e.a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f30300a     // Catch:{ NoSuchFieldError -> 0x0058 }
                D4.e$a r1 = D4.e.a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f30300a     // Catch:{ NoSuchFieldError -> 0x0062 }
                D4.e$a r1 = D4.e.a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f30300a     // Catch:{ NoSuchFieldError -> 0x006d }
                D4.e$a r1 = D4.e.a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f30300a     // Catch:{ NoSuchFieldError -> 0x0078 }
                D4.e$a r1 = D4.e.a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30300a     // Catch:{ NoSuchFieldError -> 0x0083 }
                D4.e$a r1 = D4.e.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.b.a.<clinit>():void");
        }
    }

    b(L l10, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f30278e = new C4103a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f30279f = new C4103a(1, mode2);
        C4103a aVar = new C4103a(1);
        this.f30280g = aVar;
        this.f30281h = new C4103a(PorterDuff.Mode.CLEAR);
        this.f30282i = new RectF();
        this.f30283j = new RectF();
        this.f30284k = new RectF();
        this.f30285l = new RectF();
        this.f30286m = new RectF();
        this.f30288o = new Matrix();
        this.f30296w = new ArrayList();
        this.f30298y = true;
        this.f30271B = 0.0f;
        this.f30289p = l10;
        this.f30290q = eVar;
        this.f30287n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b10 = eVar.x().b();
        this.f30297x = b10;
        b10.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            C4162h hVar = new C4162h(eVar.h());
            this.f30291r = hVar;
            for (C4155a a10 : hVar.a()) {
                a10.a(this);
            }
            for (C4155a aVar2 : this.f30291r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f30284k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f30291r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) this.f30291r.b().get(i10);
                Path path = (Path) ((C4155a) this.f30291r.a().get(i10)).h();
                if (path != null) {
                    this.f30274a.set(path);
                    this.f30274a.transform(matrix);
                    int i11 = a.f30301b[iVar.a().ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        if ((i11 != 3 && i11 != 4) || !iVar.d()) {
                            this.f30274a.computeBounds(this.f30286m, false);
                            if (i10 == 0) {
                                this.f30284k.set(this.f30286m);
                            } else {
                                RectF rectF2 = this.f30284k;
                                rectF2.set(Math.min(rectF2.left, this.f30286m.left), Math.min(this.f30284k.top, this.f30286m.top), Math.max(this.f30284k.right, this.f30286m.right), Math.max(this.f30284k.bottom, this.f30286m.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(this.f30284k)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f30290q.i() != e.b.INVERT) {
            this.f30285l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f30293t.f(this.f30285l, matrix, true);
            if (!rectF.intersect(this.f30285l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void F() {
        this.f30289p.invalidateSelf();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        boolean z10;
        if (this.f30292s.q() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        O(z10);
    }

    private void H(float f10) {
        this.f30289p.J().n().a(this.f30290q.j(), f10);
    }

    private void O(boolean z10) {
        if (z10 != this.f30298y) {
            this.f30298y = z10;
            F();
        }
    }

    private void P() {
        boolean z10 = true;
        if (!this.f30290q.f().isEmpty()) {
            C4158d dVar = new C4158d(this.f30290q.f());
            this.f30292s = dVar;
            dVar.m();
            this.f30292s.a(new a(this));
            if (((Float) this.f30292s.h()).floatValue() != 1.0f) {
                z10 = false;
            }
            O(z10);
            i(this.f30292s);
            return;
        }
        O(true);
    }

    private void j(Canvas canvas, Matrix matrix, C4155a aVar, C4155a aVar2) {
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        this.f30277d.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f30274a, this.f30277d);
    }

    private void k(Canvas canvas, Matrix matrix, C4155a aVar, C4155a aVar2) {
        l.n(canvas, this.f30282i, this.f30278e);
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        this.f30277d.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f30274a, this.f30277d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, C4155a aVar, C4155a aVar2) {
        l.n(canvas, this.f30282i, this.f30277d);
        canvas.drawRect(this.f30282i, this.f30277d);
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        this.f30277d.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        canvas.drawPath(this.f30274a, this.f30279f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, C4155a aVar, C4155a aVar2) {
        l.n(canvas, this.f30282i, this.f30278e);
        canvas.drawRect(this.f30282i, this.f30277d);
        this.f30279f.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        canvas.drawPath(this.f30274a, this.f30279f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, C4155a aVar, C4155a aVar2) {
        l.n(canvas, this.f30282i, this.f30279f);
        canvas.drawRect(this.f30282i, this.f30277d);
        this.f30279f.setAlpha((int) (((float) ((Integer) aVar2.h()).intValue()) * 2.55f));
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        canvas.drawPath(this.f30274a, this.f30279f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (C4065e.h()) {
            C4065e.b("Layer#saveLayer");
        }
        l.o(canvas, this.f30282i, this.f30278e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (C4065e.h()) {
            C4065e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f30291r.b().size(); i10++) {
            i iVar = (i) this.f30291r.b().get(i10);
            C4155a aVar = (C4155a) this.f30291r.a().get(i10);
            C4155a aVar2 = (C4155a) this.f30291r.c().get(i10);
            int i11 = a.f30301b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f30277d.setColor(-16777216);
                        this.f30277d.setAlpha(255);
                        canvas.drawRect(this.f30282i, this.f30277d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f30277d.setAlpha(255);
                canvas.drawRect(this.f30282i, this.f30277d);
            }
        }
        if (C4065e.h()) {
            C4065e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C4065e.h()) {
            C4065e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, C4155a aVar) {
        this.f30274a.set((Path) aVar.h());
        this.f30274a.transform(matrix);
        canvas.drawPath(this.f30274a, this.f30279f);
    }

    private boolean r() {
        if (this.f30291r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f30291r.b().size(); i10++) {
            if (((i) this.f30291r.b().get(i10)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f30295v == null) {
            if (this.f30294u == null) {
                this.f30295v = Collections.emptyList();
                return;
            }
            this.f30295v = new ArrayList();
            for (b bVar = this.f30294u; bVar != null; bVar = bVar.f30294u) {
                this.f30295v.add(bVar);
            }
        }
    }

    private void t(Canvas canvas) {
        if (C4065e.h()) {
            C4065e.b("Layer#clearLayer");
        }
        RectF rectF = this.f30282i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f30281h);
        if (C4065e.h()) {
            C4065e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, L l10, C4071k kVar) {
        switch (a.f30300a[eVar.g().ordinal()]) {
            case 1:
                return new g(l10, eVar, cVar, kVar);
            case 2:
                return new c(l10, eVar, kVar.o(eVar.n()), kVar);
            case 3:
                return new h(l10, eVar);
            case 4:
                return new d(l10, eVar);
            case 5:
                return new f(l10, eVar);
            case 6:
                return new i(l10, eVar);
            default:
                H4.f.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    public e A() {
        return this.f30290q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        C4162h hVar = this.f30291r;
        if (hVar == null || hVar.a().isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        if (this.f30293t != null) {
            return true;
        }
        return false;
    }

    public void I(C4155a aVar) {
        this.f30296w.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    public void K(b bVar) {
        this.f30293t = bVar;
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        if (z10 && this.f30270A == null) {
            this.f30270A = new C4103a();
        }
        this.f30299z = z10;
    }

    /* access modifiers changed from: package-private */
    public void M(b bVar) {
        this.f30294u = bVar;
    }

    /* access modifiers changed from: package-private */
    public void N(float f10) {
        if (C4065e.h()) {
            C4065e.b("BaseLayer#setProgress");
            C4065e.b("BaseLayer#setProgress.transform");
        }
        this.f30297x.j(f10);
        if (C4065e.h()) {
            C4065e.c("BaseLayer#setProgress.transform");
        }
        if (this.f30291r != null) {
            if (C4065e.h()) {
                C4065e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f30291r.a().size(); i10++) {
                ((C4155a) this.f30291r.a().get(i10)).n(f10);
            }
            if (C4065e.h()) {
                C4065e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f30292s != null) {
            if (C4065e.h()) {
                C4065e.b("BaseLayer#setProgress.inout");
            }
            this.f30292s.n(f10);
            if (C4065e.h()) {
                C4065e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f30293t != null) {
            if (C4065e.h()) {
                C4065e.b("BaseLayer#setProgress.matte");
            }
            this.f30293t.N(f10);
            if (C4065e.h()) {
                C4065e.c("BaseLayer#setProgress.matte");
            }
        }
        if (C4065e.h()) {
            C4065e.b("BaseLayer#setProgress.animations." + this.f30296w.size());
        }
        for (int i11 = 0; i11 < this.f30296w.size(); i11++) {
            ((C4155a) this.f30296w.get(i11)).n(f10);
        }
        if (C4065e.h()) {
            C4065e.c("BaseLayer#setProgress.animations." + this.f30296w.size());
            C4065e.c("BaseLayer#setProgress");
        }
    }

    public void b() {
        F();
    }

    public void d(A4.e eVar, int i10, List list, A4.e eVar2) {
        b bVar = this.f30293t;
        if (bVar != null) {
            A4.e a10 = eVar2.a(bVar.getName());
            if (eVar.c(this.f30293t.getName(), i10)) {
                list.add(a10.i(this.f30293t));
            }
            if (eVar.h(getName(), i10)) {
                this.f30293t.J(eVar, eVar.e(this.f30293t.getName(), i10) + i10, list, a10);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void e(Object obj, c cVar) {
        this.f30297x.c(obj, cVar);
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f30282i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f30288o.set(matrix);
        if (z10) {
            List list = this.f30295v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f30288o.preConcat(((b) this.f30295v.get(size)).f30297x.f());
                }
            } else {
                b bVar = this.f30294u;
                if (bVar != null) {
                    this.f30288o.preConcat(bVar.f30297x.f());
                }
            }
        }
        this.f30288o.preConcat(this.f30297x.f());
    }

    public String getName() {
        return this.f30290q.j();
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        Paint paint;
        Integer num;
        C4065e.b(this.f30287n);
        if (!this.f30298y || this.f30290q.y()) {
            C4065e.c(this.f30287n);
            return;
        }
        s();
        if (C4065e.h()) {
            C4065e.b("Layer#parentMatrix");
        }
        this.f30275b.reset();
        this.f30275b.set(matrix);
        for (int size = this.f30295v.size() - 1; size >= 0; size--) {
            this.f30275b.preConcat(((b) this.f30295v.get(size)).f30297x.f());
        }
        if (C4065e.h()) {
            C4065e.c("Layer#parentMatrix");
        }
        C4155a h10 = this.f30297x.h();
        if (h10 == null || (num = (Integer) h10.h()) == null) {
            i11 = 100;
        } else {
            i11 = num.intValue();
        }
        int i12 = (int) ((((((float) i10) / 255.0f) * ((float) i11)) / 100.0f) * 255.0f);
        if (C() || B() || w() != h.NORMAL) {
            if (C4065e.h()) {
                C4065e.b("Layer#computeBounds");
            }
            f(this.f30282i, this.f30275b, false);
            E(this.f30282i, matrix);
            this.f30275b.preConcat(this.f30297x.f());
            D(this.f30282i, this.f30275b);
            this.f30283j.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            canvas.getMatrix(this.f30276c);
            if (!this.f30276c.isIdentity()) {
                Matrix matrix2 = this.f30276c;
                matrix2.invert(matrix2);
                this.f30276c.mapRect(this.f30283j);
            }
            if (!this.f30282i.intersect(this.f30283j)) {
                this.f30282i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            if (C4065e.h()) {
                C4065e.c("Layer#computeBounds");
            }
            if (this.f30282i.width() >= 1.0f && this.f30282i.height() >= 1.0f) {
                if (C4065e.h()) {
                    C4065e.b("Layer#saveLayer");
                }
                this.f30277d.setAlpha(255);
                C2389e.b(this.f30277d, w().b());
                l.n(canvas, this.f30282i, this.f30277d);
                if (C4065e.h()) {
                    C4065e.c("Layer#saveLayer");
                }
                if (w() != h.MULTIPLY) {
                    t(canvas);
                } else {
                    if (this.f30273D == null) {
                        C4103a aVar = new C4103a();
                        this.f30273D = aVar;
                        aVar.setColor(-1);
                    }
                    RectF rectF = this.f30282i;
                    canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f30273D);
                }
                if (C4065e.h()) {
                    C4065e.b("Layer#drawLayer");
                }
                u(canvas, this.f30275b, i12);
                if (C4065e.h()) {
                    C4065e.c("Layer#drawLayer");
                }
                if (B()) {
                    p(canvas, this.f30275b);
                }
                if (C()) {
                    if (C4065e.h()) {
                        C4065e.b("Layer#drawMatte");
                        C4065e.b("Layer#saveLayer");
                    }
                    l.o(canvas, this.f30282i, this.f30280g, 19);
                    if (C4065e.h()) {
                        C4065e.c("Layer#saveLayer");
                    }
                    t(canvas);
                    this.f30293t.h(canvas, matrix, i12);
                    if (C4065e.h()) {
                        C4065e.b("Layer#restoreLayer");
                    }
                    canvas.restore();
                    if (C4065e.h()) {
                        C4065e.c("Layer#restoreLayer");
                        C4065e.c("Layer#drawMatte");
                    }
                }
                if (C4065e.h()) {
                    C4065e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C4065e.h()) {
                    C4065e.c("Layer#restoreLayer");
                }
            }
            if (this.f30299z && (paint = this.f30270A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f30270A.setColor(-251901);
                this.f30270A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f30282i, this.f30270A);
                this.f30270A.setStyle(Paint.Style.FILL);
                this.f30270A.setColor(1357638635);
                canvas.drawRect(this.f30282i, this.f30270A);
            }
            H(C4065e.c(this.f30287n));
            return;
        }
        this.f30275b.preConcat(this.f30297x.f());
        if (C4065e.h()) {
            C4065e.b("Layer#drawLayer");
        }
        u(canvas, this.f30275b, i12);
        if (C4065e.h()) {
            C4065e.c("Layer#drawLayer");
        }
        H(C4065e.c(this.f30287n));
    }

    public void i(C4155a aVar) {
        if (aVar != null) {
            this.f30296w.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void u(Canvas canvas, Matrix matrix, int i10);

    public h w() {
        return this.f30290q.a();
    }

    public C4.a x() {
        return this.f30290q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f30271B == f10) {
            return this.f30272C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f30272C = blurMaskFilter;
        this.f30271B = f10;
        return blurMaskFilter;
    }

    public C3007j z() {
        return this.f30290q.d();
    }

    public void c(List list, List list2) {
    }

    /* access modifiers changed from: package-private */
    public void J(A4.e eVar, int i10, List list, A4.e eVar2) {
    }
}
