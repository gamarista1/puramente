package zh;

import java.io.IOException;
import kotlin.jvm.internal.C6496s;

public final class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final C6844b f74208a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(C6844b bVar) {
        super("stream was reset: " + bVar);
        C6496s.h(bVar, "errorCode");
        this.f74208a = bVar;
    }
}
