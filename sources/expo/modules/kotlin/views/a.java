package expo.modules.kotlin.views;

import ae.C4464a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.C6496s;
import qe.C5155b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f60463a;

    /* renamed from: b  reason: collision with root package name */
    private final C5155b f60464b;

    public a(String str, C5155b bVar) {
        C6496s.h(str, "name");
        C6496s.h(bVar, "type");
        this.f60463a = str;
        this.f60464b = bVar;
    }

    public final String a() {
        return this.f60463a;
    }

    public final C5155b b() {
        return this.f60464b;
    }

    public abstract void c(Dynamic dynamic, View view, C4464a aVar);
}
