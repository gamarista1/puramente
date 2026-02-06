package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.a;

/* renamed from: androidx.core.view.o  reason: case insensitive filesystem */
public class C1705o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16104a;

    /* renamed from: b  reason: collision with root package name */
    private final C1707p f16105b;

    /* renamed from: c  reason: collision with root package name */
    private final b f16106c;

    /* renamed from: d  reason: collision with root package name */
    private final a f16107d;

    /* renamed from: e  reason: collision with root package name */
    private VelocityTracker f16108e;

    /* renamed from: f  reason: collision with root package name */
    private float f16109f;

    /* renamed from: g  reason: collision with root package name */
    private int f16110g;

    /* renamed from: h  reason: collision with root package name */
    private int f16111h;

    /* renamed from: i  reason: collision with root package name */
    private int f16112i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f16113j;

    /* renamed from: androidx.core.view.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: androidx.core.view.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C1705o(Context context, C1707p pVar) {
        this(context, pVar, new C1701m(), new C1703n());
    }

    /* access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C1686e0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = C1686e0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f16111h == source && this.f16112i == deviceId && this.f16110g == i10) {
            return false;
        }
        this.f16106c.a(this.f16104a, this.f16113j, motionEvent, i10);
        this.f16111h = source;
        this.f16112i = deviceId;
        this.f16110g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f16108e == null) {
            this.f16108e = VelocityTracker.obtain();
        }
        return this.f16107d.a(this.f16108e, motionEvent, i10);
    }

    /* access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        Y.a(velocityTracker, motionEvent);
        Y.b(velocityTracker, 1000);
        return Y.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean d10 = d(motionEvent, i10);
        if (this.f16113j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f16108e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16108e = null;
                return;
            }
            return;
        }
        float e10 = e(motionEvent, i10) * this.f16105b.b();
        float signum = Math.signum(e10);
        float f10 = 0.0f;
        if (d10 || !(signum == Math.signum(this.f16109f) || signum == 0.0f)) {
            this.f16105b.c();
        }
        float abs = Math.abs(e10);
        int[] iArr = this.f16113j;
        if (abs >= ((float) iArr[0])) {
            int i11 = iArr[1];
            float max = Math.max((float) (-i11), Math.min(e10, (float) i11));
            if (this.f16105b.a(max)) {
                f10 = max;
            }
            this.f16109f = f10;
        }
    }

    C1705o(Context context, C1707p pVar, b bVar, a aVar) {
        this.f16110g = -1;
        this.f16111h = -1;
        this.f16112i = -1;
        this.f16113j = new int[]{a.e.API_PRIORITY_OTHER, 0};
        this.f16104a = context;
        this.f16105b = pVar;
        this.f16106c = bVar;
        this.f16107d = aVar;
    }
}
