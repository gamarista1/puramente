package u3;

import kotlin.jvm.internal.C6496s;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f26755a = new v();

    private v() {
    }

    public static final String a(String str) {
        C6496s.h(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
