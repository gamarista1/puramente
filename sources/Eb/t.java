package Eb;

import dc.C4942a;
import dc.C4943b;
import java.util.Map;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f50741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4942a f50742b;

    public /* synthetic */ t(Map.Entry entry, C4942a aVar) {
        this.f50741a = entry;
        this.f50742b = aVar;
    }

    public final void run() {
        ((C4943b) this.f50741a.getKey()).a(this.f50742b);
    }
}
