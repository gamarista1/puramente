package u4;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: u4.l  reason: case insensitive filesystem */
public final /* synthetic */ class C4072l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f48545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f48546b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f48547c;

    public /* synthetic */ C4072l(Context context, String str, String str2) {
        this.f48545a = context;
        this.f48546b = str;
        this.f48547c = str2;
    }

    public final Object call() {
        return C4080u.Q(this.f48545a, this.f48546b, this.f48547c);
    }
}
