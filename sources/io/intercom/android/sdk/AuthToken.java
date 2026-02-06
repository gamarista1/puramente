package io.intercom.android.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/AuthToken;", "", "name", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getToken", "setToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthToken {
    public static final int $stable = 8;
    private String name;
    private String token;

    public AuthToken(String str, String str2) {
        C6496s.h(str, "name");
        C6496s.h(str2, "token");
        this.name = str;
        this.token = str2;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authToken.name;
        }
        if ((i10 & 2) != 0) {
            str2 = authToken.token;
        }
        return authToken.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.token;
    }

    public final AuthToken copy(String str, String str2) {
        C6496s.h(str, "name");
        C6496s.h(str2, "token");
        return new AuthToken(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        return C6496s.c(this.name, authToken.name) && C6496s.c(this.token, authToken.token);
    }

    public final String getName() {
        return this.name;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.token.hashCode();
    }

    public final void setName(String str) {
        C6496s.h(str, "<set-?>");
        this.name = str;
    }

    public final void setToken(String str) {
        C6496s.h(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        return "AuthToken(name=" + this.name + ", token=" + this.token + ')';
    }
}
