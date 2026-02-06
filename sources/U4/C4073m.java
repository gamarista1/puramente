package u4;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: u4.m  reason: case insensitive filesystem */
public final /* synthetic */ class C4073m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f48548a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f48549b;

    public /* synthetic */ C4073m(InputStream inputStream, String str) {
        this.f48548a = inputStream;
        this.f48549b = str;
    }

    public final Object call() {
        return C4080u.q(this.f48548a, this.f48549b);
    }
}
