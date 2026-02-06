package Fe;

/* renamed from: Fe.x  reason: case insensitive filesystem */
public enum C3034x {
    BranchData("branch_data"),
    ForceNewBranchSession("branch_force_new_session"),
    BranchLinkUsed("branch_used"),
    BranchURI("branch"),
    AutoDeepLinked("io.branch.sdk.auto_linked");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f31199a;

    private C3034x(String str) {
        this.f31199a = str;
    }

    public String b() {
        return this.f31199a;
    }

    public String toString() {
        return this.f31199a;
    }
}
