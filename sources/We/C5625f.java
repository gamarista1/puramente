package We;

import io.branch.rnbranch.RNBranchModule;

/* renamed from: We.f  reason: case insensitive filesystem */
public enum C5625f {
    All("__all__"),
    Default("default"),
    Error(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR),
    Session("session"),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f65863a;

    private C5625f(String str) {
        this.f65863a = str;
    }

    public String b() {
        return this.f65863a;
    }
}
