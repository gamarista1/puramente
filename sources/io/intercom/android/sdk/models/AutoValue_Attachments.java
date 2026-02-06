package io.intercom.android.sdk.models;

final class AutoValue_Attachments extends Attachments {
    private final String contentType;
    private final String humanFileSize;
    private final String name;
    private final String url;

    AutoValue_Attachments(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.url = str2;
                if (str3 != null) {
                    this.contentType = str3;
                    if (str4 != null) {
                        this.humanFileSize = str4;
                        return;
                    }
                    throw new NullPointerException("Null humanFileSize");
                }
                throw new NullPointerException("Null contentType");
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Attachments)) {
            return false;
        }
        Attachments attachments = (Attachments) obj;
        if (!this.name.equals(attachments.getName()) || !this.url.equals(attachments.getUrl()) || !this.contentType.equals(attachments.getContentType()) || !this.humanFileSize.equals(attachments.getHumanFileSize())) {
            return false;
        }
        return true;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.humanFileSize.hashCode();
    }

    public String toString() {
        return "Attachments{name=" + this.name + ", url=" + this.url + ", contentType=" + this.contentType + ", humanFileSize=" + this.humanFileSize + "}";
    }
}
