package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final b f15767a;

    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f15768e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f15769f;

        /* renamed from: a  reason: collision with root package name */
        int f15770a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f15771b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f15772c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f15773d = new C0281a();

        /* renamed from: androidx.core.app.i$a$a  reason: collision with other inner class name */
        class C0281a implements Window.OnFrameMetricsAvailableListener {
            C0281a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f15770a & 1) != 0) {
                    aVar.e(aVar.f15771b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f15770a & 2) != 0) {
                    aVar2.e(aVar2.f15771b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f15770a & 4) != 0) {
                    aVar3.e(aVar3.f15771b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f15770a & 8) != 0) {
                    aVar4.e(aVar4.f15771b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f15770a & 16) != 0) {
                    aVar5.e(aVar5.f15771b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f15770a & 64) != 0) {
                    aVar6.e(aVar6.f15771b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f15770a & 32) != 0) {
                    aVar7.e(aVar7.f15771b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f15770a & 128) != 0) {
                    aVar8.e(aVar8.f15771b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f15770a & 256) != 0) {
                    aVar9.e(aVar9.f15771b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f15770a = i10;
        }

        public void a(Activity activity) {
            if (f15768e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f15768e = handlerThread;
                handlerThread.start();
                f15769f = new Handler(f15768e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f15771b;
                if (sparseIntArrayArr[i10] == null && (this.f15770a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f15773d, f15769f);
            this.f15772c.add(new WeakReference(activity));
        }

        public SparseIntArray[] b() {
            return this.f15771b;
        }

        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f15772c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f15772c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15773d);
            return this.f15771b;
        }

        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f15771b;
            this.f15771b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* access modifiers changed from: package-private */
        public void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();
    }

    public i() {
        this(1);
    }

    public void a(Activity activity) {
        this.f15767a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f15767a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f15767a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f15767a.d();
    }

    public i(int i10) {
        this.f15767a = new a(i10);
    }
}
