package ia;

import android.content.Context;
import ia.C3612j;

public final class s implements C3612j.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44526a;

    /* renamed from: b  reason: collision with root package name */
    private final J f44527b;

    /* renamed from: c  reason: collision with root package name */
    private final C3612j.a f44528c;

    public s(Context context, J j10, C3612j.a aVar) {
        this.f44526a = context.getApplicationContext();
        this.f44527b = j10;
        this.f44528c = aVar;
    }

    /* renamed from: b */
    public r a() {
        r rVar = new r(this.f44526a, this.f44528c.a());
        J j10 = this.f44527b;
        if (j10 != null) {
            rVar.n(j10);
        }
        return rVar;
    }
}
