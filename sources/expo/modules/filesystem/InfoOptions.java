package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import ne.b;
import ne.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lexpo/modules/filesystem/InfoOptions;", "Lne/c;", "", "md5", "size", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lexpo/modules/filesystem/InfoOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getMd5", "getMd5$annotations", "()V", "getSize", "getSize$annotations", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InfoOptions implements c {
    private final Boolean md5;
    private final Boolean size;

    public InfoOptions(Boolean bool, Boolean bool2) {
        this.md5 = bool;
        this.size = bool2;
    }

    public static /* synthetic */ InfoOptions copy$default(InfoOptions infoOptions, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = infoOptions.md5;
        }
        if ((i10 & 2) != 0) {
            bool2 = infoOptions.size;
        }
        return infoOptions.copy(bool, bool2);
    }

    @b
    public static /* synthetic */ void getMd5$annotations() {
    }

    @b
    public static /* synthetic */ void getSize$annotations() {
    }

    public final Boolean component1() {
        return this.md5;
    }

    public final Boolean component2() {
        return this.size;
    }

    public final InfoOptions copy(Boolean bool, Boolean bool2) {
        return new InfoOptions(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoOptions)) {
            return false;
        }
        InfoOptions infoOptions = (InfoOptions) obj;
        return C6496s.c(this.md5, infoOptions.md5) && C6496s.c(this.size, infoOptions.size);
    }

    public final Boolean getMd5() {
        return this.md5;
    }

    public final Boolean getSize() {
        return this.size;
    }

    public int hashCode() {
        Boolean bool = this.md5;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.size;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Boolean bool = this.md5;
        Boolean bool2 = this.size;
        return "InfoOptions(md5=" + bool + ", size=" + bool2 + ")";
    }
}
