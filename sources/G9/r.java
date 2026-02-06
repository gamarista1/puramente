package g9;

import android.database.sqlite.SQLiteDatabase;
import b9.C3162c;
import g9.M;

public final /* synthetic */ class r implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f43743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3162c.b f43744b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f43745c;

    public /* synthetic */ r(String str, C3162c.b bVar, long j10) {
        this.f43743a = str;
        this.f43744b = bVar;
        this.f43745c = j10;
    }

    public final Object apply(Object obj) {
        return M.f2(this.f43743a, this.f43744b, this.f43745c, (SQLiteDatabase) obj);
    }
}
