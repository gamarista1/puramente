package expo.modules.filesystem;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.b;
import ne.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u000fR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0011R \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010\u0013¨\u0006,"}, d2 = {"Lexpo/modules/filesystem/DownloadOptions;", "Lne/c;", "", "md5", "cache", "", "", "headers", "Lexpo/modules/filesystem/SessionType;", "sessionType", "<init>", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/SessionType;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/Map;", "component4", "()Lexpo/modules/filesystem/SessionType;", "copy", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/SessionType;)Lexpo/modules/filesystem/DownloadOptions;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMd5", "getMd5$annotations", "()V", "Ljava/lang/Boolean;", "getCache", "getCache$annotations", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "Lexpo/modules/filesystem/SessionType;", "getSessionType", "getSessionType$annotations", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadOptions implements c {
    private final Boolean cache;
    private final Map<String, String> headers;
    private final boolean md5;
    private final SessionType sessionType;

    public DownloadOptions(boolean z10, Boolean bool, Map<String, String> map, SessionType sessionType2) {
        C6496s.h(sessionType2, "sessionType");
        this.md5 = z10;
        this.cache = bool;
        this.headers = map;
        this.sessionType = sessionType2;
    }

    public static /* synthetic */ DownloadOptions copy$default(DownloadOptions downloadOptions, boolean z10, Boolean bool, Map<String, String> map, SessionType sessionType2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = downloadOptions.md5;
        }
        if ((i10 & 2) != 0) {
            bool = downloadOptions.cache;
        }
        if ((i10 & 4) != 0) {
            map = downloadOptions.headers;
        }
        if ((i10 & 8) != 0) {
            sessionType2 = downloadOptions.sessionType;
        }
        return downloadOptions.copy(z10, bool, map, sessionType2);
    }

    @b
    public static /* synthetic */ void getCache$annotations() {
    }

    @b
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @b
    public static /* synthetic */ void getMd5$annotations() {
    }

    @b
    public static /* synthetic */ void getSessionType$annotations() {
    }

    public final boolean component1() {
        return this.md5;
    }

    public final Boolean component2() {
        return this.cache;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    public final SessionType component4() {
        return this.sessionType;
    }

    public final DownloadOptions copy(boolean z10, Boolean bool, Map<String, String> map, SessionType sessionType2) {
        C6496s.h(sessionType2, "sessionType");
        return new DownloadOptions(z10, bool, map, sessionType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadOptions)) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return this.md5 == downloadOptions.md5 && C6496s.c(this.cache, downloadOptions.cache) && C6496s.c(this.headers, downloadOptions.headers) && this.sessionType == downloadOptions.sessionType;
    }

    public final Boolean getCache() {
        return this.cache;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getMd5() {
        return this.md5;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.md5) * 31;
        Boolean bool = this.cache;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.headers;
        if (map != null) {
            i10 = map.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.sessionType.hashCode();
    }

    public String toString() {
        boolean z10 = this.md5;
        Boolean bool = this.cache;
        Map<String, String> map = this.headers;
        SessionType sessionType2 = this.sessionType;
        return "DownloadOptions(md5=" + z10 + ", cache=" + bool + ", headers=" + map + ", sessionType=" + sessionType2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadOptions(boolean z10, Boolean bool, Map map, SessionType sessionType2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, bool, map, (i10 & 8) != 0 ? SessionType.BACKGROUND : sessionType2);
    }
}
