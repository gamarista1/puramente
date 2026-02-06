package L4;

import K4.b;
import K4.t;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c extends a {

    /* renamed from: c  reason: collision with root package name */
    private final Context f32508c;

    public c(Context context, b bVar) {
        super(bVar, (t) null, 2, (DefaultConstructorMarker) null);
        this.f32508c = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    public final Context a() {
        return this.f32508c;
    }
}
