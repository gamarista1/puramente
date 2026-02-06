package R0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.C6496s;

public final class k0 extends Canvas {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f5561a;

    public final void a(Canvas canvas) {
        this.f5561a = canvas;
    }

    public boolean clipOutPath(Path path) {
        C1361s sVar = C1361s.f5584a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return sVar.a(canvas, path);
    }

    public boolean clipOutRect(RectF rectF) {
        C1361s sVar = C1361s.f5584a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return sVar.e(canvas, rectF);
    }

    public boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    public boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    public void concat(Matrix matrix) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    public void disableZ() {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.a(canvas);
    }

    public void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i10, i11, i12, i13);
    }

    public void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f10, f11, z10, paint);
    }

    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f10, f11, paint);
    }

    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    public void drawColor(int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10);
    }

    public void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.e(canvas, rectF, f10, f11, rectF2, f12, f13, paint);
    }

    public void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        G g10 = G.f5498a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        g10.a(canvas, iArr, i10, fArr, i11, i12, font, paint);
    }

    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f10, f11, f12, f13, paint);
    }

    public void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i10, i11, paint);
    }

    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        G g10 = G.f5498a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        g10.b(canvas, ninePatch, rect, paint);
    }

    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(Picture picture) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f10, f11, paint);
    }

    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i10, i11, paint);
    }

    public void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i10, i11, fArr, paint);
    }

    public void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i10, i11, i12);
    }

    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    public void drawRenderNode(RenderNode renderNode) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.g(canvas, renderNode);
    }

    public void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f10, f11, paint);
    }

    public void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i10, i11, f10, f11, paint);
    }

    public void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    public void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C1356m mVar = C1356m.f5581a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        mVar.b(canvas, cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    public void enableZ() {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.i(canvas);
    }

    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), a.e.API_PRIORITY_OTHER);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i10);
    }

    public void rotate(float f10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f10);
    }

    public int save() {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    public int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i10);
    }

    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10, i11);
    }

    public void scale(float f10, float f11) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f10, f11);
    }

    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public void setDensity(int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i10);
    }

    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f10, float f11) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f10, f11);
    }

    public void translate(float f10, float f11) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f10, f11);
    }

    public boolean clipOutRect(Rect rect) {
        C1361s sVar = C1361s.f5584a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return sVar.d(canvas, rect);
    }

    public boolean clipPath(Path path) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    public boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    public void drawColor(long j10) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.c(canvas, j10);
    }

    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f10, f11, f12, f13, paint);
    }

    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        G g10 = G.f5498a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        g10.c(canvas, ninePatch, rectF, paint);
    }

    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    public void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f10, f11, paint);
    }

    public void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f10, f11, paint);
    }

    public boolean quickReject(RectF rectF) {
        C c10 = C.f5497a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return c10.c(canvas, rectF);
    }

    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i10);
    }

    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        C1361s sVar = C1361s.f5584a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return sVar.b(canvas, f10, f11, f12, f13);
    }

    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i10, mode);
    }

    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    public void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i10, i11, f10, f11, paint);
    }

    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
    }

    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        C1361s sVar = C1361s.f5584a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return sVar.c(canvas, i10, i11, i12, i13);
    }

    public boolean clipRect(Rect rect) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    public void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    public void drawColor(int i10, BlendMode blendMode) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.b(canvas, i10, blendMode);
    }

    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i10, i11, f10, f11, paint);
    }

    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C1356m mVar = C1356m.f5581a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        mVar.a(canvas, charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public boolean quickReject(Path path) {
        C c10 = C.f5497a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return c10.b(canvas, path);
    }

    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f10, f11, f12, f13, paint);
    }

    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13, op);
    }

    public void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    public void drawColor(long j10, BlendMode blendMode) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.d(canvas, j10, blendMode);
    }

    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f10, f11, f12, f13, edgeType);
    }

    public boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f10, f11, f12, f13);
    }

    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public boolean quickReject(float f10, float f11, float f12, float f13) {
        C c10 = C.f5497a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return c10.a(canvas, f10, f11, f12, f13);
    }

    public boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i10, i11, i12, i13);
    }

    public void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C1367y yVar = C1367y.f5585a;
        Canvas canvas = this.f5561a;
        if (canvas == null) {
            C6496s.v("nativeCanvas");
            canvas = null;
        }
        yVar.h(canvas, measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
