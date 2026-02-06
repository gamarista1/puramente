package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.C6496s;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15945a;

    /* renamed from: b  reason: collision with root package name */
    private Configuration f15946b;

    public v(boolean z10) {
        this.f15945a = z10;
    }

    public final boolean a() {
        return this.f15945a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(boolean z10, Configuration configuration) {
        this(z10);
        C6496s.h(configuration, "newConfig");
        this.f15946b = configuration;
    }
}
