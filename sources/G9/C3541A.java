package g9;

import android.database.Cursor;
import b9.C3160a;
import g9.M;
import java.util.Map;

/* renamed from: g9.A  reason: case insensitive filesystem */
public final /* synthetic */ class C3541A implements M.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f43677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f43678b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C3160a.C0595a f43679c;

    public /* synthetic */ C3541A(M m10, Map map, C3160a.C0595a aVar) {
        this.f43677a = m10;
        this.f43678b = map;
        this.f43679c = aVar;
    }

    public final Object apply(Object obj) {
        return this.f43677a.W1(this.f43678b, this.f43679c, (Cursor) obj);
    }
}
