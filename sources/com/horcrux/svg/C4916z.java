package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.z  reason: case insensitive filesystem */
class C4916z extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    ReadableMap f59105a;

    /* renamed from: b  reason: collision with root package name */
    private C4914x f59106b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f59107c;

    /* renamed from: d  reason: collision with root package name */
    private Canvas f59108d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f59109e = new Paint(1);

    public C4916z(ReactContext reactContext) {
        super(reactContext);
    }

    private static Object s(Object obj) {
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        v(canvas);
        clip(canvas, paint);
        l(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    /* access modifiers changed from: package-private */
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof E) && (hitTest = virtualView.hitTest(fArr2)) != -1) {
                        if ((virtualView = (VirtualView) childAt).isResponsible() || hitTest != childAt.getId()) {
                            return hitTest;
                        }
                        return getId();
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void l(Canvas canvas, Paint paint, float f10) {
        r();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f59107c;
            if (bitmap == null) {
                this.f59107c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f59108d = new Canvas(this.f59107c);
            } else {
                bitmap.recycle();
                Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f59107c = createBitmap;
                this.f59108d.setBitmap(createBitmap);
            }
            this.f59108d.save();
            this.f59108d.setMatrix(canvas.getMatrix());
        } else {
            this.f59108d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f59108d, this.mCTM);
                        virtualView.render(this.f59108d, paint, f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f59108d, saveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<F> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f59108d.restore();
            int save = canvas.save();
            canvas.setMatrix((Matrix) null);
            this.f59109e.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.f59107c, 0.0f, 0.0f, this.f59109e);
            canvas.restoreToCount(save);
        }
        setClientRect(rectF);
        q();
    }

    /* access modifiers changed from: package-private */
    public void m(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    /* access modifiers changed from: package-private */
    public C4914x n() {
        return this.f59106b;
    }

    /* access modifiers changed from: package-private */
    public Path o(Canvas canvas, Paint paint, Region.Op op) {
        Path path;
        Path path2 = new Path();
        Path.Op valueOf = Path.Op.valueOf(op.name());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                if (virtualView instanceof C4916z) {
                    path = ((C4916z) virtualView).o(canvas, paint, op);
                } else {
                    path = virtualView.getPath(canvas, paint);
                }
                path.transform(matrix);
                path2.op(path, valueOf);
            }
        }
        return path2;
    }

    /* access modifiers changed from: package-private */
    public C4914x p() {
        return ((C4916z) s(getTextRoot())).n();
    }

    /* access modifiers changed from: package-private */
    public void q() {
        p().n();
    }

    /* access modifiers changed from: package-private */
    public void r() {
        p().o(this, this.f59105a);
    }

    /* access modifiers changed from: package-private */
    public void resetProperties() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    public void t(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f59105a = dynamic.asMap();
        } else {
            this.f59105a = null;
        }
        invalidate();
    }

    public void u(ReadableMap readableMap) {
        this.f59105a = readableMap;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void v(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f59106b = new C4914x(this.mScale, rectF.width(), rectF.height());
    }
}
