package androidx.work;

import android.app.Notification;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f19016a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19017b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f19018c;

    public j(int i10, Notification notification, int i11) {
        this.f19016a = i10;
        this.f19018c = notification;
        this.f19017b = i11;
    }

    public int a() {
        return this.f19017b;
    }

    public Notification b() {
        return this.f19018c;
    }

    public int c() {
        return this.f19016a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f19016a == jVar.f19016a && this.f19017b == jVar.f19017b) {
            return this.f19018c.equals(jVar.f19018c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f19016a * 31) + this.f19017b) * 31) + this.f19018c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f19016a + ", mForegroundServiceType=" + this.f19017b + ", mNotification=" + this.f19018c + '}';
    }
}
