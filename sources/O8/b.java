package o8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class b extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f47401a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f47402b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f47403c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f47404d;

    /* renamed from: e  reason: collision with root package name */
    private List f47405e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        C6496s.h(context, "context");
        Paint paint = new Paint();
        this.f47401a = paint;
        Paint paint2 = new Paint();
        this.f47404d = paint2;
        this.f47405e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* access modifiers changed from: private */
    public static final void c(b bVar, int i10) {
        bVar.f47402b.remove(Integer.valueOf(i10));
        bVar.f47403c.remove(Integer.valueOf(i10));
        bVar.invalidate();
    }

    public final void b() {
        this.f47405e.clear();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        C6496s.h(canvas, "canvas");
        super.onDraw(canvas);
        for (Object next : this.f47402b.values()) {
            C6496s.g(next, "next(...)");
            c cVar = (c) next;
            this.f47401a.setColor(cVar.a());
            canvas.drawRect(cVar.c(), this.f47401a);
            int b10 = cVar.b();
            C3910a aVar = new C3910a(this, b10);
            if (!this.f47403c.containsKey(Integer.valueOf(b10))) {
                this.f47403c.put(Integer.valueOf(b10), aVar);
                UiThreadUtil.runOnUiThread(aVar, 2000);
            }
        }
        for (RectF drawRect : this.f47405e) {
            canvas.drawRect(drawRect, this.f47404d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> list) {
        C6496s.h(list, "elementsRectangles");
        this.f47405e = list;
        invalidate();
    }

    public final void setTraceUpdates(List<c> list) {
        C6496s.h(list, "traceUpdates");
        for (c next : list) {
            int b10 = next.b();
            if (this.f47403c.containsKey(Integer.valueOf(b10))) {
                UiThreadUtil.removeOnUiThread((Runnable) this.f47403c.get(Integer.valueOf(b10)));
                this.f47403c.remove(Integer.valueOf(b10));
            }
            this.f47402b.put(Integer.valueOf(b10), next);
        }
        invalidate();
    }
}
