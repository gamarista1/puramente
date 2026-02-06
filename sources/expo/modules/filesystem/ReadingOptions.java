package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.b;
import ne.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\f¨\u0006#"}, d2 = {"Lexpo/modules/filesystem/ReadingOptions;", "Lne/c;", "Lexpo/modules/filesystem/EncodingType;", "encoding", "", "position", "length", "<init>", "(Lexpo/modules/filesystem/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Lexpo/modules/filesystem/EncodingType;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Lexpo/modules/filesystem/EncodingType;Ljava/lang/Integer;Ljava/lang/Integer;)Lexpo/modules/filesystem/ReadingOptions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/filesystem/EncodingType;", "getEncoding", "getEncoding$annotations", "()V", "Ljava/lang/Integer;", "getPosition", "getPosition$annotations", "getLength", "getLength$annotations", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadingOptions implements c {
    private final EncodingType encoding;
    private final Integer length;
    private final Integer position;

    public ReadingOptions(EncodingType encodingType, Integer num, Integer num2) {
        C6496s.h(encodingType, "encoding");
        this.encoding = encodingType;
        this.position = num;
        this.length = num2;
    }

    public static /* synthetic */ ReadingOptions copy$default(ReadingOptions readingOptions, EncodingType encodingType, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            encodingType = readingOptions.encoding;
        }
        if ((i10 & 2) != 0) {
            num = readingOptions.position;
        }
        if ((i10 & 4) != 0) {
            num2 = readingOptions.length;
        }
        return readingOptions.copy(encodingType, num, num2);
    }

    @b
    public static /* synthetic */ void getEncoding$annotations() {
    }

    @b
    public static /* synthetic */ void getLength$annotations() {
    }

    @b
    public static /* synthetic */ void getPosition$annotations() {
    }

    public final EncodingType component1() {
        return this.encoding;
    }

    public final Integer component2() {
        return this.position;
    }

    public final Integer component3() {
        return this.length;
    }

    public final ReadingOptions copy(EncodingType encodingType, Integer num, Integer num2) {
        C6496s.h(encodingType, "encoding");
        return new ReadingOptions(encodingType, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadingOptions)) {
            return false;
        }
        ReadingOptions readingOptions = (ReadingOptions) obj;
        return this.encoding == readingOptions.encoding && C6496s.c(this.position, readingOptions.position) && C6496s.c(this.length, readingOptions.length);
    }

    public final EncodingType getEncoding() {
        return this.encoding;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = this.encoding.hashCode() * 31;
        Integer num = this.position;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.length;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        EncodingType encodingType = this.encoding;
        Integer num = this.position;
        Integer num2 = this.length;
        return "ReadingOptions(encoding=" + encodingType + ", position=" + num + ", length=" + num2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReadingOptions(EncodingType encodingType, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EncodingType.UTF8 : encodingType, num, num2);
    }
}
