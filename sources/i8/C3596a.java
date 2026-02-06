package i8;

import C7.d;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.r;
import java.util.Map;

/* renamed from: i8.a  reason: case insensitive filesystem */
abstract class C3596a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map f44299e = d.g(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: a  reason: collision with root package name */
    private Interpolator f44300a;

    /* renamed from: b  reason: collision with root package name */
    private int f44301b;

    /* renamed from: c  reason: collision with root package name */
    protected b f44302c;

    /* renamed from: d  reason: collision with root package name */
    protected int f44303d;

    C3596a() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.animation.Interpolator c(i8.d r2, com.facebook.react.bridge.ReadableMap r3) {
        /*
            i8.d r0 = i8.d.SPRING
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            i8.n r0 = new i8.n
            float r3 = i8.n.a(r3)
            r0.<init>(r3)
            goto L_0x001b
        L_0x0012:
            java.util.Map r3 = f44299e
            java.lang.Object r3 = r3.get(r2)
            r0 = r3
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Missing interpolator for type : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.C3596a.c(i8.d, com.facebook.react.bridge.ReadableMap):android.view.animation.Interpolator");
    }

    public final Animation a(View view, int i10, int i11, int i12, int i13) {
        if (!e()) {
            return null;
        }
        Animation b10 = b(view, i10, i11, i12, i13);
        if (b10 != null) {
            b10.setDuration((long) this.f44303d);
            b10.setStartOffset((long) this.f44301b);
            b10.setInterpolator(this.f44300a);
        }
        return b10;
    }

    /* access modifiers changed from: package-private */
    public abstract Animation b(View view, int i10, int i11, int i12, int i13);

    public void d(ReadableMap readableMap, int i10) {
        b bVar;
        int i11;
        if (readableMap.hasKey("property")) {
            bVar = b.b(readableMap.getString("property"));
        } else {
            bVar = null;
        }
        this.f44302c = bVar;
        if (readableMap.hasKey("duration")) {
            i10 = readableMap.getInt("duration");
        }
        this.f44303d = i10;
        if (readableMap.hasKey("delay")) {
            i11 = readableMap.getInt("delay");
        } else {
            i11 = 0;
        }
        this.f44301b = i11;
        if (readableMap.hasKey("type")) {
            this.f44300a = c(d.b(readableMap.getString("type")), readableMap);
            if (!e()) {
                throw new r("Invalid layout animation : " + readableMap);
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean e();

    public void f() {
        this.f44302c = null;
        this.f44303d = 0;
        this.f44301b = 0;
        this.f44300a = null;
    }
}
