package u4;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: u4.o  reason: case insensitive filesystem */
public final /* synthetic */ class C4075o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f48551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f48552b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f48553c;

    public /* synthetic */ C4075o(Context context, ZipInputStream zipInputStream, String str) {
        this.f48551a = context;
        this.f48552b = zipInputStream;
        this.f48553c = str;
    }

    public final Object call() {
        return C4080u.E(this.f48551a, this.f48552b, this.f48553c);
    }
}
