package io.invertase.firebase.database;

import com.google.firebase.database.a;
import java.util.concurrent.Callable;

/* renamed from: io.invertase.firebase.database.u  reason: case insensitive filesystem */
public final /* synthetic */ class C6421u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f71396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71397b;

    public /* synthetic */ C6421u(a aVar, String str) {
        this.f71396a = aVar;
        this.f71397b = str;
    }

    public final Object call() {
        return C6402a.l(this.f71396a, this.f71397b);
    }
}
