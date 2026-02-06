package androidx.work.impl;

import kotlin.jvm.internal.C6496s;
import v3.C2756b;
import y3.g;

/* renamed from: androidx.work.impl.h  reason: case insensitive filesystem */
public final class C1848h extends C2756b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1848h f18933c = new C1848h();

    private C1848h() {
        super(12, 13);
    }

    public void a(g gVar) {
        C6496s.h(gVar, "db");
        gVar.z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
