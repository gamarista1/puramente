package c4;

import Ef.m;
import a4.C3116i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import k4.C3666h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m4.C3772a;
import m4.c;
import o4.g;

/* renamed from: c4.c  reason: case insensitive filesystem */
public final class C3167c extends Drawable implements Animatable {

    /* renamed from: w  reason: collision with root package name */
    public static final a f36391w = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Movie f36392a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f36393b;

    /* renamed from: c  reason: collision with root package name */
    private final C3666h f36394c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f36395d = new Paint(3);

    /* renamed from: e  reason: collision with root package name */
    private final List f36396e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f36397f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final Rect f36398g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private Canvas f36399h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap f36400i;

    /* renamed from: j  reason: collision with root package name */
    private float f36401j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f36402k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f36403l;

    /* renamed from: m  reason: collision with root package name */
    private float f36404m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36405n;

    /* renamed from: o  reason: collision with root package name */
    private long f36406o;

    /* renamed from: p  reason: collision with root package name */
    private long f36407p;

    /* renamed from: q  reason: collision with root package name */
    private int f36408q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f36409r;

    /* renamed from: s  reason: collision with root package name */
    private C3772a f36410s;

    /* renamed from: t  reason: collision with root package name */
    private Picture f36411t;

    /* renamed from: u  reason: collision with root package name */
    private c f36412u = c.UNCHANGED;

    /* renamed from: v  reason: collision with root package name */
    private boolean f36413v;

    /* renamed from: c4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3167c(Movie movie, Bitmap.Config config, C3666h hVar) {
        this.f36392a = movie;
        this.f36393b = config;
        this.f36394c = hVar;
        if (g.g(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    /* JADX INFO: finally extract failed */
    private final void a(Canvas canvas) {
        Canvas canvas2 = this.f36399h;
        Bitmap bitmap = this.f36400i;
        if (canvas2 != null && bitmap != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int save = canvas2.save();
            try {
                float f10 = this.f36401j;
                canvas2.scale(f10, f10);
                this.f36392a.draw(canvas2, 0.0f, 0.0f, this.f36395d);
                Picture picture = this.f36411t;
                if (picture != null) {
                    picture.draw(canvas2);
                }
                canvas2.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.translate(this.f36403l, this.f36404m);
                    float f11 = this.f36402k;
                    canvas.scale(f11, f11);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f36395d);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th2) {
                canvas2.restoreToCount(save);
                throw th2;
            }
        }
    }

    private final Rect b(Canvas canvas) {
        Rect rect = this.f36398g;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void f(Rect rect) {
        if (!C6496s.c(this.f36397f, rect)) {
            this.f36397f.set(rect);
            int width = rect.width();
            int height = rect.height();
            int width2 = this.f36392a.width();
            int height2 = this.f36392a.height();
            if (width2 > 0 && height2 > 0) {
                double c10 = C3116i.c(width2, height2, width, height, this.f36394c);
                if (!this.f36413v) {
                    c10 = m.f(c10, 1.0d);
                }
                float f10 = (float) c10;
                this.f36401j = f10;
                int i10 = (int) (((float) width2) * f10);
                int i11 = (int) (f10 * ((float) height2));
                Bitmap createBitmap = Bitmap.createBitmap(i10, i11, this.f36393b);
                Bitmap bitmap = this.f36400i;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f36400i = createBitmap;
                this.f36399h = new Canvas(createBitmap);
                if (this.f36413v) {
                    this.f36402k = 1.0f;
                    this.f36403l = 0.0f;
                    this.f36404m = 0.0f;
                    return;
                }
                float c11 = (float) C3116i.c(i10, i11, width, height, this.f36394c);
                this.f36402k = c11;
                float f11 = ((float) width) - (((float) i10) * c11);
                float f12 = (float) 2;
                this.f36403l = ((float) rect.left) + (f11 / f12);
                this.f36404m = ((float) rect.top) + ((((float) height) - (c11 * ((float) i11))) / f12);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean g() {
        /*
            r7 = this;
            android.graphics.Movie r0 = r7.f36392a
            int r0 = r0.duration()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x002f
        L_0x000b:
            boolean r2 = r7.f36405n
            if (r2 == 0) goto L_0x0015
            long r2 = android.os.SystemClock.uptimeMillis()
            r7.f36407p = r2
        L_0x0015:
            long r2 = r7.f36407p
            long r4 = r7.f36406o
            long r2 = r2 - r4
            int r2 = (int) r2
            int r3 = r2 / r0
            r7.f36409r = r3
            int r4 = r7.f36408q
            r5 = -1
            if (r4 == r5) goto L_0x0026
            if (r3 > r4) goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            int r3 = r3 * r0
            int r0 = r2 - r3
        L_0x002c:
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x002f:
            android.graphics.Movie r2 = r7.f36392a
            r2.setTime(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C3167c.g():boolean");
    }

    public void c(F3.a aVar) {
        this.f36396e.add(aVar);
    }

    public final void d(C3772a aVar) {
        this.f36410s = aVar;
        if (aVar == null || this.f36392a.width() <= 0 || this.f36392a.height() <= 0) {
            this.f36411t = null;
            this.f36412u = c.UNCHANGED;
            this.f36413v = false;
        } else {
            Picture picture = new Picture();
            this.f36412u = aVar.transform(picture.beginRecording(this.f36392a.width(), this.f36392a.height()));
            picture.endRecording();
            this.f36411t = picture;
            this.f36413v = true;
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        boolean g10 = g();
        if (this.f36413v) {
            f(b(canvas));
            int save = canvas.save();
            try {
                float f10 = ((float) 1) / this.f36401j;
                canvas.scale(f10, f10);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            f(getBounds());
            a(canvas);
        }
        if (!this.f36405n || !g10) {
            stop();
        } else {
            invalidateSelf();
        }
    }

    public final void e(int i10) {
        if (i10 >= -1) {
            this.f36408q = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i10).toString());
    }

    public int getIntrinsicHeight() {
        return this.f36392a.height();
    }

    public int getIntrinsicWidth() {
        return this.f36392a.width();
    }

    public int getOpacity() {
        c cVar;
        if (this.f36395d.getAlpha() != 255 || ((cVar = this.f36412u) != c.OPAQUE && (cVar != c.UNCHANGED || !this.f36392a.isOpaque()))) {
            return -3;
        }
        return -1;
    }

    public boolean isRunning() {
        return this.f36405n;
    }

    public void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
        }
        this.f36395d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f36395d.setColorFilter(colorFilter);
    }

    public void start() {
        if (!this.f36405n) {
            this.f36405n = true;
            this.f36409r = 0;
            this.f36406o = SystemClock.uptimeMillis();
            List list = this.f36396e;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F3.a) list.get(i10)).b(this);
            }
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f36405n) {
            this.f36405n = false;
            List list = this.f36396e;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F3.a) list.get(i10)).a(this);
            }
        }
    }
}
