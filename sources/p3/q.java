package P3;

import androidx.work.C1840g;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.C6496s;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final String f5079a;

    /* renamed from: b  reason: collision with root package name */
    private final C1840g f5080b;

    public q(String str, C1840g gVar) {
        C6496s.h(str, "workSpecId");
        C6496s.h(gVar, ReactProgressBarViewManager.PROP_PROGRESS);
        this.f5079a = str;
        this.f5080b = gVar;
    }

    public final C1840g a() {
        return this.f5080b;
    }

    public final String b() {
        return this.f5079a;
    }
}
