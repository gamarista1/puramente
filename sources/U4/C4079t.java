package u4;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: u4.t  reason: case insensitive filesystem */
public final /* synthetic */ class C4079t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f48562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f48563b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f48564c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f48565d;

    public /* synthetic */ C4079t(WeakReference weakReference, Context context, int i10, String str) {
        this.f48562a = weakReference;
        this.f48563b = context;
        this.f48564c = i10;
        this.f48565d = str;
    }

    public final Object call() {
        return C4080u.P(this.f48562a, this.f48563b, this.f48564c, this.f48565d);
    }
}
