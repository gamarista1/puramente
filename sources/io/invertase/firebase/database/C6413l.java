package io.invertase.firebase.database;

import com.google.firebase.database.a;
import java.util.concurrent.Callable;

/* renamed from: io.invertase.firebase.database.l  reason: case insensitive filesystem */
public final /* synthetic */ class C6413l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f71383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f71384c;

    public /* synthetic */ C6413l(String str, a aVar, String str2) {
        this.f71382a = str;
        this.f71383b = aVar;
        this.f71384c = str2;
    }

    public final Object call() {
        return ReactNativeFirebaseDatabaseQueryModule.lambda$handleDatabaseEvent$0(this.f71382a, this.f71383b, this.f71384c);
    }
}
