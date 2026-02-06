package rd;

import android.app.Application;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import yf.C6798l;

/* renamed from: rd.a  reason: case insensitive filesystem */
public final /* synthetic */ class C5192a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GoogleDeviceIdentifiersFetcher f61584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f61585b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6798l f61586c;

    public /* synthetic */ C5192a(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, C6798l lVar) {
        this.f61584a = googleDeviceIdentifiersFetcher;
        this.f61585b = application;
        this.f61586c = lVar;
    }

    public final void run() {
        GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0(this.f61584a, this.f61585b, this.f61586c);
    }
}
