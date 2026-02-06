package T0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j extends ReplacementSpan {

    /* renamed from: k  reason: collision with root package name */
    public static final a f5928k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f5929l = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float f5930a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5931b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5932c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5933d;

    /* renamed from: e  reason: collision with root package name */
    private final float f5934e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5935f;

    /* renamed from: g  reason: collision with root package name */
    private Paint.FontMetricsInt f5936g;

    /* renamed from: h  reason: collision with root package name */
    private int f5937h;

    /* renamed from: i  reason: collision with root package name */
    private int f5938i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5939j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f5936g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C6496s.v("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f5939j) {
            return this.f5938i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f5935f;
    }

    public final int d() {
        if (this.f5939j) {
            return this.f5937h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int i12;
        this.f5939j = true;
        float textSize = paint.getTextSize();
        this.f5936g = paint.getFontMetricsInt();
        if (a().descent > a().ascent) {
            int i13 = this.f5931b;
            if (i13 == 0) {
                f10 = this.f5930a * this.f5934e;
            } else if (i13 == 1) {
                f10 = this.f5930a * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f5937h = k.a(f10);
            int i14 = this.f5933d;
            if (i14 == 0) {
                i12 = k.a(this.f5932c * this.f5934e);
            } else if (i14 == 1) {
                i12 = k.a(this.f5932c * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f5938i = i12;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f5935f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b10 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
