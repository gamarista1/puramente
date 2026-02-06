package u4;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: u4.q  reason: case insensitive filesystem */
public final /* synthetic */ class C4077q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f48555a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f48556b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f48557c;

    public /* synthetic */ C4077q(Context context, String str, String str2) {
        this.f48555a = context;
        this.f48556b = str;
        this.f48557c = str2;
    }

    public final Object call() {
        return C4080u.o(this.f48555a, this.f48556b, this.f48557c);
    }
}
