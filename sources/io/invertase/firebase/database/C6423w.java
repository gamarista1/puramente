package io.invertase.firebase.database;

import com.google.firebase.database.a;
import java.util.concurrent.Callable;

/* renamed from: io.invertase.firebase.database.w  reason: case insensitive filesystem */
public final /* synthetic */ class C6423w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f71399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71400b;

    public /* synthetic */ C6423w(a aVar, String str) {
        this.f71399a = aVar;
        this.f71400b = str;
    }

    public final Object call() {
        return C6402a.l(this.f71399a, this.f71400b);
    }
}
