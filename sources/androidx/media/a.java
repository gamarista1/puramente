package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    b f17300a;

    public a(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f17300a = new g(str, i10, i11);
        } else {
            this.f17300a = new h(str, i10, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f17300a.equals(((a) obj).f17300a);
    }

    public int hashCode() {
        return this.f17300a.hashCode();
    }

    public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a10 = g.a(remoteUserInfo);
        if (a10 == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(a10)) {
            this.f17300a = new g(remoteUserInfo);
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
