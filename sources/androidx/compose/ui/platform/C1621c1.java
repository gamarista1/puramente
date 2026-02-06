package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import r0.C2446G;
import r0.C2520p0;
import r0.C2523q0;
import r0.S1;
import r0.b2;
import x.C2877p;
import yf.C6798l;

/* renamed from: androidx.compose.ui.platform.c1  reason: case insensitive filesystem */
public final class C1621c1 implements C1653n0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f13696a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f13697b = C2877p.a("Compose");

    /* renamed from: c  reason: collision with root package name */
    private int f13698c = a.f13386a.a();

    public C1621c1(r rVar) {
        this.f13696a = rVar;
    }

    public boolean A(boolean z10) {
        return this.f13697b.setHasOverlappingRendering(z10);
    }

    public void B(Matrix matrix) {
        this.f13697b.getMatrix(matrix);
    }

    public void C(int i10) {
        boolean unused = this.f13697b.offsetLeftAndRight(i10);
    }

    public int D() {
        return this.f13697b.getBottom();
    }

    public void E(float f10) {
        boolean unused = this.f13697b.setPivotX(f10);
    }

    public void F(float f10) {
        boolean unused = this.f13697b.setPivotY(f10);
    }

    public void G(Outline outline) {
        boolean unused = this.f13697b.setOutline(outline);
    }

    public void H(C2523q0 q0Var, S1 s12, C6798l lVar) {
        RecordingCanvas a10 = this.f13697b.beginRecording();
        Canvas a11 = q0Var.a().a();
        q0Var.a().z(a10);
        C2446G a12 = q0Var.a();
        if (s12 != null) {
            a12.q();
            C2520p0.p(a12, s12, 0, 2, (Object) null);
        }
        lVar.invoke(a12);
        if (s12 != null) {
            a12.h();
        }
        q0Var.a().z(a11);
        this.f13697b.endRecording();
    }

    public void I(int i10) {
        boolean unused = this.f13697b.setAmbientShadowColor(i10);
    }

    public void J(boolean z10) {
        boolean unused = this.f13697b.setClipToOutline(z10);
    }

    public void K(int i10) {
        boolean unused = this.f13697b.setSpotShadowColor(i10);
    }

    public float L() {
        return this.f13697b.getElevation();
    }

    public float a() {
        return this.f13697b.getAlpha();
    }

    public int b() {
        return this.f13697b.getLeft();
    }

    public void c(float f10) {
        boolean unused = this.f13697b.setAlpha(f10);
    }

    public int d() {
        return this.f13697b.getHeight();
    }

    public int e() {
        return this.f13697b.getWidth();
    }

    public void f(float f10) {
        boolean unused = this.f13697b.setTranslationY(f10);
    }

    public void g(b2 b2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C1624d1.f13709a.a(this.f13697b, b2Var);
        }
    }

    public void h(float f10) {
        boolean unused = this.f13697b.setScaleX(f10);
    }

    public void i(float f10) {
        boolean unused = this.f13697b.setCameraDistance(f10);
    }

    public void j(float f10) {
        boolean unused = this.f13697b.setRotationX(f10);
    }

    public void k(float f10) {
        boolean unused = this.f13697b.setRotationY(f10);
    }

    public void l(float f10) {
        boolean unused = this.f13697b.setRotationZ(f10);
    }

    public void m(float f10) {
        boolean unused = this.f13697b.setScaleY(f10);
    }

    public void n(float f10) {
        boolean unused = this.f13697b.setTranslationX(f10);
    }

    public int o() {
        return this.f13697b.getRight();
    }

    public void p() {
        this.f13697b.discardDisplayList();
    }

    public void q(int i10) {
        RenderNode renderNode = this.f13697b;
        a.C0255a aVar = a.f13386a;
        if (a.e(i10, aVar.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, (Paint) null);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i10, aVar.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
        this.f13698c = i10;
    }

    public boolean r() {
        return this.f13697b.getClipToBounds();
    }

    public boolean s() {
        return this.f13697b.hasDisplayList();
    }

    public void t(Canvas canvas) {
        canvas.drawRenderNode(this.f13697b);
    }

    public void u(boolean z10) {
        boolean unused = this.f13697b.setClipToBounds(z10);
    }

    public boolean v(int i10, int i11, int i12, int i13) {
        return this.f13697b.setPosition(i10, i11, i12, i13);
    }

    public void w(float f10) {
        boolean unused = this.f13697b.setElevation(f10);
    }

    public void x(int i10) {
        boolean unused = this.f13697b.offsetTopAndBottom(i10);
    }

    public int y() {
        return this.f13697b.getTop();
    }

    public boolean z() {
        return this.f13697b.getClipToOutline();
    }
}
