package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.h;
import java.util.Calendar;

class A {

    /* renamed from: d  reason: collision with root package name */
    private static A f10828d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f10829a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f10830b;

    /* renamed from: c  reason: collision with root package name */
    private final a f10831c = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f10832a;

        /* renamed from: b  reason: collision with root package name */
        long f10833b;

        a() {
        }
    }

    A(Context context, LocationManager locationManager) {
        this.f10829a = context;
        this.f10830b = locationManager;
    }

    static A a(Context context) {
        if (f10828d == null) {
            Context applicationContext = context.getApplicationContext();
            f10828d = new A(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f10828d;
    }

    private Location b() {
        Location location;
        Location location2 = null;
        if (h.b(this.f10829a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = c("network");
        } else {
            location = null;
        }
        if (h.b(this.f10829a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = c("gps");
        }
        if (location2 == null || location == null) {
            if (location2 != null) {
                return location2;
            }
            return location;
        } else if (location2.getTime() > location.getTime()) {
            return location2;
        } else {
            return location;
        }
    }

    private Location c(String str) {
        try {
            if (this.f10830b.isProviderEnabled(str)) {
                return this.f10830b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        if (this.f10831c.f10833b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f10831c;
        long currentTimeMillis = System.currentTimeMillis();
        z b10 = z.b();
        z zVar = b10;
        zVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        zVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = true;
        if (b10.f11140c != 1) {
            z10 = false;
        }
        boolean z11 = z10;
        long j11 = b10.f11139b;
        long j12 = b10.f11138a;
        long j13 = j12;
        double latitude = location.getLatitude();
        long j14 = j11;
        b10.a(currentTimeMillis + 86400000, latitude, location.getLongitude());
        long j15 = b10.f11139b;
        if (j14 == -1 || j13 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j13) {
                if (currentTimeMillis > j14) {
                    j15 = j13;
                } else {
                    j15 = j14;
                }
            }
            j10 = j15 + 60000;
        }
        aVar.f10832a = z11;
        aVar.f10833b = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f10831c;
        if (e()) {
            return aVar.f10832a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f10832a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        if (i10 < 6 || i10 >= 22) {
            return true;
        }
        return false;
    }
}
