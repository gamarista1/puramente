package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

public final class v extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f19001c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10, int i11) {
        super(i10, i11);
        C6496s.h(context, "mContext");
        this.f19001c = context;
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        if (this.f27146b >= 10) {
            gVar.R("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f19001c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
