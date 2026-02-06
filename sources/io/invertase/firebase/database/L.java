package io.invertase.firebase.database;

import Ue.g;
import com.facebook.react.bridge.WritableMap;

public final /* synthetic */ class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WritableMap f71326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f71328c;

    public /* synthetic */ L(WritableMap writableMap, String str, int i10) {
        this.f71326a = writableMap;
        this.f71327b = str;
        this.f71328c = i10;
    }

    public final void run() {
        g.i().o(new M("database_transaction_event", this.f71326a, this.f71327b, this.f71328c));
    }
}
