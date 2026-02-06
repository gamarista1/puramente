package Fe;

/* renamed from: Fe.i  reason: case insensitive filesystem */
public class C3020i {

    /* renamed from: a  reason: collision with root package name */
    String f31097a = "";

    /* renamed from: b  reason: collision with root package name */
    int f31098b = -122;

    public C3020i(String str, int i10) {
        this.f31097a = str + c(i10);
    }

    private String c(int i10) {
        if (i10 == -113) {
            this.f31098b = -113;
            return " Check network connectivity or DNS settings.";
        } else if (i10 == -114) {
            this.f31098b = -114;
            return " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        } else if (i10 == -104) {
            this.f31098b = -104;
            return " Did you forget to call init? Make sure you init the session before making Branch calls.";
        } else if (i10 == -101) {
            this.f31098b = -101;
            return " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        } else if (i10 == -102) {
            this.f31098b = -102;
            return " Please add 'android.permission.INTERNET' in your applications manifest file.";
        } else if (i10 == -105) {
            this.f31098b = -105;
            return " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        } else if (i10 == -108) {
            this.f31098b = -108;
            return "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        } else if (i10 == -109) {
            this.f31098b = -109;
            return "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        } else if (i10 == -110) {
            this.f31098b = -110;
            return " Unable create share options. Couldn't find applications on device to share the link.";
        } else if (i10 == -111) {
            this.f31098b = -111;
            return " Request to Branch server timed out. Please check your internet connectivity";
        } else if (i10 == -117) {
            this.f31098b = -117;
            return " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        } else if (i10 == -118) {
            this.f31098b = -118;
            return " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
        } else if (i10 >= 500 || i10 == -112) {
            this.f31098b = i10;
            return " Unable to reach the Branch servers, please try again shortly.";
        } else if (i10 == 409 || i10 == -115) {
            this.f31098b = i10;
            return " A resource with this identifier already exists.";
        } else if (i10 >= 400 || i10 == -116) {
            this.f31098b = i10;
            return " The request was invalid";
        } else if (i10 == -119) {
            this.f31098b = -119;
            return "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
        } else if (i10 == -120) {
            this.f31098b = -120;
            return " Task exceeded timeout.";
        } else {
            this.f31098b = -122;
            return " See exception message or logs for more details. ";
        }
    }

    public int a() {
        return this.f31098b;
    }

    public String b() {
        return this.f31097a;
    }

    public String toString() {
        return b();
    }
}
