package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2446G;
import r0.C2520p0;
import r0.C2523q0;
import r0.S1;
import r0.b2;
import yf.C6798l;

public final class P0 implements C1653n0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f13623i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f13624j = 8;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f13625k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f13626l = true;

    /* renamed from: a  reason: collision with root package name */
    private final r f13627a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f13628b;

    /* renamed from: c  reason: collision with root package name */
    private int f13629c = androidx.compose.ui.graphics.a.f13386a.a();

    /* renamed from: d  reason: collision with root package name */
    private int f13630d;

    /* renamed from: e  reason: collision with root package name */
    private int f13631e;

    /* renamed from: f  reason: collision with root package name */
    private int f13632f;

    /* renamed from: g  reason: collision with root package name */
    private int f13633g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13634h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public P0(r rVar) {
        this.f13627a = rVar;
        RenderNode create = RenderNode.create("Compose", rVar);
        this.f13628b = create;
        if (f13626l) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            R(create);
            M();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f13626l = false;
        }
        if (f13625k) {
            throw new NoClassDefFoundError();
        }
    }

    private final void M() {
        C1630f1.f13740a.a(this.f13628b);
    }

    private final void R(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1633g1 g1Var = C1633g1.f13743a;
            g1Var.c(renderNode, g1Var.a(renderNode));
            g1Var.d(renderNode, g1Var.b(renderNode));
        }
    }

    public boolean A(boolean z10) {
        return this.f13628b.setHasOverlappingRendering(z10);
    }

    public void B(Matrix matrix) {
        this.f13628b.getMatrix(matrix);
    }

    public void C(int i10) {
        O(b() + i10);
        P(o() + i10);
        this.f13628b.offsetLeftAndRight(i10);
    }

    public int D() {
        return this.f13633g;
    }

    public void E(float f10) {
        this.f13628b.setPivotX(f10);
    }

    public void F(float f10) {
        this.f13628b.setPivotY(f10);
    }

    public void G(Outline outline) {
        this.f13628b.setOutline(outline);
    }

    public void H(C2523q0 q0Var, S1 s12, C6798l lVar) {
        Canvas start = this.f13628b.start(e(), d());
        Canvas a10 = q0Var.a().a();
        q0Var.a().z(start);
        C2446G a11 = q0Var.a();
        if (s12 != null) {
            a11.q();
            C2520p0.p(a11, s12, 0, 2, (Object) null);
        }
        lVar.invoke(a11);
        if (s12 != null) {
            a11.h();
        }
        q0Var.a().z(a10);
        this.f13628b.end(start);
    }

    public void I(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1633g1.f13743a.c(this.f13628b, i10);
        }
    }

    public void J(boolean z10) {
        this.f13628b.setClipToOutline(z10);
    }

    public void K(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1633g1.f13743a.d(this.f13628b, i10);
        }
    }

    public float L() {
        return this.f13628b.getElevation();
    }

    public void N(int i10) {
        this.f13633g = i10;
    }

    public void O(int i10) {
        this.f13630d = i10;
    }

    public void P(int i10) {
        this.f13632f = i10;
    }

    public void Q(int i10) {
        this.f13631e = i10;
    }

    public float a() {
        return this.f13628b.getAlpha();
    }

    public int b() {
        return this.f13630d;
    }

    public void c(float f10) {
        this.f13628b.setAlpha(f10);
    }

    public int d() {
        return D() - y();
    }

    public int e() {
        return o() - b();
    }

    public void f(float f10) {
        this.f13628b.setTranslationY(f10);
    }

    public void h(float f10) {
        this.f13628b.setScaleX(f10);
    }

    public void i(float f10) {
        this.f13628b.setCameraDistance(-f10);
    }

    public void j(float f10) {
        this.f13628b.setRotationX(f10);
    }

    public void k(float f10) {
        this.f13628b.setRotationY(f10);
    }

    public void l(float f10) {
        this.f13628b.setRotation(f10);
    }

    public void m(float f10) {
        this.f13628b.setScaleY(f10);
    }

    public void n(float f10) {
        this.f13628b.setTranslationX(f10);
    }

    public int o() {
        return this.f13632f;
    }

    public void p() {
        M();
    }

    public void q(int i10) {
        a.C0255a aVar = androidx.compose.ui.graphics.a.f13386a;
        if (androidx.compose.ui.graphics.a.e(i10, aVar.c())) {
            this.f13628b.setLayerType(2);
            this.f13628b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, aVar.b())) {
            this.f13628b.setLayerType(0);
            this.f13628b.setHasOverlappingRendering(false);
        } else {
            this.f13628b.setLayerType(0);
            this.f13628b.setHasOverlappingRendering(true);
        }
        this.f13629c = i10;
    }

    public boolean r() {
        return this.f13634h;
    }

    public boolean s() {
        return this.f13628b.isValid();
    }

    public void t(Canvas canvas) {
        C6496s.f(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f13628b);
    }

    public void u(boolean z10) {
        this.f13634h = z10;
        this.f13628b.setClipToBounds(z10);
    }

    public boolean v(int i10, int i11, int i12, int i13) {
        O(i10);
        Q(i11);
        P(i12);
        N(i13);
        return this.f13628b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public void w(float f10) {
        this.f13628b.setElevation(f10);
    }

    public void x(int i10) {
        Q(y() + i10);
        N(D() + i10);
        this.f13628b.offsetTopAndBottom(i10);
    }

    public int y() {
        return this.f13631e;
    }

    public boolean z() {
        return this.f13628b.getClipToOutline();
    }

    public void g(b2 b2Var) {
    }
}
