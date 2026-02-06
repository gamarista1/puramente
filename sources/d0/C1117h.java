package D0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: D0.h  reason: case insensitive filesystem */
public final class C1117h {

    /* renamed from: a  reason: collision with root package name */
    private long f1465a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseLongArray f1466b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f1467c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    private final List f1468d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f1469e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f1470f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f1466b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f1466b;
                long j10 = this.f1465a;
                this.f1465a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f1467c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f1466b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f1466b;
                long j11 = this.f1465a;
                this.f1465a = 1 + j11;
                sparseLongArray2.put(pointerId2, j11);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f1469e || source != this.f1470f) {
                this.f1469e = toolType;
                this.f1470f = source;
                this.f1467c.clear();
                this.f1466b.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final D0.D d(D0.P r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            int r4 = r33.getPointerId(r34)
            long r6 = r0.f(r4)
            float r15 = r33.getPressure(r34)
            float r4 = r33.getX(r34)
            float r5 = r33.getY(r34)
            long r4 = q0.C2422h.a(r4, r5)
            r12 = 3
            r13 = 0
            r10 = 0
            r11 = 0
            r8 = r4
            long r21 = q0.C2421g.g(r8, r10, r11, r12, r13)
            if (r3 != 0) goto L_0x003e
            float r4 = r33.getRawX()
            float r5 = r33.getRawY()
            long r4 = q0.C2422h.a(r4, r5)
            long r8 = r1.o(r4)
        L_0x003b:
            r10 = r4
            r12 = r8
            goto L_0x0055
        L_0x003e:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x004f
            D0.k r4 = D0.C1120k.f1471a
            long r4 = r4.a(r2, r3)
            long r8 = r1.o(r4)
            goto L_0x003b
        L_0x004f:
            long r8 = r1.u(r4)
            r12 = r4
            r10 = r8
        L_0x0055:
            int r1 = r33.getToolType(r34)
            if (r1 == 0) goto L_0x008c
            r4 = 1
            if (r1 == r4) goto L_0x0085
            r4 = 2
            if (r1 == r4) goto L_0x007e
            r4 = 3
            if (r1 == r4) goto L_0x0077
            r4 = 4
            if (r1 == r4) goto L_0x0070
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.e()
        L_0x006d:
            r16 = r1
            goto L_0x0093
        L_0x0070:
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.a()
            goto L_0x006d
        L_0x0077:
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.b()
            goto L_0x006d
        L_0x007e:
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.c()
            goto L_0x006d
        L_0x0085:
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.d()
            goto L_0x006d
        L_0x008c:
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.e()
            goto L_0x006d
        L_0x0093:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r33.getHistorySize()
            r1.<init>(r4)
            int r4 = r33.getHistorySize()
            r5 = 0
            r8 = r5
        L_0x00a2:
            if (r8 >= r4) goto L_0x00dd
            float r9 = r2.getHistoricalX(r3, r8)
            float r14 = r2.getHistoricalY(r3, r8)
            boolean r17 = java.lang.Float.isInfinite(r9)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isNaN(r9)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isInfinite(r14)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isNaN(r14)
            if (r17 != 0) goto L_0x00da
            long r28 = q0.C2422h.a(r9, r14)
            D0.e r9 = new D0.e
            long r24 = r2.getHistoricalEventTime(r8)
            r30 = 0
            r23 = r9
            r26 = r28
            r23.<init>(r24, r26, r28, r30)
            r1.add(r9)
        L_0x00da:
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00dd:
            int r4 = r33.getActionMasked()
            r8 = 8
            if (r4 != r8) goto L_0x00fb
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r8 = 9
            float r8 = r2.getAxisValue(r8)
            float r8 = -r8
            r9 = 0
            float r8 = r8 + r9
            long r8 = q0.C2422h.a(r4, r8)
        L_0x00f8:
            r19 = r8
            goto L_0x0102
        L_0x00fb:
            q0.g$a r4 = q0.C2421g.f25320b
            long r8 = r4.c()
            goto L_0x00f8
        L_0x0102:
            android.util.SparseBooleanArray r4 = r0.f1467c
            int r3 = r33.getPointerId(r34)
            boolean r17 = r4.get(r3, r5)
            D0.D r3 = new D0.D
            r5 = r3
            long r8 = r33.getEventTime()
            r23 = 0
            r14 = r35
            r18 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C1117h.d(D0.P, android.view.MotionEvent, int, boolean):D0.D");
    }

    private final long f(int i10) {
        long j10;
        int indexOfKey = this.f1466b.indexOfKey(i10);
        if (indexOfKey >= 0) {
            j10 = this.f1466b.valueAt(indexOfKey);
        } else {
            j10 = this.f1465a;
            this.f1465a = 1 + j10;
            this.f1466b.put(i10, j10);
        }
        return z.b(j10);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f1467c.get(pointerId, false)) {
                this.f1466b.delete(pointerId);
                this.f1467c.delete(pointerId);
            }
        }
        if (this.f1466b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f1466b.size() - 1; -1 < size; size--) {
                int keyAt = this.f1466b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f1466b.removeAt(size);
                    this.f1467c.delete(keyAt);
                }
            }
        }
    }

    public final C c(MotionEvent motionEvent, P p10) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f1466b.clear();
            this.f1467c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        if (actionMasked == 9 || actionMasked == 7 || actionMasked == 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMasked == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            this.f1467c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked == 1) {
            i10 = 0;
        } else if (actionMasked != 6) {
            i10 = -1;
        } else {
            i10 = motionEvent.getActionIndex();
        }
        this.f1468d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            List list = this.f1468d;
            if (z10 || i11 == i10 || (z11 && motionEvent.getButtonState() == 0)) {
                z12 = false;
            } else {
                z12 = true;
            }
            list.add(d(p10, motionEvent, i11, z12));
        }
        h(motionEvent);
        return new C(motionEvent.getEventTime(), this.f1468d, motionEvent);
    }

    public final void e(int i10) {
        this.f1467c.delete(i10);
        this.f1466b.delete(i10);
    }
}
