package g9;

import android.database.sqlite.SQLiteDatabase;
import g9.M;

public final /* synthetic */ class L implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f43688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f43689b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f43690c;

    public /* synthetic */ L(M m10, String str, String str2) {
        this.f43688a = m10;
        this.f43689b = str;
        this.f43690c = str2;
    }

    public final Object apply(Object obj) {
        return this.f43688a.d2(this.f43689b, this.f43690c, (SQLiteDatabase) obj);
    }
}
