package Ab;

import android.content.Context;
import ic.C5027b;

public final /* synthetic */ class j implements C5027b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f50199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f50200b;

    public /* synthetic */ j(Context context, String str) {
        this.f50199a = context;
        this.f50200b = str;
    }

    public final Object get() {
        return this.f50199a.getSharedPreferences(this.f50200b, 0);
    }
}
