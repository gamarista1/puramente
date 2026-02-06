package Je;

import Fe.F;
import Fe.G;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.amazon.a.a.o.b;
import io.branch.referral.validators.LinkingValidatorDialogRowItem;
import java.util.ArrayList;

public class r extends Dialog implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    private a f32294a;

    /* renamed from: b  reason: collision with root package name */
    private final Button f32295b;

    /* renamed from: c  reason: collision with root package name */
    private final Spinner f32296c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f32297d;

    /* renamed from: e  reason: collision with root package name */
    private final EditText f32298e;

    /* renamed from: f  reason: collision with root package name */
    private final LinearLayout f32299f;

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f32300g;

    /* renamed from: h  reason: collision with root package name */
    private int f32301h = 1;

    /* renamed from: i  reason: collision with root package name */
    private String f32302i = "";

    /* renamed from: j  reason: collision with root package name */
    private String f32303j = "";

    /* renamed from: k  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32304k;

    /* renamed from: l  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32305l;

    /* renamed from: m  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32306m;

    /* renamed from: n  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32307n;

    /* renamed from: o  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32308o;

    /* renamed from: p  reason: collision with root package name */
    private LinkingValidatorDialogRowItem f32309p;

    private enum a {
        CANONICAL_URL,
        DEEPLINK_PATH,
        CUSTOM
    }

    public r(Context context) {
        super(context);
        requestWindowFeature(1);
        setContentView(G.f30887b);
        Spinner spinner = (Spinner) findViewById(F.f30865f);
        this.f32296c = spinner;
        ArrayList arrayList = new ArrayList();
        arrayList.add("$canonical_url");
        arrayList.add("$deeplink_path");
        arrayList.add("other (custom)");
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        Button button = (Button) findViewById(F.f30864e);
        this.f32295b = button;
        button.setText("Next");
        button.setOnClickListener(new q(this));
        this.f32297d = (TextView) findViewById(F.f30878s);
        EditText editText = (EditText) findViewById(F.f30866g);
        this.f32298e = editText;
        LinearLayout linearLayout = (LinearLayout) findViewById(F.f30860a);
        this.f32299f = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(F.f30877r);
        this.f32300g = linearLayout2;
        editText.setVisibility(8);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        this.f32294a = a.CANONICAL_URL;
        this.f32304k = (LinkingValidatorDialogRowItem) findViewById(F.f30867h);
        this.f32305l = (LinkingValidatorDialogRowItem) findViewById(F.f30868i);
        this.f32306m = (LinkingValidatorDialogRowItem) findViewById(F.f30869j);
        this.f32307n = (LinkingValidatorDialogRowItem) findViewById(F.f30870k);
        this.f32308o = (LinkingValidatorDialogRowItem) findViewById(F.f30871l);
        this.f32309p = (LinkingValidatorDialogRowItem) findViewById(F.f30872m);
    }

    private void b() {
        dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        int i10 = this.f32301h;
        if (i10 == 1) {
            d();
        } else if (i10 == 2) {
            c();
        } else if (i10 == 3) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int ordinal = this.f32294a.ordinal();
        if (ordinal == 0) {
            this.f32302i = "$canonical_url";
            this.f32303j = this.f32298e.getText().toString();
        } else if (ordinal == 1) {
            this.f32302i = "$deeplink_path";
            this.f32303j = this.f32298e.getText().toString();
        }
        this.f32301h++;
        this.f32298e.setVisibility(8);
        this.f32299f.setVisibility(8);
        this.f32297d.setVisibility(8);
        this.f32295b.setText("Done");
        this.f32300g.setVisibility(0);
        EditText editText = (EditText) findViewById(F.f30863d);
        EditText editText2 = (EditText) findViewById(F.f30859F);
        if (this.f32302i.isEmpty()) {
            this.f32302i = editText.getText().toString();
            this.f32303j = editText2.getText().toString();
        }
        this.f32304k.k("Link using App Link", "Verifies that Universal Links / App Links are working correctly for your Branch domain", "Ensure you’ve entered the correct SHA 256s on the dashboard and added your Branch domains to the Android Manifest", this.f32302i, this.f32303j, "regularBranchLink", true, 0, new String[0]);
        this.f32305l.k("Link using URI scheme", "Verifies that URI schemes work correctly for your Branch domain", "Ensure that you’ve added a unique Branch URI scheme to the dashboard and Android Manifest", this.f32302i, this.f32303j, "uriFallbackBranchLink", true, 1, "$uri_redirect_mode", "2");
        this.f32306m.k("Web-only link", "Verifies that web-only links are handled correctly to take you to the mobile web", "Ensure that your code checks for $web-only in the link data, and if it is true routes the user to the mobile web", this.f32302i, this.f32303j, "webOnlyBranchLink", true, 2, "$web_only", b.f37475af);
        this.f32307n.k("Link with missing data", "Verifies that your app gracefully handles Branch links missing deep link data", "Ensure that your code gracefully handles missing or invalid deep link data like taking them to the home screen", this.f32302i, "", "missingDataBranchLink", true, 3, new String[0]);
        this.f32308o.k("Warm start use case", "Click the button to simulate a deep link click for the warm start use case", "Ensure that you are initializing Branch inside of onStart() and that the code is called anytime the app enters the foreground", this.f32302i, this.f32303j, "warmStartUseCase", false, 4, new String[0]);
        this.f32309p.k("Foreground click use case", "Click the button to simulate a deep link click for the foreground use case", "Ensure that you are calling reInit() inside of onNewIntent() after checking if branch_force_new_session is true", this.f32302i, this.f32303j, "foregroundClickUseCase", false, 5, new String[0]);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f32301h++;
        this.f32295b.setText("  Generate Links for Testing  ");
        this.f32296c.setVisibility(8);
        int ordinal = this.f32294a.ordinal();
        if (ordinal == 0) {
            this.f32298e.setVisibility(0);
            this.f32297d.setText("Please paste in a web link for the $canonical_url");
        } else if (ordinal == 1) {
            this.f32298e.setVisibility(0);
            this.f32297d.setText("Please paste in a value for the $deeplink_path");
        } else if (ordinal == 2) {
            this.f32299f.setVisibility(0);
            this.f32297d.setText("Please enter your custom key and value for routing");
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        String obj = adapterView.getItemAtPosition(i10).toString();
        obj.hashCode();
        char c10 = 65535;
        switch (obj.hashCode()) {
            case -1332004672:
                if (obj.equals("other (custom)")) {
                    c10 = 0;
                    break;
                }
                break;
            case 889094202:
                if (obj.equals("$deeplink_path")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1102666240:
                if (obj.equals("$canonical_url")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f32294a = a.CUSTOM;
                return;
            case 1:
                this.f32294a = a.DEEPLINK_PATH;
                return;
            case 2:
                this.f32294a = a.CANONICAL_URL;
                return;
            default:
                return;
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
