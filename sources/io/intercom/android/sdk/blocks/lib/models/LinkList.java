package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.models.Link;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkList implements Parcelable {
    public static final Parcelable.Creator<LinkList> CREATOR = new Parcelable.Creator<LinkList>() {
        public LinkList createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            Class<Link> cls = Link.class;
            parcel.readList(arrayList, cls.getClassLoader());
            return new LinkList(arrayList, (Link) parcel.readParcelable(cls.getClassLoader()));
        }

        public LinkList[] newArray(int i10) {
            return new LinkList[i10];
        }
    };
    private final Link footerLink;
    private final List<Link> links;

    public LinkList(List<Link> list, Link link) {
        this.links = list;
        this.footerLink = link;
    }

    public static LinkList fromBlock(Block block) {
        if (block == null) {
            return new LinkList(Collections.emptyList(), new Link.Builder().build());
        }
        return new LinkList(block.getLinks(), block.getFooterLink());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkList linkList = (LinkList) obj;
        if (!this.links.equals(linkList.links)) {
            return false;
        }
        return this.footerLink.equals(linkList.footerLink);
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public int hashCode() {
        return (this.links.hashCode() * 31) + this.footerLink.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.links);
        parcel.writeParcelable(this.footerLink, i10);
    }
}
