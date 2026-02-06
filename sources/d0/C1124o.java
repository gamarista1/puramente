package D0;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: D0.o  reason: case insensitive filesystem */
public final class C1124o {

    /* renamed from: a  reason: collision with root package name */
    private final List f1482a;

    /* renamed from: b  reason: collision with root package name */
    private final C1116g f1483b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1484c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1485d;

    /* renamed from: e  reason: collision with root package name */
    private int f1486e;

    public C1124o(List list, C1116g gVar) {
        this.f1482a = list;
        this.f1483b = gVar;
        MotionEvent e10 = e();
        int i10 = 0;
        this.f1484c = C1123n.a(e10 != null ? e10.getButtonState() : 0);
        MotionEvent e11 = e();
        this.f1485d = N.b(e11 != null ? e11.getMetaState() : i10);
        this.f1486e = a();
    }

    private final int a() {
        MotionEvent e10 = e();
        if (e10 != null) {
            int actionMasked = e10.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C1127s.f1491a.f();
                            case 9:
                                return C1127s.f1491a.a();
                            case 10:
                                return C1127s.f1491a.b();
                            default:
                                return C1127s.f1491a.g();
                        }
                    }
                    return C1127s.f1491a.c();
                }
                return C1127s.f1491a.e();
            }
            return C1127s.f1491a.d();
        }
        List list = this.f1482a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            A a10 = (A) list.get(i10);
            if (C1125p.d(a10)) {
                return C1127s.f1491a.e();
            }
            if (C1125p.b(a10)) {
                return C1127s.f1491a.d();
            }
        }
        return C1127s.f1491a.c();
    }

    public final int b() {
        return this.f1484c;
    }

    public final List c() {
        return this.f1482a;
    }

    public final C1116g d() {
        return this.f1483b;
    }

    public final MotionEvent e() {
        C1116g gVar = this.f1483b;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    public final int f() {
        return this.f1486e;
    }

    public final void g(int i10) {
        this.f1486e = i10;
    }

    public C1124o(List list) {
        this(list, (C1116g) null);
    }
}
