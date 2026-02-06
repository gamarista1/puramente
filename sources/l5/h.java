package l5;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.m;
import com.bumptech.glide.request.d;
import m5.C3775b;

public final class h extends c {

    /* renamed from: e  reason: collision with root package name */
    private static final Handler f46119e = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d  reason: collision with root package name */
    private final m f46120d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((h) message.obj).e();
            return true;
        }
    }

    private h(m mVar, int i10, int i11) {
        super(i10, i11);
        this.f46120d = mVar;
    }

    public static h j(m mVar, int i10, int i11) {
        return new h(mVar, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f46120d.clear((j) this);
    }

    public void h(Object obj, C3775b bVar) {
        d a10 = a();
        if (a10 != null && a10.g()) {
            f46119e.obtainMessage(1, this).sendToTarget();
        }
    }

    public void d(Drawable drawable) {
    }
}
