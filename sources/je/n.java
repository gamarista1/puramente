package Je;

import android.content.Context;
import android.view.View;
import io.branch.referral.validators.IntegrationValidatorDialogRowItem;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntegrationValidatorDialogRowItem f32289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f32290b;

    public /* synthetic */ n(IntegrationValidatorDialogRowItem integrationValidatorDialogRowItem, Context context) {
        this.f32289a = integrationValidatorDialogRowItem;
        this.f32290b = context;
    }

    public final void onClick(View view) {
        this.f32289a.i(this.f32290b, view);
    }
}
