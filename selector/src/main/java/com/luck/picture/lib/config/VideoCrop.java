package com.luck.picture.lib.config;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/*********************************************************************
 * Created by shenglei on 2023/6/1.
 *********************************************************************/
public class VideoCrop {
    /**
     * Retrieve cropped image Uri from the result Intent
     *
     * @param intent crop result intent
     */
    @Nullable
    public static Uri getOutput(@NonNull Intent intent) {
        Uri outputUri = intent.getParcelableExtra(MediaStore.EXTRA_OUTPUT);
        if (outputUri == null) {
            outputUri = intent.getParcelableExtra(CustomIntentKey.EXTRA_OUTPUT_URI);
        }
        return outputUri;
    }

    /**
     * custom extra data
     *
     * @param intent crop result intent
     */
    public static String getOutputCustomExtraData(@NonNull Intent intent) {
        return intent.getStringExtra(CustomIntentKey.EXTRA_CUSTOM_EXTRA_DATA);
    }

    /**
     * output duration after video crop
     *
     * @param intent crop result intent
     * @return
     */
    public static long getOutputDuration(@NonNull Intent intent) {
        return intent.getLongExtra(CustomIntentKey.EXTRA_VIDEO_CUT_DURATION, 0L);
    }
}
