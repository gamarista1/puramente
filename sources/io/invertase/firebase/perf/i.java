package io.invertase.firebase.perf;

import Ac.b;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import rc.e;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f71448a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71449b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.core.app.i f71450c;

    /* renamed from: d  reason: collision with root package name */
    private Trace f71451d;

    public i(Activity activity, String str) {
        this.f71448a = activity;
        this.f71449b = str;
        if (c(activity)) {
            this.f71450c = new androidx.core.app.i();
            return;
        }
        throw new IllegalStateException("Device does not support screen traces. Hardware acceleration must be enabled and Android must not be 8.0 or 8.1.");
    }

    private static boolean a() {
        return true;
    }

    private static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26 || i10 == 27) {
            return false;
        }
        return true;
    }

    private static boolean c(Activity activity) {
        boolean z10;
        boolean b10 = b();
        boolean a10 = a();
        boolean z11 = false;
        if (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (b10 && a10 && z10) {
            z11 = true;
        }
        Log.d("RNFirebasePerf", "isValidSDKVersion: " + b10 + "isScreenTraceSupported(" + activity + "): " + z11 + " [hasFrameMetricsAggregatorClass: " + a10 + ", isActivityHardwareAccelerated: " + z10 + "]");
        return z11;
    }

    private String d() {
        return "_st_" + this.f71449b;
    }

    public void e() {
        Log.d("RNFirebasePerf", "Recording screen trace " + this.f71449b);
        this.f71450c.a(this.f71448a);
        this.f71451d = e.h(d());
    }

    public void f() {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (this.f71451d != null) {
            SparseIntArray[] d10 = this.f71450c.d();
            int i12 = 0;
            if (d10 == null || (sparseIntArray = d10[0]) == null) {
                i11 = 0;
                i10 = 0;
            } else {
                int i13 = 0;
                i11 = 0;
                i10 = 0;
                while (i12 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i12);
                    int valueAt = sparseIntArray.valueAt(i12);
                    i13 += valueAt;
                    if (keyAt > 700) {
                        i10 += valueAt;
                    }
                    if (keyAt > 16) {
                        i11 += valueAt;
                    }
                    i12++;
                }
                i12 = i13;
            }
            if (i12 > 0) {
                this.f71451d.putMetric(b.FRAMES_TOTAL.toString(), (long) i12);
            }
            if (i11 > 0) {
                this.f71451d.putMetric(b.FRAMES_SLOW.toString(), (long) i11);
            }
            if (i10 > 0) {
                this.f71451d.putMetric(b.FRAMES_FROZEN.toString(), (long) i10);
            }
            Log.d("RNFirebasePerf", "sendScreenTrace " + this.f71449b + ", name: " + d() + ", total_frames: " + i12 + ", slow_frames: " + i11 + ", frozen_frames: " + i10);
            this.f71451d.stop();
        }
    }
}
