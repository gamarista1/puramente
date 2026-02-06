package o4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.gms.common.api.a;
import k4.C3661c;
import k4.C3666h;
import lf.C6535s;
import m4.C3772a;
import yf.C6787a;

public abstract class g {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46991a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f46992b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                m4.c[] r0 = m4.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                m4.c r2 = m4.c.UNCHANGED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                m4.c r3 = m4.c.TRANSLUCENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                m4.c r3 = m4.c.OPAQUE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f46991a = r0
                k4.h[] r0 = k4.C3666h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                k4.h r3 = k4.C3666h.FILL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                k4.h r1 = k4.C3666h.FIT     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f46992b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.g.a.<clinit>():void");
        }
    }

    public static final class b extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f46993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f46994b;

        b(C6787a aVar, C6787a aVar2) {
            this.f46993a = aVar;
            this.f46994b = aVar2;
        }

        public void onAnimationEnd(Drawable drawable) {
            C6787a aVar = this.f46994b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationStart(Drawable drawable) {
            C6787a aVar = this.f46993a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class c extends F3.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f46995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f46996b;

        c(C6787a aVar, C6787a aVar2) {
            this.f46995a = aVar;
            this.f46996b = aVar2;
        }

        public void a(Drawable drawable) {
            C6787a aVar = this.f46996b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void b(Drawable drawable) {
            C6787a aVar = this.f46995a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final Animatable2.AnimationCallback b(C6787a aVar, C6787a aVar2) {
        return new b(aVar, aVar2);
    }

    public static final F3.a c(C6787a aVar, C6787a aVar2) {
        return new c(aVar, aVar2);
    }

    public static final PostProcessor d(C3772a aVar) {
        return new f(aVar);
    }

    /* access modifiers changed from: private */
    public static final int e(C3772a aVar, Canvas canvas) {
        return f(aVar.transform(canvas));
    }

    public static final int f(m4.c cVar) {
        int i10 = a.f46991a[cVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return -3;
        }
        if (i10 == 3) {
            return -1;
        }
        throw new C6535s();
    }

    public static final boolean g(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.HARDWARE) {
            return false;
        }
        return true;
    }

    public static final int h(C3661c cVar, C3666h hVar) {
        if (cVar instanceof C3661c.a) {
            return ((C3661c.a) cVar).f45103a;
        }
        int i10 = a.f46992b[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new C6535s();
    }
}
