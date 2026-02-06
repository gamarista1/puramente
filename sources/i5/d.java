package i5;

import android.content.Context;
import i5.b;

final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44200a;

    /* renamed from: b  reason: collision with root package name */
    final b.a f44201b;

    d(Context context, b.a aVar) {
        this.f44200a = context.getApplicationContext();
        this.f44201b = aVar;
    }

    private void e() {
        r.a(this.f44200a).d(this.f44201b);
    }

    private void j() {
        r.a(this.f44200a).e(this.f44201b);
    }

    public void onStart() {
        e();
    }

    public void onStop() {
        j();
    }

    public void onDestroy() {
    }
}
