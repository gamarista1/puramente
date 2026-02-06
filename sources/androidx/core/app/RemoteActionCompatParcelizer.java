package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f15739a = (IconCompat) aVar.v(remoteActionCompat.f15739a, 1);
        remoteActionCompat.f15740b = aVar.l(remoteActionCompat.f15740b, 2);
        remoteActionCompat.f15741c = aVar.l(remoteActionCompat.f15741c, 3);
        remoteActionCompat.f15742d = (PendingIntent) aVar.r(remoteActionCompat.f15742d, 4);
        remoteActionCompat.f15743e = aVar.h(remoteActionCompat.f15743e, 5);
        remoteActionCompat.f15744f = aVar.h(remoteActionCompat.f15744f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f15739a, 1);
        aVar.D(remoteActionCompat.f15740b, 2);
        aVar.D(remoteActionCompat.f15741c, 3);
        aVar.H(remoteActionCompat.f15742d, 4);
        aVar.z(remoteActionCompat.f15743e, 5);
        aVar.z(remoteActionCompat.f15744f, 6);
    }
}
