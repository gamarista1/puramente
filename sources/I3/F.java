package i3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.C4770v;
import f2.C1964E;
import f2.C1966a;
import f2.C1981p;
import f2.H;
import f2.P;
import h2.C2031b;
import i2.C2076a;
import i2.L;
import i3.C2090a;
import i3.C2099j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class F extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    private boolean f22214A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public boolean f22215B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f22216C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public int f22217D;

    /* renamed from: a  reason: collision with root package name */
    private final b f22218a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final View f22219b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f22220c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22221d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final e f22222e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f22223f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f22224g;

    /* renamed from: h  reason: collision with root package name */
    private final View f22225h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f22226i;

    /* renamed from: j  reason: collision with root package name */
    private final C2099j f22227j;

    /* renamed from: k  reason: collision with root package name */
    private final FrameLayout f22228k;

    /* renamed from: l  reason: collision with root package name */
    private final FrameLayout f22229l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Handler f22230m;

    /* renamed from: n  reason: collision with root package name */
    private final Class f22231n;

    /* renamed from: o  reason: collision with root package name */
    private final Method f22232o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f22233p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public C1964E f22234q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f22235r;

    /* renamed from: s  reason: collision with root package name */
    private C2099j.m f22236s;

    /* renamed from: t  reason: collision with root package name */
    private int f22237t;

    /* renamed from: u  reason: collision with root package name */
    private int f22238u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f22239v;

    /* renamed from: w  reason: collision with root package name */
    private int f22240w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f22241x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f22242y;

    /* renamed from: z  reason: collision with root package name */
    private int f22243z;

    private final class b implements C1964E.d, View.OnLayoutChangeListener, View.OnClickListener, C2099j.m, C2099j.d {

        /* renamed from: a  reason: collision with root package name */
        private final H.b f22244a = new H.b();

        /* renamed from: b  reason: collision with root package name */
        private Object f22245b;

        public b() {
        }

        public void C(int i10, int i11) {
            if (L.f22072a == 34 && (F.this.f22220c instanceof SurfaceView)) {
                ((e) C2076a.e(F.this.f22222e)).f(F.this.f22230m, (SurfaceView) F.this.f22220c, new G(F.this));
            }
        }

        public void K(C2031b bVar) {
            c0 unused = F.this.getClass();
        }

        public void L(boolean z10, int i10) {
            F.this.a0();
            F.this.c0();
        }

        public void O(boolean z10) {
            d unused = F.this.getClass();
        }

        public void U(C1964E.e eVar, C1964E.e eVar2, int i10) {
            if (F.this.M() && F.this.f22215B) {
                F.this.I();
            }
        }

        public void Y(f2.L l10) {
            H h10;
            C1964E e10 = (C1964E) C2076a.e(F.this.f22234q);
            if (e10.L(17)) {
                h10 = e10.s();
            } else {
                h10 = H.f19735a;
            }
            if (h10.q()) {
                this.f22245b = null;
            } else if (!e10.L(30) || e10.m().b()) {
                Object obj = this.f22245b;
                if (obj != null) {
                    int b10 = h10.b(obj);
                    if (b10 == -1 || e10.B() != h10.f(b10, this.f22244a).f19746c) {
                        this.f22245b = null;
                    } else {
                        return;
                    }
                }
            } else {
                this.f22245b = h10.g(e10.v(), this.f22244a, true).f19745b;
            }
            F.this.e0(false);
        }

        public void onClick(View view) {
            F.this.Y();
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            F.y((TextureView) view, F.this.f22217D);
        }

        public void p(P p10) {
            if (!p10.equals(P.f19906e) && F.this.f22234q != null && F.this.f22234q.k() != 1) {
                F.this.Z();
            }
        }

        public void v(int i10) {
            F.this.a0();
            F.this.d0();
            F.this.c0();
        }

        public void w(int i10) {
            F.this.b0();
            c unused = F.this.getClass();
        }

        public void z() {
            if (F.this.f22219b != null) {
                F.this.f22219b.setVisibility(4);
                if (F.this.E()) {
                    F.this.J();
                } else {
                    F.this.G();
                }
            }
        }
    }

    public interface c {
    }

    public interface d {
    }

    public F(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A() {
        View view = this.f22219b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void B(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(L.U(context, resources, T.f22258a));
        imageView.setBackgroundColor(resources.getColor(Q.f22253a));
    }

    private static void C(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(L.U(context, resources, T.f22258a));
        imageView.setBackgroundColor(resources.getColor(Q.f22253a, (Resources.Theme) null));
    }

    /* access modifiers changed from: private */
    public boolean E() {
        C1964E e10 = this.f22234q;
        if (e10 == null || this.f22233p == null || !e10.L(30) || !e10.m().c(4)) {
            return false;
        }
        return true;
    }

    private boolean F() {
        C1964E e10 = this.f22234q;
        if (e10 == null || !e10.L(30) || !e10.m().c(2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void G() {
        J();
        ImageView imageView = this.f22223f;
        if (imageView != null) {
            imageView.setImageResource(17170445);
        }
    }

    private void H() {
        ImageView imageView = this.f22224g;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f22224g.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public void J() {
        ImageView imageView = this.f22223f;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private boolean K(int i10) {
        if (i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23) {
            return true;
        }
        return false;
    }

    private boolean L() {
        Drawable drawable;
        ImageView imageView = this.f22223f;
        if (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public boolean M() {
        C1964E e10 = this.f22234q;
        if (e10 == null || !e10.L(16) || !this.f22234q.g() || !this.f22234q.u()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object N(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        R(objArr[1]);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (!F()) {
            X();
            A();
        }
    }

    private void P(boolean z10) {
        boolean z11;
        if ((!M() || !this.f22215B) && h0()) {
            if (!this.f22227j.c0() || this.f22227j.getShowTimeoutMs() > 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean U10 = U();
            if (z10 || z11 || U10) {
                W(U10);
            }
        }
    }

    private void R(Bitmap bitmap) {
        this.f22230m.post(new E(this, bitmap));
    }

    private boolean S(C1964E e10) {
        byte[] bArr;
        if (e10 == null || !e10.L(18) || (bArr = e10.d0().f20341i) == null) {
            return false;
        }
        return T(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean T(Drawable drawable) {
        if (!(this.f22224g == null || drawable == null)) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f22237t == 2) {
                    f10 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                Q((C2090a) null, f10);
                this.f22224g.setScaleType(scaleType);
                this.f22224g.setImageDrawable(drawable);
                this.f22224g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean U() {
        C1964E e10 = this.f22234q;
        if (e10 == null) {
            return true;
        }
        int k10 = e10.k();
        if (!this.f22214A || ((this.f22234q.L(17) && this.f22234q.s().q()) || (k10 != 1 && k10 != 4 && ((C1964E) C2076a.e(this.f22234q)).u()))) {
            return false;
        }
        return true;
    }

    private void W(boolean z10) {
        int i10;
        if (h0()) {
            C2099j jVar = this.f22227j;
            if (z10) {
                i10 = 0;
            } else {
                i10 = this.f22243z;
            }
            jVar.setShowTimeoutMs(i10);
            this.f22227j.n0();
        }
    }

    private void X() {
        ImageView imageView = this.f22223f;
        if (imageView != null) {
            imageView.setVisibility(0);
            f0();
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        if (h0() && this.f22234q != null) {
            if (!this.f22227j.c0()) {
                P(true);
            } else if (this.f22216C) {
                this.f22227j.Y();
            }
        }
    }

    /* access modifiers changed from: private */
    public void Z() {
        P p10;
        float f10;
        C1964E e10 = this.f22234q;
        if (e10 != null) {
            p10 = e10.V();
        } else {
            p10 = P.f19906e;
        }
        int i10 = p10.f19911a;
        int i11 = p10.f19912b;
        int i12 = p10.f19913c;
        float f11 = 0.0f;
        if (i11 == 0 || i10 == 0) {
            f10 = 0.0f;
        } else {
            f10 = (((float) i10) * p10.f19914d) / ((float) i11);
        }
        View view = this.f22220c;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f22217D != 0) {
                view.removeOnLayoutChangeListener(this.f22218a);
            }
            this.f22217D = i12;
            if (i12 != 0) {
                this.f22220c.addOnLayoutChangeListener(this.f22218a);
            }
            y((TextureView) this.f22220c, this.f22217D);
        }
        if (!this.f22221d) {
            f11 = f10;
        }
        Q((C2090a) null, f11);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4.f22234q.u() == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0() {
        /*
            r4 = this;
            android.view.View r0 = r4.f22225h
            if (r0 == 0) goto L_0x002b
            f2.E r0 = r4.f22234q
            r1 = 0
            if (r0 == 0) goto L_0x0020
            int r0 = r0.k()
            r2 = 2
            if (r0 != r2) goto L_0x0020
            int r0 = r4.f22240w
            r3 = 1
            if (r0 == r2) goto L_0x0021
            if (r0 != r3) goto L_0x0020
            f2.E r0 = r4.f22234q
            boolean r0 = r0.u()
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            android.view.View r0 = r4.f22225h
            if (r3 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 8
        L_0x0028:
            r0.setVisibility(r1)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.F.a0():void");
    }

    /* access modifiers changed from: private */
    public void b0() {
        C2099j jVar = this.f22227j;
        String str = null;
        if (jVar == null || !this.f22235r) {
            setContentDescription((CharSequence) null);
        } else if (jVar.c0()) {
            if (this.f22216C) {
                str = getResources().getString(Z.f22342e);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(Z.f22349l));
        }
    }

    /* access modifiers changed from: private */
    public void c0() {
        if (!M() || !this.f22215B) {
            P(false);
        } else {
            I();
        }
    }

    /* access modifiers changed from: private */
    public void d0() {
        TextView textView = this.f22226i;
        if (textView != null) {
            CharSequence charSequence = this.f22242y;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f22226i.setVisibility(0);
                return;
            }
            C1964E e10 = this.f22234q;
            if (e10 != null) {
                e10.i();
            }
            this.f22226i.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void e0(boolean z10) {
        boolean z11;
        C1964E e10 = this.f22234q;
        boolean z12 = false;
        if (e10 == null || !e10.L(30) || e10.m().b()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f22241x && (!z11 || z10)) {
            H();
            A();
            G();
        }
        if (z11) {
            boolean F10 = F();
            boolean E10 = E();
            if (!F10 && !E10) {
                A();
                G();
            }
            View view = this.f22219b;
            if (view != null && view.getVisibility() == 4 && L()) {
                z12 = true;
            }
            if (E10 && !F10 && z12) {
                A();
                X();
            } else if (F10 && !E10 && z12) {
                G();
            }
            if (F10 || E10 || !g0() || (!S(e10) && !T(this.f22239v))) {
                H();
            }
        }
    }

    private void f0() {
        Drawable drawable;
        ImageView imageView = this.f22223f;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f22238u == 1) {
                    f10 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                if (this.f22223f.getVisibility() == 0) {
                    Q((C2090a) null, f10);
                }
                this.f22223f.setScaleType(scaleType);
            }
        }
    }

    private boolean g0() {
        if (this.f22237t == 0) {
            return false;
        }
        C2076a.i(this.f22224g);
        return true;
    }

    private boolean h0() {
        if (!this.f22235r) {
            return false;
        }
        C2076a.i(this.f22227j);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f22223f;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            f0();
        }
    }

    private void setImageOutput(C1964E e10) {
        Class cls = this.f22231n;
        if (cls != null && cls.isAssignableFrom(e10.getClass())) {
            try {
                ((Method) C2076a.e(this.f22232o)).invoke(e10, new Object[]{C2076a.e(this.f22233p)});
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void y(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i10 == 0)) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate((float) i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void z(C1964E e10) {
        Class cls = this.f22231n;
        if (cls != null && cls.isAssignableFrom(e10.getClass())) {
            try {
                ((Method) C2076a.e(this.f22232o)).invoke(e10, new Object[]{null});
            } catch (IllegalAccessException | InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public boolean D(KeyEvent keyEvent) {
        if (!h0() || !this.f22227j.U(keyEvent)) {
            return false;
        }
        return true;
    }

    public void I() {
        C2099j jVar = this.f22227j;
        if (jVar != null) {
            jVar.Y();
        }
    }

    public void V() {
        W(U());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (L.f22072a == 34 && (eVar = this.f22222e) != null) {
            eVar.e();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1964E e10 = this.f22234q;
        if (e10 != null && e10.L(16) && this.f22234q.g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean K10 = K(keyEvent.getKeyCode());
        if (K10 && h0() && !this.f22227j.c0()) {
            P(true);
            return true;
        } else if (D(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            P(true);
            return true;
        } else {
            if (K10 && h0()) {
                P(true);
            }
            return false;
        }
    }

    public List<C1966a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f22229l;
        if (frameLayout != null) {
            arrayList.add(new C1966a.C0343a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        C2099j jVar = this.f22227j;
        if (jVar != null) {
            arrayList.add(new C1966a.C0343a(jVar, 1).a());
        }
        return C4770v.z(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C2076a.j(this.f22228k, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f22237t;
    }

    public boolean getControllerAutoShow() {
        return this.f22214A;
    }

    public boolean getControllerHideOnTouch() {
        return this.f22216C;
    }

    public int getControllerShowTimeoutMs() {
        return this.f22243z;
    }

    public Drawable getDefaultArtwork() {
        return this.f22239v;
    }

    public int getImageDisplayMode() {
        return this.f22238u;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f22229l;
    }

    public C1964E getPlayer() {
        return this.f22234q;
    }

    public int getResizeMode() {
        C2076a.i((Object) null);
        throw null;
    }

    public c0 getSubtitleView() {
        return null;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.f22237t != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.f22235r;
    }

    public View getVideoSurfaceView() {
        return this.f22220c;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!h0() || this.f22234q == null) {
            return false;
        }
        P(true);
        return true;
    }

    public boolean performClick() {
        Y();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        boolean z10;
        if (i10 == 0 || this.f22224g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f22237t != i10) {
            this.f22237t = i10;
            e0(false);
        }
    }

    public void setAspectRatioListener(C2090a.C0359a aVar) {
        C2076a.i((Object) null);
        throw null;
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f22214A = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f22215B = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22216C = z10;
        b0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C2099j.d dVar) {
        C2076a.i(this.f22227j);
        this.f22227j.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C2076a.i(this.f22227j);
        this.f22243z = i10;
        if (this.f22227j.c0()) {
            V();
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        if (cVar != null) {
            setControllerVisibilityListener((C2099j.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.f22226i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f22242y = charSequence;
        d0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f22239v != drawable) {
            this.f22239v = drawable;
            e0(false);
        }
    }

    public void setErrorMessageProvider(C1981p pVar) {
        if (pVar != null) {
            d0();
        }
    }

    public void setFullscreenButtonClickListener(d dVar) {
        C2076a.i(this.f22227j);
        this.f22227j.setOnFullScreenModeChangedListener(this.f22218a);
    }

    public void setImageDisplayMode(int i10) {
        boolean z10;
        if (this.f22223f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f22238u != i10) {
            this.f22238u = i10;
            f0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f22241x != z10) {
            this.f22241x = z10;
            e0(false);
        }
    }

    public void setPlayer(C1964E e10) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (e10 == null || e10.M() == Looper.getMainLooper()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.a(z11);
        C1964E e11 = this.f22234q;
        if (e11 != e10) {
            if (e11 != null) {
                e11.F(this.f22218a);
                if (e11.L(27)) {
                    View view = this.f22220c;
                    if (view instanceof TextureView) {
                        e11.U((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        e11.Z((SurfaceView) view);
                    }
                }
                z(e11);
            }
            this.f22234q = e10;
            if (h0()) {
                this.f22227j.setPlayer(e10);
            }
            a0();
            d0();
            e0(true);
            if (e10 != null) {
                if (e10.L(27)) {
                    View view2 = this.f22220c;
                    if (view2 instanceof TextureView) {
                        e10.P((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        e10.I((SurfaceView) view2);
                    }
                    if (!e10.L(30) || e10.m().d(2)) {
                        Z();
                    }
                }
                e10.e0(this.f22218a);
                setImageOutput(e10);
                P(false);
                return;
            }
            I();
        }
    }

    public void setRepeatToggleModes(int i10) {
        C2076a.i(this.f22227j);
        this.f22227j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C2076a.i((Object) null);
        throw null;
    }

    public void setShowBuffering(int i10) {
        if (this.f22240w != i10) {
            this.f22240w = i10;
            a0();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C2076a.i(this.f22227j);
        this.f22227j.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f22219b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(z10 ^ true ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!z10 || this.f22227j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.g(z11);
        if (!z10 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.f22235r != z10) {
            this.f22235r = z10;
            if (h0()) {
                this.f22227j.setPlayer(this.f22234q);
            } else {
                C2099j jVar = this.f22227j;
                if (jVar != null) {
                    jVar.Y();
                    this.f22227j.setPlayer((C1964E) null);
                }
            }
            b0();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f22220c;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(C2099j.m mVar) {
        C2076a.i(this.f22227j);
        C2099j.m mVar2 = this.f22236s;
        if (mVar2 != mVar) {
            if (mVar2 != null) {
                this.f22227j.j0(mVar2);
            }
            this.f22236s = mVar;
            if (mVar != null) {
                this.f22227j.S(mVar);
                setControllerVisibilityListener((c) null);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        boolean z16;
        Method method;
        Object obj;
        boolean z17;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f22218a = new b();
        this.f22230m = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f22219b = null;
            this.f22220c = null;
            this.f22221d = false;
            this.f22222e = null;
            this.f22223f = null;
            this.f22224g = null;
            this.f22225h = null;
            this.f22226i = null;
            this.f22227j = null;
            this.f22228k = null;
            this.f22229l = null;
            this.f22231n = null;
            this.f22232o = null;
            this.f22233p = null;
            ImageView imageView = new ImageView(context2);
            if (L.f22072a >= 23) {
                C(context2, getResources(), imageView);
            } else {
                B(context2, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i16 = X.f22327b;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, b0.f22392a0, i10, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(b0.f22416m0);
                i14 = obtainStyledAttributes.getColor(b0.f22416m0, 0);
                int resourceId = obtainStyledAttributes.getResourceId(b0.f22408i0, i16);
                z12 = obtainStyledAttributes.getBoolean(b0.f22420o0, true);
                i13 = obtainStyledAttributes.getInt(b0.f22394b0, 1);
                i12 = obtainStyledAttributes.getResourceId(b0.f22398d0, 0);
                i11 = obtainStyledAttributes.getInt(b0.f22404g0, 0);
                z11 = obtainStyledAttributes.getBoolean(b0.f22422p0, true);
                obtainStyledAttributes.getInt(b0.f22418n0, 1);
                obtainStyledAttributes.getInt(b0.f22410j0, 0);
                int i17 = obtainStyledAttributes.getInt(b0.f22414l0, 5000);
                boolean z18 = obtainStyledAttributes.getBoolean(b0.f22402f0, true);
                boolean z19 = obtainStyledAttributes.getBoolean(b0.f22396c0, true);
                int i18 = resourceId;
                i15 = obtainStyledAttributes.getInteger(b0.f22412k0, 0);
                boolean z20 = z19;
                this.f22241x = obtainStyledAttributes.getBoolean(b0.f22406h0, this.f22241x);
                boolean z21 = obtainStyledAttributes.getBoolean(b0.f22400e0, true);
                obtainStyledAttributes.recycle();
                z16 = z20;
                boolean z22 = z21;
                i16 = i18;
                z10 = i17;
                z14 = z18;
                z15 = z22;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            z16 = true;
            z15 = true;
            i15 = 0;
            z14 = true;
            z13 = false;
            i14 = 0;
            z12 = true;
            i13 = 1;
            i12 = 0;
            i11 = 0;
            z11 = true;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        android.support.v4.media.session.c.a(findViewById(V.f22306i));
        View findViewById = findViewById(V.f22291N);
        this.f22219b = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i14);
        }
        this.f22220c = null;
        this.f22221d = false;
        this.f22222e = L.f22072a == 34 ? new e() : null;
        this.f22228k = (FrameLayout) findViewById(V.f22298a);
        this.f22229l = (FrameLayout) findViewById(V.f22279B);
        this.f22223f = (ImageView) findViewById(V.f22318u);
        this.f22238u = i11;
        Class<ExoPlayer> cls = ExoPlayer.class;
        Class<ImageOutput> cls2 = ImageOutput.class;
        try {
            ImageOutput imageOutput = ImageOutput.f17717a;
            method = cls.getMethod("setImageOutput", new Class[]{cls2});
            obj = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new D(this));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.f22231n = cls;
        this.f22232o = method;
        this.f22233p = obj;
        ImageView imageView2 = (ImageView) findViewById(V.f22299b);
        this.f22224g = imageView2;
        this.f22237t = (!z12 || i13 == 0 || imageView2 == null) ? 0 : i13;
        if (i12 != 0) {
            this.f22239v = androidx.core.content.c.getDrawable(getContext(), i12);
        }
        android.support.v4.media.session.c.a(findViewById(V.f22294Q));
        View findViewById2 = findViewById(V.f22303f);
        this.f22225h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f22240w = i15;
        TextView textView = (TextView) findViewById(V.f22311n);
        this.f22226i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C2099j jVar = (C2099j) findViewById(V.f22307j);
        View findViewById3 = findViewById(V.f22308k);
        if (jVar != null) {
            this.f22227j = jVar;
            z17 = false;
        } else if (findViewById3 != null) {
            z17 = false;
            C2099j jVar2 = new C2099j(context2, (AttributeSet) null, 0, attributeSet2);
            this.f22227j = jVar2;
            jVar2.setId(V.f22307j);
            jVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(jVar2, indexOfChild);
        } else {
            z17 = false;
            this.f22227j = null;
        }
        C2099j jVar3 = this.f22227j;
        this.f22243z = jVar3 != null ? z10 : z17 ? 1 : 0;
        this.f22216C = z14;
        this.f22214A = z16;
        this.f22215B = z15;
        this.f22235r = (!z11 || jVar3 == null) ? z17 : true;
        if (jVar3 != null) {
            jVar3.Z();
            this.f22227j.S(this.f22218a);
        }
        if (z11) {
            setClickable(true);
        }
        b0();
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        SurfaceSyncGroup f22247a;

        private e() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl a10 = surfaceView.getRootSurfaceControl();
            if (a10 != null) {
                SurfaceSyncGroup a11 = H.a("exo-sync-b-334901521");
                this.f22247a = a11;
                C2076a.g(a11.add(a10, new O()));
                runnable.run();
                boolean unused = a10.applyTransactionOnDraw(I.a());
            }
        }

        public void e() {
            SurfaceSyncGroup surfaceSyncGroup = this.f22247a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f22247a = null;
            }
        }

        public void f(Handler handler, SurfaceView surfaceView, Runnable runnable) {
            handler.post(new N(this, surfaceView, runnable));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void c() {
        }
    }

    /* access modifiers changed from: protected */
    public void Q(C2090a aVar, float f10) {
    }
}
