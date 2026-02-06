package va;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.k;

final class m extends p {
    m(f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        i iVar = (i) bVar;
        ((w) iVar.getService()).b(new l(this), iVar.e());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ k createFailedResult(Status status) {
        return status;
    }
}
