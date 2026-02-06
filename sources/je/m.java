package Je;

import Fe.C3016e;
import Fe.F;
import Fe.G;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import io.branch.referral.validators.IntegrationValidatorDialogRowItem;

public class m extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32279a = ((IntegrationValidatorDialogRowItem) findViewById(F.f30881v));

    /* renamed from: b  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32280b = ((IntegrationValidatorDialogRowItem) findViewById(F.f30882w));

    /* renamed from: c  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32281c = ((IntegrationValidatorDialogRowItem) findViewById(F.f30883x));

    /* renamed from: d  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32282d = ((IntegrationValidatorDialogRowItem) findViewById(F.f30884y));

    /* renamed from: e  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32283e = ((IntegrationValidatorDialogRowItem) findViewById(F.f30885z));

    /* renamed from: f  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32284f = ((IntegrationValidatorDialogRowItem) findViewById(F.f30854A));

    /* renamed from: g  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32285g = ((IntegrationValidatorDialogRowItem) findViewById(F.f30855B));

    /* renamed from: h  reason: collision with root package name */
    IntegrationValidatorDialogRowItem f32286h = ((IntegrationValidatorDialogRowItem) findViewById(F.f30856C));

    /* renamed from: i  reason: collision with root package name */
    Button f32287i = ((Button) findViewById(F.f30862c));

    /* renamed from: j  reason: collision with root package name */
    Button f32288j = ((Button) findViewById(F.f30857D));

    public m(Context context) {
        super(context);
        requestWindowFeature(1);
        setContentView(G.f30886a);
        ((TextView) findViewById(F.f30880u)).setText("SDK Version: " + C3016e.e0());
        this.f32287i.setOnClickListener(new k(this, context));
        this.f32288j.setOnClickListener(new l(context));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Context context, View view) {
        g(context);
    }

    private void f(IntegrationValidatorDialogRowItem integrationValidatorDialogRowItem, String str, boolean z10, String str2, String str3) {
        integrationValidatorDialogRowItem.f(str);
        integrationValidatorDialogRowItem.e(z10);
        integrationValidatorDialogRowItem.c(str2);
        integrationValidatorDialogRowItem.d(str3);
    }

    private void g(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", i.f());
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public void c(int i10, String str, boolean z10, String str2, String str3) {
        switch (i10) {
            case 1:
                f(this.f32279a, str, z10, str2, str3);
                return;
            case 2:
                f(this.f32280b, str, z10, str2, str3);
                return;
            case 3:
                f(this.f32281c, str, z10, str2, str3);
                return;
            case 4:
                f(this.f32282d, str, z10, str2, str3);
                return;
            case 5:
                f(this.f32283e, str, z10, str2, str3);
                return;
            case 6:
                f(this.f32284f, str, z10, str2, str3);
                return;
            case 7:
                f(this.f32285g, str, z10, str2, str3);
                return;
            case 8:
                f(this.f32286h, str, z10, str2, str3);
                return;
            default:
                return;
        }
    }
}
