package x7;

import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.N;

/* renamed from: x7.a  reason: case insensitive filesystem */
public final /* synthetic */ class C4175a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ URL f49487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f49488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f49489c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f49490d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Condition f49491e;

    public /* synthetic */ C4175a(URL url, N n10, String str, ReentrantLock reentrantLock, Condition condition) {
        this.f49487a = url;
        this.f49488b = n10;
        this.f49489c = str;
        this.f49490d = reentrantLock;
        this.f49491e = condition;
    }

    public final void run() {
        C4176b.d(this.f49487a, this.f49488b, this.f49489c, this.f49490d, this.f49491e);
    }
}
