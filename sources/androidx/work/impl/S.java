package androidx.work.impl;

import Q3.l;
import Q3.q;
import android.content.Context;
import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

public final class S extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f18784c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(Context context) {
        super(9, 10);
        C6496s.h(context, "context");
        this.f18784c = context;
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        q.c(this.f18784c, gVar);
        l.c(this.f18784c, gVar);
    }
}
