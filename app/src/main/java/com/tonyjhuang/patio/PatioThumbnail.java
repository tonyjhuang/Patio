package com.tonyjhuang.patio;

import android.net.Uri;
import android.widget.ImageView;

public class PatioThumbnail {
    private Uri mThumbnailUri;
    private ImageView mThumbnailView;

    public PatioThumbnail(Uri thumbnailUri, ImageView thumbnailView) {
        mThumbnailUri = thumbnailUri;
        mThumbnailView = thumbnailView;
    }

    public Uri getThumbnailUri() {
        return mThumbnailUri;
    }

    public ImageView getThumbnailView() {
        return mThumbnailView;
    }

    public void setSelected(boolean selected) {
        getThumbnailView().setSelected(selected);
        if(selected) {
            getThumbnailView().setAlpha(0.5f);
        } else {
            getThumbnailView().setAlpha(1.0f);
        }
    }

    public boolean isSelected() {
        return getThumbnailView().isSelected();
    }
}
