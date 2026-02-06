package ib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import bb.C4467a;
import hb.C5009a;
import ib.C5024k;
import ib.C5025l;
import ib.m;
import java.util.BitSet;

/* renamed from: ib.g  reason: case insensitive filesystem */
public class C5020g extends Drawable implements n {

    /* renamed from: x  reason: collision with root package name */
    private static final String f60673x = "g";

    /* renamed from: y  reason: collision with root package name */
    private static final Paint f60674y;

    /* renamed from: a  reason: collision with root package name */
    private c f60675a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m.g[] f60676b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final m.g[] f60677c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f60678d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f60679e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f60680f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f60681g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f60682h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f60683i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f60684j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f60685k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f60686l;

    /* renamed from: m  reason: collision with root package name */
    private C5024k f60687m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f60688n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f60689o;

    /* renamed from: p  reason: collision with root package name */
    private final C5009a f60690p;

    /* renamed from: q  reason: collision with root package name */
    private final C5025l.b f60691q;

    /* renamed from: r  reason: collision with root package name */
    private final C5025l f60692r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f60693s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuffColorFilter f60694t;

    /* renamed from: u  reason: collision with root package name */
    private int f60695u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f60696v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f60697w;

    /* renamed from: ib.g$a */
    class a implements C5025l.b {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i10) {
            C5020g.this.f60678d.set(i10, mVar.e());
            C5020g.this.f60676b[i10] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i10) {
            C5020g.this.f60678d.set(i10 + 4, mVar.e());
            C5020g.this.f60677c[i10] = mVar.f(matrix);
        }
    }

    /* renamed from: ib.g$b */
    class b implements C5024k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f60699a;

        b(float f10) {
            this.f60699a = f10;
        }

        public C5016c a(C5016c cVar) {
            if (cVar instanceof C5022i) {
                return cVar;
            }
            return new C5015b(this.f60699a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f60674y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C5020g(c cVar, a aVar) {
        this(cVar);
    }

    private float D() {
        if (L()) {
            return this.f60689o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f60675a;
        int i10 = cVar.f60717q;
        if (i10 == 1 || cVar.f60718r <= 0 || (i10 != 2 && !T())) {
            return false;
        }
        return true;
    }

    private boolean K() {
        Paint.Style style = this.f60675a.f60722v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    private boolean L() {
        Paint.Style style = this.f60675a.f60722v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f60689o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.f60697w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f60696v.width() - ((float) getBounds().width()));
            int height = (int) (this.f60696v.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f60696v.width()) + (this.f60675a.f60718r * 2) + width, ((int) this.f60696v.height()) + (this.f60675a.f60718r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (float) ((getBounds().left - this.f60675a.f60718r) - width);
            float f11 = (float) ((getBounds().top - this.f60675a.f60718r) - height);
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int R(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        canvas.translate((float) A(), (float) B());
    }

    private boolean e0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f60675a.f60704d == null || (color2 = this.f60688n.getColor()) == (colorForState2 = this.f60675a.f60704d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f60688n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f60675a.f60705e == null || (color = this.f60689o.getColor()) == (colorForState = this.f60675a.f60705e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f60689o.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int l10 = l(color);
        this.f60695u = l10;
        if (l10 != color) {
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f60693s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f60694t;
        c cVar = this.f60675a;
        this.f60693s = k(cVar.f60707g, cVar.f60708h, this.f60688n, true);
        c cVar2 = this.f60675a;
        this.f60694t = k(cVar2.f60706f, cVar2.f60708h, this.f60689o, false);
        c cVar3 = this.f60675a;
        if (cVar3.f60721u) {
            this.f60690p.d(cVar3.f60707g.getColorForState(getState(), 0));
        }
        if (!x1.c.a(porterDuffColorFilter, this.f60693s) || !x1.c.a(porterDuffColorFilter2, this.f60694t)) {
            return true;
        }
        return false;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f60675a.f60710j != 1.0f) {
            this.f60680f.reset();
            Matrix matrix = this.f60680f;
            float f10 = this.f60675a.f60710j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f60680f);
        }
        path.computeBounds(this.f60696v, true);
    }

    private void g0() {
        float I10 = I();
        this.f60675a.f60718r = (int) Math.ceil((double) (0.75f * I10));
        this.f60675a.f60719s = (int) Math.ceil((double) (I10 * 0.25f));
        f0();
        N();
    }

    private void i() {
        C5024k y10 = C().y(new b(-D()));
        this.f60687m = y10;
        this.f60692r.d(y10, this.f60675a.f60711k, v(), this.f60682h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f60695u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList == null || mode == null) {
            return f(paint, z10);
        }
        return j(colorStateList, mode, z10);
    }

    public static C5020g m(Context context, float f10) {
        int c10 = Ya.a.c(context, Ua.a.f52734l, C5020g.class.getSimpleName());
        C5020g gVar = new C5020g();
        gVar.M(context);
        gVar.W(ColorStateList.valueOf(c10));
        gVar.V(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f60678d.cardinality() > 0) {
            Log.w(f60673x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f60675a.f60719s != 0) {
            canvas.drawPath(this.f60681g, this.f60690p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f60676b[i10].b(this.f60690p, this.f60675a.f60718r, canvas);
            this.f60677c[i10].b(this.f60690p, this.f60675a.f60718r, canvas);
        }
        if (this.f60697w) {
            int A10 = A();
            int B10 = B();
            canvas.translate((float) (-A10), (float) (-B10));
            canvas.drawPath(this.f60681g, f60674y);
            canvas.translate((float) A10, (float) B10);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f60688n, this.f60681g, this.f60675a.f60701a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, C5024k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f60675a.f60711k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f60684j.set(u());
        float D10 = D();
        this.f60684j.inset(D10, D10);
        return this.f60684j;
    }

    public int A() {
        c cVar = this.f60675a;
        return (int) (((double) cVar.f60719s) * Math.sin(Math.toRadians((double) cVar.f60720t)));
    }

    public int B() {
        c cVar = this.f60675a;
        return (int) (((double) cVar.f60719s) * Math.cos(Math.toRadians((double) cVar.f60720t)));
    }

    public C5024k C() {
        return this.f60675a.f60701a;
    }

    public ColorStateList E() {
        return this.f60675a.f60707g;
    }

    public float F() {
        return this.f60675a.f60701a.r().a(u());
    }

    public float G() {
        return this.f60675a.f60701a.t().a(u());
    }

    public float H() {
        return this.f60675a.f60716p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f60675a.f60702b = new C4467a(context);
        g0();
    }

    public boolean O() {
        C4467a aVar = this.f60675a.f60702b;
        if (aVar == null || !aVar.d()) {
            return false;
        }
        return true;
    }

    public boolean P() {
        return this.f60675a.f60701a.u(u());
    }

    public boolean T() {
        int i10 = Build.VERSION.SDK_INT;
        if (P() || this.f60681g.isConvex() || i10 >= 29) {
            return false;
        }
        return true;
    }

    public void U(C5016c cVar) {
        setShapeAppearanceModel(this.f60675a.f60701a.x(cVar));
    }

    public void V(float f10) {
        c cVar = this.f60675a;
        if (cVar.f60715o != f10) {
            cVar.f60715o = f10;
            g0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f60675a;
        if (cVar.f60704d != colorStateList) {
            cVar.f60704d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f10) {
        c cVar = this.f60675a;
        if (cVar.f60711k != f10) {
            cVar.f60711k = f10;
            this.f60679e = true;
            invalidateSelf();
        }
    }

    public void Y(int i10, int i11, int i12, int i13) {
        c cVar = this.f60675a;
        if (cVar.f60709i == null) {
            cVar.f60709i = new Rect();
        }
        this.f60675a.f60709i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Z(float f10) {
        c cVar = this.f60675a;
        if (cVar.f60714n != f10) {
            cVar.f60714n = f10;
            g0();
        }
    }

    public void a0(float f10, int i10) {
        d0(f10);
        c0(ColorStateList.valueOf(i10));
    }

    public void b0(float f10, ColorStateList colorStateList) {
        d0(f10);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f60675a;
        if (cVar.f60705e != colorStateList) {
            cVar.f60705e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f10) {
        this.f60675a.f60712l = f10;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f60688n.setColorFilter(this.f60693s);
        int alpha = this.f60688n.getAlpha();
        this.f60688n.setAlpha(R(alpha, this.f60675a.f60713m));
        this.f60689o.setColorFilter(this.f60694t);
        this.f60689o.setStrokeWidth(this.f60675a.f60712l);
        int alpha2 = this.f60689o.getAlpha();
        this.f60689o.setAlpha(R(alpha2, this.f60675a.f60713m));
        if (this.f60679e) {
            i();
            g(u(), this.f60681g);
            this.f60679e = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.f60688n.setAlpha(alpha);
        this.f60689o.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.f60675a.f60713m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f60675a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f60675a.f60717q != 2) {
            if (P()) {
                outline.setRoundRect(getBounds(), F() * this.f60675a.f60711k);
                return;
            }
            g(u(), this.f60681g);
            if (this.f60681g.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f60681g);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f60675a.f60709i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f60685k.set(getBounds());
        g(u(), this.f60681g);
        this.f60686l.setPath(this.f60681g, this.f60685k);
        this.f60685k.op(this.f60686l, Region.Op.DIFFERENCE);
        return this.f60685k;
    }

    /* access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        C5025l lVar = this.f60692r;
        c cVar = this.f60675a;
        C5024k kVar = cVar.f60701a;
        float f10 = cVar.f60711k;
        lVar.e(kVar, f10, rectF, this.f60691q, path);
    }

    public void invalidateSelf() {
        this.f60679e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f60675a.f60707g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f60675a.f60706f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f60675a.f60705e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f60675a.f60704d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int l(int i10) {
        float I10 = I() + y();
        C4467a aVar = this.f60675a.f60702b;
        if (aVar != null) {
            return aVar.c(i10, I10);
        }
        return i10;
    }

    public Drawable mutate() {
        this.f60675a = new c(this.f60675a);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f60679e = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean e02 = e0(iArr);
        boolean f02 = f0();
        if (e02 || f02) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f60675a.f60701a, rectF);
    }

    /* access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.f60689o, this.f60682h, this.f60687m, v());
    }

    public float s() {
        return this.f60675a.f60701a.j().a(u());
    }

    public void setAlpha(int i10) {
        c cVar = this.f60675a;
        if (cVar.f60713m != i10) {
            cVar.f60713m = i10;
            N();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f60675a.f60703c = colorFilter;
        N();
    }

    public void setShapeAppearanceModel(C5024k kVar) {
        this.f60675a.f60701a = kVar;
        invalidateSelf();
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f60675a.f60707g = colorStateList;
        f0();
        N();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f60675a;
        if (cVar.f60708h != mode) {
            cVar.f60708h = mode;
            f0();
            N();
        }
    }

    public float t() {
        return this.f60675a.f60701a.l().a(u());
    }

    /* access modifiers changed from: protected */
    public RectF u() {
        this.f60683i.set(getBounds());
        return this.f60683i;
    }

    public float w() {
        return this.f60675a.f60715o;
    }

    public ColorStateList x() {
        return this.f60675a.f60704d;
    }

    public float y() {
        return this.f60675a.f60714n;
    }

    public int z() {
        return this.f60695u;
    }

    public C5020g() {
        this(new C5024k());
    }

    public C5020g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C5024k.e(context, attributeSet, i10, i11).m());
    }

    public C5020g(C5024k kVar) {
        this(new c(kVar, (C4467a) null));
    }

    private C5020g(c cVar) {
        C5025l lVar;
        this.f60676b = new m.g[4];
        this.f60677c = new m.g[4];
        this.f60678d = new BitSet(8);
        this.f60680f = new Matrix();
        this.f60681g = new Path();
        this.f60682h = new Path();
        this.f60683i = new RectF();
        this.f60684j = new RectF();
        this.f60685k = new Region();
        this.f60686l = new Region();
        Paint paint = new Paint(1);
        this.f60688n = paint;
        Paint paint2 = new Paint(1);
        this.f60689o = paint2;
        this.f60690p = new C5009a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = C5025l.k();
        } else {
            lVar = new C5025l();
        }
        this.f60692r = lVar;
        this.f60696v = new RectF();
        this.f60697w = true;
        this.f60675a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        f0();
        e0(getState());
        this.f60691q = new a();
    }

    /* renamed from: ib.g$c */
    static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public C5024k f60701a;

        /* renamed from: b  reason: collision with root package name */
        public C4467a f60702b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f60703c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f60704d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f60705e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f60706f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f60707g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f60708h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f60709i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f60710j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f60711k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f60712l;

        /* renamed from: m  reason: collision with root package name */
        public int f60713m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f60714n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f60715o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f60716p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f60717q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f60718r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f60719s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f60720t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f60721u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f60722v = Paint.Style.FILL_AND_STROKE;

        public c(C5024k kVar, C4467a aVar) {
            this.f60701a = kVar;
            this.f60702b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C5020g gVar = new C5020g(this, (a) null);
            boolean unused = gVar.f60679e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f60701a = cVar.f60701a;
            this.f60702b = cVar.f60702b;
            this.f60712l = cVar.f60712l;
            this.f60703c = cVar.f60703c;
            this.f60704d = cVar.f60704d;
            this.f60705e = cVar.f60705e;
            this.f60708h = cVar.f60708h;
            this.f60707g = cVar.f60707g;
            this.f60713m = cVar.f60713m;
            this.f60710j = cVar.f60710j;
            this.f60719s = cVar.f60719s;
            this.f60717q = cVar.f60717q;
            this.f60721u = cVar.f60721u;
            this.f60711k = cVar.f60711k;
            this.f60714n = cVar.f60714n;
            this.f60715o = cVar.f60715o;
            this.f60716p = cVar.f60716p;
            this.f60718r = cVar.f60718r;
            this.f60720t = cVar.f60720t;
            this.f60706f = cVar.f60706f;
            this.f60722v = cVar.f60722v;
            if (cVar.f60709i != null) {
                this.f60709i = new Rect(cVar.f60709i);
            }
        }
    }
}
