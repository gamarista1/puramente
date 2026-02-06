package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f53779a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53780b;

    /* renamed from: c  reason: collision with root package name */
    final CountDownLatch f53781c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    boolean f53782d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f53779a = new WeakReference(advertisingIdClient);
        this.f53780b = j10;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f53779a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.b();
            this.f53782d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f53781c.await(this.f53780b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
