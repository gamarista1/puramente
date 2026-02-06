package Je;

import android.content.Context;
import android.view.View;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f32276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f32277b;

    public /* synthetic */ k(m mVar, Context context) {
        this.f32276a = mVar;
        this.f32277b = context;
    }

    public final void onClick(View view) {
        this.f32276a.d(this.f32277b, view);
    }
}
