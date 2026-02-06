package i3;

import android.graphics.Bitmap;

public final /* synthetic */ class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F f22212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f22213b;

    public /* synthetic */ E(F f10, Bitmap bitmap) {
        this.f22212a = f10;
        this.f22213b = bitmap;
    }

    public final void run() {
        this.f22212a.O(this.f22213b);
    }
}
