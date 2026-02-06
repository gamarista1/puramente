package g9;

import android.database.sqlite.SQLiteDatabase;
import b9.C3160a;
import g9.M;
import java.util.Map;

/* renamed from: g9.t  reason: case insensitive filesystem */
public final /* synthetic */ class C3561t implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f43747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f43748b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f43749c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C3160a.C0595a f43750d;

    public /* synthetic */ C3561t(M m10, String str, Map map, C3160a.C0595a aVar) {
        this.f43747a = m10;
        this.f43748b = str;
        this.f43749c = map;
        this.f43750d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f43747a.X1(this.f43748b, this.f43749c, this.f43750d, (SQLiteDatabase) obj);
    }
}
