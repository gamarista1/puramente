package androidx.media.app;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.app.o;

public class c extends o.i {

    /* renamed from: e  reason: collision with root package name */
    int[] f17301e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f17302f;

    /* renamed from: g  reason: collision with root package name */
    CharSequence f17303g;

    /* renamed from: h  reason: collision with root package name */
    int f17304h;

    /* renamed from: i  reason: collision with root package name */
    PendingIntent f17305i;

    /* renamed from: j  reason: collision with root package name */
    boolean f17306j = false;

    public void b(m mVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(mVar.a(), a.b(b.a(a.a(), this.f17303g, this.f17304h, this.f17305i, Boolean.valueOf(this.f17306j)), this.f17301e, this.f17302f));
        } else {
            a.d(mVar.a(), a.b(a.a(), this.f17301e, this.f17302f));
        }
    }

    public RemoteViews d(m mVar) {
        return null;
    }

    public RemoteViews e(m mVar) {
        return null;
    }

    public c h(MediaSessionCompat.Token token) {
        this.f17302f = token;
        return this;
    }

    public c i(int... iArr) {
        this.f17301e = iArr;
        return this;
    }
}
