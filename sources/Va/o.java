package va;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;

final class o extends p {
    o(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        i iVar = (i) bVar;
        ((w) iVar.getService()).a(new n(this), iVar.e());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ k createFailedResult(Status status) {
        return status;
    }
}
