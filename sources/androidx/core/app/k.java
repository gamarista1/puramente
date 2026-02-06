package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.C6496s;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15775a;

    /* renamed from: b  reason: collision with root package name */
    private Configuration f15776b;

    public k(boolean z10) {
        this.f15775a = z10;
    }

    public final boolean a() {
        return this.f15775a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(boolean z10, Configuration configuration) {
        this(z10);
        C6496s.h(configuration, "newConfig");
        this.f15776b = configuration;
    }
}
