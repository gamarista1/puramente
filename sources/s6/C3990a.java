package s6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: s6.a  reason: case insensitive filesystem */
public class C3990a {

    /* renamed from: a  reason: collision with root package name */
    C0723a f48075a;

    /* renamed from: b  reason: collision with root package name */
    final float f48076b;

    /* renamed from: c  reason: collision with root package name */
    boolean f48077c;

    /* renamed from: d  reason: collision with root package name */
    boolean f48078d;

    /* renamed from: e  reason: collision with root package name */
    long f48079e;

    /* renamed from: f  reason: collision with root package name */
    float f48080f;

    /* renamed from: g  reason: collision with root package name */
    float f48081g;

    /* renamed from: s6.a$a  reason: collision with other inner class name */
    public interface C0723a {
        boolean a();
    }

    public C3990a(Context context) {
        this.f48076b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static C3990a c(Context context) {
        return new C3990a(context);
    }

    public void a() {
        this.f48075a = null;
        e();
    }

    public boolean b() {
        return this.f48077c;
    }

    public boolean d(MotionEvent motionEvent) {
        C0723a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48077c = true;
            this.f48078d = true;
            this.f48079e = motionEvent.getEventTime();
            this.f48080f = motionEvent.getX();
            this.f48081g = motionEvent.getY();
        } else if (action == 1) {
            this.f48077c = false;
            if (Math.abs(motionEvent.getX() - this.f48080f) > this.f48076b || Math.abs(motionEvent.getY() - this.f48081g) > this.f48076b) {
                this.f48078d = false;
            }
            if (this.f48078d && motionEvent.getEventTime() - this.f48079e <= ((long) ViewConfiguration.getLongPressTimeout()) && (aVar = this.f48075a) != null) {
                aVar.a();
            }
            this.f48078d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f48077c = false;
                this.f48078d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f48080f) > this.f48076b || Math.abs(motionEvent.getY() - this.f48081g) > this.f48076b) {
            this.f48078d = false;
        }
        return true;
    }

    public void e() {
        this.f48077c = false;
        this.f48078d = false;
    }

    public void f(C0723a aVar) {
        this.f48075a = aVar;
    }
}
