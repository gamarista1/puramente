package expo.modules.fetch;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ne.b;
import ne.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J@\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\fR2\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000eR \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u0010¨\u0006&"}, d2 = {"Lexpo/modules/fetch/NativeRequestInit;", "Lne/c;", "Lexpo/modules/fetch/NativeRequestCredentials;", "credentials", "", "Lkotlin/Pair;", "", "headers", "method", "<init>", "(Lexpo/modules/fetch/NativeRequestCredentials;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lexpo/modules/fetch/NativeRequestCredentials;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lexpo/modules/fetch/NativeRequestCredentials;Ljava/util/List;Ljava/lang/String;)Lexpo/modules/fetch/NativeRequestInit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/fetch/NativeRequestCredentials;", "getCredentials", "getCredentials$annotations", "()V", "Ljava/util/List;", "getHeaders", "getHeaders$annotations", "Ljava/lang/String;", "getMethod", "getMethod$annotations", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NativeRequestInit implements c {
    private final NativeRequestCredentials credentials;
    private final List<Pair<String, String>> headers;
    private final String method;

    public NativeRequestInit() {
        this((NativeRequestCredentials) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NativeRequestInit copy$default(NativeRequestInit nativeRequestInit, NativeRequestCredentials nativeRequestCredentials, List<Pair<String, String>> list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nativeRequestCredentials = nativeRequestInit.credentials;
        }
        if ((i10 & 2) != 0) {
            list = nativeRequestInit.headers;
        }
        if ((i10 & 4) != 0) {
            str = nativeRequestInit.method;
        }
        return nativeRequestInit.copy(nativeRequestCredentials, list, str);
    }

    @b
    public static /* synthetic */ void getCredentials$annotations() {
    }

    @b
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @b
    public static /* synthetic */ void getMethod$annotations() {
    }

    public final NativeRequestCredentials component1() {
        return this.credentials;
    }

    public final List<Pair<String, String>> component2() {
        return this.headers;
    }

    public final String component3() {
        return this.method;
    }

    public final NativeRequestInit copy(NativeRequestCredentials nativeRequestCredentials, List<Pair<String, String>> list, String str) {
        C6496s.h(nativeRequestCredentials, "credentials");
        C6496s.h(list, "headers");
        C6496s.h(str, "method");
        return new NativeRequestInit(nativeRequestCredentials, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeRequestInit)) {
            return false;
        }
        NativeRequestInit nativeRequestInit = (NativeRequestInit) obj;
        return this.credentials == nativeRequestInit.credentials && C6496s.c(this.headers, nativeRequestInit.headers) && C6496s.c(this.method, nativeRequestInit.method);
    }

    public final NativeRequestCredentials getCredentials() {
        return this.credentials;
    }

    public final List<Pair<String, String>> getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return (((this.credentials.hashCode() * 31) + this.headers.hashCode()) * 31) + this.method.hashCode();
    }

    public String toString() {
        NativeRequestCredentials nativeRequestCredentials = this.credentials;
        List<Pair<String, String>> list = this.headers;
        String str = this.method;
        return "NativeRequestInit(credentials=" + nativeRequestCredentials + ", headers=" + list + ", method=" + str + ")";
    }

    public NativeRequestInit(NativeRequestCredentials nativeRequestCredentials, List<Pair<String, String>> list, String str) {
        C6496s.h(nativeRequestCredentials, "credentials");
        C6496s.h(list, "headers");
        C6496s.h(str, "method");
        this.credentials = nativeRequestCredentials;
        this.headers = list;
        this.method = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeRequestInit(NativeRequestCredentials nativeRequestCredentials, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NativeRequestCredentials.INCLUDE : nativeRequestCredentials, (i10 & 2) != 0 ? C6565s.n() : list, (i10 & 4) != 0 ? "GET" : str);
    }
}
