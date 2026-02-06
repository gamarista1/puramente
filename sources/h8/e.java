package h8;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6501x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.C6798l;

public final class e extends LayerDrawable {

    /* renamed from: l  reason: collision with root package name */
    private static final a f44091l = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f44092a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f44093b;

    /* renamed from: c  reason: collision with root package name */
    private final d f44094c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public LayerDrawable f44095d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C3582a f44096e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C3583b f44097f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Drawable f44098g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public LayerDrawable f44099h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public h f44100i;

    /* renamed from: j  reason: collision with root package name */
    private j8.c f44101j;

    /* renamed from: k  reason: collision with root package name */
    private j8.e f44102k;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends C6494p implements C6798l {
        b(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(C3582a aVar) {
            ((Ff.i) this.receiver).set(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((C3582a) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class c extends C6501x {
        c(Object obj) {
            super(obj, e.class, AppStateModule.APP_STATE_BACKGROUND, "getBackground()Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).h();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44096e = (C3582a) obj;
        }
    }

    /* synthetic */ class d extends C6494p implements C6798l {
        d(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(C3583b bVar) {
            ((Ff.i) this.receiver).set(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((C3583b) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: h8.e$e  reason: collision with other inner class name */
    /* synthetic */ class C0678e extends C6501x {
        C0678e(Object obj) {
            super(obj, e.class, "border", "getBorder()Lcom/facebook/react/uimanager/drawable/BorderDrawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).i();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44097f = (C3583b) obj;
        }
    }

    /* synthetic */ class f extends C6494p implements C6798l {
        f(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(Drawable drawable) {
            ((Ff.i) this.receiver).set(drawable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Drawable) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class g extends C6501x {
        g(Object obj) {
            super(obj, e.class, "feedbackUnderlay", "getFeedbackUnderlay()Landroid/graphics/drawable/Drawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).m();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44098g = (Drawable) obj;
        }
    }

    /* synthetic */ class h extends C6494p implements C6798l {
        h(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(LayerDrawable layerDrawable) {
            ((Ff.i) this.receiver).set(layerDrawable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((LayerDrawable) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class i extends C6501x {
        i(Object obj) {
            super(obj, e.class, "innerShadows", "getInnerShadows()Landroid/graphics/drawable/LayerDrawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).n();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44099h = (LayerDrawable) obj;
        }
    }

    /* synthetic */ class j extends C6494p implements C6798l {
        j(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(LayerDrawable layerDrawable) {
            ((Ff.i) this.receiver).set(layerDrawable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((LayerDrawable) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class k extends C6501x {
        k(Object obj) {
            super(obj, e.class, "outerShadows", "getOuterShadows()Landroid/graphics/drawable/LayerDrawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).p();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44095d = (LayerDrawable) obj;
        }
    }

    /* synthetic */ class l extends C6494p implements C6798l {
        l(Object obj) {
            super(1, obj, Ff.i.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        public final void i(h hVar) {
            ((Ff.i) this.receiver).set(hVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((h) obj);
            return C6514M.f71813a;
        }
    }

    /* synthetic */ class m extends C6501x {
        m(Object obj) {
            super(obj, e.class, "outline", "getOutline()Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", 0);
        }

        public Object get() {
            return ((e) this.receiver).q();
        }

        public void set(Object obj) {
            ((e) this.receiver).f44100i = (h) obj;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(android.content.Context r10, android.graphics.drawable.Drawable r11, android.graphics.drawable.LayerDrawable r12, h8.d r13, h8.C3582a r14, h8.C3583b r15, android.graphics.drawable.Drawable r16, android.graphics.drawable.LayerDrawable r17, h8.h r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r18
        L_0x003d:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.e.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.LayerDrawable, h8.d, h8.a, h8.b, android.graphics.drawable.Drawable, android.graphics.drawable.LayerDrawable, h8.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final e A(Drawable drawable, int i10, C6798l lVar) {
        lVar.invoke(drawable);
        if (M7.b.k() && u(drawable, i10)) {
            return this;
        }
        e eVar = new e(this.f44092a, this.f44093b, this.f44095d, this.f44094c, this.f44096e, this.f44097f, this.f44098g, this.f44099h, this.f44100i);
        eVar.f44101j = this.f44101j;
        eVar.f44102k = this.f44102k;
        return eVar;
    }

    private final void g(Drawable drawable, int i10) {
        if (drawable != null) {
            addLayer(drawable);
            drawable.setCallback(this);
            setId(getNumberOfLayers() - 1, i10);
            invalidateSelf();
        }
    }

    private final void r(Drawable drawable, int i10) {
        if (drawable != null) {
            if (getNumberOfLayers() == 0) {
                g(drawable, i10);
                return;
            }
            int numberOfLayers = getNumberOfLayers();
            int i11 = 0;
            while (i11 < numberOfLayers) {
                if (i10 < getId(i11)) {
                    Drawable drawable2 = getDrawable(i11);
                    C6496s.g(drawable2, "getDrawable(...)");
                    int id2 = getId(i11);
                    setDrawable(i11, drawable);
                    setId(i11, i10);
                    r(drawable2, id2);
                    return;
                } else if (i11 == getNumberOfLayers() - 1) {
                    g(drawable, i10);
                    return;
                } else {
                    i11++;
                }
            }
        }
    }

    private final boolean u(Drawable drawable, int i10) {
        if (drawable != null) {
            if (findDrawableByLayerId(i10) == null) {
                r(drawable, i10);
            } else {
                setDrawableByLayerId(i10, drawable);
            }
            invalidateSelf();
            return true;
        } else if (findDrawableByLayerId(i10) == null) {
            return true;
        } else {
            return false;
        }
    }

    public final e B(LayerDrawable layerDrawable) {
        return A(layerDrawable, 1, new j(new k(this)));
    }

    public final e C(h hVar) {
        return A(hVar, 7, new l(new m(this)));
    }

    public void getOutline(Outline outline) {
        j8.i iVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Outline outline2 = outline;
        C6496s.h(outline2, "outline");
        j8.e eVar = this.f44102k;
        if (eVar == null || !eVar.c()) {
            outline2.setRect(getBounds());
            return;
        }
        Path path = new Path();
        j8.e eVar2 = this.f44102k;
        RectF rectF = null;
        if (eVar2 != null) {
            iVar = eVar2.d(getLayoutDirection(), this.f44092a, (float) getBounds().width(), (float) getBounds().height());
        } else {
            iVar = null;
        }
        j8.c cVar = this.f44101j;
        if (cVar != null) {
            rectF = cVar.a(getLayoutDirection(), this.f44092a);
        }
        if (iVar != null) {
            RectF rectF2 = new RectF(getBounds());
            G g10 = G.f41415a;
            float a10 = iVar.c().a();
            if (rectF != null) {
                f10 = rectF.left;
            } else {
                f10 = 0.0f;
            }
            float b10 = g10.b(a10 + f10);
            float b11 = iVar.c().b();
            if (rectF != null) {
                f11 = rectF.top;
            } else {
                f11 = 0.0f;
            }
            float b12 = g10.b(b11 + f11);
            float a11 = iVar.d().a();
            if (rectF != null) {
                f12 = rectF.right;
            } else {
                f12 = 0.0f;
            }
            float b13 = g10.b(a11 + f12);
            float b14 = iVar.d().b();
            if (rectF != null) {
                f13 = rectF.top;
            } else {
                f13 = 0.0f;
            }
            float b15 = g10.b(b14 + f13);
            float a12 = iVar.b().a();
            if (rectF != null) {
                f14 = rectF.right;
            } else {
                f14 = 0.0f;
            }
            float b16 = g10.b(a12 + f14);
            float b17 = iVar.b().b();
            if (rectF != null) {
                f15 = rectF.bottom;
            } else {
                f15 = 0.0f;
            }
            float b18 = g10.b(b17 + f15);
            float a13 = iVar.a().a();
            if (rectF != null) {
                f16 = rectF.left;
            } else {
                f16 = 0.0f;
            }
            float b19 = g10.b(a13 + f16);
            float b20 = iVar.a().b();
            if (rectF != null) {
                f17 = rectF.bottom;
            } else {
                f17 = 0.0f;
            }
            path.addRoundRect(rectF2, new float[]{b10, b12, b13, b15, b16, b18, b19, g10.b(b20 + f17)}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline2.setPath(path);
        } else {
            outline2.setConvexPath(path);
        }
    }

    public final C3582a h() {
        return this.f44096e;
    }

    public final C3583b i() {
        return this.f44097f;
    }

    public final j8.c j() {
        return this.f44101j;
    }

    public final j8.e k() {
        return this.f44102k;
    }

    public final d l() {
        return this.f44094c;
    }

    public final Drawable m() {
        return this.f44098g;
    }

    public final LayerDrawable n() {
        return this.f44099h;
    }

    public final Drawable o() {
        return this.f44093b;
    }

    public final LayerDrawable p() {
        return this.f44095d;
    }

    public final h q() {
        return this.f44100i;
    }

    public final void s(j8.c cVar) {
        this.f44101j = cVar;
    }

    public final void t(j8.e eVar) {
        this.f44102k = eVar;
    }

    public final e v(C3582a aVar) {
        return A(aVar, 3, new b(new c(this)));
    }

    public final e w(C3583b bVar) {
        return A(bVar, 4, new d(new C0678e(this)));
    }

    public final e x(d dVar) {
        e eVar = new e(this.f44092a, this.f44093b, this.f44095d, dVar, this.f44096e, this.f44097f, this.f44098g, this.f44099h, this.f44100i);
        eVar.f44101j = this.f44101j;
        eVar.f44102k = this.f44102k;
        return eVar;
    }

    public final e y(Drawable drawable) {
        return A(drawable, 5, new f(new g(this)));
    }

    public final e z(LayerDrawable layerDrawable) {
        return A(layerDrawable, 6, new h(new i(this)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, Drawable drawable, LayerDrawable layerDrawable, d dVar, C3582a aVar, C3583b bVar, Drawable drawable2, LayerDrawable layerDrawable2, h hVar) {
        super(new Drawable[0]);
        C6496s.h(context, "context");
        this.f44092a = context;
        this.f44093b = drawable;
        this.f44094c = dVar;
        this.f44095d = layerDrawable;
        this.f44096e = aVar;
        this.f44097f = bVar;
        this.f44098g = drawable2;
        this.f44099h = layerDrawable2;
        this.f44100i = hVar;
        setPaddingMode(1);
        g(drawable, 0);
        g(layerDrawable, 1);
        g(dVar, 2);
        g(aVar, 3);
        g(bVar, 4);
        g(drawable2, 5);
        g(layerDrawable2, 6);
        g(hVar, 7);
    }
}
