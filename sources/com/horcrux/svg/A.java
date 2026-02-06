package com.horcrux.svg;

import R5.i;
import X6.C3096t;
import Y6.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import c7.C3184d;
import c7.C3185e;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.horcrux.svg.events.SvgLoadEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import d6.C3477c;
import i7.C3593b;
import j6.d;
import java.util.concurrent.atomic.AtomicBoolean;
import q8.C3959a;
import q8.c;

class A extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f58686a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f58687b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f58688c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f58689d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f58690e;

    /* renamed from: f  reason: collision with root package name */
    private int f58691f;

    /* renamed from: g  reason: collision with root package name */
    private int f58692g;

    /* renamed from: h  reason: collision with root package name */
    private String f58693h;

    /* renamed from: i  reason: collision with root package name */
    private int f58694i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f58695j = new AtomicBoolean(false);

    class a extends b {
        a() {
        }

        public void e(C3477c cVar) {
            A.this.f58695j.set(false);
            U5.a.L("ReactNative", cVar.d(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        public void g(Bitmap bitmap) {
            A a10 = A.this;
            EventDispatcher c10 = n0.c(a10.mContext, a10.getId());
            int f10 = n0.f(A.this);
            int id2 = A.this.getId();
            A a11 = A.this;
            c10.h(new SvgLoadEvent(f10, id2, a11.mContext, a11.f58690e, (float) bitmap.getWidth(), (float) bitmap.getHeight()));
            A.this.f58695j.set(false);
            SvgView svgView = A.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public A(ReactContext reactContext) {
        super(reactContext);
    }

    private void n(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f58691f == 0 || this.f58692g == 0) {
            this.f58691f = bitmap.getWidth();
            this.f58692g = bitmap.getHeight();
        }
        RectF o10 = o();
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f58691f, (float) this.f58692g);
        o0.a(rectF, o10, this.f58693h, this.f58694i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF o() {
        double relativeOnWidth = relativeOnWidth(this.f58686a);
        double relativeOnHeight = relativeOnHeight(this.f58687b);
        double relativeOnWidth2 = relativeOnWidth(this.f58688c);
        double relativeOnHeight2 = relativeOnHeight(this.f58689d);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = (double) (((float) this.f58691f) * this.mScale);
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = (double) (((float) this.f58692g) * this.mScale);
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void p(C3096t tVar, C3593b bVar) {
        this.f58695j.set(true);
        tVar.k(bVar, this.mContext).e(new a(), i.g());
    }

    private void v(C3096t tVar, C3593b bVar, Canvas canvas, Paint paint, float f10) {
        X5.a aVar;
        C3477c o10 = tVar.o(bVar, this.mContext);
        try {
            aVar = (X5.a) o10.a();
            if (aVar == null) {
                o10.close();
                return;
            }
            C3185e eVar = (C3185e) aVar.I();
            if (!(eVar instanceof C3184d)) {
                X5.a.E(aVar);
                o10.close();
                return;
            }
            Bitmap h12 = ((C3184d) eVar).h1();
            if (h12 == null) {
                X5.a.E(aVar);
                o10.close();
                return;
            }
            n(canvas, paint, h12, f10);
            X5.a.E(aVar);
            o10.close();
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        } catch (Throwable th2) {
            o10.close();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        if (!this.f58695j.get()) {
            C3096t a10 = d.a();
            C3593b a11 = C3593b.a(new C3959a(this.mContext, this.f58690e).f());
            if (a10.u(a11)) {
                v(a10, a11, canvas, paint, f10 * this.mOpacity);
                return;
            }
            p(a10, a11);
        }
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(o(), Path.Direction.CW);
        return this.mPath;
    }

    public void q(Dynamic dynamic) {
        this.f58689d = SVGLength.b(dynamic);
        invalidate();
    }

    public void r(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f58690e = string;
            if (string != null && !string.isEmpty()) {
                if (!readableMap.hasKey(Snapshot.WIDTH) || !readableMap.hasKey(Snapshot.HEIGHT)) {
                    this.f58691f = 0;
                    this.f58692g = 0;
                } else {
                    this.f58691f = readableMap.getInt(Snapshot.WIDTH);
                    this.f58692g = readableMap.getInt(Snapshot.HEIGHT);
                }
                if (Uri.parse(this.f58690e).getScheme() == null) {
                    c.d().g(this.mContext, this.f58690e);
                }
            }
        }
    }

    public void s(Dynamic dynamic) {
        this.f58688c = SVGLength.b(dynamic);
        invalidate();
    }

    public void setAlign(String str) {
        this.f58693h = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f58694i = i10;
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f58686a = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(Dynamic dynamic) {
        this.f58687b = SVGLength.b(dynamic);
        invalidate();
    }
}
