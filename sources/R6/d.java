package R6;

import P6.b;
import P6.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final P6.a f33724a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33725b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f33726c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33727d;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                R6.d$c[] r0 = R6.d.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33728a = r0
                R6.d$c r1 = R6.d.c.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33728a     // Catch:{ NoSuchFieldError -> 0x001d }
                R6.d$c r1 = R6.d.c.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33728a     // Catch:{ NoSuchFieldError -> 0x0028 }
                R6.d$c r1 = R6.d.c.ABORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33728a     // Catch:{ NoSuchFieldError -> 0x0033 }
                R6.d$c r1 = R6.d.c.SKIP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: R6.d.a.<clinit>():void");
        }
    }

    public interface b {
        void a(int i10, Bitmap bitmap);

        X5.a b(int i10);
    }

    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(P6.a aVar, boolean z10, b bVar) {
        this.f33724a = aVar;
        this.f33725b = bVar;
        this.f33727d = z10;
        Paint paint = new Paint();
        this.f33726c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, P6.b bVar) {
        int i10 = bVar.f33488b;
        int i11 = bVar.f33489c;
        canvas.drawRect((float) i10, (float) i11, (float) (i10 + bVar.f33490d), (float) (i11 + bVar.f33491e), this.f33726c);
    }

    private c b(int i10) {
        P6.b c10 = this.f33724a.c(i10);
        b.C0547b bVar = c10.f33493g;
        if (bVar == b.C0547b.DISPOSE_DO_NOT) {
            return c.REQUIRED;
        }
        if (bVar == b.C0547b.DISPOSE_TO_BACKGROUND) {
            if (c(c10)) {
                return c.NOT_REQUIRED;
            }
            return c.REQUIRED;
        } else if (bVar == b.C0547b.DISPOSE_TO_PREVIOUS) {
            return c.SKIP;
        } else {
            return c.ABORT;
        }
    }

    private boolean c(P6.b bVar) {
        if (bVar.f33488b == 0 && bVar.f33489c == 0 && bVar.f33490d == this.f33724a.l() && bVar.f33491e == this.f33724a.j()) {
            return true;
        }
        return false;
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        P6.b c10 = this.f33724a.c(i10);
        P6.b c11 = this.f33724a.c(i10 - 1);
        if (c10.f33492f == b.a.NO_BLEND && c(c10)) {
            return true;
        }
        if (c11.f33493g != b.C0547b.DISPOSE_TO_BACKGROUND || !c(c11)) {
            return false;
        }
        return true;
    }

    private void e(Bitmap bitmap) {
        e m10 = this.f33724a.m();
        if (m10 != null) {
            m10.c();
        }
    }

    private int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f33728a[b(i10).ordinal()];
            if (i11 == 1) {
                P6.b c10 = this.f33724a.c(i10);
                X5.a b10 = this.f33725b.b(i10);
                if (b10 != null) {
                    try {
                        canvas.drawBitmap((Bitmap) b10.I(), 0.0f, 0.0f, (Paint) null);
                        if (c10.f33493g == b.C0547b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, c10);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f33727d) {
                            b10.close();
                        }
                    }
                } else if (d(i10)) {
                    return i10;
                }
            } else if (i11 == 2) {
                return i10 + 1;
            } else {
                if (i11 == 3) {
                    return i10;
                }
            }
            i10--;
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f33724a.k(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        int i11;
        if (this.f33727d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!d(i10)) {
            i11 = f(i10 - 1, canvas);
        } else {
            i11 = i10;
        }
        while (i11 < i10) {
            P6.b c10 = this.f33724a.c(i11);
            b.C0547b bVar = c10.f33493g;
            if (bVar != b.C0547b.DISPOSE_TO_PREVIOUS) {
                if (c10.f33492f == b.a.NO_BLEND) {
                    a(canvas, c10);
                }
                this.f33724a.g(i11, canvas);
                this.f33725b.a(i11, bitmap);
                if (bVar == b.C0547b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, c10);
                }
            }
            i11++;
        }
        P6.b c11 = this.f33724a.c(i10);
        if (c11.f33492f == b.a.NO_BLEND) {
            a(canvas, c11);
        }
        this.f33724a.g(i10, canvas);
        e(bitmap);
    }
}
