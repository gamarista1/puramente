package K4;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f32341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f32342b;

    public /* synthetic */ c(String str, t tVar) {
        this.f32341a = str;
        this.f32342b = tVar;
    }

    public final Thread newThread(Runnable runnable) {
        return d.c(this.f32341a, this.f32342b, runnable);
    }
}
